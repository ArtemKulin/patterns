package ru.kulinartem.patterns.builder;

import lombok.Setter;

@Setter
public class Director {
    private WebsiteBuilder builder;

    public Website buildWebsite() {
        builder.createWebSite();
        builder.buildCMS();
        builder.buildName();
        builder.buildPrice();
        return builder.getWebsite();
    }
}
