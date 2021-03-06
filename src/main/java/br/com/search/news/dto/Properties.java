package br.com.search.news.dto;

import java.io.Serializable;

public class Properties implements Serializable {

    private static final long serialVersionUID = 1920526238931622608L;

    private String title;
    private String address;
    private String source;
    private String content;
    private String time;
    private String listNews;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getListNews() {
        return listNews;
    }

    public void setListNews(String listNews) {
        this.listNews = listNews;
    }

    public static Properties newsBingSearch() {
        final Properties properties = new Properties();
        properties.setTitle("t_t");
        properties.setListNews("news-card-body");
        properties.setContent("snippet");
        properties.setSource("source");
        return properties;
    }

}
