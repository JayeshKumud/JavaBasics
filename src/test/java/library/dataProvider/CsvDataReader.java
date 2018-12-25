package library.dataProvider;

import library.managers.FileReaderManager;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CsvDataReader {
    private final String CsvFilePath = FileReaderManager.getInstance().getConfigFileReader().gettestDataResourcePath();
    private BufferedReader bufferedReader;
    private String line;

    public CsvDataReader(){

    }

    public List<List<String>> getEmployeeData_ListOfListOfString(){
        List<List<String> > data = new ArrayList();
        try {
            bufferedReader = new BufferedReader(new FileReader(CsvFilePath + "Employee.csv"));
            while ((line = bufferedReader.readLine()) != null){
                data.add(Arrays.asList(line.split(",")));
            }
            bufferedReader.close();
        }catch (FileNotFoundException e){
            throw new RuntimeException(e.getMessage());
        }catch (IOException e){
            throw new RuntimeException(e.getMessage());
        }
        return data;
    }

    public ArrayList<Object[]> getEmployeeData_ArrayListOfArrayOfObject(){
        ArrayList<Object[]> data = new ArrayList<>();
        try{
            bufferedReader = new BufferedReader(new FileReader(CsvFilePath + "Employee.csv"));
            while ((line = bufferedReader.readLine()) != null){
                data.add(line.split(","));
            }
            bufferedReader.close();
        }catch (FileNotFoundException e){
            throw new RuntimeException(e.getMessage());
        }catch (IOException e){
            throw new RuntimeException(e.getMessage());
        }
        return data;
    }

}
