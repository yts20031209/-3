import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class EncryptorFactory {
    private static Properties config = null;

    private static void loadConfig() {
        if (config == null) {
            config = new Properties();
            try {
                config.load(new FileInputStream("config.properties"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static Encryptor getEncryptor(String type) {
        loadConfig();
        String className = config.getProperty("encryptor." + type + ".class");
        try {
            Class<?> clazz = Class.forName(className);
            return (Encryptor) clazz.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
