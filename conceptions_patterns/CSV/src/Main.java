public class Main {
    public static void main(String[] args) {
        AnalyseurVentes analyseur = new CSVAdapter("ventes.csv");

        BurgerAnalytics analytics = new BurgerAnalytics(analyseur);

        analytics.genererRapport();
    }
}
