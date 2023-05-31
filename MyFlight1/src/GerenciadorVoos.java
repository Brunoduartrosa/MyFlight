import java.time.LocalDate;
import java.util.ArrayList;

public class GerenciadorVoos {
    private ArrayList<Voo> listaVoos = new ArrayList<>();

    public void adicionar(Voo voo) {
        listaVoos.add(voo);
    }

    public ArrayList<Voo> listarTodos() {
        return listaVoos;
    }

    public ArrayList<Voo> buscarData(LocalDate data) {
        ArrayList<Voo> voosNaData = new ArrayList<>();
        for (Voo voo : listaVoos) {
            if (voo.getDatahora().toLocalDate() == data)
                voosNaData.add(voo);
        }
        return voosNaData;
    }

}
