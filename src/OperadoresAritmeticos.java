public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int numer2 = 2;
        int numero3 = 3;
        int resultadoSuma = numer2 + numero3;
        System.out.println(" El resultado de la suma es " + resultadoSuma);
        System.out.println("La resta funciona igual ");
        int numeroConCambioDeSigno = -numer2;
        System.out.println("El numero dos con cambio de signo es "+ numeroConCambioDeSigno);
        double resultadoDeMultiplicacion = numero3 * 3.5;
        double resultadoDivicion = (double)numer2 / numero3;
        System.out.println("resultado de divicion contiene " + resultadoDivicion);
        int resultadoModulo =  numero3 % numer2;
        System.out.println("El resto del la divicion es " + resultadoModulo);

    }
}
