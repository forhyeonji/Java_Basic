$(document).ready(function(){

// $(선택자).메서드명()
// show 효과
$('#show').on("click",function(){

    $('p').show("slow");
})


// hide 효과
$('#hide').on("click",function(){
    $('p').hide("slow");
})


// toggle 효과
$('#toggle').on("click",function(){
    $('p').toggle("slow")
})


// slideDown 효과
$('#slideDown').on("click",function(){
    $('p').slideDown("slow");
})



// slideUp 효과
$('#slideUp').on("click",function(){
    $('p').slideUp("slow");
})


// slideToggle 효과
$('#slideToggle').on("click",function(){
    $('p').slideToggle("slow");
})


// fadeIn 효과
$('#fadeIn').on("click",function(){
    $('p').fadeIn("slow");
})


// fadeOut 효과
$('#fadeOut').on("click",function(){
    $('p').fadeOut("slow");
})


// fadeToggle 효과
$('#fadeToggle').on("click",function(){
    $('p').fadeToggle("slow");
})










}) //ready