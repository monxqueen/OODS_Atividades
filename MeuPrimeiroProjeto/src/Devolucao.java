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
