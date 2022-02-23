package strategy;

public class ImageStorage {

     public ImageStorage() {
    }

    public void store(String fileName, Compressor compressor, Filter filter) {
        compressor.compress(fileName);
        filter.apply(fileName);
    }
}
