package ir.maktab.decorator;

public class ImageDecorator implements ImageReader {
    ImageReader imageReader;

    public ImageDecorator(ImageReader imageReader) {
        this.imageReader = imageReader;
    }

    @Override
    public void read() {
        this.imageReader.read();
    }
}
