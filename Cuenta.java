package BankMonitor;

public class Cuenta {
	private double saldo;
	public Cuenta(){

		saldo=0;


	}
	public synchronized double getSaldo(){



		return saldo;
	}
	public synchronized boolean Retirar(double valor){
		if (valor<= getSaldo()){
			saldo= saldo - valor;
			return true;
		}else
			return false;
	}
	public synchronized void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
