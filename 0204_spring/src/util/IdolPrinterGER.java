package util;

import vo.Idol;

public class IdolPrinterGER implements IdolPrinter  {

	private Idol idol;
	
	public IdolPrinterGER() {
	}
	public IdolPrinterGER(Idol idol) {
		this.idol = idol;
	}
	// 데코레이트 패턴
	@Override
	public void print() {
		System.out.println("Ger이름: " + idol.getName()+" /Ger키: "+idol.getHeight()+" /Ger몸무게: "+ idol.getWeight());
	}
	//@Override 인터페이스에서 받아왔다 증서임.
	public void print2() {
		System.out.println("zszzx");
	}
}
