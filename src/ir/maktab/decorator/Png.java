package ir.maktab.decorator;

public class Png extends ImageDecorator {
    public Png(ImageReader imageReader) {
        super(imageReader);
    }

    @Override
    public void read() {
        super.read();
        System.out.println("image type png");
    }
}
