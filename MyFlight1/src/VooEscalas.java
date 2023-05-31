import java.time.Duration;
import java.time.LocalDateTime;

public class VooEscalas extends Voo {

    private Rota rotaFinal;
    public VooEscalas(Rota rota, LocalDateTime datahora, Duration duracao) {
        super(rota, datahora, duracao);
        this.rotaFinal = rotaFinal;
    }
    public Rota getRotaFinal(){return rotaFinal;}

    /*
    toString desta forma abaixo será desnecessário, pois utilizaremos o super.toString().
    @Override
    public String toString(){
       return getStatus() + " " + getDatahora() + "("+getDuracao()+")" + getRota() + " -> " + rotaFinal;}
    */
    @Override
    public String toString(){
        return super.toString() + " -> " + rotaFinal;
    }

}
