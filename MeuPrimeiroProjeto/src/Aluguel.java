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
	
	public void setData(Date data) {
		this.data = data;
	}
	
	public Livro getLivro() {
		return livro;
	}
	
	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	
	public Funcionario getFuncionario() {
		return funcionario;
	}
	
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
