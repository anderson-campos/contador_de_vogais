public class contador {
    public static int contarVogais(String texto) {
        int contator = 0;
        String vogais = "aieouAEIOU";

        for (int i = 0; i < texto.length(); i++) {
            if (vogais.indexOf(texto.charAt(i)) != -1){
                contator++;
            }
        }
        return contator;
    }
}
