package com.task3;

public class CarsRunner {
    public static void main(String[] args)
    {
        Cars[] cars = {
                new Cars(1, "BMW", "седан",2002, "blue", 100000,111),
                new Cars(2, "Лада", "седан",2005, "red", 50000,112),
                new Cars(3, "Mercedes", "седан",2010, "white", 1250000,113),
                new Cars(4, "BMW", "седан",2010, "black", 150000,114),
                new Cars(5, "Волга", "седан",2010, "red", 70000,115),

        };
        //System.out.println(cars[1].toString());
        System.out.println("Машины бренда BMW");
        CarsMethods.carsBrendEqual(cars, "BMW");
        System.out.println("Седаны со сроком эксплуатации более 10 лет");
        CarsMethods.carsModelExpluatation(cars, "седан", 10);
        System.out.println("Машины 2010 года со стоимостью более 70000");
        CarsMethods.carsYearPrice(cars, 2010, 70000);
    }
}
