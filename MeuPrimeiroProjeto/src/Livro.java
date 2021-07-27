public class Livro {
	private String autor;
	public String nome;
	private double valor;
	
	public Livro(String autor, double valor, String nome) {
		this.autor = autor;
		this.valor = valor;
		this.nome = nome;
	}

	public String getAutor() {
		return autor;
	}

	public String getNome() {
		return autor;
	}
	
	public double getValor() {
		return valor;
	}

	public void setValor(Float valor) {
		this.valor = valor;
	}
}
