/**
 * 
 */


$(document).ready(function(){
	
	// 검색버튼을 클릭하면
	$("input[type='button']").on("click",function(){
		// alert("aaa");  확인용
		
		// pageNum에 1을 초기화
		$("input[name='pageNum']").val("1");
		// form태그를 submit
		$("#searchForm").submit();
	
	})
	
})


