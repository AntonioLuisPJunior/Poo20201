package lab7;

class MinhaThread1 extends Thread{
	public void run(){
		System.out.println("Bom dia");
	}		
}

class Teste1 {
    public static void main(String[] args) {
        new MinhaThread1().start();
    }
}