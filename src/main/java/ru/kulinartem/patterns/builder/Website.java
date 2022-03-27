package ru.kulinartem.patterns.builder;

import lombok.Setter;
import lombok.ToString;

@Setter
@ToString
public class Website {
    private String name;
    private CMS cms;
    private Integer price;
}