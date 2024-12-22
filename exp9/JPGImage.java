public class JPGImage extends Image {
    public JPGImage(String filename, ImageFilter filter) {
        super(filename, filter);
    }

    @Override
    protected void parseFile() {
        System.out.println("Parsing JPG file: " + filename);
    }
}
