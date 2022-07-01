/**
 * 
 */

/* ----------------- 아이디 ----------------- */


document.getElementById('idbox').addEventListener('blur',blur)
//var idbox = document.querySelector("#idbox")
//idbox.onblur=function(){기능 주르륵}

var msg=document.getElementById('msg')

//var idbox=document.getElementById('idbox')

function blur (){
	var idbox=document.getElementById('idbox').value
	//var idValue=idbox.value; 표현가능
	//화면의 id 문자열을 여기로 가져와서 (idbox.value) idValue 변수에 저장
	if (idbox.length>=5 && idbox.length<=20){  //"정자바".length(정자바 문자열의 글자 수)
		msg.innerHTML="정상입니다.";
		msg.style.color="green";
		}
		else if (idbox.length<5 || idbox.length>20){
		msg.innerHTML="5~20글자를 입력해주세요."
		msg.style.color="red";
		}
	
}
/* ----------------- 비밀번호 ----------------- 
document.getElementById('passbox').addEventListener('blur',passblur)
var passmsg=document.getElementById('passmsg')


function passblur (){
	var passbox=document.getElementById('passbox').value
	if (passbox.length>=8 && passbox.length<=16){ 
		passmsg.innerHTML="정상입니다.";
		passmsg.style.color="green";
		}
		else if (passbox.length<8 || passbox.length>16){
		passmsg.innerHTML="8~16글자를 입력해주세요."
		passmsg.style.color="red";
		}
	
}
*/

var pass = document.querySelector("#passbox");

pass.onblur = function(){
	var check=/^[a-zA-Z]+[a-zA-Z0-9-_]{7,16}$/g;
	if (check.test(pass.value)){
		passmsg.innerHTML="정상입니다.";
		passmsg.style.color="green";
	} else {
		passmsg.innerHTML="8~16자의 영문 대소문자, 숫자와 특수기호 (-),(_)만 사용 가능합니다."
		passmsg.style.color="red";
	}
}




/*
document.getElementById('passbox').addEventListener('blur',passblur)

var re = /[a-zA-Z0-9]{8,16}$/;
var passmsg=document.getElementById('passmsg');

function passblur (){
	var passbox=document.getElementById('passbox').value
	if(passbox && re == true){
		passmsg.innerHTML="정상입니다.";
		passmsg.style.color="green";
	} else {
		passmsg.innerHTML="8~16글자를 입력해주세요."
		passmsg.style.color="red";
	}
}
*/
/*
function passblur (){
	var passbox=document.getElementById('passbox').value
	function check (){
		var regExp = /^(?=.*[a-zA-z])(?=.*[0-9])(?=.*[\-_]).{8,16}$/;
	
		return regExp.test('passbox')
	}
	if (check==true){
		passmsg.innerHTML="정상입니다.";
		passmsg.style.color="green";
		
		passmsg.innerHTML="8~16자 영문 대 소문자, 숫자, 특수문자를 사용하세요.";
		passmsg.style.color="red";
		
	} else if (check==false){
		passmsg.innerHTML="8~16자 영문 대 소문자, 숫자, 특수문자를 사용하세요.";
		passmsg.style.color="red";
	
	}

}
*/




 /*----------------- 비밀번호 확인 ----------------- 
document.getElementById('rebox').addEventListener('keydown',reblur)
var remsg=document.getElementById('remsg')
function reblur (){
	
	var passbox=document.getElementById('passbox').value
	var rebox=document.getElementById('rebox').value
	if (rebox===passbox){ 
		remsg.innerHTML="비밀번호가 일치합니다.";
		remsg.style.color="green";
		
		}
		else if (rebox!==passbox){
		remsg.innerHTML="비밀번호가 일치하지 않습니다."
		remsg.style.color="red";
	
		}
}
*/
/*case 2*/

var rebox = document.querySelector('#rebox');
rebox.onkeydown = function (){

	var passbox=document.querySelector('#passbox')
	if (rebox.value===passbox.value){
		remsg.innerHTML="비밀번호가 일치합니다.";
		remsg.style.color="green";
	} else if (rebox.value!==passbox.value) {
		remsg.innerHTML="비밀번호가 일치하지 않습니다."
		remsg.style.color="red";
	}

}

/* ----------------- 이메일 mail, emsg1 ----------------- */
var mail = document.querySelector("#mail");
var emsg1=document.getElementById('emsg1')
mail.onblur = function(){
	var check2=/([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]/;
	if (check2.test(mail.value)){
		emsg1.innerHTML="정상입니다.";
		emsg1.style.color="green";
	} else {
		emsg1.innerHTML="@를 포함한 메일 형식을 기입해 주세요."
		emsg1.style.color="red";
	}
}


/* ----------------- 이메일 확인 mailcheck, emsg2 ----------------- */

document.getElementById('mailcheck').addEventListener('keydown',check3)
var emsg2=document.getElementById('emsg2')
function check3 (){
	
	var mail=document.getElementById('mail').value
	var mailcheck=document.getElementById('mailcheck').value
	if (mailcheck===mail){ 
		emsg2.innerHTML="이메일이 일치합니다.";
		emsg2.style.color="green";
		
		}
		else if (mailcheck!==mail){
		emsg2.innerHTML="이메일이 일치하지 않습니다."
		emsg2.style.color="red";
	
		}
}






document.getElementById('but').addEventListener('click',click)

function click () {
	alert('로그인 하였습니다.')
}