package soal2;
import java.util.Arrays;
public class Anjing extends HewanPeliharaan{
    private String warnaBulu;
    private String kemampuan;
    public Anjing(String r, String n, String warnaBulu, String[] kemampuan) {
        super(r, n);
        this.warnaBulu = warnaBulu;
        this.kemampuan = Arrays.toString(kemampuan);
    }
    public void displayDetailAnjing(){
        super.display();
        System.out.println("Warna Bulu: "+warnaBulu);
        System.out.println("Kemampuan: "+kemampuan);
    }
}
