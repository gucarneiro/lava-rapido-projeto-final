import java.io.IOException;
import java.io.FileWriter;
import java.util.ArrayList;

public class Arquivo {


    void gerarRelatorio(ArrayList<Cliente> lista) throws IOException {
        var nomeArquivo = "C:\\Users\\gustavo\\OneDrive\\Área de Trabalho\\relatorio.txt";
        FileWriter escreverArqv = new FileWriter(nomeArquivo);

        escreverArqv.write("Todos os clientes atendidos: ");
        for (int i = 0; i < lista.size(); i++){
            Cliente c = lista.get(i);

            escreverArqv.write("\n\nNome: "+c.getNome());
            escreverArqv.write("\nModelo: "+c.getModelo());
            escreverArqv.write("\nCor: "+c.getCor());
            escreverArqv.write("\nPlaca: "+c.getPlaca());
            escreverArqv.write("\nServico realizado: "+c.getServico());
            escreverArqv.write("\nValor: "+c.getValor());

            escreverArqv.write("\n\n ------------------------------------ ");
        }
        escreverArqv.close();
    }
}
