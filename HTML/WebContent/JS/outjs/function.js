/**
 *
 */
/*
function plus(a,b){
	
	var sum = a + b;
	return sum;
}

var result;
result = plus(3,7);
document.write(result);
*/
/*
function plus(a,b){
	
	var sum = a + b;
	return sum;
}

var result = plus(3,10);
document.write(result);
*/
/*
// 함수 선언 (더하기를 하기 위한 함수)
function add(a,b){
	
	return a+b;
	
}

//함수 호출
alert(add(3,7))

*/


// 가로(밑변):3 - a
// 세로(높이):4 - b
// 일 때, 삼각형의 넓이를 구하는 함수를 작성하시오. (선언문, 호출 둘 다)
/*
case 1)
function area (a,b){
	
	return (a+b)/2;
	
}

alert(area(3,4))

case2)

function area (a,b){
	
	return (a+b)/2;
	
}

var result = area(3,4)
alert(result)

//-------------------------

// 익명 함수 (콜백함수 쓸 때 씀)
// 변수에 저장해서 호출 가능

var add=function(a,b){
	return a+b
}

alert(add(5,7));





//1과 2 순서 상관 없음.

// 1. 익명 함수
var callback = function(){
	alert("콜백 함수 호출")
}



// 2. 콜백 함수 = 매개 변수에 함수를 넣어서 전달할 때 사용되는 함수
// var callback = 함수 (자료형 : 함수 type)
// callbackTest 함수 선언
function callbackTest(a){
	for (var i=0;i<3;i++){
	 a(); //함수를 호출해야하니까 소괄호를 () 넣어야함.
	}
}



// 3. callbackTest 함수 호출
callbackTest(callback);

*/

// 다음 코드의 실행 결과를 예측하세요.

/*
 * function test(a,b,c){
 * 	alert(a)
 * 	alert(a*b)
 * 	alert(a*b*c)
 * }
 * 
 * test(10,100)
 * 
 * 예상 답 : 알림창 10, 알림창 1000, 알림창 NaN
 * */
/*
function test (a,b,c){
	alert(c) //undefined
	alert(a) //10
	alert(a*b) //1000
	alert(a*b*c) //NaN =>not a number
}

test(10,100)
*/
/*다음과 같은 함수를 만들어 보세요.
 * 1) 함수이름 : power
 * - 매개변수를 하나 넣으면 제곱해준다.(ex: power(2)=4)
 * - 매개변수를 두 개 넣으면 첫 번째 매개변수와 두 번째 매개변수 제곱만큼 해준다. (ex: power(2,3)=8)
 */
/*
var two = function (a,b){
	alert(a**b) ;
}
function power(a,b){
	if (b==null){
		alert(a*a)
	}
	else {
		two(a,b);
	}
}

power(2,3)
*/


/* 2) 함수이름 : multiply
 * - 매개변수로 넣은 값을 모두 곱해준다.(ex: multiply(1,2,3,4,5)=120)
 */

/*
function multiply (){
	var sum=1;
	for(var i=0; i<arguments.length; i++){
		sum*=arguments[i];		
		}
	
alert(sum);

}

multiply(3,5,2)

*/
/*
function a(b){
	alert(b)
}

a("메롱")


window.onload = function (){
	alert(test(9,3))
};

function test(a,b){
	return b ? (a**b) : (a**2)
}

*/










