/**
 * 조건식
 */

//평균 60점 이상이면 합격
/*
var math=Number(prompt("수학점수를 입력하시오."))
var art=Number(prompt("예술점수를 입력하시오"))
var avg=(math+art)/2
if (avg>=60){
	alert(avg+"점 합격")
}
*/

//평균이 60점 이상이면 합격, 그렇지 않으면 불합격
/*
var math=Number(prompt("수학점수를 입력하시오."))
var art=Number(prompt("예술점수를 입력하시오"))
var avg=(math+art)/2
if (avg>=60){
	alert(avg+"점 합격")
} else {
	alert(avg+"점 불합격")
}
*/

//평균이 60점 이상이면 합격,
//평균이 59점 이상이면 보류,
//그렇지 않으면 불합격
/*
var math=Number(prompt("수학점수를 입력하시오."))
var art=Number(prompt("예술점수를 입력하시오"))
var avg=(math+art)/2
if (avg>=60){
	alert("합격")
}else if (avg>=59){
	alert("보류")
}else
	alert("불합격")
*/

//평균이 60점 이상이고 총점이 150점 이상이면 합격
//그렇지 않으면 불합격
/*
var math=Number(prompt("수학점수를 입력하시오."))
var art=Number(prompt("예술점수를 입력하시오"))
var avg=(math+art)/2
var total=(math+art)

if (avg>=60 && total>=150) {
	alert("평균:"+avg+"점, "+"total:"+total+"점\n합격")
} else {
	alert("기준미달-불합격 "+"\n\n*평균 60점 이상, 총 점 150점 이상이어야 합니다.")
}


var num=Number(prompt("num을 입력하시오."));
switch(num){
	case 10:
		alert("num 값은 10입니다.")
		break;
	case 20:
		alert("num 값은 20입니다.")
		break;
	case 30:
		alert("num 값은 30입니다.")		
		break;
}

*/

/* ~~~~~~~~~ 심화 문제 ~~~~~~~~~
1.
 * 일단 방금 배운 문자열을 사용해봅시다. prompt()함수로 문자열을 입력받아
 * "안녕"이 들어가면 "안녕하세요",
 * "잘자" 또는 "잘 자"를 입력하면 "안녕히 주무세요"를 출력하는 코드를 작성하세요.
*/
/*
var hi=prompt("인사해 주세요.")

if (hi=="안녕"){
	alert("안녕하세요")
}else if (hi=="잘자"||"잘 자"){
	alert("안녕히 주무세요")
}
*/


/*↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓*/
/*var hi=prompt("인사해 주세요.")

if(hi.indexOf('안녕')>=0){
	alert("안녕하세요")
}

else if (hi.indexOf('잘가')>=0){
	alert("안녕히가세요")
}

else if (hi.indexOf('잘 가')>=0){
	alert("안녕히가세요")
}
*/
/*↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑*/

//1★★★★★★★★★★★
/*
var hi=prompt("인사해 주세요.")
hi.indexOf('안녕')>=0?alert("안녕하세요"):""
hi.indexOf('잘가')>=0?alert("안녕히가세요"):""
hi.indexOf('잘 가')>=0?alert("안녕히가세요"):""
*/

//2. prompt() 함수로 문자열을 입력받아 "안녕"이라는 글자가 들어있지 않으면 "인사를 안 하다니"라고 출력
/*
 
var hi=prompt("인사해 주세요.")

if (hi!="안녕"){
	alert("인사를 안하다니")
}
*/


/*↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓*/
/*	
var hi=prompt("인사해 주세요.")

if(hi.indexOf('안녕')>=0){
	alert("안녕하세요")
}

else
	alert("인사를 안하다니")
*/
/*↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑*/



//2★★★★★★★★★★★
var hi=prompt("인사해 주세요.")
hi.indexOf('안녕')==-1?alert("인사를 안하다니"):""


//3. prompt() 함수로 숫자를 입력받아 4로 나눌 수 있는 숫자라면 "4로 나눌 수 있는 숫자입니다."를 출력
/*
var hi=Number(prompt("숫자를 입력해 주세요."))

if (hi=4n) {
	alert("4로 나눌 수 있는 숫자입니다.")
}
*/
/*
var num=Number(prompt("숫자를 입력해 주세요."))

if (num%4 == 0){
	alert("4로 나눌 수 있는 숫자입니다.")
}
*/

//3★★★★★★★★★★★
/*var num=prompt("숫자를 입력해 주세요.")			
num%4 == 0?alert("4로 나눌 수 있는 숫자입니다."):""
		
*/				
//4. prompt() 함수로 숫자를 입력받아 양수면 "양수입니다.", 음수면 "음수입니다.", 0이면 "0입니다."
/*
var hi=Number(prompt("숫자를 입력해 주세요."))

if (hi>=1){
	alert("양수입니다.")
} else if (hi<0){
	alert("음수입니다.")
} else if(hi==0){
	alert("0입니다.")
}
*/
var num=Number(prompt("숫자를 입력해 주세요."))

num>0?alert("양수입니다."):num<0?alert("음수입니다."):alert("0입니다.")
		
/*
//4★★★★★★★★★★★
var num=prompt("숫자를 입력해 주세요.")		

num==0?alert("0입니다."):""
	||
num>0?alert("양수입니다."):alert("음수입니다.")
	*/	
		

	
/*
//5. prompt() 함수로 숫자를 입력받아 짝수면 "짝수입니다.", 홀수면 "홀수입니다."

var num=Number(prompt("숫자를 입력해 주세요."))

if(num%2 == 0){
		alert("짝수입니다.")
	}
	
	else if(num%2==1) {
		alert("홀수입니다.")
	} */
/*		 
//5★★★★★★★★★★★
var num=Number(prompt("숫자를 입력해 주세요."))

num%2==0?alert("짝수입니다."):alert("홀수입니다.")

*/
		
		
