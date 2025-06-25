//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    //        Programmieren: Begrüßungsmethode
    //        Schreibe eine Java-Methode, die einen String als Parameter erhält und eine Begrüßung in der Konsole ausgibt.
    //        Schritt 1: Definiere die Methodensignatur.
    //         Schritt 2: Gib die Begrüßung in der Konsole aus.

    public static void greet (String greeting) {
        System.out.println(greeting);
    }

    //        Programmieren: Einfache Berechnung
    //        Schreibe eine Java-Methode, die zwei Zahlen als Parameter erhält und das Ergebnis ihrer Addition zurückgibt.
    //
    //        Schritt 1: Schreibe eine Methode mit dem Namen add, die zwei int-Parameter entgegennimmt und die Summe der beiden Zahlen zurückgibt.
    //        Schritt 2: Rufe die Methode innerhalb deiner main()-Methode auf und gib das Ergebnis in der Konsole aus.
    //                Programmieren: Zusätzliche Funktionen
    //        Überprüfe und verstehe dein Programm. Erweitere es anschließend.
    //

    public static int add (int a, int b) {
        return a + b;
    }
    //        Schritt 1: Kopiere die add-Methode, um auch Gleitkommazahlen (double) zu unterstützen.
    public static float add (float a, float b) {
        return a + b;
    }

    public static double add (double a, double b) {
        return a + b;
    }
    //        Schritt 2: Schreibe eine weitere Methode mit dem Namen subtract, die zwei int-Parameter entgegennimmt und die Differenz der beiden Zahlen zurückgibt.
    public static int subtract (int a, int b) {
        return a - b;
    }

    public static float subtract (float a, float b) {
        return a - b;
    }

    public static double subtract (double a, double b) {
        return a - b;
    }
    //        Schritt 3: Schreibe eine Methode mit dem Namen makePositive, die eine negative Zahl in eine positive Zahl umwandelt, aber positive Zahlen unverändert zurückgibt. (Beispiel: Eingabe 5 → Rückgabe 5, Eingabe -28 → Rückgabe 28)
    public static int makePositive (int a) {
        if (a >= 0) {
            return a;
        } else {
            return a * -1;
        }
    }

    public static float makePositive(float a) {
        if (a >= 0) {
            return a;
        } else {
            return a * -1;
        }
    }

    public static double makePositive(double a) {
        if (a >= 0) {
            return a;
        } else {
            return a * -1;
        }
    }

    // änderung von deniz


    //        Schreibe eine Methode, die überprüft, ob eine Zahl gerade ist. Gerade Zahlen sollen unverändert zurückgegeben werden, während ungerade Zahlen verdoppelt werden.
    public static int tripleIfUneven(int number) {

        if (number % 2 == 0) {
            return number;
        } else {
            return number * 3;
        }
    }

    //        Schreibe eine Methode, die einen String als Parameter entgegennimmt und überprüft, ob es sich um ein Palindrom handelt (d. h. das Wort liest sich vorwärts und rückwärts gleich). Gibt true zurück, wenn es ein Palindrom ist, andernfalls false.

    public static boolean checkPalindrom (String word) {
        String wordReverse = new StringBuilder(word).reverse().toString();
        return word.equals(wordReverse);
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 7;

        System.out.println("Ergebnis " + add(a, b));
        System.out.println("Betrag " + makePositive(a));

        //                Bonus
        //        Super, du hast gute Fortschritte gemacht! Jetzt arbeite an den Bonusaufgaben.
        //
        //        Erstelle eine Bedingung, die die Methode subtract aufruft, wenn die erste Zahl größer als die zweite ist, andernfalls soll die Methode add aufgerufen werden.

        if (a > b) {
            System.out.println("Ergebnis Subtraktion " + subtract(a, b));
        } else {
            System.out.println("Ergebnis Addition " + add(a, b));
        }
        /* Comments added by Abdul Salam
    }
}