package strategy;

public class Main {

    public static void main(String[] args) {
        var imageStorage = new ImageStorage(new PngCompressor(), new BlackAndWhiteFilter());

        imageStorage.store("file");
    }
}
