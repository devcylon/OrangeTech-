public class OrangeTech {
    public static void main(String[] args) throws Exception {
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        String meuNome = "Cylon";
        final double VALOR_DE_PI = 3.14F;

        double soma = 10.5 + 15.7;
        int subtração = 113-25;
        int multiplicação = 20*7;
        int divisão = 15/3;
        int modulo = 18 % 3;
        double resultado = (10*7)+(20/4);

        String nomeCompleto = "Francisco"+" Cipriano ";
        System.out.println(nomeCompleto + VALOR_DE_PI);
        int a = 5;
        int b = 5;

        String resultado1 = a==b? "Verdadeiro" :"Falso";
        System.out.println(resultado1);

        SmartTv smartTv = new SmartTv();
        System.out.println("Tv liga?: " + smartTv.ligada);
        System.out.println("Canal atual: " +smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);
        smartTv.ligar();
        System.out.println("Tv liga?: " + smartTv.ligada);
        System.out.println("Canal atual: " +smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);
        smartTv.desligar();
        System.out.println("Tv liga?: " + smartTv.ligada);
        System.out.println("Canal atual: " +smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();
        smartTv.mudarCanal(13);
    

    }
}
