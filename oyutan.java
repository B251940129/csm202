package Lab07;
public class Oyutan {
    private String ner;
    private int nas;
    private String oyutniikod;

    public Oyutan(String ner, int nas, String oyutniikod) {
        this.ner = ner;
        this.nas = nas;
        this.oyutniikod = oyutniikod;
    }

    public String getOyutniikod() {
        return oyutniikod;
    }

    public String getNer() {
        return ner;
    }

    @Override
    public String toString() {
        return "Kod: " + oyutniikod + ", Ner: " + ner + ", Nas: " + nas;
    }
}
