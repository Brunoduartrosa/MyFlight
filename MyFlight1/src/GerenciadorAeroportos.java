import java.util.ArrayList;

public class GerenciadorAeroportos {
    private ArrayList<Aeroporto> listaAeroporto = new ArrayList<>();

    public void adicionar(Aeroporto aero) {
        listaAeroporto.add(aero);
    }

    public ArrayList<Aeroporto> listarTodos() {
        return listaAeroporto;
    }

    public Aeroporto buscarPorCodigo(String cod) {
        Aeroporto match = null;
        for (Aeroporto aero : listaAeroporto) {
            if (aero.getCodigo() == cod) {
                match = aero;
            }
        }
        return match;
    }
}
