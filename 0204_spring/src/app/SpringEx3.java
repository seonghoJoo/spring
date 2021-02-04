package app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import util.IdolPrinter;

public class SpringEx3 {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("/config/applicationContext.xml");
		
		IdolPrinter printer = (IdolPrinter)ctx.getBean("printer");
		
		printer.print();
		
		
	}//main() end

}//SpringEx3 end
