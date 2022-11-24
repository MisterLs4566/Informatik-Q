package OOM.Warteschlange;

public class Waschanlage {
    private String name;
    private Auto[] schlange;
    private int anzAutos;
    public Waschanlage(String name) {
        this.name = name;
        this.schlange = new Auto[11];
        this.anzAutos = 0;
    }
    public void aufruecken() {
        for(int i = 0; i < this.schlange.length - 1; i++) {
            if(this.schlange[i] == null) {
                this.schlange[i] = this.schlange[i + 1];
                this.schlange[i + 1] = null;
            }
        }
    }

    public void wegfahren(int stelle) {
        this.schlange[stelle] = null;
        aufruecken();
    }

    public void setAuto(Auto auto) {
        if(this.schlange[0] == null) {
            this.schlange[0] = auto;
        }
        else {
            if(this.anzAutos < this.schlange.length - 1) {
                this.schlange[this.anzAutos + 1] = auto;
                this.anzAutos++;
                this.aufruecken();
            }
        }
    }

    public String toString() {
        String zeichenkette = "Name: " + this.name + " ";
        for(int i = 0; i < this.schlange.length; i++) {
            if(this.schlange[i] != null) {
                zeichenkette = zeichenkette + " " + schlange[i].toString();
            }
        }

        return zeichenkette;
    }

    public void warteschlangeAusgeben() {
        for(int i = 0; i < this.schlange.length; i++) {
            if(this.schlange[i] == null) {
                System.out.println(i + " " + this.schlange[i]);
            }
            else {
                System.out.println(i + " Auto");
            }
        }
    }
}
