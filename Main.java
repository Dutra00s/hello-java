public class Main {
    public static void main(String[] args) {
        int parcelas = 24;
        int valor = 1000;
        System.out.println(" eu tenho " + parcelas + " parcelas para receber " + " junto com " + valor);
        if ( parcelas >= 1 && parcelas <= 24) {
            double valorParcelas = (double) valor / parcelas;
            System.out.println("o valor de cada parcela é " + String.format("%.2f", valorParcelas));
        } else {
            System.out.println("recebimento invalido");
        }

    }
}