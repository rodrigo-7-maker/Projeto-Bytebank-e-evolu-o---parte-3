
public class TestaGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		conta.setConta(1337);
		System.out.println(conta.getConta());
		
		Cliente rodrigo = new Cliente();
		rodrigo.setNome("Rodrigo Viana Rocha");
		
		conta.setTitular(rodrigo);
		System.out.println(conta.getTitulat().getNome());
		
		rodrigo.setProfissao("Programador");
		System.out.println(conta.getTitulat().getProfissao());
		

	}

}
