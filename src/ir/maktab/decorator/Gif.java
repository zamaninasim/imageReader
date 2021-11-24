package ir.maktab.decorator;

public class Gif extends ImageDecorator {
    public Gif(ImageReader imageReader) {
        super(imageReader);
    }

    @Override
    public void read() {
        super.read();
        System.out.println("image type gif");
    }
}
