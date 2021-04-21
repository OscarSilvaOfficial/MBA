package br.com.tests;

import java.io.*;
import java.util.List;

public class FilesFunc {

    FileReader streamReader;
    FileWriter stream;
    PrintWriter print;
    List<String> content;
    String path;

    public FilesFunc(String path) throws IOException {
        this.content = content;
        this.path = path;
        this.stream = new FileWriter(path);
        this.print = new PrintWriter(this.stream);
        this.streamReader = new FileReader(path);
    }

    public void read() {

    }

    public void  write(List<String> content) {

        try {

            for(String linha: this.content) {
                print.println(linha);
            }

            print.close();
            stream.close();

            System.out.println("Arquivo salvo em: " + this.path);
        } catch (IOException e) {
            System.out.println(e);
        }

    }

}
