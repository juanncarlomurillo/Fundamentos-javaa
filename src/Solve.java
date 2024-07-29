import java.util.Scanner;

public class Solve {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("Menú de Ejercicios:");
            System.out.println("1. Casteo - Ejercicio 1");
            System.out.println("2. Casteo - Ejercicio 2");
            System.out.println("3. Casteo - Ejercicio 3");
            System.out.println("4. Casteo - Ejercicio 4");
            System.out.println("5. Casteo - Ejercicio 5");
            System.out.println("6. Casteo - Ejercicio 6");
            System.out.println("7. Casteo - Ejercicio 7");
            System.out.println("8. Casteo - Ejercicio 8");
            System.out.println("9. Casteo - Ejercicio 9");
            System.out.println("10. Casteo - Ejercicio 10");
            System.out.println("11. Operadores de Asignación - Ejercicio 1");
            System.out.println("12. Operadores de Asignación - Ejercicio 2");
            System.out.println("13. Operadores de Asignación - Ejercicio 3");
            System.out.println("14. Operadores de Asignación - Ejercicio 4");
            System.out.println("15. Operadores de Asignación - Ejercicio 5");
            System.out.println("16. Operadores de Incremento y Decremento - Ejercicio 1");
            System.out.println("17. Operadores de Incremento y Decremento - Ejercicio 2");
            System.out.println("18. Operadores de Incremento y Decremento - Ejercicio 3");
            System.out.println("19. Operadores de Incremento y Decremento - Ejercicio 4");
            System.out.println("20. Operadores de Incremento y Decremento - Ejercicio 5");
            System.out.println("21. Ejercicios Combinados - Ejercicio 1");
            System.out.println("22. Ejercicios Combinados - Ejercicio 2");
            System.out.println("23. Ejercicios Combinados - Ejercicio 3");
            System.out.println("24. Ejercicios Combinados - Ejercicio 4");
            System.out.println("25. Ejercicios Combinados - Ejercicio 5");
            System.out.println("26. Ejercicios Combinados - Ejercicio 6");
            System.out.println("27. Ejercicios Combinados - Ejercicio 7");
            System.out.println("28. Ejercicios Combinados - Ejercicio 8");
            System.out.println("29. Ejercicios Combinados - Ejercicio 9");
            System.out.println("30. Ejercicios Combinados - Ejercicio 10");
            System.out.println("31. Salir");
            System.out.print("Selecciona una opciónn: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    casteoEjercicio1();
                    break;
                case 2:
                    casteoEjercicio2();
                    break;
                case 3:
                    casteoEjercicio3();
                    break;
                case 4:
                    casteoEjercicio4();
                    break;
                case 5:
                    casteoEjercicio5();
                    break;
                case 6:
                    casteoEjercicio6();
                    break;
                case 7:
                    casteoEjercicio7();
                    break;
                case 8:
                    casteoEjercicio8();
                    break;
                case 9:
                    casteoEjercicio9();
                    break;
                case 10:
                    casteoEjercicio10();
                    break;
                case 11:
                    operadoresAsignacionEjercicio1();
                    break;
                case 12:
                    operadoresAsignacionEjercicio2();
                    break;
                case 13:
                    operadoresAsignacionEjercicio3();
                    break;
                case 14:
                    operadoresAsignacionEjercicio4();
                    break;
                case 15:
                    operadoresAsignacionEjercicio5();
                    break;
                case 16:
                    operadoresIncrementoDecrementoEjercicio1();
                    break;
                case 17:
                    operadoresIncrementoDecrementoEjercicio2();
                    break;
                case 18:
                    operadoresIncrementoDecrementoEjercicio3();
                    break;
                case 19:
                    operadoresIncrementoDecrementoEjercicio4();
                    break;
                case 20:
                    operadoresIncrementoDecrementoEjercicio5();
                    break;
                case 21:
                    ejerciciosCombinadosEjercicio1();
                    break;
                case 22:
                    ejerciciosCombinadosEjercicio2();
                    break;
                case 23:
                    ejerciciosCombinadosEjercicio3();
                    break;
                case 24:
                    ejerciciosCombinadosEjercicio4();
                    break;
                case 25:
                    ejerciciosCombinadosEjercicio5();
                    break;
                case 26:
                    ejerciciosCombinadosEjercicio6();
                    break;
                case 27:
                    ejerciciosCombinadosEjercicio7();
                    break;
                case 28:
                    ejerciciosCombinadosEjercicio8();
                    break;
                case 29:
                    ejerciciosCombinadosEjercicio9();
                    break;
                case 30:
                    ejerciciosCombinadosEjercicio10();
                    break;
                case 31:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (option != 31);

        scanner.close();
    }

    // Métodos para los ejercicios de Casteo
    public static void casteoEjercicio1() {
        System.out.println("Casteo - Ejercicio 1:");
        int x = (int) 5.89 + (int) 3.45;
        System.out.println(x);
    }

    public static void casteoEjercicio2() {
        System.out.println("Casteo - Ejercicio 2:");
        char c = 'A';
        int asciiValue = (int) c;
        System.out.println(asciiValue);
    }

    public static void casteoEjercicio3() {
        System.out.println("Casteo - Ejercicio 3:");
        double d = 100.04;
        long l = (long) d;
        int i = (int) l;
        System.out.println(i);
    }

    public static void casteoEjercicio4() {
        System.out.println("Casteo - Ejercicio 4:");
        String number = "123";
        int result = Integer.parseInt(number);
        System.out.println(result);
    }

    public static void casteoEjercicio5() {
        System.out.println("Casteo - Ejercicio 5:");
        int result = (int) (char) (byte) -1;
        System.out.println(result);
    }

    public static void casteoEjercicio6() {
        System.out.println("Casteo - Ejercicio 6:");
        char c = (char) 65;
        System.out.println(c);
    }

    public static void casteoEjercicio7() {
        System.out.println("Casteo - Ejercicio 7:");
        long l = 100L;
        int i = (int) l;
        System.out.println(i);
    }

    public static void casteoEjercicio8() {
        System.out.println("Casteo - Ejercicio 8:");
        float f = 10.5f;
        String s = Float.toString(f);
        System.out.println(s);
    }

    public static void casteoEjercicio9() {
        System.out.println("Casteo - Ejercicio 9:");
        int result = (int) Math.round(3.7);
        System.out.println(result);
    }

    public static void casteoEjercicio10() {
        System.out.println("Casteo - Ejercicio 10:");
        byte b = 50;
        short s = b;
        System.out.println(s);
    }

    // Métodos para los ejercicios de Operadores de Asignación
    public static void operadoresAsignacionEjercicio1() {
        System.out.println("Operadores de Asignación - Ejercicio 1:");
        int x = 10;
        x += 5;
        System.out.println(x);
    }

    public static void operadoresAsignacionEjercicio2() {
        System.out.println("Operadores de Asignación - Ejercicio 2:");
        int y = 10;
        int x = 5;
        y *= (x + 5);
        System.out.println(y);
    }

    public static void operadoresAsignacionEjercicio3() {
        System.out.println("Operadores de Asignación - Ejercicio 3:");
        int a = 15;
        a %= 4;
        System.out.println(a);
    }

    public static void operadoresAsignacionEjercicio4() {
        System.out.println("Operadores de Asignación - Ejercicio 4:");
        int x = 10;
        int y = 5;
        x += y;
        System.out.println(x);
    }

    public static void operadoresAsignacionEjercicio5() {
        System.out.println("Operadores de Asignación - Ejercicio 5:");
        int x = 10;
        x ^= 2;
        System.out.println(x);
    }

    // Métodos para los ejercicios de Operadores de Incremento y Decremento
    public static void operadoresIncrementoDecrementoEjercicio1() {
        System.out.println("Operadores de Incremento y Decremento - Ejercicio 1:");
        int x = 5;
        int y = ++x;
        System.out.println("x: " + x + ", y: " + y);
    }

    public static void operadoresIncrementoDecrementoEjercicio2() {
        System.out.println("Operadores de Incremento y Decremento - Ejercicio 2:");
        int a = 5;
        System.out.println(a++);
        System.out.println(a);
    }

    public static void operadoresIncrementoDecrementoEjercicio3() {
        System.out.println("Operadores de Incremento y Decremento - Ejercicio 3:");
        int count = 10;
        count--;
        System.out.println(count);
    }

    public static void operadoresIncrementoDecrementoEjercicio4() {
        System.out.println("Operadores de Incremento y Decremento - Ejercicio 4:");
        System.out.println("++i incrementa la variable antes de su uso, i++ incrementa la variable después de su uso.");
    }

    public static void operadoresIncrementoDecrementoEjercicio5() {
        System.out.println("Operadores de Incremento y Decremento - Ejercicio 5:");
        int x = 3;
        x = x++;
        System.out.println(x);
    }

    // Métodos para los ejercicios combinados
    public static void ejerciciosCombinadosEjercicio1() {
        System.out.println("Ejercicios Combinados - Ejercicio 1:");
        int i = 5;
        i += ++i + i++ + ++i;
        System.out.println(i);
    }

    public static void ejerciciosCombinadosEjercicio2() {
        System.out.println("Ejercicios Combinados - Ejercicio 2:");
        double d = 10.0;
        int i = (int) d;
        i++;
        System.out.println(i);
    }

    public static void ejerciciosCombinadosEjercicio3() {
        System.out.println("Ejercicios Combinados - Ejercicio 3:");
        double d = 5.7;
        int i = (int) d;
        i *= 2;
        System.out.println(i--);
    }

    public static void ejerciciosCombinadosEjercicio4() {
        System.out.println("Ejercicios Combinados - Ejercicio 4:");
        int x = 10;
        double result = x / 2.0;
        double y = (double) x / 2.0;
        System.out.println(y);
    }

    public static void ejerciciosCombinadosEjercicio5() {
        System.out.println("Ejercicios Combinados - Ejercicio 5:");
        char c = 'X';
        c += 32;
        System.out.println(c);
    }

    public static void ejerciciosCombinadosEjercicio6() {
        System.out.println("Ejercicios Combinados - Ejercicio 6:");
        long l = 100L;
        short s = (short) l;
        s *= 3;
        System.out.println(s);
    }

    public static void ejerciciosCombinadosEjercicio7() {
        System.out.println("Ejercicios Combinados - Ejercicio 7:");
        int x = 10;
        x += (x++) + (++x);
        System.out.println(x);
    }

    public static void ejerciciosCombinadosEjercicio8() {
        System.out.println("Ejercicios Combinados - Ejercicio 8:");
        float f = 10.5f;
        byte b = (byte) f;
        --b;
        System.out.println(b);
    }

    public static void ejerciciosCombinadosEjercicio9() {
        System.out.println("Ejercicios Combinados - Ejercicio 9:");
        int i = 257;
        byte b = (byte) i;
        System.out.println(b);
    }

    public static void ejerciciosCombinadosEjercicio10() {
        System.out.println("Ejercicios Combinados - Ejercicio 10:");
        double d = 10.0;
        int i = (int) d;
        i += 5;
        i++;
        System.out.println(i);
    }
}
