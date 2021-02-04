package util;

import vo.Idol;

public class IdolPrinterKOR implements IdolPrinter {
	
	// 디자인 패턴 이름 무엇??
	Idol idol;
	public IdolPrinterKOR() {
	}
	public IdolPrinterKOR(Idol idol) {
		this.idol = idol;
	}
	public void setIdol(Idol idol) {
		this.idol = idol;
	}
	
	@Override
	public void print() {
		System.out.println("이름: " + idol.getName()+" /키: "+idol.getHeight()+" /몸무게: "+ idol.getWeight());
	}
}
