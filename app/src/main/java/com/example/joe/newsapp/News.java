package com.example.joe.newsapp;

public class News {

    private String articleTitle;

    private String articleAuthor;

    private String publishedDate;

    private String articleSection;

    private String articleSynopsis;

    private String articleUrl;

    public News(String title, String author, String date, String section, String synopsis, String webUrl) {
        articleTitle = title;
        articleAuthor = author;
        publishedDate = date;
        articleSection = section;
        articleSynopsis = synopsis;
        articleUrl = webUrl;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public String getArticleAuthor() {
        return articleAuthor;
    }

    public String getPublishedDate() {
        return publishedDate;
    }

    public String getArticleSection() {
        return articleSection;
    }

    public String getArticleSynopsis() {
        return articleSynopsis;
    }

    public String getArticleUrl() {
        return articleUrl;
    }
}
