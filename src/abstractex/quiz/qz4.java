package abstractex.quiz;

import java.util.ArrayList;

public class qz4 {

	public static void main(String[] args) {
		ArrayList<Car2> list = new  ArrayList<Car2>();
		
		list.add(new Bus());
		list.add(new AutoCar());
		
		for ( int i = 0; i < list.size(); i++) {
			Car2 car = list.get(i); //리스트 안에 저장된 요소 꺼내기
			car.run();
			car.refuel();
			//리스트에 저장된 Bus와 AutoCar을 꺼내서 가지고 있는 모든 기능을 호출
			if (car instanceof Bus) { //실제 인스턴스의 타입 확인
				Bus bus = (Bus) car;  //다운캐스팅
				bus.take();			  //버스가 가지고 있는 메소드 호출
			}
			if (car instanceof AutoCar) {
				AutoCar autoCar = (AutoCar) car;
				autoCar.load(); //오토카가 가지고 있는 메소드 호출
			}
		}
	}

}

