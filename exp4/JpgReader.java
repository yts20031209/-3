public class JpgReader implements ImageReader {
    @Override
    public void read(String filename) {
        System.out.println("Reading JPG image: " + filename);
    }
}
