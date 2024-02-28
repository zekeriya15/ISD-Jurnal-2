public class Bag implements Comparable<Bag> {
    String kode;
    String jenis;
    String nama;
    int stok;

    
    public Bag(String kode, String jenis, String nama, int stok) {
        this.kode = kode;
        this.jenis = jenis;
        this.nama = nama;
        this.stok = stok;
    }


    @Override
    public String toString() {
        return "Bag [kode=" + kode + ", jenis=" + jenis + ", nama=" + nama + ", stok=" + stok + "]";
    }

    public String getKode() {
        return kode;
    }


    public String getJenis() {
        return jenis;
    }


    public String getNama() {
        return nama;
    }


    public int getStok() {
        return stok;
    }


    @Override
    public int compareTo(Bag o) {
        return this.getKode().compareTo(o.getKode());
    }

    
    
}
