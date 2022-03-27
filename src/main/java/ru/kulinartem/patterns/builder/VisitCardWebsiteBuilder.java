package ru.kulinartem.patterns.builder;

public class VisitCardWebsiteBuilder extends WebsiteBuilder{

    @Override
    void buildName() {
        website.setName("VisitCard");
    }

    @Override
    void buildCMS() {
        website.setCms(CMS.WORDPRESS);
    }

    @Override
    void buildPrice() {
        website.setPrice(1000);
    }
}
