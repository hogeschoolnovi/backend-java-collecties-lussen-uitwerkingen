package nl.Novi;
// Importeer de Scanner class uit de java.util package, wat een basis onderdeel is van je jdk
// We hoeven Translator niet te importeren, omdat deze in hetzelfde package staat als Main, namelijk "nl.Novi"
import java.util.Scanner;

// Definieer de Main class, waarin we onze applicatie beginnen.
public class Main {

    //Definieer de main methode, de voordeur van onze applicatie, waarmee we onze applicatie op starten.
    public static void main(String[] args) {

        // Een array van integers.
        Integer[] numeric = {1,2,3,4,5,6,7,8,9,0};
        // Een array van Strings.
        String[] alphabetic = {"een", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "nul"};

        // We instatieren een nieuwe Translator. De Translator klasse hebben we zelf gemaakt en staat in de nl.Novi package.
        // Met het new-keyword, roepen we de constructor van Translator aan.
        // Deze vraagt als parameters om een array van integers en een array van Strings.
        Translator translator = new Translator(alphabetic, numeric);

        // We instantieren hier een nieuwe Scanner.
        // We geven als parameter "System.in", dit betekent dat we de input via de terminal krijgen.
        Scanner scanner = new Scanner(System.in);
        // We maken een boolean (primitive) variabele genaamd "play" en geven die de waarde "true".
        boolean play = true;
        // We maken een String variabele genaamd "ongeldig" en geven die de waarde "ongeldige invoer".
        String ongeldig = "ongeldige invoer";

        // zolang play "true" is, voeren we de volgende code uit.
        while(play){
            // Print een bericht voor de gebruiker, zodat deze weet wat hij/zij moet doen.
            System.out.println("Type 'x' om te stoppen \nType 'v' om te vertalen");
            // Lees de input van de gebruiker en sla dat op als een String "input".
            String input = scanner.nextLine();
            if(input.equals("x")){
                // Als de input van de gebruiker "x" is, dan zetten we "play" naar false, waardoor de while loop niet langer door gaat.
                play = false;
            } else if(input.equals("v")) {
                // Als de input van de gebruiker "v" is, dan voeren we onderstaande code uit.
                // We printen eerst weer een instructie voorde gebruiker.
                System.out.println("Type een cijfer in van 0 t/m 9");
                // Vervolgens lezen we het cijfer dat de gebruiker intypt en slaan we dat op.
                int number = scanner.nextInt();
                // We laten de scanner hier nog eens een lege regel lezen, omdat nextInt() van zichzelf niet op een nieuwe regel eindigd.
                // We krijgen later problemen als we dit niet doen.
                scanner.nextLine();
                if(number < 10 && number >= 0){
                    // Als het nummer onder de 10 is en groter of gelijk aan 0, dan vertalen we het met de translate methode en printen we het resultaat
                    String result = translator.translate(number);
                    System.out.println("De vertaling van " + number + " is " + result);
                }
                else {
                    // Als het resultaat hoger dan 10 of lager dan 0 is, dan printen we het "ongeldig" bericht.
                    System.out.println(ongeldig);
                }
            } else{
                // Als de gebruiker is anders  dan "x" of "v" intypt, dan printen de het "ongeldig" bericht.
                System.out.println(ongeldig);
            }
        }

    }

}

