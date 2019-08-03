package pl.sda.filewriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterSingleton {

    private static FileWriterSingleton instance;

    private FileWriterSingleton() {

    }

    public synchronized static FileWriterSingleton getInstance(){
        if (instance == null) {
            instance = new FileWriterSingleton();
        }
        return instance;
    }

    public void write(String text, String file) {

        try {
            FileWriter fileWriter = new FileWriter(new File(file), true);
            fileWriter.write(text);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
