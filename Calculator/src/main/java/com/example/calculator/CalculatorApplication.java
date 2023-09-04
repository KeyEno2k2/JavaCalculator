package com.example.calculator;
import java.util.Scanner;


public class CalculatorApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("||| KALKULATOR |||");

        System.out.println("Wybierz rodzaj Kalkulatora:\n 1 - prosty\n 2 - trygonometryczny");
        char wybor = scanner.next().charAt(0);

        switch(wybor){
            case '1':
                System.out.println("Wybierz Rodzaj Dzialania: \n 1 - Dodawanie\n 2 - Odejmowanie\n 3 - Mnozenie\n 4 - Dzielenie\n 5 - Potegowanie\n 6 Pierwstek kwadratowy liczby1\n");
                char operator = scanner.next().charAt(0);

                System.out.println("Podaj pierwszą liczbę");
                double liczba1 = scanner.nextDouble();

                System.out.println("Podaj drugą liczbę");
                double liczba2 = scanner.nextDouble();

                double wynik;

                switch(operator) {
                    case '1':
                        wynik = liczba1 + liczba2;
                        break;
                    case '2':
                        wynik = liczba1 - liczba2;
                        break;
                    case '3':
                        wynik = liczba1 * liczba2;
                        break;
                    case '4':
                        if (liczba2 != 0){
                            wynik = liczba1 / liczba2;
                        } else {
                            System.out.println("Nie mozna dzielic prez zero!");
                            return;
                        }
                        break;
                    case '5':
                        wynik = Math.pow(liczba1, liczba2);
                        break;
                    case '6':
                        wynik = Math.sqrt(liczba1);
                        break;
                    default:
                        System.out.println("Nieznany operator!");
                        return;
                }
                System.out.println("Wynik: " + wynik);

            case '2':
                System.out.println("Podaj kat - zostanie on przeliczony na radiany aby kalkulator mogl to obliczyc");
                Double kat = scanner.nextDouble();
                System.out.println("Wybierz Rodzaj Dzialania:\n 1 - Sinus Kąta\n 2 - Cosinus Kąta\n 3 - Tangens Kąta\n");
                char operator1 = scanner.next().charAt(0);
                Double wynik1 = null;
            switch (operator1){
                case '1':
                    wynik1 = Math.sin(Math.toRadians(kat));
                    break;
                case '2':
                    wynik1 = Math.cos(Math.toRadians(kat));
                    break;
                case '3':
                    wynik1 = Math.tan(Math.toRadians(kat));
                    break;
                default:
                    System.out.println("Nienznany Operator");
            }
                System.out.println("Wynik: " + wynik1);
        }
        }



}
