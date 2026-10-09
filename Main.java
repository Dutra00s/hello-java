public class Main {
    public static void main(String[] args) {
        int parcelas = 25;
        double valor = 1000.0;
        System.out.println(" eu tenho " + parcelas + " parcelas para receber " + " junto com " + valor);
        if ( parcelas >= 1 && parcelas <= 24) {
            System.out.println("recebimento valido");
        } else {
            System.out.println("recebimento invalido");
        }

    }
}