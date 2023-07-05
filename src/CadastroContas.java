
public class CadastroContas {
	public static void main(String[] args) {
		Conta ca = new Conta();
		Conta cb = new Conta();
		
		ContaCorrente cca = new ContaCorrente();
		ContaCorrente ccb = new ContaCorrente();
		
		ca.setNumero(1010);
		ca.setSaldo(100);
		cb.setNumero(2020);
		cb.setSaldo(254.25);
		cca.setNumero(3030);
		cca.setSaldo(0.14);
		ccb.setNumero(4040);
		ccb.setSaldo(687.98);
		
		ca.depositar(20);
		cb.sacar(30);
		cca.depositar(250);
		ccb.sacar(287);
		
		System.out.println("Saldo da conta " + ca.getNumero() + ": " + ca.getSaldo() + "\n" +
				"Saldo da conta " + cb.getNumero() + ": " + cb.getSaldo() + "\n" +
				"Saldo da conta " + cca.getNumero() + ": " + cca.getSaldo() + "\n" +
				"Saldo da conta " + ccb.getNumero() + ": " + ccb.getSaldo() + "\n");
	}
}
