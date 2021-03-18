package com.company.Porterfield;
// George Porterfield


public class Main {

    public static void main(String[] args) {
        AddressBook list1 = new AddressBook();

        Person ppl1 = new Person("Jimmy", "Blah@gmail.com");

        Person ppl2 = new Person("Sally", "Sally@gmail.com");

        Person ppl3 = new Person("Bill","Bill@gmail.com");
        list1.add(ppl1);
        list1.add(ppl2);
        list1.add(ppl3);

        list1.display();

        list1.getEmail("Bill");

        System.out.println("Bills email address is " +list1.getEmail("Bill"));
    }

}
