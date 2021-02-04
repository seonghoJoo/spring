package util;

import vo.Idol;

public class IdolPrinterCN implements IdolPrinter{

	private Idol idol;
	
	public IdolPrinterCN(Idol idol) {
		this.idol = idol;
	}

	public IdolPrinterCN() {
	}
	
	public Idol getIdol() {
		return idol;
	}

	public void setIdol(Idol idol) {
		this.idol = idol;
	}

	@Override
	public void print() {
		System.out.println("name: " + idol.getName()+" /height: "+idol.getHeight()+" /weight: "+ idol.getWeight());
	}
	
}
