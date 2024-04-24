package basic.exercise.toy;

public class LionDoll extends Product{

	public LionDoll() {
		productName = "사자인형";
		price = 2000;
	}
	
	public void LionPrice() {
		System.out.println("사자 인형을 뽑습니다.");
		price -= 500;
	}
	
}
