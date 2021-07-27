
public class Funcionario {
	private String cpf;
	private String nome;
	private Cliente[] clientes;
	
	public Funcionario(String cpf, String nome, Cliente[] clientes) {
		this.cpf = cpf;
		this.nome = nome;
		this.clientes = clientes;
	}

	public String getCpf() {
		return cpf;
	}

	public String getNome() {
		return nome;
	}

	public Cliente[] getClientes() {
		return clientes;
	}

	public void setClientes(Cliente[] clientes) {
		this.clientes = clientes;
	}
}
