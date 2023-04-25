package threads;

public class THREADS_main {

	public static void main(String[] args) {
		MyThread ss = new MyThread("s");
		Thread s = new Thread(ss);
		MyThread tt = new MyThread("t");
		Thread t = new Thread(tt);
		
		s.start();
		t.start();

	}

}
