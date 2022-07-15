package poly;
// 제품을 사는 사람 객체
public class Buyer {
	// 소유 금액
	int money=1000;
	Product[] item = new Product[5];  //전체 item(5개가 저장된 큰 item)자체는 new product랑 연결
	int i=0; //item[i], 그 안의 item 하나하나 자체는 비어있으니 new computer, new Tv로 주소 연결
	// 제품을 사는 기능
	void buy(Product p) {
		// 내가 가진 금액 = 내가 가진 금액-제품가격
		// 소유금액(money) = 소유금액(money)-제품 가격
		money-=p.price;
		System.out.println(p.toString()+"을/를 구입하였습니다.");
		item[i++]=p;
	}
}
