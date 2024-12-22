public class GameClient {
    private SceneFactory factory;
    private Map map;
    private Weather weather;
    private Sound sound;

    public void createScene(String type) {
        if (type.equalsIgnoreCase("desert")) {
            factory = new DesertSceneFactory();
        } else if (type.equalsIgnoreCase("snow")) {
            factory = new SnowSceneFactory();
        }
        
        map = factory.createMap();
        weather = factory.createWeather();
        sound = factory.createSound();
    }

    public void loadScene() {
        map.load();
        weather.apply();
        sound.play();
    }

    public static void main(String[] args) {
        GameClient client = new GameClient();

        System.out.println("Loading Desert Scene:");
        client.createScene("desert");
        client.loadScene();

        System.out.println("\nLoading Snow Scene:");
        client.createScene("snow");
        client.loadScene();
    }
}
