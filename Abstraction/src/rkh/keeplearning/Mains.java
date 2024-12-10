package rkh.keeplearning;

import rkh.keeplearning.person.Programmer;
import rkh.keeplearning.person.Merchant;
import rkh.keeplearning.person.Person;

public class Mains {
    
    public static void main(String [] args) {

        Person al = new Programmer();
        al.activity();
        al.job();
        
        System.out.println("\n" + "**********************" + "\n");

        Person ax = new Merchant();
        ax.activity();
        ax.job();

    }

}
