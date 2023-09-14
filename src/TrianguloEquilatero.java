public class TrianguloEquilatero {
    private double lado, perimetro, altura, area;
    public TrianguloEquilatero(double lado){
        this.lado = lado;
        setPerimetro(lado);
        setAltura(lado);
        setArea(lado);
    }
    public void setLado(double lado) {
        this.lado = lado;
        setPerimetro(lado);
        setAltura(lado);
        setArea(lado);
    }
    public double getLado(){
        return lado;
    }

    public double getPerimetro() {
        return Math.round(perimetro*100.0)/100.0;
    }

    public double getAltura() {
        return Math.round(altura*100.0)/100.0;
    }

    public double getArea() {
        return Math.round(area*100.0)/100.0;
    }
    private void setPerimetro(double lado){
        this.perimetro = lado*3;
    }
    private void setAltura(double lado){
        this.altura = lado * Math.sqrt(3) / 2;

    }

    private void setArea(double lado){
        this.area = (Math.pow(lado,2) * Math.sqrt(3)) / 4;
    }
}
