/**
 * 
 */

window.onload=function(){
	
	document.getElementById('id').addEventListener('blur',blur)
	var idmsg=document.getElementById('idmsg')

	function blur (){
		var idval=document.getElementById('id').value
		var idcheck=/[a-zA-Z0-9-_]{5,20}$/g;

		if (idcheck.test(idval)){
			idmsg.innerHTML="  정상입니다.";
			idmsg.style.color="green";
			} else {
			idmsg.innerHTML=" 특수문자를 제외한 5~20글자를 입력해주세요."
			idmsg.style.color="red";
			}
		
	} // id blur
	
	
	document.getElementById('pw').addEventListener('blur',pwblur)
	var pwmsg=document.getElementById('pwmsg')


	function pwblur (){
		
		var pwval=document.getElementById('pw').value
		var check=/[a-zA-Z0-9-_]{8,16}$/g;

		if (check.test(pwval)){
			pwmsg.innerHTML="  정상입니다.";
			pwmsg.style.color="green";
			}
			else {
			pwmsg.innerHTML="8~16자의 영문 대소문자, 숫자와 특수기호 (-),(_)만 사용 가능합니다."
			pwmsg.style.color="red";
			}
		
	} // pw blur
	
	
	document.getElementById('login').addEventListener('click',click)
	
	
	
	
}//onload