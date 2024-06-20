package petunia_store_01_model;

public class Estendida extends Produto {

	private String marca;
	}

	public Estendida(Float codigo, String nome, double preco, String marca) {
		// TODO Auto-generated constructor stub
		super(codigo, nome, preco, marca);
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Estendida [marca=" + marca + "]";
	}

	
}
