package pl.sda.filewriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public enum SingletonEnum  {

    INSTANCE;

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
