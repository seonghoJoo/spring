package factory;


import util.IdolPrinter;
import util.IdolPrinterENG;
import util.IdolPrinterGER;
import util.IdolPrinterJPN;
import util.IdolPrinterKOR;
import vo.Idol;

// 팩토리 패키지 필요할까..?
public class IdolPrinterFactory {

	// 멤버 필드가 필요없기 때문에 static으로 하자
	public static IdolPrinter getIdolPrinter(Idol idol, String c) {
		if(c.equalsIgnoreCase("k")) {
			return new IdolPrinterKOR(idol);
		}else if(c.equalsIgnoreCase("E")) {
			return new IdolPrinterENG(idol);
		}else if(c.equalsIgnoreCase("G")) {
			return new IdolPrinterGER(idol);
		}else if(c.equalsIgnoreCase("J")) {
			return new IdolPrinterJPN(idol);
		}
		// 일본어를 추가하고 싶다?
		// else if(J)를 추가하자~!
		return null; 
	}
}
