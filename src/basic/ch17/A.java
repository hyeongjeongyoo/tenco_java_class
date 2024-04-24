package basic.ch17;

// 상상력 추가
// 선임이 작성한 코드라고 가정
public class A {

	String name;
	int height;
	int weight;
	int age;

	// 바로 수정하게 된다면 잘 돌아가는지 테스트를 해야 됨 + 일 추가

}

// 단, 하나의 자바 파일 안에 여러개의 클래스를 작성할 수 있다.
// 단, public 클래스는 오직 하나만 정의 가능하다.
// default 로 여기서만 사용 가능
// 복사 + 붙여넣기
class B {

	String name;
	int height;
	int weight;
	int age;

	int level;
	String nickNAme;
}

// 상속이라는 문법을 배운 개발자라면
class C extends A {

	int level;
	int nickName;
	String phone;

}