package abstractex.quiz;

import java.util.ArrayList;

/*
 * 동물
클래스 타입의 리스트를 생성하세요
리스트에
사람과 호랑이 객체를 추가하세요
리스트안에 저장된 객체를 꺼내서 객체가 가지고 있는 모든 메소드를 호출하세요 (instanceof 사용하여 다운캐스팅)
 * */
public class qz5 {

	public static void main(String[] args) {
		ArrayList<Animal> list = new ArrayList<Animal>();
		list.add(new Human());
		list.add(new Tiger());

		for (int i = 0; i < list.size(); i++) {
			Animal ani = list.get(i);
			ani.sleep();
			ani.move();

			if (ani instanceof Human) {
				Human human = (Human) ani; //ani 변수, Human 앞에 나온 ex2의 클래스 이름
				human.read();
			}
			if (ani instanceof Tiger) {
				Tiger tiger = (Tiger) ani;
				tiger.hunting();
			}
		}

	}

}
