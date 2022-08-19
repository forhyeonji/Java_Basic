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
	
	
	
})


// 함수 선언
function list(bno){ // list함수 시작
	// get방식의 JSON타입을 들고온다.
	$.getJSON("/replies/"+bno+".json", function(data){
		
		var str="";
		
		for(var i=0; i<data.length; i++){
			
			str+="<li>"+data[i].id+"</li>"
			str+="<li>"+data[i].reply+"</li>"
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


