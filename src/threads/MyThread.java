package threads;

public class MyThread implements Runnable {
	
	public String name;
	
	public MyThread(String name) {
		this.name = name;
		
	}

	
	public void run() {
		for(int i= 1;i<101; i++) {
			System.out.println(name+i);
		}
		
	}
	

}
