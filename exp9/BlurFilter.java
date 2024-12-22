public class BlurFilter implements ImageFilter {
    @Override
    public void apply(String image) {
        System.out.println("Applying blur filter to " + image);
    }
}
