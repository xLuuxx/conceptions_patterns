public class Main {
    public static void main(String[] args) {
        Sandwich sandwich1 = new SandwichBuilder("baguette")
                .meat("jambon")
                .cheese("emmental")
                .veggies("tomate, laitue")
                .sauce("mayo")
                .build();

        System.out.println("Sandwich 1 : " + sandwich1);

        Sandwich sandwich2 = new SandwichBuilder("complet")
                .meat("Chicken")
                .cheese("emmental")
                .veggies("tomate, laitue, oignon, cornichon")
                .sauce("mayo")
                .grilled(true)
                .build();

        System.out.println("Sandwich 2 : " + sandwich2);

        Sandwich sandwich3 = new SandwichBuilder("ciabatta")
                .meat("jambon")
                .cheese("cheddar")
                .build();

        System.out.println("Sandwich 3 : " + sandwich3);
    }
}
