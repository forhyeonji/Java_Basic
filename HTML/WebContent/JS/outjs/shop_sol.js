
$(document).ready(function(){  

        //1번
        $('#plus').on("click",function(){
            var numbox = Number($('#numbox').val())
            $('#numbox').val(numbox+1);
        })


        $('#minus').on("click",function(){
            var numbox = Number($('#numbox').val())

            //numbox변수에 저장되어 있는 값이 1이면
            //갯수를 입력하는 텍스트상자에 1을 셋팅.
            //그렇지 않으면 갯수를 1씩 감소시켜서 갯수입력란에 셋팅한다.

            if (numbox==1){
                $('#numbox').val(1)    
            }else{
                $('#numbox').val(numbox-1);
            }
        
        })





        //2번
            //버튼 태그를 선택 -> 클릭이벤트 연결(on) -> 콜백함수
            $("#result").on("click",function(){

            //속성선택자 : $( "태그명[속성='값']") -> 사용자가 어떠한 항목을 체크했는지 여부를 파악
            //        $("input[type='checkbox']")
            var str="";
            $(".hobby:checked").each(function(){
                        //사용자가 선택한 것 $(this)에 대한 값을 가져오기
                //console.log($(this).val());
                str +="<h1>"+$(this).val()+"</h>"
                $("div").html(str)
                // console.log($("input[type='checkbox']")[0].is("checked"));
               
                })

            })



            
        //3번
            //textarea 태그 선택
            var content=$('textarea');
            //textarea 태그에 keyup 이벤트(키보드 누를때마다) 연결 (on)
            content.on("keyup",function(){
                //textarea 태그에 입력한 값을 가져오기
                $('#num').html(content.val().length);
                //length앞의 . 앞에 배열이 오면 배열의 길이를 살린다.
                //lenght앞의 . 앞에 문자열이 오면 문자의 길이를 살린다.
            })



        //4-1번
            var one = $('#one')
            var two = $('#two')
            var three = $('#three')

            $('#total1').on("click",function(){
            three.val(Number(one.val())+Number(two.val()));
            }) //total1의 onclick

        
        //4-2번
            var price = $('#price')
            var select = $('#select')
            var total2 = $('#total2')

            select.on("change",function(){
                total2.text(Number(price.val())*Number(select.val()))

            })


        //4-3번 
            $('#btn2').on("click",function(){
                //속성선택자 : "태그명 [속성='값']"
                var str2=0;
                $(".fruit:checked").each(function(){
                    str2+=Number($(this).val());
                    $("#total3").html(str2)
                        })
        
                    })

//배열.each - 배열의 길이만큼 반복

        //5번
            //form 태그의 값을 서버로 submit 했을 때
            $('form').on("submit",function(){
                var id = $('#id')
                var pass = $('#pass')
               
                if (id.val()=='' || id.val()==null){
                    
                    id.val("아이디를 입력하세요.")
                    id.on("click",function(){
                        id.val("")
                    })
                    return false;
                } else if (pass.val()==''|| pass.val()==null){
                    pass.val("비밀번호를 입력하세요.")
                    pass.on("click",function(){
                        pass.val("")
                    })
                    return false;
                }
        
            })
            









            })//onload

