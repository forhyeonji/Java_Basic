/**
 *
 */

// 1.다양한 질문과 답을 하는 프로그램, "잘 있어" 입력하면 종료하는 프로그램 만들기.
/*
 * 몇 번 하시오 라는 말이 없으면 while를 쓰기!!!
 */



/*
for(var i=0; i<10; i++){
	
	if(prompt("안녕하세요?")=="잘 있어"){
		break;
	}
	else if(prompt("식사하셨나요?")=="잘 있어"){
		break;
	}
	else if(prompt("취미가 뭐예요?")=="잘 있어"){
		break;
	}
	else if(prompt("오늘 마치고 뭐하시나요?")=="잘 있어"){
		break;
	}
	else if(prompt("mbti가 어떻게 되세요?")=="잘 있어"){
		break;
	}
	else if(prompt("코딩을 배워본적 있으세요?")=="잘 있어"){
		break;
	}
	else if(prompt("어떤 음식을 좋아하세요?")=="잘 있어"){
		break;
	}
	else if(prompt("아침에 커피를 마시나요?")=="잘 있어"){
		break;
	}
}
*/





//이전 연습문제에서 입력에 "안녕"이 들어가 있으면 "안녕하세요"를 출력하는 프로그램을 작성하였습니다.
//반복문을 적용해서 계속해서 입력을 받게 하고, 입력한 문장에 다양한 질문과 답변을 하는 프로그램을 만드세요.
//"잘 있어"를 입력하면 반복문을 종료해서 벗어나게 만들어보세요.

/*
while(true){
	var hello=prompt("인사말을 입력하세요.")
	if (hello=="안녕"){
		alert("안녕하세요.")
	}else if (hello=="밥"){
		alert("식사하셨나요.")
	}else if (hello=="시간"){
		alert("저녁이에요.")
	}else if (hello=="메롱"){
		alert("왜 욕하세요?")
	}else if  (hello=="잘 있어"){
		break;
	}
	
}

*/





/*
// 2.1~100까지 더하는 프로그램을 만들어보세요.(hint : 지역변수 vs 전역변수)

var sum=0; //for 안에 선언하게 되면 실행x 계속 sum이 0이 되어버려서
for(var i=1; i<=100; i++){
	sum+=i   //sum = sum+i;

	if (i==100){
	alert(sum+=i)
	}
}

// i는 변수이기 때문에 
*/


/*
// 3.2번 문제에서 사용자에게 두 수를 입력 받아 특정한 숫자부터 특정한 숫자까지 더하는 프로그램을 만들어라.
var sum=0
var start=Number(prompt("시작값을 입력하시오"))
var end=Number(prompt("마지막값을 입력하시오"))
for(start;end;start++){
	sum+=start
	
	if (start==end)
	{alert((sum+=start)-end);
		break;}
}
*/


/*
//sol)
var sum=0
var num1=Number(prompt("첫번째 숫자를 입력하세요."))
var num2=Number(prompt("두번째 숫자를 입력하세요."))
var tmp=0;

if(num1>num2){
	tmp=num1;
	num1=num2;
	num2=tmp;
//num1>num2일 경우(if문)
//num1과 num2의 값을 바꾸자!
//hint : 변수를 하나 더 쓰자!
}

for(var i=num1; i<=num2; i++){
	sum+=i
}
alert(sum);
*/



/*
// 4.구구단 2단을 반복문으로 만들어보세요.

for(i=1; i<=9; i++){
	alert("2 x "+ i +" = "+2*i)
}
*/

// 5.구구단 2~9까지 반복문으로 만들어보세요.
/*
for(i=2; i<=9; i++){
	for(j=1; j<=9; j++){
		var sum=i*j
		document.write(i+"x"+j+"="+sum);
		document.write("<br>");
	}
}
*/

