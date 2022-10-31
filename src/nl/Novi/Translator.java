package nl.Novi;

// We imperteren de HashMap en Map classes het het java.util package.
import java.util.HashMap;
import java.util.Map;

// We definieren de Tranlator class.
public class Translator {

    // We maken hier een HashMap.
    // Een Hashmap bestaat uit een zogenaamd "key-value pair".
    // Een entry in een Map is dus altijd 2 waardes, een key (in ons geval de integer) en een value (in ons geval een String)
    Map<Integer, String> numericAlpha = new HashMap<>();

    // De constructor kunnen we aanroepen met het "new" keyword.
    // Deze constructor vraagt om 2 parameters, een String array en een Integer array.
    public Translator(String[] alphabetic, Integer[] numeric){
        // We loopen hier zovaak als de "numeric" array lang is, dat zijn dus 10 loops,
        // maar we hadden ook de "alphabetic" array kunnen nemen, want ze zijn beide even lang.
        for(int i = 0; i < numeric.length; i++){
            // We beginnen met i=0 en we eindigen met i=9. Alle waardes daartussen gebruiken we ook.
            // We gebruiken i om te zeggen welke index uit de arrays we willen hebben.
            // Als eerst zetten we een nieuwe waarde in de "numericAlpha" hashmap met numeric[0] en alphabetic[0], ofwel 0 en "nul",
            // daarna zetten we een nieuwe waarde in de "numericAlpha" hashmap met numeric[1] en alphabetic[1], ofwel 1 en "een",
            // en zo herhalen we dat tot en met numeric[9] en alphabetic[9]. Daarna sluiten we de for-loop.
            numericAlpha.put(numeric[i], alphabetic[i]);
        }
    }

    // De translate-methode vraag om 1 parameter, een Integer en geeft een String als return waarde.
    public String translate(Integer number){
        // We gebruiken hier de get-methode van HashMap. Aan de get methode geef je een key en je krijgt een value terug.
        // Wij geven hier dus het Integer uit de parameter (de key) en we krijgen een String terug (de value) die we meteen returnen.
        // In de main-methode slaan we deze String op en printen we het uiteindelijk uit. (regel 50 en 51 van Main)
        return numericAlpha.get(number);
    }
}
