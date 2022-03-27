package ru.kulinartem.patterns.builder;

public class EnterpriseWebsiteBuilder extends WebsiteBuilder{

    @Override
    void buildName() {
        website.setName("Enterprise");
    }

    @Override
    void buildCMS() {
        website.setCms(CMS.ALFRESCO);
    }

    @Override
    void buildPrice() {
        website.setPrice(4000);
    }
}
