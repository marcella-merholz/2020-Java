package at.dcv.FotoApparat;

public class FotoApparat {

    private String name;
    private String modell;
    private String release;
    private String price;
    private double megaPixel;
    private int weight;


    public FotoApparat(String name, String modell, String release, String price, double megaPixel, int weight) {
        this.name = name;
        this.modell = modell;
        this.release = release;
        this.price = price;
        this.megaPixel = megaPixel;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getModell() {
        return modell;
    }

    public String getRelease() {
        return release;
    }

    public String getPrice() {
        return price;
    }

    public double getMegaPixel() {
        return megaPixel;
    }

    public int getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public void setRelease(String release) {
        this.release = release;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setMegaPixel(double megaPixel) {
        this.megaPixel = megaPixel;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Hersteller: " + name + " | " +
                "Modell: " + modell + " | " +
                "Markteinführung: " + release + " | " +
                "Preis: " + price + " | " +
                "Megapixel: " + megaPixel + " | " +
                "Gewicht: " + weight + "g";
    }

}


