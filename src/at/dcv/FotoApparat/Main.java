package at.dcv.FotoApparat;

public class Main {
    public static void main(String[] args) {
        FotoApparat nikon = new FotoApparat("Nikon D30", 19.3f, "Taiwan", "Alles in Einem");
        FotoApparat sony = new FotoApparat("Sony Alpha A6500", 23.8f, "Japan", "Super Automatik");

        Objektiv nikonStandard = new Objektiv(24, 80);
        nikon.setCurrentObjektiv(nikonStandard);

        System.out.println(nikon);
        System.out.println(sony);

        Speicherkarte sonyMSeries = new Speicherkarte("sonyMSeries", 128);
        Speicherkarte nikonQXD = new Speicherkarte("nikonQXD", 64);

        sony.setCurrentSpeicherkarte(sonyMSeries);
        sony.getFreePerCent();
        sony.makeFoto();
        sony.getFreePerCent();
        sony.makeFoto();

        sony.setCurrentSpeicherkarte(nikonQXD);
        sony.getFreePerCent();
        sony.makeFoto();
        sony.makeFoto();
        sony.makeFoto();
        sony.getFreePerCent();
        sony.makeFoto();

    }
}
