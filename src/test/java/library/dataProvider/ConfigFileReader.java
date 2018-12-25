package library.dataProvider;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {

    private Properties properties;
    private final String configFilePath = "configs//Configuration.properties";

    public ConfigFileReader(){
        BufferedReader bufferedReader;
        try{
            bufferedReader = new BufferedReader(new FileReader(configFilePath));
            properties = new Properties();
            properties.load(bufferedReader);
            bufferedReader.close();
        }catch (FileNotFoundException e){
            throw new RuntimeException(e.getMessage());
        }catch (IOException e){
            throw new RuntimeException(e.getMessage());
        }finally {

        }
    }

    public String gettestDataResourcePath(){
        String testDataResourcePath = properties.getProperty("testDataResourcePath");
        if(testDataResourcePath != null) return testDataResourcePath;
        else throw new RuntimeException("testDataResourcePath not found");
    }
}
