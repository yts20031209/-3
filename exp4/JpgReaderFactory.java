public class JpgReaderFactory extends ImageReaderFactory {
    @Override
    public ImageReader createReader() {
        return new JpgReader();
    }
}
