package ir.maktab.decorator;

public class Jpeg extends ImageDecorator {
    public Jpeg(ImageReader imageReader) {
        super(imageReader);
    }

    @Override
    public void read() {
        super.read();
        System.out.println("image type jpeg");
    }
}
