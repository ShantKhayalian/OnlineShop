package java.Models;

public class News {
    private int newsID;
    private String news_title;
    private String news_description;

    public News(String news_title, String news_description) {
        this.news_title = news_title;
        this.news_description = news_description;
    }
    public News(){

    }

    public int getNewsID() {
        return newsID;
    }

    public void setNewsID(int newsID) {
        this.newsID = newsID;
    }

    public String getNews_title() {
        return news_title;
    }

    public void setNews_title(String news_title) {
        this.news_title = news_title;
    }

    public String getNews_description() {
        return news_description;
    }

    public void setNews_description(String news_description) {
        this.news_description = news_description;
    }
}