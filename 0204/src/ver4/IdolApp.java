package ver4;

import factory.IdolPrinterFactory;
import util.IdolPrinter;
import vo.Idol;

public class IdolApp {

	public static void main(String[] args) {

		Idol idol = new Idol("우기",165,50);
		
		IdolPrinter printer = IdolPrinterFactory.getIdolPrinter(idol, "G");
		
		printer.print();
		
	}// main() end
	
}// IdolApp end
