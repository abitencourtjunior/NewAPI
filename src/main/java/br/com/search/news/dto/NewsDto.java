
package br.com.search.news.dto;

import org.springframework.data.domain.Page;

import br.com.search.news.model.News;

public class NewsDto {

    private final String title;
    private final String address;
    private final String source;
    private final String content;
    private final String time;

    public NewsDto(final News news) {
        title = news.getTitle();
        address = news.getAddress();
        source = news.getSource();
        content = news.getContent();
        time = news.getTime();
    }

    public String getTitle() {
        return title;
    }

    public String getAddress() {
        return address;
    }

    public String getSource() {
        return source;
    }

    public String getContent() {
        return content;
    }

    public static Page<NewsDto> converter(final Page<News> news) {
        return news.map(NewsDto::new);
    }

    public String getTime() {
        return time;
    }

}
