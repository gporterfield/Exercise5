package com.company.Porterfield;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private List<Person> yellowPages;

    public AddressBook() {
        yellowPages = new ArrayList<>();
    }

    public boolean add(Person a){
        return(yellowPages.add(a));
    }

    public void setYellowPages(List<Person> yellowPages) {
        this.yellowPages = yellowPages;
    }

    public void display(){
        System.out.println(yellowPages);
    }

    public String getEmail(String name){
        Person guy;
        for(int i=0; i < yellowPages.size(); i++){
            guy = yellowPages.get(i);
            if(guy.getName().equals(name)) {
                return(guy.getEmail());
            }
        } return "";
    }

}
