import java.util.Date;

public class Aluguel {
	private Date data;
	private Livro livro;
	private Funcionario funcionario;
	private Cliente cliente;

	
	public Aluguel(Date data, Livro livro, Funcionario funcionario, Cliente cliente) {
		this.data = data;
		this.livro = livro;
		this.funcionario = funcionario;
		this.cliente = cliente;
	}

	public Date getData() {
		return data;
	}
	
	public String getNomeLivro() {
		return livro.getNome();
	}
	
	public String getAutorLivro() {
		return livro.getAutor();
	}
	
	public double getValorLivro() {
		return livro.getValor();
	}
	
	public String getNomeFuncionario() {
		return funcionario.getNome();
	}
	
	public String getCpfFuncionario() {
		return funcionario.getCpf();
	}
	
	public Cliente[] getClientesFuncionario() {
		return funcionario.getClientes();
	}
	
	public String getNomeCliente() {
		return cliente.getNome();
	}
	
	public String getCpfCliente() {
		return cliente.getCpf();
	}
	
	public String getTelefoneCliente() {
		return cliente.getTelefone();
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public Livro getLivro() {
		return livro;
	}
	
	public Funcionario getFuncionario() {
		return funcionario;
	}
}
