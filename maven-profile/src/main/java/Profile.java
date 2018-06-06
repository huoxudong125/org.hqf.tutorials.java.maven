import java.io.IOException;
import java.util.Properties;

public class Profile {
    public static void main(String[] args) {
        Properties prop = new Properties();
        try {
            //load a properties file from class path, inside static method
            prop.load(Profile.class.getClassLoader().getResourceAsStream("config.properties"));

            //get the property value and print it out
            System.out.println(prop.getProperty("mysql.host"));
            System.out.println(prop.getProperty("mysql.port"));

        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
