
public class ContaCorrente extends Conta{
	private double limite = 200.00;
	
	@Override
	public void sacar(double valor) {
        if (valor <= getSaldo() & valor <= getLimite()) {
            double novoSaldo = getSaldo() - valor;
            setSaldo(novoSaldo);
        } else {
        	System.out.println("Saque não permitido! Saldo insuficiente ou valor limite de saque atingido na conta: " + getNumero());
        }
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
}
