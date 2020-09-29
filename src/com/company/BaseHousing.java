package com.company;
//у інтерфейсі всі методи абстрактні без реалізації. а у абстрактному класі зазвичай є пару абстрактних методів.
public abstract class BaseHousing {     //клас, в якому є абстрактний метод
    private String name;
    private String description;
    private int price;

    public BaseHousing() {
    }

    public BaseHousing(String name, String description, int price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public abstract int getTotalPrice();

    @Override
    public String toString() {
        return "BaseHousing{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
