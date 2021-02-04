package ver1;

import vo.Idol;

public class IdolApp {
	
	// 선언?
	// 멤버필드
	
	public static void main(String[] args) {
		
		// 다형성 Object와 Idol의 자료형이 다르다.
		
		// 지역 변수
		Idol idol  = new Idol("진",178,70);
		
		
		
		// 아이돌 한명
		Idol idol2 = new Idol("우기",165,50);
		System.out.println("이름: " + idol2.getName()+" /키: "+idol2.getHeight()+" /몸무게: "+ idol2.getWeight());
		
	}// main() end
	
	public static void print(Idol idol) {
		System.out.println("이름: " + idol.getName()+" /키: "+idol.getHeight()+" /몸무게: "+ idol.getWeight());
	}
	
	
}//IdolApp end
