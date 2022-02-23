package strategy;

public class ImageStorage {
    private String compressor;
    private String filter;

    public ImageStorage(String compressor, String filter) {
        this.compressor = compressor;
        this.filter = filter;
    }

    public void store(String filename) {
        if (compressor == "jpeg")
            System.out.println("Compressing using JPEG");
        else if (compressor == "png")
            System.out.println("Compressing using PNG");

        if (filter == "b&w")
            System.out.println("Applying B&W filter");
        else if (compressor == "high-contrast")
            System.out.println("Applying high contrast filter");
    }
}
