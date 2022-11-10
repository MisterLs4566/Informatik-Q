package OOM.Radios;

public class RadioApp {
    public static void main(String[] args) {
        Radio linusRadio = new Radio();
        linusRadio.an();
        linusRadio.lauter();
        linusRadio.lauter();
        linusRadio.waehleSender(95);
        System.out.println(linusRadio.toString());
    }
}
