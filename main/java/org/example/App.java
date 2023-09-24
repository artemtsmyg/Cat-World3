package org.example;


public class App {
        public static void main(String[] args) {
            // Создаем несколько кошек
            Cat cat1 = new Cat("Мурка", 3);
            Cat cat2 = new Cat("Барсик", 2);
            Cat cat3 = new Cat("Кузя", 3);
            Cat cat4 = new Cat("Басюта", 4);
            Cat cat5 = new Cat("Паша", 19);

            // Взаимодействие с кошками
            cat1.displayInfo();
            cat1.meow();
            cat1.play();
            cat1.sleep();

            System.out.println();

            cat2.displayInfo();
            cat2.meow();
            cat2.play();
            cat2.sleep();

            System.out.println();

            cat3.displayInfo();
            cat3.meow();
            cat3.play();
            cat3.sleep();

            System.out.println();

            cat4.displayInfo();
            cat4.meow();
            cat4.play();
            cat4.sleep();

            System.out.println();

            cat5.displayInfo();
            cat5.meow();
            cat5.play();
            cat5.sleep();
        }
    }

