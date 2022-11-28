package Vererbung.Fahrzeuge;

public class AppFahrzeuge {
    public static void main(String[] args) {
        Auto aAuto = new Auto();
        System.out.println(aAuto.toString());

        Auto aKrankenwagen = new Krankenwagen();
        System.out.println(aKrankenwagen.toString());


    }
}
