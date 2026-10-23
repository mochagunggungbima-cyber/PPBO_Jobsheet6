public class Keyboard {
    // Atribut privat sesuai diagram (-)
    private String merk;
    private String tipeKonek;
    private int jumlahTombol;

    // Konstruktor
    public Keyboard(String merk, String tipeKonek, int jumlahTombol) {
        this.merk = merk;
        this.tipeKonek = tipeKonek;
        this.jumlahTombol = jumlahTombol;
    }

    // Method publik sesuai diagram (+)
    public void ketik() {
        System.out.println("Keyboard " + merk + " sedang digunakan untuk mengetik.");
    }

    // Getter dan Setter
    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getTipeKonek() {
        return tipeKonek;
    }

    public void setTipeKonek(String tipeKonek) {
        this.tipeKonek = tipeKonek;
    }

    public int getJumlahTombol() {
        return jumlahTombol;
    }

    public void setJumlahTombol(int jumlahTombol) {
        this.jumlahTombol = jumlahTombol;
    }
}