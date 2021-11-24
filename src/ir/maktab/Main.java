package ir.maktab;

import ir.maktab.decorator.*;
import ir.maktab.model.Image;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean end = false;
        do {
            Image image = getImage(scanner);
            switch (image.getType().toLowerCase()) {
                case "gif":
                    ImageReader gif = new Gif(new BasicImageReader());
                    gif.read();
                    end = true;
                    break;
                case "jpeg":
                    ImageReader jpeg = new Jpeg(new BasicImageReader());
                    jpeg.read();
                    end = true;
                    break;
                case "png":
                    ImageReader png = new Png(new BasicImageReader());
                    png.read();
                    end = true;
                    break;
                default:
                    System.out.println("your img type is not supported,enter another img");
            }
        } while (!end);
    }

    private static Image getImage(Scanner scanner) {
        System.out.println("Enter your image name:");
        String name = scanner.next();
        System.out.println("Enter your image type:");
        String type = scanner.next();
        Image image = new Image(name, type);
        return image;
    }

}
