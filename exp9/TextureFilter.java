public class TextureFilter implements ImageFilter {
    @Override
    public void apply(String image) {
        System.out.println("Applying texture filter to " + image);
    }
}
