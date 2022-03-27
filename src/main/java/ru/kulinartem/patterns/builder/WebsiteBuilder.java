package ru.kulinartem.patterns.builder;

public abstract class WebsiteBuilder {
    protected Website website;

    public void createWebSite() {
        website = new Website();
    }

    abstract void buildName();
    abstract void buildCMS();
    abstract void buildPrice();

    protected Website getWebsite() {
        return website;
    }
}
