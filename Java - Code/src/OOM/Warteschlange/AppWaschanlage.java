package OOM.Warteschlange;

public class AppWaschanlage {
    public static void main(String[] args) {
        Waschanlage myWaschanlage = new Waschanlage(" WASCHEN");
        Auto auto1 = new Auto("1223123124", 1);
        Auto auto2 = new Auto("201938217387213", 2);
        Auto auto3 = new Auto("398498342984392", 3);

        System.out.println(myWaschanlage.toString());

        myWaschanlage.setAuto(auto1);
        myWaschanlage.setAuto(auto2);
        myWaschanlage.setAuto(auto3);

        myWaschanlage.warteschlangeAusgeben();

        myWaschanlage.wegfahren(1);

        myWaschanlage.warteschlangeAusgeben();
    }
}
