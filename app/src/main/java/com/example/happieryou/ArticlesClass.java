package com.example.happieryou;

public class ArticlesClass {
    String Title;

    public String getTitle() {
        return Title;
    }

    public String getDescription() {
        return Description;
    }

    public String getLink() {
        return Link;
    }
    public ArticlesClass(){

    }
    public ArticlesClass(String title, String description, String link) {
        Title = title;
        Description = description;
        Link = link;
    }

    String Description;
    String Link;
}
