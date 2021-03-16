public class Strafe {
    //Attrinute
    String vorname; //Vorname
    String nachname; //Nachname
    String kennzeichen; //PKW-Kennzeichen
    int strafnnummer; //Fortlaufende Nummer
    double strafe; //Höhe der Strafe
    int anzahl; //zählt die Anzahl der Vergehen

    //Erhöt das Attribut strafe aufgrund einer Geschwindigkeitsüberschreitung. Erhöhen Sie die Anzahl der Vergehen
    public void strafe(int geschwindigkeitsueberschreitung){
        if (geschwindigkeitsueberschreitung < 20){
            strafe += 30;
            anzahl++;
            System.out.println("Geschwindigkeistüberschreitung von: " + geschwindigkeitsueberschreitung + " es fallen 30 Euro an und die Anzahl der Vergehen ist jetzt: " + anzahl + " hoch.");
        }else if (geschwindigkeitsueberschreitung < 30){
            strafe += 50;
            anzahl++;
            System.out.println("Geschwindigkeistüberschreitung von: " + geschwindigkeitsueberschreitung + " es fallen 50 Euro an und die Anzahl der Vergehen ist jetzt: " + anzahl + " hoch.");
        }else if (geschwindigkeitsueberschreitung < 50){
            strafe += 100;
            anzahl++;
            System.out.println("Geschwindigkeistüberschreitung von: " + geschwindigkeitsueberschreitung + " es fallen 100 Euro an und die Anzahl der Vergehen ist jetzt: " + anzahl + " hoch.");

        }else if (geschwindigkeitsueberschreitung < 100){
            strafe += 500;
            anzahl++;
            System.out.println("Geschwindigkeistüberschreitung von: " + geschwindigkeitsueberschreitung + " es fallen 500 Euro an und die Anzahl der Vergehen ist jetzt: " + anzahl + " hoch.");

        }else {
            strafe += 1500;
            anzahl++;
            System.out.println("Geschwindigkeistüberschreitung von: " + geschwindigkeitsueberschreitung + " es fallen 1500 Euro an und die Anzahl der Vergehen ist jetzt: " + anzahl + " hoch.");

        }
    }

    //Erhöhen Sie die Strafe aufgrund eines vergessenen Verbandspaketes um 25 Euro. Erhöhen Sie die Anzahl der Vergehen.
    public void verbandspaket(){
        strafe += 20;
        anzahl++;
        System.out.println("Da das Verbandspaket fehlt fallen 20 Euro an, die Strafe beträgt: " + strafe + " Euro und die Anzahl der Vergehen beträgt jetzt: " +anzahl);
    }

    //Erhöhen Sie die Strafe aufgrund eines erhöhten Alkoholspiegels. Erhöhen Sie die Anzahl der Vergehen um Zwei.
    public void alkohol(double wert) {
        if (wert < 1.0) {
            strafe += 100;
            anzahl += 2;
            System.out.println("Aufgrund eines Alkoholspiegels von " + wert + " Promille wird die Strafe um 100 € erhöht und beträgt jetzt " + strafe + " Euro und die Anzahl der Vergehen wird um 2 erhöht und beträgt nun: " + anzahl);
        } else if (wert < 2.0) {
            strafe += 400;
            anzahl += 2;
            System.out.println("Aufgrund eines Alkoholspiegels von " + wert + " Promille wird die Strafe um 400 € erhöht und beträgt jetzt " + strafe + " Euro und die Anzahl der Vergehen wird um 2 erhöht und beträgt nun: " + anzahl);
        } else if (wert < 3.0) {
            strafe += 1000;
            anzahl += 2;
            System.out.println("Aufgrund eines Alkoholspiegels von " + wert + " Promille wird die Strafe um 1000 € erhöht und beträgt jetzt " + strafe + " Euro und die Anzahl der Vergehen wird um 2 erhöht und beträgt nun: " + anzahl);
        } else{
            strafe += 5000;
            anzahl += 2;
            System.out.println("Aufgrund eines Alkoholspiegels von " + wert + " Promille wird die Strafe um 5000 € erhöht und beträgt jetzt " + strafe + " Euro und die Anzahl der Vergehen wird um 2 erhöht und beträgt nun: " + anzahl);
        }
    }

    //Erhöhen Sie die Strafe um den übergebenen Wert. Erhöhen Sie die Anzahl der Vergehen.
    public void sonstiges(double wert){
        strafe += wert;
        anzahl++;
        System.out.println("Durch ein sonstiges vergehen wird die Strafe um " + wert + " Euro erhöht und beträgt jetzt gesamt " + strafe + " Euro. Die Anzahl der vergehen ist: " + anzahl);
    }

    //Schreiben Sie eine Methode für das Auslesen der Strafe. Aufgrund folgender Regelung bekommt der Verkehrssünder jedoch eine Verringerung gutgeschrieben:

    public double getStrafe(int anzahl){
        if (anzahl == 1){
            strafe = strafe - (strafe * 0.3);
        }else if (anzahl == 2){
            strafe = strafe - (strafe * 0.2);
        }else if (anzahl == 3){
            strafe = strafe - (strafe * 0.1);
        }
        return strafe;
    }
}
