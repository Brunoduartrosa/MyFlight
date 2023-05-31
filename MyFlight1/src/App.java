import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class App {
    public static void main(String[] args) throws Exception {

        LeituraDados leitura = new LeituraDados();
        leitura.leArquivo("C:\\Users\\bruno\\Desktop\\dados\\airlines.txt");
        leitura.leArquivo("C:\\Users\\bruno\\Desktop\\dados\\airports.txt");
        leitura.leArquivo("C:\\Users\\bruno\\Desktop\\dados\\countries.txt");
        leitura.leArquivo("C:\\Users\\bruno\\Desktop\\dados\\equipment.txt");
        leitura.leArquivo("C:\\Users\\bruno\\Desktop\\dados\\routes.txt");

        CiaAerea ciaAerea = new CiaAerea("G3", "GOL");
        ciaAerea.imprimir();

        System.out.println("Total de empresas: " + CiaAerea.getTotalCias());

        Aeronave aeronave = new Aeronave("01", "boeing");
        aeronave.imprimir();
    }
}


