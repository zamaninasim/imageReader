package ir.maktab.decorator;

public class BasicImageReader implements ImageReader {
    @Override
    public void read() {
        System.out.print("Your image has been uploaded->>");
    }
}