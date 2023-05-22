public class Comparador {
    private double a;
    private double b;

    public Comparador(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public String comparar() {
        if (this.a > this.b) {
            return "A es mayor que B";
        } else if (this.a == this.b) {
            return "A es igual a B";
        } else {
            return "A es menor que B";
        }
    }
}
