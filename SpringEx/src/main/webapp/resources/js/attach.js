/**
 * 첨부파일 관련 js
 */


$(document).ready(function(){
	
	// detail.jsp가 시작되자마자(ready) bno 값 가져오기
	var bno = $("input[name='bno']").val();
	
	$.getJSON("/attachlist", {bno:bno}, function(attachlist){
		console.log(attachlist);
		
		
		var str="";
		
		$(attachlist).each(function(i, attach){
			// 만약 attach.image가 true 이면
			if(attach.image){
				// 아래를 실행
				
				var filePath=encodeURIComponent(attach.uploadPath + "/s_" + attach.uuid + "_" + attach.fileName)
				console.log(filePath)	
				
				str+="<li><img src='display?fileName="+filePath+"'>"+attach.fileName+"</li>";
				
			}else{

				var filePath=encodeURIComponent(attach.uploadPath + "/" + attach.uuid + "_" + attach.fileName)
				str+="<li><a href='download?fileName="+filePath+"'>"+ attach.fileName +"_다운받기</a></li>"
				
			}

		})
		
		$("#uploadResult ul").html(str);
		
		
	})
	
	
	
})