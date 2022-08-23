/**
 * 댓글 관련 javascript 처리
 */

$(document).ready(function(){	// jquery 준비...
	
	// 함수 호출
	// detail.jsp가 시작되자마자 bno값을 가져올려면 $(document).ready 아래에 선언
	var bnoValue = $("input[name='bno']").val();

	// detail.jsp가 시작되자마자 댓글목록리스트 함수를 호출
	list(bnoValue);
	

	
	
	
	// 댓글 쓰기버튼을 클릭하면
	$("#add").on("click",function(){
		// 댓글쓰기 버튼을 클릭했을 당시에 댓글 내용을 가져오려면 click 이벤트 아래에 선언 
		
	var replyValue = $("#reply").val();
	var idValue = $("input[name='id']").val();
	
		// alert(replyValue);	
	
		// {"변수명":"값","변수명":"값"}  -- jason 문법
		add({bno:bnoValue, reply:replyValue, id:idValue});    // 댓글쓰기를 하기 위한 함수 호출
		
	})
	
	
	
	
	
	
	

	
	
	// 댓글 수정버튼을 클릭하면
	// 이미 존재하는 태그에 이벤트를 처리하고
	// 나중에 동적으로 생기는 태그들에 대해서 파라미터 형식으로 지정 (이벤트 델리게이트)
	$("#chat").on("click", ".update", function(){
		
		// 댓글번호와 댓글내용을 수집해서
		var rno=$(this).data("rno");
		// var reply=$(this).data("reply");
		var reply=$("#replycontent"+rno).val();
		
		
		// 댓글 수정에 대한 함수 호출 (댓글번호, 댓글내용)
		modify({rno:rno, reply:reply});
	
	})

	
	
	// 댓글 삭제버튼을 클릭하면
		$("#chat").on("click", ".remove", function(){
		
		// 댓글번호를 수집해서
		var rno=$(this).data("rno");
		console.log(rno);
		// 댓글 삭제에 대한 함수 호출 (댓글번호)
		// remove({rno:rno}); json 타입으로 묶어서 보내거나 어차피 하나만 보내니까 그냥 인수로 rno만 보내거나!
		remove(rno);
	
	})
	
	
	
	
	
})  // jquery 끝...


	// 댓글 삭제를 위한 함수 선언
	function remove(rno){
		console.log(rno);
		
		$.ajax({
			type:"delete",
			url:"/replies/remove/"+rno,
			success : function(result){
				if(result=="success"){
					alert("댓글삭제 성공")
				}
			}

			
		})
	}


	// 댓글 수정을 위한 함수 선언
	function modify(reply){
		console.log(reply);
		$.ajax({
			
			type : "put",
			url : "/replies/modify",
			data : JSON.stringify(reply),
			// contentType : ajax -> controller로 데이터 전송 시 타입
			// 생략하게 되면 web Brower한테 위임
			contentType: "application/json; charset=utf-8",
			success : function(result){
				if(result=="success"){
					alert("댓글수정 성공")
				}
			}
			
		})		
	}
	






// 함수 선언
function list(bno){ // list함수 시작
	// get방식의 JSON타입을 들고온다.
	$.getJSON("/replies/"+bno+".json", function(data){
		
		var str="";
		
		for(var i=0; i<data.length; i++){
			
			str+="<li>"+data[i].id+"</li>"
			str+="<li>"+data[i].rno+"</li>"
			str+="<li><textarea id='replycontent"+data[i].rno+"'>"+data[i].reply+"</textarea></li>"
			str+="<li>"
			str+="<input class='update' type='button' value='수정' data-rno="+data[i].rno+">"
			str+="<input class='remove' type='button' value='삭제' data-rno="+data[i].rno+">"
			str+="</li>"
		}
		
		$("#replyUL").html(str);
		
	});
	
}// list함수 선언 끝










// 함수 선언
// 댓글 쓰기를 하기 위한 함수 선언
function add(reply){
	console.log("js: "+reply);
	$.ajax({
	
		// ajax타입의 get, post, put, delete 중에서 controller의 타입과 일치시켜주면 된다.
		type : "post",
		url : "/replies/new",
		data : JSON.stringify(reply),
		contentType: "application/json; charset=utf-8",
		success : function(result){
			if(result=="success"){
				alert("댓글쓰기 성공")
			}
		}
		
	})
}	// add 함수 선언 끝














