package app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import vo.Idol;

public class SpringEx1 {
	
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("/config/applicationContext.xml");
		
		// 객체를 만드는 주체 getBean의 return 자료형은 Object이다 따라서 강제형변환
		Idol idol = (Idol)ctx.getBean("idol");
		
		System.out.println(idol.getName());
		System.out.println(idol.getWeight());
		System.out.println(idol.getHeight());
		
	}//main() end
	
	
}//SpringEx1 end
