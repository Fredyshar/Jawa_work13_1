package ru.netology;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Smartphone extends Product {
//    private String namePhone;
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
@Override
public boolean matches(String search) {
    if (super.matches(search)) {
        return true;
    }
    if (getProduced().contains(search)) {
        return true;
    }
    else {
        return false;
    }


}
}

