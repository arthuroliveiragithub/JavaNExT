public class Triangulo {
    double l1;
    double l2;
    double l3;
    public double calcularPerimetro(){
        return (l1+l2+l3)/2;
    }
    public double calculaArea() {
        double perimetro = calcularPerimetro();
        return Math.sqrt(perimetro * (perimetro - l1) * (perimetro - l2) * (perimetro - l3));
    }
}
