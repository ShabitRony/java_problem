package jsonManipulation;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class QuizSystem {
    public static void main(String[] args) throws IOException {
        writeJSONArrayList();
    }
    public static void writeJSONArrayList() throws IOException {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name","user 3");
        jsonObject.put("age","23");
        JSONArray jsonArray =new JSONArray();
        jsonArray.add(jsonObject);

        System.out.println(jsonArray);
        FileWriter fileWriter = new FileWriter("./src/main/resources/users.json ");
        fileWriter.write(jsonArray.toJSONString());
        fileWriter.flush();
        fileWriter.close();
    }
}
