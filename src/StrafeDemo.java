public class StrafeDemo {
    public static void main(String[] args) {
        Strafe miri = new Strafe();
        miri.vorname = "Mirjam";
        miri.nachname = "Weirer";
        miri.kennzeichen = "G-897UM";
        miri.strafnnummer = 2;
        miri.strafe = 0;
        miri.anzahl = 0;

        Strafe tommy = new Strafe();
        tommy.vorname = "Thomas";
        tommy.nachname = "Mölecnik";
        tommy.kennzeichen = "LE-454HE";
        tommy.strafnnummer = 33;
        tommy.strafe = 0;
        tommy.anzahl = 2;

        System.out.println(miri.nachname + " " + miri.vorname + ", " + miri.kennzeichen + " Kennzeichen " + miri.strafnnummer + " Strafnummer:");
        miri.strafe(15);
        miri.sonstiges(15.5);
        System.out.println("Die Strafe bträgt nun (nach möglichem Rabatt) " + miri.getStrafe(miri.anzahl));
        System.out.println();
        System.out.println(tommy.nachname + " " + tommy.vorname + " " + tommy.kennzeichen + " Kennzeichen " + tommy.strafnnummer + " Strafnummer:");
        tommy.strafe(40);
        tommy.verbandspaket();
        tommy.alkohol(1.0);
        System.out.println("Die Strafe bträgt nun (nach möglichem Rabatt) " + miri.getStrafe(tommy.anzahl));
    }
}
