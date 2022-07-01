// 웹브라우저 선택한 것에 대해서 준비가 된 후 익명함수에 있는 것을 실행
// JS의 window.onload 와 동일
$(document).ready(function(){
    //alert("jquery 실행됨.")


// id를 이용한 선택자
$("#header1").css("color","red")
// class를 이용한 선택자 - 2개가 저장되니 배열에 저장
$(".header1").css("background-color","powderblue")
// tag를 이용한 선택자
$("h1").css("font-size","20px")

$("#header3").css("color","red").css("background-color","blue")


$("#header4").css({"color":"red","border-style":"solid","border-color":"black"})

$("#header4").on("click",function(){})

$("#idchk").on("blur",function(){
    alert("id입력란에서 커서를 뺏겼을때")
})

})