import java.util.ArrayList;

public class GerenciadorRotas {
    private ArrayList<Rota> listaRotas = new ArrayList<>();

    public void adicionar(Rota rota) {
        listaRotas.add(rota);
    }

    public ArrayList<Rota> listarTodas() {
        return listaRotas;
    }

    public ArrayList<Rota> buscarPorOrigem(Aeroporto origem) {
        ArrayList<Rota> rotasDaOrigem = new ArrayList<>();
        for (Rota rota : listaRotas) {
            if (rota.getOrigem() == origem)
                rotasDaOrigem.add(rota);
        }
        return rotasDaOrigem;
    }
}
