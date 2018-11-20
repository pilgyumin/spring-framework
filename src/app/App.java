package app;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import frame.Biz;


public class App {

	public static void main(String[] args) {
		AbstractApplicationContext factory = new 
				GenericXmlApplicationContext("mybiz.xml");
		//custbiz
		Biz pbiz = (Biz) factory.getBean("pbiz");
		pbiz.register();
		pbiz.remove();
		pbiz.modify();
	}

}
