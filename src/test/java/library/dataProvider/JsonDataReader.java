package library.dataProvider;

import com.google.gson.Gson;
import library.managers.FileReaderManager;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class JsonDataReader {
    private final String jsonFilePath = FileReaderManager.getInstance().getConfigFileReader().gettestDataResourcePath();

    public JsonDataReader(){

    }

    public ArrayList<Object[]> getEmployeeData_FromGson(){
        Gson gson = new Gson();
        ArrayList<Object[]> objects = new ArrayList<>();
        BufferedReader bufferedReader = null;

        try{
            bufferedReader = new BufferedReader(new FileReader(jsonFilePath + "Employee.json"));
            objects.add(gson.fromJson(bufferedReader, Object[].class));
        }catch (FileNotFoundException e){
            throw new RuntimeException(e.getMessage());
        }
        return objects;
    }

}
