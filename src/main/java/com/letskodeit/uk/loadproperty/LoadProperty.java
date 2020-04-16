package com.letskodeit.uk.loadproperty;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LoadProperty {
    String projectPath = System.getProperty("user.dir");

    static Properties prop;
    static FileInputStream input;

    public String getProperty(String key) {
        prop = new Properties();

        try {
            input = new FileInputStream(projectPath + "/src/test/java/com/letskodeit/uk/resources/propertiesfile/config.properties/");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            prop.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop.getProperty(key);
    }

    public static void main(String[] args) {
        LoadProperty loadProperty=new LoadProperty();
        System.out.println(loadProperty.getProperty("browser"));
    }

}



