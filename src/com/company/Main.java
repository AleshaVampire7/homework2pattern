package com.company;

import com.company.observer.Observer;
import com.company.subject.Subject;

public class Main {

    public static void main(String[] args) {
        Subject subject=new Subject();
        Observer ob1=new Observer("Alibek");
        System.out.println(subject.addObserver(ob1));
        Observer ob2=new Observer("Aleke");
        System.out.println(subject.addObserver(ob2));
        subject.addTitle("Election fraud, QAnon, Jan. 6: Extremists in Germany read from a pro-Trump script");
        subject.addTitle("Letting the government negotiate drug prices won’t hurt innovation");


    }
}
