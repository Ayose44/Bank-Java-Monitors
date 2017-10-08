package BankMonitor;

public class Cajeros extends Thread {
Cuenta cb;
	public Cajeros(String nombre,Cuenta cb){
		setName(nombre);
		this.cb=cb;
	}
	
	public void run(){
		
		for(int i=0;i<5;i++){
		double aleatorio=(double)(Math.random()*500)+1;
		boolean retirado = cb.Retirar(aleatorio);
		if(retirado==true){
			try {
				sleep((int)Math.random()*1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Withdrawn money:  " + aleatorio + "€");
			System.out.println("Stills " + cb.getSaldo() + "€");
		}else{
			System.out.println("Is impossible to take money at this moment");
		}
		}
		}
	
}
