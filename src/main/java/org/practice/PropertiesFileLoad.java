package main.java.org.practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileLoad {

    public static Properties propFileLoad(String path) throws IOException {
        File fl = new File(path);
        FileReader fr = new FileReader(fl);
        Properties pr = new Properties();
        pr.load(fr);
        return  pr;
    }

    public static void main(String[] args) throws IOException {
        Properties pr= PropertiesFileLoad.propFileLoad("src/main/resources/env.properties");
        System.out.println("pr.getProperty(\"QA1\") = " + pr.getProperty("QA1"));
    }
}
