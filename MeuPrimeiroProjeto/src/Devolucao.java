import java.util.Date;

public class Devolucao {
	private Cliente cliente;
	private Livro livro;
	private Date data;
	
	public Devolucao(Cliente cliente, Livro livro, Date data) {
		this.cliente = cliente;
		this.livro = livro;
		this.data = data;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
}
