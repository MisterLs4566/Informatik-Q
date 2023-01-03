package Listen;

public class AppListe {
    public static void main(String[] args) {
        Liste ListeEinfach = new Liste();
        Element element1 = new Element("Inhalt");
        Element element2 = new Element("Inhalt2");

        System.out.println(ListeEinfach.toString());

        ListeEinfach.append(element1);
        ListeEinfach.append(element2);

        System.out.println(ListeEinfach.toString());
        System.out.println("Anzahl: " + ListeEinfach.getCount());
    }
}
