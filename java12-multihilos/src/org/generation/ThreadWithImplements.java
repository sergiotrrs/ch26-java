package org.generation;


class MyThreadRunnable implements Runnable {
	
	private String name;

	public MyThreadRunnable(String name) {		
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public long getId() {
		return Thread.currentThread().getId();
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000); // suspendemos el hilo en 1 s.
			} catch (InterruptedException e) {				
				e.printStackTrace();
			} 
			System.out.println("IdThread: "+ getId() 
			+" Obj: "+  getName() +", Iteration: " + i);
		}
	}
	
}



public class ThreadWithImplements {			
		
	public static void main(String[] args) {
		System.out.println("Thread with runnable interface");
		
		Runnable myThread01 = new MyThreadRunnable("hilo01");
		
		Thread hilo01 = new Thread(  myThread01 );
		Thread hilo02 = new Thread( new MyThreadRunnable("hilo2") );
		Thread hilo03 = new Thread( new MyThreadRunnable("hilo3") );		
		
		hilo01.start();
		hilo02.start();
		hilo03.start();
						
	}			

}
