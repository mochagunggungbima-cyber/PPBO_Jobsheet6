public class MechanicalKeyboard extends Keyboard {
    // Atribut privat tambahan sesuai diagram (-)
    private String tipeSwitch;

    // Konstruktor
    public MechanicalKeyboard(String merk, String tipeKonek, int jumlahTombol, String tipeSwitch) {
        super(merk, tipeKonek, jumlahTombol);
        this.tipeSwitch = tipeSwitch;
    }

    // Method publik sesuai diagram (+)
    public void infoMechanical() {
        System.out.println("--- Info Mechanical Keyboard ---");
        System.out.println("Merk          : " + getMerk());
        System.out.println("Tipe Koneksi  : " + getTipeKonek());
        System.out.println("Jumlah Tombol : " + getJumlahTombol());
        System.out.println("Tipe Switch   : " + tipeSwitch);
    }

    // Getter dan Setter untuk tipeSwitch
    public String getTipeSwitch() {
        return tipeSwitch;
    }

    public void setTipeSwitch(String tipeSwitch) {
        this.tipeSwitch = tipeSwitch;
    }
}