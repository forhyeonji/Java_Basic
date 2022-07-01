$(document).ready(function(){

    $("#idbox").on("blur",function(){
       var exp = /^[a-zA-Z]+[a-zA-Z0-9-_]{7,16}$/g;
       var idbox =  $("#idbox")
       var idmsg = $("#idmsg")
       if(exp.test(idbox.val())){
        idmsg.html("정상입니다.")
        idmsg.css("color","green")
       
       } else {
        idmsg.html("8~16자의 영문 대소문자, 숫자와 특수기호 (-),(_)만 사용 가능합니다.")
        idmsg.css("color","red")
         
       }

    })


    $('#passbox').on("blur",function(){
        var exp = /^[a-zA-Z]+[a-zA-Z0-9-_]{7,16}$/g;
        var passbox =  $("#passbox")
        var passmsg = $("#passmsg")
        if(exp.test(passbox.val())){
            passmsg.html("정상입니다.");
            passmsg.css("color","green");
           
           } else {
            passmsg.html("8~16자의 영문 대소문자, 숫자와 특수기호 (-),(_)만 사용 가능합니다.");
            passmsg.css("color","red");
             
           }

    })


    $('#mailbox').on("keydown",function(){
        var exp2=/([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]/;
        var mailbox=$('#mailbox')
        var mailmsg=$('#mailmsg')
        if(exp2.test(mailbox.val())){
            mailmsg.html("정상입니다.");
            mailmsg.css("color","green");
        } else {
            mailmsg.html("@를 포함한 메일 형식을 기입해 주세요.");
            mailmsg.css("color","red");
        }

    })



    $('#checkbox').on("keydown",function(){
        var mailbox = $('#mailbox').val()
        var checkbox = $('#checkbox').val()
        var checkmsg = $('#checkmsg')
        if(checkbox===mailbox){
            checkmsg.html("일치합니다.");
            checkmsg.css("color","green");
        } else if(checkbox!==mailbox){
            checkmsg.html("일치하지 않습니다.");
            checkmsg.css("color","red");      
        }



    })

})