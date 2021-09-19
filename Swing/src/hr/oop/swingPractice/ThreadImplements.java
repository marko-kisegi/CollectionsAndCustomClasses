package hr.oop.swingPractice;

import javax.swing.SwingUtilities;

public class ThreadImplements implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0 ; i < 5 ; i++) {
			System.out.println("broj " + i);
		}
		System.out.println("Gotovo brojanje");
	}
	
	public static void main(String[] args) {
		Runnable r1, r2;
		r1 = new ThreadImplements();
		r2 = new ThreadImplements();
		new Thread(r1).start();
		new Thread(r2).start();
	}
	
}
