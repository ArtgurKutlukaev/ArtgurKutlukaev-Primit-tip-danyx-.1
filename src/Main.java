public class Main {


    public static void main(String[] args) {

        int amount = 40000;   // Соимость одного билета
        int minimumamont = 20; // Минимальная сумма для одной мили
        int mile = 1;   // количесвто мили

        if (minimumamont > 20) {
            mile = 1;
        }
        if (minimumamont < 20) {
            mile = 0;
        }
        System.out.println((amount / minimumamont * 1) + "количесвто миль");


    }
}