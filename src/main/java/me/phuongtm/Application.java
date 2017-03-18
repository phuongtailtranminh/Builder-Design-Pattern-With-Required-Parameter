package me.phuongtm;

import me.phuongtm.models.Person;

/**
 * Created by phuongtm on 3/19/2017.
 */
public class Application {

    public static void main(String[] args) {
        Person p = Person.builder()
                .withFirstName("Tran")
                .withLastName("Phuong")
                .withAddress("Hanoi")
                .build();
        System.out.println(p);
    }

}