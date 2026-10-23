public class Main {
    public static void main(String[] args) {
        // Membuat objek MechanicalKeyboard
        MechanicalKeyboard mech = new MechanicalKeyboard("Keychron K2", "Wireless", 84, "Gateron Brown");
        mech.ketik();
        mech.infoMechanical();

        System.out.println();

        // Membuat objek MembraneKeyboard
        MembraneKeyboard memb = new MembraneKeyboard("Logitech K120", "Wired", 104, true);
        memb.ketik();
        memb.infoMembrane();
    }
}