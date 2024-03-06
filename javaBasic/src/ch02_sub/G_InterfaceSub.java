package ch02_sub;

class InterfaceSub implements G_Message{
	
	int method3 (int number) {
        System.out.println(G_Message.GREETING_MESSGE);
		
		System.out.println(G_Message.GOODBYE_MESSGE);
		return 3 + number;
		
		
	}
	
	
}

public class G_InterfaceSub implements G_Message, G_Method  {
	
	public void method1 () {
		System.out.println(G_Message.GREETING_MESSGE);
		
		System.out.println(G_Message.GOODBYE_MESSGE);
	}
	
	public void method2() {
		System.out.println(G_Message.GREETING_MESSGE);
		
		System.out.println(G_Message.GOODBYE_MESSGE);
	}

}
