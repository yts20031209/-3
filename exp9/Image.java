public abstract class Image {
    protected ImageFilter filter;
    protected String filename;

    public Image(String filename, ImageFilter filter) {
        this.filename = filename;
        this.filter = filter;
    }

    public void process() {
        parseFile();
        filter.apply(filename);
    }

    public void setFilter(ImageFilter filter) {
        this.filter = filter;
    }

    protected abstract void parseFile();
}
