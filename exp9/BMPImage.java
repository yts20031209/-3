public class BMPImage extends Image {
    public BMPImage(String filename, ImageFilter filter) {
        super(filename, filter);
    }

    @Override
    protected void parseFile() {
        System.out.println("Parsing BMP file: " + filename);
    }
}
