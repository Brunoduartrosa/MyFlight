import java.util.ArrayList;

public class GerenciadorCias {
	private ArrayList<CiaAerea> listaEmpresas = new ArrayList<>();

	public void adicionar(CiaAerea cia) {
		listaEmpresas.add(cia);
	}

	public ArrayList<CiaAerea> listarTodas() {
		return listaEmpresas;
	}

	public ArrayList<CiaAerea> buscarPorCodigo(String cod) {
		ArrayList<CiaAerea> ciasCodigo = new ArrayList<>();
		for (CiaAerea cia : listaEmpresas) {
			if (cia.getCodigo() == cod)
				listaEmpresas.add(cia);
		}
		return ciasCodigo;
	}

	public ArrayList<CiaAerea> buscarPorNome(String cod) {
		ArrayList<CiaAerea> ciasCodigo = new ArrayList<>();
		for (CiaAerea cia : listaEmpresas) {
			if (cia.getNome() == cod)
				listaEmpresas.add(cia);
		}
		return ciasCodigo;
	}

}
