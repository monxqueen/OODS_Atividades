public class Main {

	public static void main(String[] args) {
		Cliente laura = new Cliente("123", "Laura", "819");
		Cliente monique = new Cliente("456", "Monique", "8192");
		Cliente[] clientes = { laura, monique };
		
		Funcionario jorge = new Funcionario("789", "Jorge", clientes);
		
		System.out.println(jorge.getClientes());
	}

}
