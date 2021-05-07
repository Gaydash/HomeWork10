package com.gaydash;

/*
1) Завершить пример с фруктуами: напечатать стоимость чека по 4 позициям с окрулением до копеек.
Данные вес/стоимость за Кг:
Зеленое яблоко 346 / 21.95
Красное яблоко 230 / 19.95
Банан 220 / 32.85
Лимон 88 / 34.95
*/

public class Main {
    public static void main(String[] args) {
        Fruit greenApple = new Fruit();
        greenApple.setColor(Color.GREEN);
        greenApple.setType(Fruit.Type.APPLE);
        greenApple.setWeight(346);
        greenApple.setPricePerKg(21.95);

        double greenApplePrice = greenApple.getPricePerKg() * greenApple.getWeight() / 1000.0;

        Fruit redApple = new Fruit();
        redApple.setColor(Color.RED);
        redApple.setType(Fruit.Type.APPLE);
        redApple.setWeight(230);
        redApple.setPricePerKg(19.95);

        double redApplePrice = redApple.getPricePerKg() * redApple.getWeight() / 1000.0;

        Fruit banana = new Fruit();
        banana.setColor(Color.YELLOW);
        banana.setType(Fruit.Type.BANANA);
        banana.setWeight(220);
        banana.setPricePerKg(32.85);

        double bananaPrice = banana.getPricePerKg() * banana.getWeight() / 1000.0;

        Fruit lemon = new Fruit();
        lemon.setColor(Color.YELLOW);
        lemon.setType(Fruit.Type.LEMON);
        lemon.setWeight(88);
        lemon.setPricePerKg(34.95);

        double lemonPrice = lemon.getPricePerKg() * lemon.getWeight() / 1000.0;

        System.out.printf("%.2f", greenApplePrice); // 7.59 грн
        System.out.println();
        System.out.printf("%.2f", redApplePrice);
        System.out.println();
        System.out.printf("%.2f", bananaPrice);
        System.out.println();
        System.out.printf("%.2f", lemonPrice);
        System.out.println();
        System.out.print("Итого: ");
        System.out.printf("%.2f", greenApplePrice + redApplePrice + bananaPrice + lemonPrice);

    }
}
