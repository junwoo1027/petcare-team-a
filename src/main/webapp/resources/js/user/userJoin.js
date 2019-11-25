$(document).ready(function() {
    $("#userJoin").validate({ // userJoin에 validate를 적용
        rules:{
            userId:{
            	required:true 
            	, rangelength:[5,10]
    			, remote:{
    				type:"post",
    				url:"/member/check_id"
    			}
            },
            // required는 필수, rangelength는 글자 개수(5~10개 사이)
            userPw:{required:true, rangelength:[8,16]},
            userPw2:{required:true, equalTo:"#userPw"},
            // equalTo : id가 password인 값과 같아야함
            userName:"required", // 검증값이 하나일 경우 이와 같이도 가능
            userEmail:{
            	required:true
            	, email:true
    			, remote:{
    				type:"post",
    				url:"/member/check_email"
    			} 
            },
            // email 형식 검증
            userPhone:{required:true, phone: true},
            // phone 형식 검증
            userAddress:"required"
        },
        messages:{  //rules에 해당하는 메시지를 지정하는 속성
            userId:{
                required:"ID를 입력하세요.",
                rangelength:"5글자 이상, 10글자 이하여야 합니다.",
                remote: "이미 존재하는 아이디입니다."
            },
            userPw:{
                required:"비밀번호를 입력하세요.",
                rangelength:"8글자 이상, 16글자 이하여야 합니다."
            },
            userPw2:{
                required:"비밀번호를 다시 입력하세요.",
                equalTo:"비밀번호가 서로 일치하지 않습니다."
            },
            userName:{
                required:"이름을 입력하세요."
            },
            userEmail:{
                required:"이메일을 입력하세요.",
                email: "이메일 형식이 아닙니다. ",
                remote: "이미 존재하는 이메일입니다."
            },
            userPhone:{
                required:"휴대전화번호를 입력하세요.",
                phone:"휴대전화번호 타입이 아닙니다."
            },
            userAddress:{
                required:"주소를 입력하세요."
            }
        }     
    });
});

