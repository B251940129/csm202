package Lab07;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OyutanManager {
    private List<Oyutan> oyutnuud;

    public OyutanManager() {
        oyutnuud = new ArrayList<>();
    }

    public void oyutanNemex(Oyutan o) {
        oyutnuud.add(o);
        System.out.println("Oyutan nemegdsen!");
    }

    public void oyutanUsatgax(String kod) {
        boolean ustgagsan = oyutnuud.removeIf(o -> o.getOyutniikod().equals(kod));
        if (ustgagsan) {
            System.out.println("Oyutan ustgagdlaa!");
        } else {
            System.out.println("Oyutan oldsongui!");
        }
    }

    public Oyutan oyutanHaix(String kod) {
        for (Oyutan o : oyutnuud) {
            if (o.getOyutniikod().equals(kod)) {
                return o;
            }
        }
        return null;
    }

    public void buhOyutniigHaruulah() {
        if (oyutnuud.isEmpty()) {
            System.out.println("Oyutan bhgu bna!");
            return;
        }
        for (Oyutan o : oyutnuud) {
            System.out.println(o);
        }
    }

    public void nereerEreembelye() {
        oyutnuud.sort(Comparator.comparing(Oyutan::getNer));
        System.out.println("Nerere erembelegdlee!");
    }
}
