package br.com.files;

import java.lang.List;

public class TestFiles {

    public static void main(String[] args) {

        String fileName = "pc.csv";
        String dir = System.getProperty("user.home");
        String path = dir + "\\" + fileName;

        List<String> content = new ArrayList<String>();

        for (int i = 0; i < 10; i++) {
            content.add(i + ";");
        }

    }

}
