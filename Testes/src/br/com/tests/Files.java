package br.com.tests;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Files {

    public static void main(String[] args) throws IOException {
        String fileName = "pc.csv";
        String dir = System.getProperty("user.home");
        String path = dir + "/" + fileName;
        List<String> content = new ArrayList<String>();

        for (int i = 0; i < 10; i++) {
            content.add(i + ";");
        }

        new FilesFunc(path, content).write();
    }
}

