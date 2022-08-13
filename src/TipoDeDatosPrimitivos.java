public class TipoDeDatosPrimitivos {
    public static void main(String[] args) {
        byte elMenorByte = Byte.MIN_VALUE;
        byte elMayorByte = Byte.MAX_VALUE;
        System.out.println("El tipo Byte es un numero entero de 8 bits consigno desde "+ elMenorByte +" hasta "+ elMayorByte);
        System.out.println("El tipo de dato short es un un numero de 16bits con signo que va desde "+Short.MIN_VALUE + " hasta " +Short.MAX_VALUE );
        System.out.println("El tipo de dato Integer es un numero de 32bits con signo que va desde " + Integer.MIN_VALUE+ " hasta "+ Integer.MAX_VALUE);
        System.out.println("El tipo de dato Long es un tipo de dato de 64bits con signo que va desde "+ Long.MIN_VALUE+" hasta "+ Long.MAX_VALUE);

        float variableFloat = 5.6f;
        //la mas usada es:
        double variableDouble = 5.6;

        char a ='a';
        //char esta basado en ascii por eso se puede realizar operaciones matematicas por ejemplo:
        char b = (char) (a + 1);
        System.out.println("para formar be sume el balor de a + 1 dando como resultado "+b);

        boolean booleanVariable = true;

    }
}
