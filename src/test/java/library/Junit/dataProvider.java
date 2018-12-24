package library.Junit;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * dataProvider Created by x000814 on 20-Sep-18
 */
public class dataProvider {

    BufferedReader bufferedReader;

    public void ReadGson() throws FileNotFoundException {

        Gson gson = new Gson();
        bufferedReader = new BufferedReader(new FileReader(""));
        String[] data =  gson.fromJson(bufferedReader, String[].class);
        Arrays.asList(data);
    }

    public void ReadCSV(){
        String line;
        List<List<String>> lists = new ArrayList<>();

        try {
            bufferedReader = new BufferedReader(new FileReader(""));
            while ((line = bufferedReader.readLine()) != null){
                lists.add(Arrays.asList(line.split(",")));
            }
        }catch (FileNotFoundException e){
            throw new RuntimeException(e.getMessage());
        }catch (IOException e){
            throw new RuntimeException(e.getMessage());
        }finally {
            try {
                if (bufferedReader != null) bufferedReader.close();
            }catch (IOException e){
                throw new RuntimeException(e.getMessage());
            }
        }
    }

}
