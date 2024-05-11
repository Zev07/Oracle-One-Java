public class Ex5 {
    public static void main(String[] args) {
        double valorEmDolar = 5.16; /* Cotação do dia 11/05/2024 ás 8:49h no horário de Brasília - DF - BRAZIL */
        double valorEmReais = 203.43;
        double valorConversao = valorEmReais / valorEmDolar;
        String valorFormatado = String.format("%.2f",valorConversao);

        System.out.println("O valor de R$" + valorEmReais + " convertido em dolares é " + "$" + valorFormatado );
    }
}
