package ru.netology;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Smartphone extends Product {
    private String namePhone;
    private String produced;



    public Smartphone(int id, String name, int price, String produced) {
        super(id, name, price);
        this.produced = produced;
    }

//    public String getProduced() {
//        return produced;
//    }
//
//    public void setProduced(String produced) {
//        this.produced = produced;
//    }
}

