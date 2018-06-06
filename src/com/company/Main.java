package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        Goverment vr = new Goverment();
        boolean exit = false;
        do {
            System.out.println("1 - Верховна рада\n" +
                    "2 - Фракція\n" +
                    "3 - Депутат\n" +
                    "4 - Вихід\n"
            );
            int value = sc.nextInt();
            switch (value) {
                case 1:
                    System.out.println(
                            "1-Додати фракцію\n" +
                                    "2-Видалити фракцію\n" +
                                    "3-Вивести всі фракції" +
                                    "4-Вивести фракцію\n" +
                                    "5-Видалити депутата з фракції\n" +
                                    "6-Додати депутала до фракції\n" +
                                    "7-Вивести хабарників Веховної ради\n" +
                                    "8-Вивести хабарників певної фракції\n" +
                                    "9-Вивести найбільшого хабарника у фракції\n" +
                                    "10-Вивести найбільшого хабарника верховної ради\n" +
                                    "11-Вихід\n"

                    );
                    int temp = sc.nextInt();
                    switch (temp) {
                        case 1:
                            System.out.println("Введіть назву фракції");
                            String fractionName = sc.next();
                            vr.addFraction(fractionName, new Fraction(fractionName));
                            break;
                        case 2:
                            System.out.println("Введіть назву фракції");
                            String fractionNameForDelete = sc.next();
                            vr.deleteFraction(fractionNameForDelete);
                            break;
                        case 3:
                            vr.printAllFractions();
                            break;
                        case 4:
                            System.out.println("Введіть назву фракції");
                            String fractionNameForPrint = sc.next();
                            vr.printFraction(fractionNameForPrint);
                            break;
                        case 5:
                            System.out.println("Введіть назву фракції");
                            String fractionNameForDepDelete = sc.next();
                            System.out.println("Введіть ім'я депутата");
                            String depNameForDepDelete = sc.next();
                            System.out.println("Введіть прізвище депутата");
                            String depLastNameForDepDelete = sc.next();
                            vr.deleteDeputy(fractionNameForDepDelete, depNameForDepDelete, depLastNameForDepDelete);
                            break;
                        case 6:
                            System.out.println("Введіть назву фракції");
                            String fractionNameForDepAdd = sc.next();
                            System.out.println("Введіть ім'я депутата");
                            String depName = sc.next();
                            System.out.println("Введіть прізвище депутата");
                            String depLastName = sc.next();
                            System.out.println("Хабарник?");
                            boolean isGrafter = sc.nextBoolean();
                            if (isGrafter) {
                                System.out.println("Введіть суму хабаря");
                                double depBribe = sc.nextDouble();
                                vr.addDeputy(fractionNameForDepAdd, new Deputy(depName, depLastName, isGrafter, depBribe));
                            } else {
                                vr.addDeputy(fractionNameForDepAdd, new Deputy(depName, depLastName, isGrafter));
                            }
                            break;
                        case 7:
                            vr.printGovermentGrafters();
                            break;
                        case 8:
                            System.out.println("Введіть назву фракції");
                            String fractionNameForPrintGrafters = sc.next();
                            vr.printFractionGrafters(fractionNameForPrintGrafters);
                            break;
                        case 9:
                            System.out.println("Введіть назву фракції");
                            String fractionNameForPrintMaxGrafters = sc.next();
                            vr.printMaxGrafter(fractionNameForPrintMaxGrafters);
                            break;
                        case 10:
                            vr.printMaxGovermentGrafter();
                            break;
                        case 11:
                            exit = true;
                            break;
                        default:
                            System.out.println("Wrong operation");
                    }
                    break;
                case 2:
                    System.out.println(
                            "1-Додати депутата\n" +
                                    "2-Видалити депутата\n" +
                                    "3-Видалити хабарників\n" +
                                    "4-Вивести найбільшого хабарника\n" +
                                    "5-Вивести усіх депутатів\n" +
                                    "6-Видалити усіх депутатів\n" +
                                    "7-Видалити суму хабарів\n" +
                                    "8-Вихід\n"
                    );
                    int temp2 = sc.nextInt();
                    switch (temp2) {
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        case 5:
                            break;
                        case 6:
                            break;
                        case 7:
                            break;
                        case 8:
                            exit = true;
                            break;
                        default:
                            System.out.println("Wrong operation");
                    }
                    break;
                case 3:
                    System.out.println(
                                    "1-Дати хабаря\n" +
                                    "2-Вихід\n"
                    );
                    int temp3 = sc.nextInt();
                    switch (temp3) {
                        case 1:
                            break;
                        case 2:
                            exit = true;
                            break;
                        default:
                            System.out.println("Wrong operation");
                    }
                    break;

                default:
                    System.out.println("Wrong operation");
            }
        }while (!exit);
    }
}
