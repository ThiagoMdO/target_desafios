package desafios.terceiro;

public class Incrementa {
    static int INDICE = 12;
    static int SOMA = 0;
    static int K;

    public static void main(String[] args) {
        System.out.println(somarComLooping());
    }

    private static int somarComLooping(){
        for (K = 1; K < INDICE; K++){
            SOMA += K;
        }
        return SOMA;
    }
}
