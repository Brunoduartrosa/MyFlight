public class Aeronave implements  Imprimivel, Comparable<Aeronave>{
	private String codigo;
	private String descricao;

	public Aeronave(String codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void imprimir() {
		System.out.println(codigo + " - " + descricao);

	}

	@Override
	public int compareTo(Aeronave other) {
		return descricao.compareTo(other.descricao);
	}
}
