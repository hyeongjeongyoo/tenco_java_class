package basic.exercise.toy;

public class Product{
	
	String productName;  // 상품 이름
	int productNum;	// 상품 갯수
	int price;

	public Product() {
		price = 100;
	}

	public void showInfo() {
		System.out.println("상품이름 : " + productName);
		System.out.println("가격 : " + price);
	}
	
}
