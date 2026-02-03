public class TPE {
    private static TPE instance;
    double CA;

    private TPE() {
        this.CA = 0.0;
    }

    public static TPE getInstance() {
        if (instance == null) {
            instance = new TPE();
        }
        return instance;
    }

    public void addTransaction(double montant) {
        this.CA += montant;
        System.out.println("Transaction enregistrée : " + montant + "€");
        System.out.println("Chiffre d'affaires actuel : " + CA + "€");
    }

    public double getCA () {
        return this.CA;
    }

    public void reset() {
        System.out.println("CA total : " + CA + "€.");
        this.CA = 0.0;
        System.out.println("Chiffre d'affaires réinitialisé.");
    }
}
