package ru.gb.vending.product;

public class Product { //public и private - это модификаторы доступа
    private String name;
    private double price;


    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    // каждый класс является наследником класса object
    @Override //аннотация - функциональный комментарий, перевод - перезаписать
    public String toString() {
        //return super.toString(); // super - обращение к родительскому классу
        return "name: " + name + ", price " + price + "р.";
    }


}
