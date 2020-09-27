package figurasbidimensionales;

public class CalculosBidimensionales {

    public double areaCuadrado(double base) {
        double area = (base * base);
        return area;
    }

    public double perimetroCuadrado(double lado) {
        double perimetro = lado * 4;
        return perimetro;
    }

    public double areaCirculo(double radio) {
        double area = Math.PI * Math.pow(radio, 2);
        return area;
    }

    public double perimetroCirculo(double radio) {
        double perimetro = 2 * Math.PI * radio;
        return perimetro;
    }

    public double areaTriangulo(double base, double altura) {
        double area = (base * altura) / 2;
        return area;
    }

    public double perimetroTriangulo(double l1, double l2, double l3) {
        double perimetro = l1 + l2 + l3;
        return perimetro;
    }

    public double areaRectangulo(double base, double altura) {
        double area = (base * altura);
        return area;
    }

    public double perimetroRectangulo(double largo, double ancho) {
        double perimetro = 2 * (ancho + largo);
        return perimetro;
    }

    public double areaRombo(double diagonal1, double diagonal2) {
        double area = (diagonal1 * diagonal2) / 2;
        return area;
    }

    public double perimetroRombo(double n1) {
        double perimetro = (4 * n1);
        return perimetro;
    }

    public double areaPentagono(double lado, double radio, double apotema) {
        double area = 0;
        if (apotema == 0) {
            apotema = Math.sqrt(Math.pow(radio, 2) - Math.pow(lado / 2, 2));
            area = ((lado * 5) * apotema) / 2;
        }
        area = ((lado * 5) * apotema) / 2;
        return area;
    }

    public double perimetroPentagono(double longitud, double lado) {
        double perimetro = longitud * lado;
        return perimetro;
    }
}