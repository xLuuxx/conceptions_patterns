public class ClientVIP implements Observer {
    private String nom;
    private String email;

    public ClientVIP(String nom, String email) {
        this.nom = nom;
        this.email = email;
    }

    @Override
    public void update(Promotion promotion) {
        System.out.println("Email envoyé à " + nom + " (" + email + ")");
        System.out.println("Nouvelle promotion: " + promotion.toString());
    }

    public String getNom() {
        return nom;
    }
}
