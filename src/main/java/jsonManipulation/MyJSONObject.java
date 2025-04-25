package jsonManipulation;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;

public class MyJSONObject {
    public static void main(String[] args) throws IOException, ParseException {
//        readJSON();
//        writeJSON();
        writeJSONArrayList();
//        readJSONArray();
    }
    public static void readJSON() throws IOException, ParseException {
        JSONParser parser = new JSONParser();
        JSONObject jsonObject = (JSONObject) parser.parse(new FileReader("./src/main/resources/emp.json"));
        System.out.println(jsonObject);
      String name =(String) jsonObject.get("name");
      String desi = jsonObject.get("designation").toString();
      JSONObject address = (JSONObject) jsonObject.get("Address");
        System.out.println(address);
        System.out.println(name);
        System.out.println(desi);
        String house = jsonObject.get("house").toString();
        String thana = jsonObject.get("thana").toString();
        System.out.println(house);
        System.out.println(thana);
    }
    public static void writeJSON() throws IOException {
        JSONObject jsonObj = new JSONObject();
        jsonObj.put("name","Test User");
        jsonObj.put("department","IT");
        jsonObj.put("designation","Software Engineer");
        JSONObject address = new JSONObject();
        address.put("house","20/5");
        address.put("area","ECB");
        address.put("thana","Cantonment");
        jsonObj.put("Address",address);

        System.out.println(jsonObj);

        FileWriter fileWriter = new FileWriter("./src/main/resources/emp.json");
        fileWriter.write(jsonObj.toJSONString());
        fileWriter.flush();
        fileWriter.close();
    }
    public static void writeJSONArrayList() throws IOException {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name","user 2");
        jsonObject.put("age","22");
        JSONArray jsonArray =new JSONArray();
        jsonArray.add(jsonObject);

        System.out.println(jsonArray);
        FileWriter fileWriter = new FileWriter("./src/main/resources/users.json ");
        fileWriter.write(jsonArray.toJSONString());
        fileWriter.flush();
        fileWriter.close();
    }
    public static void readJSONArray() throws IOException, ParseException {
        JSONParser parser = new JSONParser();
        JSONArray jsonArray =(JSONArray) parser.parse(new FileReader("./src/main/resources/users.json"));
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name","user 3");
        jsonObject.put("age","23");
        jsonArray.add(jsonObject);
        System.out.println(jsonArray);

        FileWriter fileWriter = new FileWriter("./src/main/resources/users.json");
        fileWriter.write(jsonArray.toJSONString());
        fileWriter.flush();
        fileWriter.close();
    }
}
