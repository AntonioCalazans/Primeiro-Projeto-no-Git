package teste;

//Comentário

public class Conta {
	
	private String numero;
	private float valor; 
	
	
	public String getNumero() {
		return numero;
	}

	
	public float getValor() {
		return valor;
	}

	public void setValor(float saldo) {
		valor = valor + saldo;
		
		
	}

	public Conta (String numerConta, float novoValor) {
		numero = numerConta;
		valor = novoValor;
	}
	
	public void creditar(float valorCreditado) {
		
		valor = valorCreditado;
	}
	
	public void debitar (float valorDebitado) {
		
		valor = valor - valorDebitado;
		
		if (valorDebitado > valor) {
			System.out.println("Conta ficará negativa");
		}
	}
	
	
	public static void main(String[] args) {
		Conta obj1 = new Conta("Antonio", 0);
		obj1.creditar(2000);
		obj1.debitar(2001);
		System.out.println("O valor total é de: " + obj1.getValor());
	}

}
