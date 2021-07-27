import java.util.Date;

public class Main {
	
	public static void main(String[] args) {
		Cliente laura = new Cliente("193.567.970-80", "Laura", "81 98222-9856");
		Cliente monique = new Cliente("185.254.720-00", "Monique", "81 99876-9087");
		
		Funcionario jorge = new Funcionario("662.631.620-66", "Jorge");
	
		Livro percyJackson = new Livro("Rick Riordan", 39.99, "Percy Jackson");
		
		Aluguel aluguel = new Aluguel(new Date(), percyJackson, jorge, laura);
		
		Devolucao devolucao = new Devolucao(aluguel, new Date());
		
		System.out.println(devolucao.getCliente().getTelefone());
	}
}
