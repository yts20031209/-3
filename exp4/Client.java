public class Client {
    private ImageReaderFactory factory;

    public void setFactory(ImageReaderFactory factory) {
        this.factory = factory;
    }

    public void readImage(String filename) {
        ImageReader reader = factory.createReader();
        reader.read(filename);
    }

    public static void main(String[] args) {
        Client client = new Client();

        // 使用GIF阅读器
        client.setFactory(new GifReaderFactory());
        client.readImage("test.gif");

        // 使用JPG阅读器
        client.setFactory(new JpgReaderFactory());
        client.readImage("test.jpg");
    }
}
