
public class TestaValores {

	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		
		Conta conta2 = new Conta(1337, 14665);
		
		Conta conta3 = new Conta(1637, 21004);
		
		System.out.println("O total de contas é " + Conta.getTotal());
		

	}

}
