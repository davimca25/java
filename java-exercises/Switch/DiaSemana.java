public class DiaSemana {
    public static void main(String[] args) {
        byte dia = 1;
        System.out.println(obterDiaSemana(dia));
    }
    public static String obterDiaSemana(byte dia) {
        return switch (dia) {
            case 1 -> "Domingo";
            case 2 -> "Segunda";
            case 3 -> "Terça";
            case 4 -> "Quarta";
            case 5 -> "Quinta";
            case 6 -> "Sexta";
            case 7 -> "Sábado";
            default -> "Não é dia válido.";
        };
    }
}