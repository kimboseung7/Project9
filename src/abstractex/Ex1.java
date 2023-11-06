package abstractex;

public class Ex1 {

	public static void main(String[] args) {
		//Computer computer = new Computer(); //You can't create instances because computers are abstract classes
		DeskTop desktop = new DeskTop();
		LapTap laptop = new LapTap();
		
		desktop.turnOn();
		desktop.turnOff();
		desktop.display(); // 재정의했음 Redefineed
		desktop.typing();//Redefineed
		
		laptop.turnOn();
		laptop.turnOff();
		laptop.display(); //Redefineed
		laptop.typing(); //Redefineed
	}

}
abstract class Computer{
	//공통기능은 일반메소드로 선언 Common functions are declared as general methods
	public void turnOn() {
		System.out.println("전원을 켭니다");
	}
	public void turnOff() {
		System.out.println("전원을 끕니다");
	}
	//추상메소드 선언
	public abstract void display();
	
	public abstract void typing();
}

class DeskTop extends Computer{

	@Override
	public void display() {
		System.out.println("DeskTop Display()");
		
	}

	@Override
	public void typing() {
		System.out.println("DeskTop Typing()");
		
	}
	
}

class LapTap extends Computer{

	@Override
	public void display() {
		System.out.println("LapTop Display()");
		
	}

	@Override
	public void typing() {
		System.out.println("LapTop Typing()");
		
	}
	
}