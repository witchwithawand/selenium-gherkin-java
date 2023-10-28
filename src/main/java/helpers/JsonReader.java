package helpers;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class JsonReader {

    public String username;
    public String password;
    public String url;
    public String env;
    public String role;
    public void getProperties(){
        ObjectMapper mapper = new ObjectMapper();
        try{
            TestPropertiesPojo prop = mapper.readValue(new File("src/main/resources/testdata/TestProperties.json"),
                    TestPropertiesPojo.class);
            this.username = prop.getUsername();
            this.password = prop.getPassword();
            this.url = prop.getUrl();
            this.env = prop.getEnv();
            this.role = prop.getRole();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        JsonReader reader = new JsonReader();
        reader.getProperties();
        System.out.println(reader.env);
    }
}
