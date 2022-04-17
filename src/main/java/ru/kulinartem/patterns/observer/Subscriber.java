package ru.kulinartem.patterns.observer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
public class Subscriber implements Observer{

    private String name;

    @Override
    public void handleEvent(List<String> events) {
        System.out.println(name + " we have changes in vacancies " + events + " \n=======================\n");
    }
}
