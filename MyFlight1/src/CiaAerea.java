
public class CiaAerea implements Imprimivel{
	private static int totalCias = 0;
	private String codigo;
	private String nome;
	
	public CiaAerea(String codigo, String nome) {
		totalCias++;
		this.codigo = codigo;
		this.nome = nome;
	}

	public static int compareTo(CiaAerea cia) {
		return 0;
	}

	public String getCodigo() {
		return codigo;
	}
	
	public String getNome() {
		return nome;
	}	

	public static int getTotalCias(){
		return totalCias;
	}

	public void imprimir() {
		System.out.println(codigo+ " - " +nome);
	}
}

