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
