public class Client {
    public static void main(String[] args) {
        // 创建不同的滤镜
        ImageFilter cutout = new CutoutFilter();
        ImageFilter blur = new BlurFilter();
        ImageFilter sharpen = new SharpenFilter();
        ImageFilter texture = new TextureFilter();

        // 处理JPG图片
        System.out.println("Processing JPG image:");
        Image jpg = new JPGImage("photo.jpg", cutout);
        jpg.process();
        jpg.setFilter(blur);
        jpg.process();

        // 处理GIF图片
        System.out.println("\nProcessing GIF image:");
        Image gif = new GIFImage("animation.gif", sharpen);
        gif.process();
        gif.setFilter(texture);
        gif.process();

        // 处理BMP图片
        System.out.println("\nProcessing BMP image:");
        Image bmp = new BMPImage("picture.bmp", texture);
        bmp.process();
        bmp.setFilter(cutout);
        bmp.process();
    }
}
