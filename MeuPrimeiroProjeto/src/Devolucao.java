import java.util.Date;

public class Devolucao {
	private Cliente cliente;
	private Livro livro;
	private Date data;
	
	public Devolucao(Aluguel aluguel, Date data) {
		this.cliente = aluguel.getCliente();
		this.livro = aluguel.getLivro();
		this.data = data;
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

	public Date getData() {
		return data;
	}
}
