public class Atk implements Comparable<Atk>{
    String kode;
    String jenis;
    String nama;
    int stok;

    public Atk(String kode, String jenis, String nama, int stok) {
        this.kode = kode;
        this.jenis = jenis;
        this.nama = nama;
        this.stok = stok;
    }

    
    @Override
    public String toString() {
        return "Atk [kode=" + kode + ", jenis=" + jenis + ", nama=" + nama + ", stok=" + stok + "]";
    }


    public String getKode() {
        return kode;
    }


    public void setKode(String kode) {
        this.kode = kode;
    }


    public String getJenis() {
        return jenis;
    }


    public void setJenis(String jenis) {
        this.jenis = jenis;
    }


    public String getNama() {
        return nama;
    }


    public void setNama(String nama) {
        this.nama = nama;
    }


    public int getStok() {
        return stok;
    }


    public void setStok(int stok) {
        this.stok = stok;
    }

    @Override
    public int compareTo(Atk o) {
        return this.getKode().compareTo(o.getKode());
    }


    
    

    
}
