package at.dcv.FotoApparat;

import at.dcv.People.People;

public class Main {
    public static void main(String[] args) {

        FotoApparat f1 = new FotoApparat("Nikon", "Z 50", "11 / 2019", "949,00 Euro", 20.7, 445);
        FotoApparat f2 = new FotoApparat("Canon", "EOS 850D", "04 / 2020", "899,00 Euro", 24, 515);
        FotoApparat f3 = new FotoApparat("Canon", "PowerShot G7 X Mark III", "08 / 2019", "779,00 Euro", 20, 300);

        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);

        System.out.printf("%-15s %-25s %-20s %-15s %-15s %-15s %n", "Hersteller", "Modell", "Markteinführung", "Preis", "Megapixel", "Gewicht");
        printData(f1);
        printData(f2);
        printData(f3);
    }

    public static void printData (FotoApparat f){
        System.out.printf("%-15s %-25s %-20s %-15s %-15s %-15s %n", f.getName(), f.getModell(), f.getRelease(), f.getPrice(), f.getMegaPixel(), f.getWeight());
    }

}
