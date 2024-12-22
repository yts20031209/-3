public class CutoutFilter implements ImageFilter {
    @Override
    public void apply(String image) {
        System.out.println("Applying cutout filter to " + image);
    }
}
