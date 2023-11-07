package abstractex.quiz;

public class qz3 {

	public static void main(String[] args) {
		Human human  = new Human();
		human.sleep();
		human.move();
		human.read();
		
		System.out.println();
		Tiger tiger = new Tiger();
		tiger.sleep();
		tiger.move();
		tiger.hunting();
		
	}

}
abstract class Animal{
	public abstract void move();
	public abstract void sleep();
	
}

class Human extends Animal{

	@Override
	public void move() {
		System.out.println("사람은 두 발로 걷습니다.");
		
	}

	@Override
	public void sleep() {
		System.out.println("밤에는 잠을 잡니다.");
		
	}//책을 읽는 메소드 추가
	public void read() {
		System.out.println("사람이 책을 읽습니다.");
		
	}
	
}

class Tiger extends Animal{

	@Override
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
		
	}

	@Override
	public void sleep() {
		System.out.println("밤에는 잠을 잡니다.");
		
	}//책을 읽는 메소드 추가
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
		
	}
	
}