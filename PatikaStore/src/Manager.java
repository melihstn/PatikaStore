public class Manager<T> {

    private final int id;
    private static int nextId = 1;
    private String marka;
    private double fiyat;
    private double indirimorani;
    private int stok;
    private String name;
    private int hafiza;
    private double ekranBoyutu;
    private int ram;

    public Manager(int id, String marka, double fiyat, double indirimorani, int stok, String name, int hafiza, double ekranBoyutu, int ram) {
        this.id = id;
        nextId++;
        this.marka = marka;
        this.fiyat = fiyat;
        this.indirimorani = indirimorani;
        this.stok = stok;
        this.name = name;
        this.hafiza = hafiza;
        this.ekranBoyutu = ekranBoyutu;
        this.ram = ram;
    }

    public int getId() {
        return id;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Manager.nextId = nextId;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    public double getIndirimorani() {
        return indirimorani;
    }

    public void setIndirimorani(double indirimorani) {
        this.indirimorani = indirimorani;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHafiza() {
        return hafiza;
    }

    public void setHafiza(int hafiza) {
        this.hafiza = hafiza;
    }

    public double getEkranBoyutu() {
        return ekranBoyutu;
    }

    public void setEkranBoyutu(double ekranBoyutu) {
        this.ekranBoyutu = ekranBoyutu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
}
