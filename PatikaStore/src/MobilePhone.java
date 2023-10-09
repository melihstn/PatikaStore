import java.util.HashMap;

public class MobilePhone extends Manager<MobilePhone>{

    private int pilGucu;
    private String renk;

    public int getPilGucu() {
        return pilGucu;
    }

    public void setPilGucu(int pilGucu) {
        this.pilGucu = pilGucu;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public MobilePhone(int id, String marka, double fiyat, double indirimorani, int stok, String name, int hafiza, double ekranBoyutu, int ram, int pilGucu, String renk) {
        super(id, marka, fiyat, indirimorani, stok, name, hafiza, ekranBoyutu, ram);
        this.pilGucu = pilGucu;
        this.renk = renk;
    }

}


