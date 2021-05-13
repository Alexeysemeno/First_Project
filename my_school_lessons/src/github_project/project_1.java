package github_project;

import java.util.InputMismatchException;
import java.util.Scanner;

public class project_1 {
    public static void main(String[] args) {
        while (true) {
            try {   // Проверка на ошибки
                Scanner you_name = new Scanner(System.in);
                System.out.println("Hi put your name: "); // Сканнер с вводом имени
                String name = you_name.nextLine();


                while (true) {

                    if (name.matches("[0-9]*$")) {
                        System.out.println("Enter your Name in letters, not numbers"); // Проверка на ввод букв
                        break;
                    }

                    Scanner question_1 = new Scanner(System.in);
                    System.out.printf("Hi %s, how i can help you? \n \n", name);  // Сканнер с выбором сценария
                    System.out.println("For working with mathematics models press 1 \n" + "for working with array press 2 \n" + "for exit press 0");
                    int question_11 = question_1.nextInt();
                    int scenario1 = 0;
                    int scenario2 = 0;


                    while (question_11 == 1) {  // Цикл с первым сценарием
                        Scanner scenario_1 = new Scanner(System.in);
                        System.out.println("In this moment you income in mathematics sphere \n");
                        System.out.println("for fibonacci press 1 \n" + "for tetration press 2 \n" + "for pascal's triangle press 4 \n" + "for calculate press 5 \n" + "for Currency Converter press 6 \n" + "for Percentage of the contribution press 7 \n" + "for multiplication table press 8 \n" + "for arithmetic progression press 9 \n" + "for back step press 3\n" + "for exit press 0 \n");
                        scenario1 = scenario_1.nextInt();

                        while (scenario1 == 1) {  // Цикл с фибоначчи
                            Scanner fibonachhi = new Scanner(System.in);
                            System.out.println("Enter the length of the fibonacci numbers: ");
                            int lenght = fibonachhi.nextInt();
                            int num_0 = 1;
                            int num_1 = 1;
                            int num_2;
                            System.out.print(num_0 + " " + num_1 + " ");
                            for (int i = 3; i <= lenght; i++) {
                                num_2 = num_0 + num_1;
                                System.out.print(num_2 + " ");
                                num_0 = num_1;
                                num_1 = num_2;
                            }
                            System.out.println();

                            break;


                        }
                        while (scenario1 == 2) { // Цикл с тетрационной степенью
                            Scanner tetration = new Scanner(System.in);
                            System.out.println("Введите число: ");
                            int num = tetration.nextInt();
                            System.out.println("Введите степень числа: ");
                            int num2 = tetration.nextInt();
                            double count = 1;
                            int result = 1;
                            for (int i = 1; i <= 4; i++) {
                                count = count * num2;
                            }
                            System.out.println(Math.pow(num, count));
                            break;
                        }

                        while (scenario1 == 4) {  // Треугольник Паскаля
                            Scanner scanner = new Scanner(System.in);
                            System.out.println("введите высоту треугольника: ");
                            int height = scanner.nextInt();
                            int spaces = height;
                            int number;
                            for (int i = 0; i < height; i++) {
                                for (int s = 0; s <= spaces; s++) {
                                    System.out.print(" ");
                                }

                                number = 1;
                                for (int j = 0; j <= i; j++) {
                                    System.out.print(number + " ");
                                    number = number * (i - j) / (j + 1);
                                }

                                spaces--;
                                System.out.println();
                            }

                            break;
                        }

                        while (scenario1 == 5) {  // Калькулятор
                                    Scanner two = new Scanner(System.in);
                                        System.out.println("Введите первое число: ");
                                        double num1 = two.nextDouble();
                                        System.out.println("Введите второе число: ");
                                        double num2 = two.nextDouble();
                                        System.out.println("Введите математический знак (+,-,*,/): ");
                                        String num3 = two.next();
                                        switch(num3){

                                            case "+":
                                                double s = num1+num2;
                                                System.out.println(num1+"+"+num2+"="+s);
                                                break;
                                            case "-":
                                                double m = num1-num2;
                                                System.out.println(num1+"-"+num2+"="+m);
                                                break;
                                            case "*":
                                                double u = num1*num2;
                                                System.out.println(num1+"*"+num2+"="+u);
                                                break;
                                            case "/":
                                                double d = num1/num2;
                                                System.out.println(num1+"/"+num2+"="+d);
                                                break;
                                        }

                            break;
                        }

                        while (scenario1 == 6) {  // Конвертер валют
                                    Scanner one = new Scanner(System.in); // конвертер валют
                                    System.out.println("Введите сумму в рублях: ");
                                    double summa = one.nextDouble();
                                    System.out.println("Сумма ваших денег в рублях : "+summa);
                                    double dollar1 = summa/73.12;
                                    System.out.println("Сумма ваших денег в долларах : "+dollar1);
                                    double euro = summa/87.16;
                                    System.out.println("Сумма ваших денег в евро : "+euro);
                                    double lir = summa/9.69;
                                    System.out.println("Сумма ваших денег в лирах : "+lir);
                                    double gbr = summa/101.68;
                                    System.out.println("Сумма ваших денег в фунтах стерлингов : "+gbr);


                        break;
                            }

                        while (scenario1 == 7) {  // Процент от суммы вклада

                                    Scanner one= new Scanner (System.in);
                                        System.out.println("Введите сумму вклада: ");
                                        float summa = one.nextFloat();
                                        System.out.println("Введите срок вклада в месяцах: ");
                                        int mounth = one.nextInt();
                                        float procent = summa*0.93f; // 7% от суммы вклада
                                        float allsumma = 0;
                                        for (float p = 1; p<=mounth; p++){ // Делаю цикл от 1 до количество месяцев
                                            float summa_procentov = p*procent; // Умножаю процент от суммы вклада с количеством циклов
                                             allsumma = summa+summa_procentov; // Складываю сумму процентов и сумму вклада
                                        }
                                        System.out.printf("После %d месяцев сумма вклада составит: %.2f", mounth, allsumma);

                            break;
                        }

                        while (scenario1 == 8) { // Таблица умножения
                            Scanner tetration = new Scanner(System.in);
                            System.out.println("Введите число: ");
                            int num = tetration.nextInt();
                            System.out.println("Введите степень числа: ");
                            int num2 = tetration.nextInt();
                            double count = 1;
                            int result = 1;
                            for (int i = 1; i <= 4; i++) {
                                count = count * num2;
                            }
                            System.out.println(Math.pow(num, count));

                            break;
                        }

                        while (scenario1 == 9) { // Арифметическая прогрессия

                                    Scanner scanner = new Scanner(System.in);
                                    System.out.println("Введите стартовое число: ");
                                    int number_start = scanner.nextInt();
                                    System.out.println("Введите финишное число: ");
                                    int number_finish = scanner.nextInt();
                                    System.out.println("Введите число прогрессии: ");
                                    int progress = scanner.nextInt();
                                    for (int i = number_start; i<=number_finish;) {
                                        System.out.println(i);
                                    }

                            break;
                        }

                        if (scenario1 < 0 || scenario1 > 9) { // Проверка
                            System.out.println("Enter the number from the selection menu! \n");
                            continue;
                        }

                        if (scenario1 == 3) { // Возврат в предыдущее меню
                            break;
                        } else {
                            break;
                        }
                    }


                    while (question_11 == 2) {
                        Scanner scenario_2 = new Scanner(System.in); // Цикл второго сценария
                        System.out.println("In this moment you income in arrays menu \n");
                        System.out.println("For fill two arrays 1 \n" + "for palindrome check press 2 \n" + "for check for uniqueness press 4 \n" + "for merging two arrays press 5 \n" + "for back step press 3\n" + "for exit press 0 \n");
                        scenario2 = scenario_2.nextInt();

                        while (scenario2 == 1) { // Цикл с заполнением двух массивов
                            Scanner scanner = new Scanner(System.in);
                            System.out.println("введите размер 1 массива: ");
                            int height1 = scanner.nextInt();
                            System.out.println("введите размер 2 массива: ");
                            int height2 = scanner.nextInt();
                            int[] number1 = new int[height1];
                            int[] number2 = new int[height2];
                            for (int i = 0; i < height1; i++) {
                                System.out.format("введите элемент по индексу %d для 1 массива : ", i);
                                int elements = scanner.nextInt();
                                number1[i] = elements;
                            }
                            for (int i = 0; i < height2; i++) {
                                System.out.format("введите элемент по индексу %d для 2 массива : ", i);
                                int elements2 = scanner.nextInt();
                                number2[i] = elements2;
                            }
                            break;
                        }
                        while (scenario2 == 2) { // Цикл с проверкой на полиндром
                            Scanner scanner = new Scanner(System.in);
                            System.out.println("введите размер массива: ");
                            int height = scanner.nextInt();
                            int[] number = new int[height];
                            for (int i = 0; i < height; i++) {
                                Scanner scanner1 = new Scanner(System.in);
                                System.out.format("введите элемент по индексу %d для массива : ", i);
                                int elements = scanner1.nextInt();
                                number[i] = elements;
                            }
                            int count = 0;
                            for (int i = 0, j = number.length - 1; i < number.length; i++, j--) {
                                if (number[i] == number[j]) {
                                    count++;
                                    if (count == number.length) {
                                        System.out.println("это полиндром");
                                    }
                                } else {
                                    count--;
                                }
                            }
                            break;
                        }

                        while (scenario2 == 4) { // Проверка уникальности в массиве

                            int list1 [] = new int[]{1,2,3,4,6};
                             int count = 1;
                              for (int i = 0; i< list1.length; i++){
                                   if (list1[i]==list1[count]) {
                                       System.out.print("Нет");
                                                System.out.println("");
                                                count=count+1;
                                                break;
                                              }
                                                 else{
                                                     System.out.println("Уникальны");
                                                 }
                                            }
                              break;
                        }

                        while (scenario2 == 5) { // Слияние двух массивов

                            int[]a = {1,2,3,4};
                            int[]b = {4,16,1,2,3,22};
                            int[]c = new int[a.length+b.length];
                            int count = 0;
                            for(int i = 0; i<a.length; i++) {
                                c[i] = a[i];
                                count++;
                            }
                            for(int j = 0;j<b.length;j++) {
                                c[count++] = b[j];
                            }
                            for(int i = 0;i<c.length;i++)
                                System.out.print(c[i]+" ");

                            break;
                        }

                        if (scenario2 < 0 || scenario2 > 5) {
                            System.out.println("Enter the number from the selection menu! \n");
                            continue;
                        }

                        if (scenario2 == 3) { // Возврат в предыдущее меню
                            break;
                        } else {
                            break;
                        }
                    }

                    if (question_11 < 0 || question_11 > 2) {
                        System.out.println("Enter the number from the selection menu! \n");
                        continue;
                    }

                    if (question_11 == 0) {
                        break;
                    }

                    if (scenario1 == 3 || scenario2 == 3) { // Продолжаем выбор сценария
                        continue;
                    } else {  // Выход из программы
                        break;
                    }

                }

                if (name.matches("[0-9]*$")) {
                    continue;
                }

                break;


            }

            catch (InputMismatchException im) {
                System.out.println("Enter the number only! Try again"); // Ошибка ввода букв
            }
            catch (Exception ex){
                System.out.println("Сервер не доступен");  // Ошибка сервера
            }
        }

    }

}

