package Calculadora;

public class Calculadora {

    // Operações básicas
    public static double somar(double a, double b) {
        return a + b;
    }

    public static double subtrair(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Erro: divisão por zero.");
            return Double.NaN;
        }
        return a / b;
    }

    public static double exponenciacao(double base, double expoente) {
        return Math.pow(base, expoente);
    }

    public static double radiciacao(double radicando, double indice) {
        if (indice == 0) {
            System.out.println("Erro: índice da raiz não pode ser zero.");
            return Double.NaN;
        }
        return Math.pow(radicando, 1.0 / indice);
    }

    // Trigonometria
    public static double seno(double graus) {
        return Math.sin(Math.toRadians(graus));
    }

    public static double cosseno(double graus) {
        return Math.cos(Math.toRadians(graus));
    }

    public static double tangente(double graus) {
        return Math.tan(Math.toRadians(graus));
    }

    // Logaritmos
    public static double log10(double valor) {
        return Math.log10(valor);
    }

    public static double ln(double valor) {
        return Math.log(valor);
    }

    public static double exp(double expoente) {
        return Math.exp(expoente);
    }

    // Fatorial
    public static long fatorial(int n) {
        if (n < 0) return -1;
        long fat = 1;
        for (int i = 2; i <= n; i++) {
            fat *= i;
        }
        return fat;
    }

    // Permutação e Combinação
    public static long permutacao(int n, int p) {
        if (p > n) return -1;
        return fatorial(n) / fatorial(n - p);
    }

    public static long combinacao(int n, int p) {
        if (p > n) return -1;
        return fatorial(n) / (fatorial(p) * fatorial(n - p));
    }

    // Hiperbólicas
    public static double sinh(double x) { return Math.sinh(x); }
    public static double cosh(double x) { return Math.cosh(x); }
    public static double tanh(double x) { return Math.tanh(x); }

    public static double asinh(double x) { return Math.log(x + Math.sqrt(x*x + 1)); }
    public static double acosh(double x) {
        if (x < 1) return Double.NaN;
        return Math.log(x + Math.sqrt(x*x - 1));
    }
    public static double atanh(double x) {
        if (x <= -1 || x >= 1) return Double.NaN;
        return 0.5 * Math.log((1 + x) / (1 - x));
    }

    // Arredondamento
    public static double floor(double x) {
        return Math.floor(x);
    }

    public static double ceil(double x) {
        return Math.ceil(x);
    }

    public static long round(double x) {
        return Math.round(x);
    }

    // Valor absoluto
    public static double abs(double x) {
        return Math.abs(x);
    }

    // Raiz cúbica
    public static double raizCubica(double x) {
        return Math.cbrt(x);
    }

    // Aleatório
    public static double random() {
        return Math.random();
    }

    // Fator de Potência
    public static double fatorDePotencia(double anguloGraus) {
        return Math.cos(Math.toRadians(anguloGraus));
    }

    // Conversão Polar <-> Retangular
    public static double[] polarParaRetangular(double modulo, double anguloGraus) {
        double anguloRad = Math.toRadians(anguloGraus);
        return new double[] {
                modulo * Math.cos(anguloRad),
                modulo * Math.sin(anguloRad)
        };
    }

    public static double[] retangularParaPolar(double real, double imag) {
        double modulo = Math.sqrt(real * real + imag * imag);
        double angulo = Math.toDegrees(Math.atan2(imag, real));
        return new double[] { modulo, angulo };
    }

    // Operações com números complexos (forma retangular)
    public static double[] somarComplexos(double r1, double i1, double r2, double i2) {
        return new double[] { r1 + r2, i1 + i2 };
    }

    public static double[] subtrairComplexos(double r1, double i1, double r2, double i2) {
        return new double[] { r1 - r2, i1 - i2 };
    }

    public static double[] multiplicarComplexos(double r1, double i1, double r2, double i2) {
        double real = r1 * r2 - i1 * i2;
        double imag = r1 * i2 + i1 * r2;
        return new double[] { real, imag };
    }

    public static double[] dividirComplexos(double r1, double i1, double r2, double i2) {
        double denominador = r2 * r2 + i2 * i2;
        if (denominador == 0) return new double[] { Double.NaN, Double.NaN };
        double real = (r1 * r2 + i1 * i2) / denominador;
        double imag = (i1 * r2 - r1 * i2) / denominador;
        return new double[] { real, imag };
    }

    public static double[] potenciaPolar(double modulo, double anguloGraus, double expoente) {
        double novoModulo = Math.pow(modulo, expoente);
        double novoAngulo = anguloGraus * expoente;
        return new double[] { novoModulo, novoAngulo };
    }

    public static double[] conjugado(double real, double imag) {
        return new double[] { real, -imag };
    }

    // Formatações
    public static String formatoRetangular(double real, double imag) {
        if (imag >= 0)
            return String.format("%.3f + %.3fi", real, imag);
        else
            return String.format("%.3f - %.3fi", real, -imag);
    }

    public static String formatoPolar(double modulo, double angulo) {
        return String.format("%.3f ∠ %.3f°", modulo, angulo);
    }
}
