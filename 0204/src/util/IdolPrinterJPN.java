package util;

import vo.Idol;

public class IdolPrinterJPN implements IdolPrinter{

	private Idol idol;

	public IdolPrinterJPN() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void print() {
		
		System.out.println("名前 : "+idol.getName()+
"身長 : "+idol.getHeight()+
" cm / 体重 : "+idol.getWeight()+
"kg");
		
	}
	
	public IdolPrinterJPN(Idol idol) {
		this.idol = idol;
	}
	
	
	
	
}
