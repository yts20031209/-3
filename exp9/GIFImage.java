public class GIFImage extends Image {
    public GIFImage(String filename, ImageFilter filter) {
        super(filename, filter);
    }

    @Override
    protected void parseFile() {
        System.out.println("Parsing GIF file: " + filename);
    }
}
