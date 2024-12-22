public class DesertSceneFactory extends SceneFactory {
    @Override
    public Map createMap() {
        return new DesertMap();
    }

    @Override
    public Weather createWeather() {
        return new SunnyWeather();
    }

    @Override
    public Sound createSound() {
        return new DesertSound();
    }
}
