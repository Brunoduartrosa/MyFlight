import java.util.ArrayList;

public class GerenciadorAeronaves {

    private ArrayList<Aeronave> listaAeronaves = new ArrayList<>();

    public void adicionar(Aeronave aviao) {
        listaAeronaves.add(aviao);
    }

    public ArrayList<Aeronave> listarTodas() {
        return listaAeronaves;
    }

    public Aeronave buscarPorCodigo(String cod) {
        Aeronave match = null;
        for (Aeronave aviao : listaAeronaves) {
            if (aviao.getCodigo() == cod) {
                match = aviao;
            }
        }
        return match;
    }
}
