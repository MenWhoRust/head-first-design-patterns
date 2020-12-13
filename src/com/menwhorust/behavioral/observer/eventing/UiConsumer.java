package com.menwhorust.behavioral.observer.eventing;

import java.util.Scanner;

public class UiConsumer {

    public static void main(String[] args) {
        ConcreteUiSubject<Integer> subject = new ConcreteUiSubject<Integer>(0);

        subject.addEventListener(integer -> {
            if(integer == 1)
                System.out.println("One is best");
            if(integer == 2)
                System.out.println("Two is not so good");

        });

        while (true) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Please input a number");
            Integer num = scanner.nextInt();

            subject.setValue(num);
        }

    }
}
