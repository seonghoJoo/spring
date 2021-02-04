package util;

import vo.Idol;

public class IdolPrinterENG implements IdolPrinter  {
	
	private Idol idol;
	
	public IdolPrinterENG() {
	}
	
	// 방법 1 : 생성자 주입
	public IdolPrinterENG(Idol idol) {
		this.idol = idol;
	}

	// 방법 2: 세터 주입 (필구쌤 pick)
	public void setIdol(Idol idol) {
		this.idol = idol;
	}
	
	public void print() {
		System.out.println("name: " + idol.getName()+" /height: "+idol.getHeight()+" /weight: "+ idol.getWeight());
	}
}
