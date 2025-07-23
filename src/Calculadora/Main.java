package Calculadora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("\n--- CALCULADORA CIENTÍFICA ---");
            System.out.println("Escolha uma operação:");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("5 - Exponenciação");
            System.out.println("6 - Radiciação");
            System.out.println("7 - Log10");
            System.out.println("8 - Logaritmo Natural (ln)");
            System.out.println("9 - Exponencial (e^x)");
            System.out.println("10 - Seno");
            System.out.println("11 - Cosseno");
            System.out.println("12 - Tangente");
            System.out.println("13 - Fatorial");
            System.out.println("14 - Permutação");
            System.out.println("15 - Combinação");
            System.out.println("16 - Hiperbólicas (sinh, cosh, tanh)");
            System.out.println("17 - Inversas Hiperbólicas (asinh, acosh, atanh)");
            System.out.println("18 - Arredondamento (floor, ceil, round)");
            System.out.println("19 - Número Aleatório");
            System.out.println("20 - Valor Absoluto");
            System.out.println("21 - Raiz Cúbica");
            System.out.println("22 - Conversão Retangular → Polar");
            System.out.println("23 - Conversão Polar → Retangular");
            System.out.println("24 - Soma de Complexos");
            System.out.println("25 - Subtração de Complexos");
            System.out.println("26 - Multiplicação de Complexos");
            System.out.println("27 - Divisão de Complexos");
            System.out.println("28 - Potência de Número Polar");
            System.out.println("29 - Conjugado de Complexo");
            System.out.println("30 - Módulo de Complexo");
            System.out.println("31 - Argumento (ângulo) de Complexo");
            System.out.println("32 - Fator de Potência");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 0:
                    continuar = false;
                    break;

                case 1: case 2: case 3: case 4: case 5: case 6: {
                    System.out.print("Digite o primeiro número: ");
                    double a = scanner.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    double b = scanner.nextDouble();
                    double res = 0;

                    switch (opcao) {
                        case 1: res = Calculadora.somar(a, b); break;
                        case 2: res = Calculadora.subtrair(a, b); break;
                        case 3: res = Calculadora.multiplicar(a, b); break;
                        case 4: res = Calculadora.dividir(a, b); break;
                        case 5: res = Calculadora.exponenciacao(a, b); break;
                        case 6: res = Calculadora.radiciacao(a, b); break;
                    }

                    System.out.println("Resultado: " + res);
                    break;
                }

                case 7: {
                    System.out.print("Digite o número: ");
                    double x = scanner.nextDouble();
                    System.out.println("Log10(" + x + ") = " + Calculadora.log10(x));
                    break;
                }

                case 8: {
                    System.out.print("Digite o número: ");
                    double x = scanner.nextDouble();
                    System.out.println("ln(" + x + ") = " + Calculadora.ln(x));
                    break;
                }

                case 9: {
                    System.out.print("Digite o expoente: ");
                    double x = scanner.nextDouble();
                    System.out.println("e^" + x + " = " + Calculadora.exp(x));
                    break;
                }

                case 10: case 11: case 12: {
                    System.out.print("Digite o ângulo em graus: ");
                    double ang = scanner.nextDouble();
                    if (opcao == 10)
                        System.out.println("sen(" + ang + ") = " + Calculadora.seno(ang));
                    else if (opcao == 11)
                        System.out.println("cos(" + ang + ") = " + Calculadora.cosseno(ang));
                    else
                        System.out.println("tan(" + ang + ") = " + Calculadora.tangente(ang));
                    break;
                }

                case 13: {
                    System.out.print("Digite um número inteiro: ");
                    int n = scanner.nextInt();
                    System.out.println(n + "! = " + Calculadora.fatorial(n));
                    break;
                }

                case 14: case 15: {
                    System.out.print("Digite n: ");
                    int n = scanner.nextInt();
                    System.out.print("Digite p: ");
                    int p = scanner.nextInt();
                    long res = (opcao == 14)
                            ? Calculadora.permutacao(n, p)
                            : Calculadora.combinacao(n, p);
                    System.out.println("Resultado: " + res);
                    break;
                }

                case 16: {
                    System.out.print("Digite o valor: ");
                    double x = scanner.nextDouble();
                    System.out.println("sinh(" + x + ") = " + Calculadora.sinh(x));
                    System.out.println("cosh(" + x + ") = " + Calculadora.cosh(x));
                    System.out.println("tanh(" + x + ") = " + Calculadora.tanh(x));
                    break;
                }

                case 17: {
                    System.out.print("Digite o valor: ");
                    double x = scanner.nextDouble();
                    System.out.println("asinh(" + x + ") = " + Calculadora.asinh(x));
                    System.out.println("acosh(" + x + ") = " + Calculadora.acosh(x));
                    System.out.println("atanh(" + x + ") = " + Calculadora.atanh(x));
                    break;
                }

                case 18: {
                    System.out.print("Digite o valor: ");
                    double x = scanner.nextDouble();
                    System.out.println("floor: " + Calculadora.floor(x));
                    System.out.println("ceil: " + Calculadora.ceil(x));
                    System.out.println("round: " + Calculadora.round(x));
                    break;
                }

                case 19:
                    System.out.println("Número aleatório: " + Calculadora.random());
                    break;

                case 20: {
                    System.out.print("Digite o valor: ");
                    double x = scanner.nextDouble();
                    System.out.println("abs(" + x + ") = " + Calculadora.abs(x));
                    break;
                }

                case 21: {
                    System.out.print("Digite o valor: ");
                    double x = scanner.nextDouble();
                    System.out.println("Raiz cúbica: " + Calculadora.raizCubica(x));
                    break;
                }

                case 22: {
                    System.out.print("Parte real: ");
                    double r = scanner.nextDouble();
                    System.out.print("Parte imaginária: ");
                    double i = scanner.nextDouble();
                    double[] polar = Calculadora.retangularParaPolar(r, i);
                    System.out.println("Forma polar: " + Calculadora.formatoPolar(polar[0], polar[1]));
                    break;
                }

                case 23: {
                    System.out.print("Módulo: ");
                    double mod = scanner.nextDouble();
                    System.out.print("Ângulo (graus): ");
                    double ang = scanner.nextDouble();
                    double[] ret = Calculadora.polarParaRetangular(mod, ang);
                    System.out.println("Forma retangular: " + Calculadora.formatoRetangular(ret[0], ret[1]));
                    break;
                }

                case 24: case 25: case 26: case 27: {
                    System.out.print("Real 1: ");
                    double r1 = scanner.nextDouble();
                    System.out.print("Imag 1: ");
                    double i1 = scanner.nextDouble();
                    System.out.print("Real 2: ");
                    double r2 = scanner.nextDouble();
                    System.out.print("Imag 2: ");
                    double i2 = scanner.nextDouble();
                    double[] res = null;
                    if (opcao == 24) res = Calculadora.somarComplexos(r1, i1, r2, i2);
                    else if (opcao == 25) res = Calculadora.subtrairComplexos(r1, i1, r2, i2);
                    else if (opcao == 26) res = Calculadora.multiplicarComplexos(r1, i1, r2, i2);
                    else res = Calculadora.dividirComplexos(r1, i1, r2, i2);
                    System.out.println("Resultado: " + Calculadora.formatoRetangular(res[0], res[1]));
                    break;
                }

                case 28: {
                    System.out.print("Módulo: ");
                    double mod = scanner.nextDouble();
                    System.out.print("Ângulo: ");
                    double ang = scanner.nextDouble();
                    System.out.print("Expoente: ");
                    double exp = scanner.nextDouble();
                    double[] res = Calculadora.potenciaPolar(mod, ang, exp);
                    System.out.println("Resultado: " + Calculadora.formatoPolar(res[0], res[1]));
                    break;
                }

                case 29: {
                    System.out.print("Parte real: ");
                    double r = scanner.nextDouble();
                    System.out.print("Parte imaginária: ");
                    double i = scanner.nextDouble();
                    double[] c = Calculadora.conjugado(r, i);
                    System.out.println("Conjugado: " + Calculadora.formatoRetangular(c[0], c[1]));
                    break;
                }

                case 30: {
                    System.out.print("Parte real: ");
                    double r = scanner.nextDouble();
                    System.out.print("Parte imaginária: ");
                    double i = scanner.nextDouble();
                    double[] p = Calculadora.retangularParaPolar(r, i);
                    System.out.println("Módulo: " + p[0]);
                    break;
                }

                case 31: {
                    System.out.print("Parte real: ");
                    double r = scanner.nextDouble();
                    System.out.print("Parte imaginária: ");
                    double i = scanner.nextDouble();
                    double[] p = Calculadora.retangularParaPolar(r, i);
                    System.out.println("Argumento: " + p[1] + "°");
                    break;
                }

                case 32: {
                    System.out.print("Digite o ângulo em graus: ");
                    double ang = scanner.nextDouble();
                    double fp = Calculadora.fatorDePotencia(ang);
                    System.out.println("Fator de potência: " + fp);
                    break;
                }

                default:
                    System.out.println("Opção inválida.");
            }
        }

        scanner.close();
        System.out.println("Calculadora finalizada!");
    }
}
