package library;

import com.google.gson.Gson;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.*;
import java.util.Arrays;
import java.util.Properties;

/**
 * Created by greycat on 18.03.14.
 */
public class DataReader {

    public void ReadJasonData(){

    }

    public void ReadConfigFile() throws IOException {
        BufferedReader reader;
        Properties properties = new Properties();

        reader = new BufferedReader(new FileReader(""));
        properties.load(reader);
        reader.close();
        properties.getProperty("");
    }

    public void GsonFileReader() throws IOException {
        BufferedReader reader;
        Gson gson = new Gson();

        reader = new BufferedReader(new FileReader(""));
        String[] data =  gson.fromJson(reader, String[].class);
        Arrays.asList(data);
        reader.close();
    }

    public void CSVReadder() throws IOException {

        String[] lines;
        BufferedReader reader;

        reader = new BufferedReader(new FileReader(""));
        while (reader.readLine() != null){
            lines = reader.readLine().split(",");
            System.out.println(lines[0] + lines[1]);
        }
    }

    public void XMLReader() throws IOException, ParserConfigurationException, SAXException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new File(""));
        document.getDocumentElement().normalize();

        NodeList nodeList = document.getElementsByTagName("Employee");
        for (int i = 0; i <= nodeList.getLength(); i++){
            nodeList.item(i).getNodeName();
        }
    }

}
