public class SnowSceneFactory extends SceneFactory {
    @Override
    public Map createMap() {
        return new SnowMap();
    }

    @Override
    public Weather createWeather() {
        return new SnowyWeather();
    }

    @Override
    public Sound createSound() {
        return new SnowSound();
    }
}
