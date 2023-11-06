package abstractex;

public class Ex2 {

	public static void main(String[] args) {
		Animal animal = new Dog(); //부모로 형변환
		animal.sound();//재정의된 메소드가 호출됨
		
		Animal anima2 = new Cat();
		anima2.sound();
	}

}
abstract class Animal {
	String kind;
	
	public void breathe() {
		System.out.println("숨을 쉽니다");
	}
	public abstract void sound();
}
class Cat extends Animal{
	public Cat() {
		this.kind = "포유류"; //종류를 포유류로 초기화 시켜줌 //super을 써도 되긴 됨
	}

	@Override
	public void sound() {
		System.out.println("야옹"); //동물 내용에 맞게 문장을 완성해줌
		
	}
}

class Dog extends Animal{
	public Dog() {
		this.kind = "포유류";
		
	}

	@Override
	public void sound() {
		System.out.println("멍멍");
		
	}
}