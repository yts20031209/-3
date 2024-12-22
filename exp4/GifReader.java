public class GifReader implements ImageReader {
    @Override
    public void read(String filename) {
        System.out.println("Reading GIF image: " + filename);
    }
}
