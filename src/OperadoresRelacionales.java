public class OperadoresRelacionales {
    public static void main(String[] args) {
        boolean esUnoMayorQueDos = 1>2;

        System.out.println("¿Es uno mayor que dos? " + esUnoMayorQueDos);

        boolean esUnoComaCincoMenorQueSieteComaDos = 1.5 < 7.2;

        boolean esOchoMayorOIgualQueOcho = 8 >= 8;

        System.out.println("Es 8 mayor o igual que 8 " + esOchoMayorOIgualQueOcho);

        boolean esCuatroIgualQueCuatro = 4 == 4;

        boolean esCuatroDiferenteDeCuatro = 4 != 4;

        System.out.println("¿Es cuatro diferente de cuatro? " + esCuatroDiferenteDeCuatro);
        String perro = "perro";
        String gato = "gato";

        System.out.println("¿Es sierto que el String perro es igual a el String gato? " + perro == gato);

    }
}
