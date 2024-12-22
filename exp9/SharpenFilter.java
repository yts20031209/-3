public class SharpenFilter implements ImageFilter {
    @Override
    public void apply(String image) {
        System.out.println("Applying sharpen filter to " + image);
    }
}
