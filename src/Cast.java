public class Cast {

    public static void main(String[] args) {
        int a = 123456789;
        short b = (short) a;
        System.out.println(b);
        // o valor de b vai ser truncado pois short não suporta o tamanho de a

        short c = 1234;
        int d = (int) c;
        System.out.println(d);
        // aqui o tipo de d suporta o cast e você pode alterar tranquilamente.
    }
}
