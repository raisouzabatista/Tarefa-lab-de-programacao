package questao9;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class GerenciadorDeArquivos {

	public static void lerArquivo(String nomeArquivo) {
        try {
            FileReader arquivo = new FileReader(nomeArquivo);
            BufferedReader leitor = new BufferedReader(arquivo);

            String linha;
            while ((linha = leitor.readLine()) != null) {
                System.out.println(linha);
            }

            leitor.close();
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }

	}
