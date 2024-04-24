package basic.exercise.toy2;

// 클래스 - 인형뽑기
// 상품들 존재 가능
// 사자인형, 곰인형, 에어팟

// 요구조건
// 배열을 활용해서 객체들을 담아주세요.
public class ToyMachine {
	
	String name;
	Product[] products;
	int productCount;
	final int MAX_PRODUCT = 3;

	
	// 사용자가 돈을 넣고 게임을 한다.
	public void addMoney(Product product) {
		if(productCount < MAX_PRODUCT) {
			products[productCount] = product;
			productCount++;
		}else {
			System.out.println("상품이 없습니다.");
		}
	}
	
	// 상품의 정보 출력
	public void showInfo(Product product) {
		System.out.println(name);
	}
	
	// 상품 추가
	public void addProduct(Product product) {
		if(productCount < MAX_PRODUCT) {
			products[productCount] = product;
		}
	}

}
