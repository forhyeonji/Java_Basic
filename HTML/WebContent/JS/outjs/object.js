/**
 * object 객체
 */

//window.alert("안녕")

//객체 선언 {}
var product={
	//속성
	제품명 : "아이스 아메리카노",
	유형 : "커피",
	//메서드(객체 안에서의 함수)
	eat : function(drink){  //익명함수
		alert(drink+"를 마십니다.")
	},
	food : function(bab){
		alert(bab+"맛있게 드세요.");
	}
}

product.food("파스타")
alert(product.제품명)
product.eat("ice-americano")

