package edu.learning.logs;

import com.google.gson.Gson;
import edu.learning.model.Log;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JSONLog extends ILogAdapter{

    private Gson gson;

    public JSONLog(String nomeArquivo) {
        super(nomeArquivo + ".json");
        this.gson = new Gson();
    }

    @Override
    public void escreverLog(Log log) throws IOException {

        FileWriter escritor = null;
        try {
            gson.toJson(log);
            escritor = new FileWriter(super.arquivo);
            escritor.write(gson.toJson(log));
        } catch (IOException ex) {
            throw new IOException("Erro durante a leitura de "
                    + arquivo.getName() + "\n" + ex.getMessage());
        } finally {
            try {
                escritor.close();
            } catch (IOException ex) {
                throw new IOException("Erro ao fechar arquivo " + arquivo.getName()
                        + " " + ex.getMessage());
            }
        }

    }

    @Override
    public void lerLogs() throws IOException {

        FileReader leitor = null;
        try {
            leitor = new FileReader(super.arquivo);
            List<Log> logs = new ArrayList();
            logs.add(gson.fromJson(leitor, Log.class));
            
            for(Log log: logs){
                System.out.println("Tipo: " + log.getTipo());
                System.out.println("Informação: " + log.getInformacao());
                System.out.println("Usuario: " + log.getUsuario().getNome() + " "
                        + log.getUsuario().getSobrenome());
                System.out.println("Data e Hora: " + log.getTimestamp()
                        .format(super.formatador) + "\n");
            }
                

        } catch (IOException ex){
            throw new IOException("Erro durante leitura do arquivo " +
                    arquivo.getName() + " " + ex.getMessage());
        }

    }

}
