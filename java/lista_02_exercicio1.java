public class lista_02_exercicio1 {
    public static void main(String[] args) {
        double R, volume;
        sacanner s = new scanner (system.in);
        System.out.println("informe o valor do raio:");
        R = s.nextDouble();

        volume = 4.0 / 3.0 * math.PI * math.pow (R, 3);
        
        System.out.println("volume da esfera informada:" + volume);

        //exemplo com formatação:
        System.out.printf("o volume da esfera informada: %.2f%n" , volume);
    }
    
}