package library.managers;

import library.dataProvider.ConfigFileReader;
import library.dataProvider.CsvDataReader;
import library.dataProvider.JsonDataReader;

public class FileReaderManager {
    private static FileReaderManager fileReaderManager = new FileReaderManager();
    private static ConfigFileReader configFileReader;
    private static JsonDataReader jsonDataReader;
    private static CsvDataReader csvDataReader;

    private FileReaderManager(){

    }

    public static FileReaderManager getInstance(){
        return fileReaderManager;
    }

    public JsonDataReader getJsonReader(){
        return (jsonDataReader == null) ? jsonDataReader = new JsonDataReader() : jsonDataReader;
    }

    public CsvDataReader getCsvDataReader(){
        return (csvDataReader == null) ? csvDataReader = new CsvDataReader() : csvDataReader;
    }

    public  ConfigFileReader getConfigFileReader(){
        return (configFileReader == null) ? configFileReader = new ConfigFileReader() : configFileReader;
    }
}
