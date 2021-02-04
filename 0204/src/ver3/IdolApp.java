package ver3;

import util.IdolPrinter;
import util.IdolPrinterKOR;
import vo.Idol;

public class IdolApp {

	// 유지 보수 측면
	public static void main(String[] args) {
		
		// 시나리오 이름 키 몸무게는 한글이나 우리 서비스가 잘되서 영어로 바꾸어야 함
		// 국제화 처리
		// 아이돌 우기
		Idol idol = new Idol("우기",165,50);		

		// 한글로 출력 영어로 출력 독어로 출력
		IdolPrinter printer = new IdolPrinterKOR(idol);
		
		// 메서드의 이름을 같게 하면 아~ 좋다
		printer.print();
		
		
	}//main() end
	
	
}//IdolApp end
