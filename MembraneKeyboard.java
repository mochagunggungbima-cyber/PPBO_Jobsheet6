public class MembraneKeyboard extends Keyboard {
    // Atribut privat tambahan sesuai diagram (-)
    private boolean tahanAir;

    // Konstruktor
    public MembraneKeyboard(String merk, String tipeKonek, int jumlahTombol, boolean tahanAir) {
        super(merk, tipeKonek, jumlahTombol);
        this.tahanAir = tahanAir;
    }

    // Method publik sesuai diagram (+)
    public void infoMembrane() {
        System.out.println("--- Info Membrane Keyboard ---");
        System.out.println("Merk          : " + getMerk());
        System.out.println("Tipe Koneksi  : " + getTipeKonek());
        System.out.println("Jumlah Tombol : " + getJumlahTombol());
        System.out.println("Tahan Air     : " + (tahanAir ? "Ya" : "Tidak"));
    }

    // Getter dan Setter untuk tahanAir
    public boolean isTahanAir() {
        return tahanAir;
    }

    public void setTahanAir(boolean tahanAir) {
        this.tahanAir = tahanAir;
    }
}