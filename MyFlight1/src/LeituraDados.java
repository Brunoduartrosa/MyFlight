import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeituraDados {

    public void leArquivo(String dados){
        BufferedReader leitor = null;
        try {
            leitor = new BufferedReader(new FileReader(dados));
            String linha;

            while ((linha = leitor.readLine()) != null) {
                System.out.println(linha);

            }
        }
        catch(IOException e){
            e.printStackTrace();{
            }

        } finally {
            if (leitor != null){
                try {
                    leitor.close();
                }catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
