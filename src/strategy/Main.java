package strategy;

public class Main {

    public static void main(String[] args) {
        var imageStorage = new ImageStorage();

        imageStorage.store("file", new PngCompressor(), new BlackAndWhiteFilter());
        imageStorage.store("file", new JpegCompressor(), new HighContrastFilter());
    }
}
