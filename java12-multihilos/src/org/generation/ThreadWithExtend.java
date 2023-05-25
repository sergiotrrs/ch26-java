package org.generation;


class Iteration {
	String name;
	
	Iteration(String name){
		this.name = name;
	}
	
	public void numberOfIteration(int number) {
		for (int i = 0; i < number; i++) {
			System.out.println("Obj: "+ this.name+", Iteration: " + i);
		}
	}
}

class MyThread extends Thread{
	
	public MyThread(String name) {
		super(name);
	}
	
	/**
	 * Método que será concurrente.
	 */
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000); // suspendemos el hilo en 1 s.
			} catch (InterruptedException e) {				
				e.printStackTrace();
			} 
			System.out.println("IdThread: "+ super.getId() 
			+" Obj: "+  super.getName() +", Iteration: " + i);
		}
		
	}
}

public class ThreadWithExtend {
	
	public static void main(String[] args) {
		Iteration it01 = new Iteration("it01");
		Iteration it02 = new Iteration("it02");
		Iteration it03 = new Iteration("it03");
		
		it01.numberOfIteration(2);
		it02.numberOfIteration(2);
		it03.numberOfIteration(2);
		
		//---- Realizar concurrencia ---------------
		// Realizar múltiples tareas simultáneamente
		MyThread hilo01 = new MyThread("hilo01");
		MyThread hilo02 = new MyThread("hilo02");
		MyThread hilo03 = new MyThread("hilo03");
		
		hilo01.start();
		hilo02.start();
		hilo03.start();
	}

}
