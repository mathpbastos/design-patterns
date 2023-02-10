package edu.learning.logs;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import edu.learning.model.Log;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CSVLog extends ILogAdapter{
    
    public CSVLog(String nomeArquivo){
        super(nomeArquivo + ".csv");
    }

    @Override
    public void lerLogs() throws IOException {
        FileReader leitor = null;
        try {
            leitor = new FileReader(super.arquivo);

            CSVReader leitorCSV = new CSVReader(leitor);
            String[] next;

            while ((next = leitorCSV.readNext()) != null) {
                for (String data : next) {
                    System.out.print(data + "\t");
                }
                System.out.println();
            }

        } catch (IOException ex) {
            throw new IOException("Erro durante a leitura de "
                    + super.arquivo.getName() + "\n" + ex.getMessage());
        } finally {
            try {
                leitor.close();
            } catch (IOException ex) {
                throw new IOException("Erro ao fechar arquivo " 
                        + super.arquivo.getName()
                        + " " + ex.getMessage());
            }
        }
    }

    @Override
    public void escreverLog(Log log) throws IOException {

        try {
            FileWriter arquivoSaida = new FileWriter(super.arquivo);

            CSVWriter escritor = new CSVWriter(arquivoSaida);

            String[] data = {
                log.getTipo(),
                log.getInformacao(),
                log.getUsuario().getNome() + " " + log.getUsuario().getSobrenome(),
                log.getTimestamp().format(super.formatador)
            };

            escritor.writeNext(data);

            escritor.close();

        } catch (IOException ex) {
            throw new IOException("Erro ao abrir o arquivo " 
                    + super.arquivo.getName() + "\n"
                    + ex.getMessage());
        }

    }

}
