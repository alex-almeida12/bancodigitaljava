package bancodigital;

public class main {

	public static void main(String[] args) {
		
		Cliente alex = new Cliente();
		alex.setNome("Alex");
		
		Conta cc = new ContaCorrente(alex);
		Conta cp = new ContaPoupanca(alex);
		
		cc.depositar(100);
		cc.transferir(100, cp);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
	}
	
	
}
