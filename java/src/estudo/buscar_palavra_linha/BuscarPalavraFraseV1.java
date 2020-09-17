package estudo.buscar_palavra_linha;

import java.util.Arrays;
import java.util.List;

public class BuscarPalavraFraseV1 {
    static List<String> phrases = Arrays.asList(
            "player one is better than player two",
            "the quick brown fox jumps the lazy dog",
            "basketball players jump higher than dogs",
            "two little birds over a dog",
            "roasted hog",
            "the real football is soccer"
    );

    public static void main(String[] args) {
        String regex = "(.* )?dog( .*)?";
        phrases.forEach(it->{
            boolean matches = it.matches(regex);
            if (matches){
                System.out.println(it);
            }
        });
    }
}
