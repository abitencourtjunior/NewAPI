
package br.com.search.news.scrapy;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import br.com.search.news.dto.Properties;
import br.com.search.news.enumerate.NewsSource;
import br.com.search.news.model.News;
import br.com.search.news.repository.NewsRepository;

@Component
public class NewsBing {

    @Autowired
    private NewsRepository newsRepository;
    private static final String REGEX = "(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)";

    @Scheduled(initialDelay = 5000, fixedDelay = 10000)
    public void searchNews() throws Exception {

        final Properties properties = NewsSource.BING.getProperties();
        final Document doc = Jsoup.connect(NewsSource.BING.getUrl()).get();
        final Elements listNewsCurrent = doc.getElementsByClass(properties.getListNews());

        for (final Element currentNew : listNewsCurrent) {
            final News processSaveNews = processSaveNews(currentNew, properties);
            final News optional = newsRepository.findByTitle(processSaveNews.getTitle());

            if (optional == null) {
                newsRepository.save(processSaveNews);
            }

        }

    }

    private News processSaveNews(final Element currentNew, Properties properties) {
        final News newsToSave = new News();
        final Elements contentTitle = currentNew.getElementsByClass(properties.getTitle());
        newsToSave.setTitle(contentTitle.text());
        newsToSave.setAddress(contentTitle.select("a").first().attr("href"));
        setSourceAndTime(currentNew, newsToSave, properties);
        newsToSave.setContent(currentNew.getElementsByClass(properties.getContent()).text());
        return newsToSave;
    }

    private void setSourceAndTime(final Element currentNew, final News newsToSave, final Properties properties) {
        final String[] source = currentNew.getElementsByClass(properties.getSource()).text().split(REGEX);
        newsToSave.setSource(source[0]);
        newsToSave.setTime(processTime(source));
    }

    private String processTime(final String[] source) {
        return source[source.length - 2] + source[source.length - 1];
    }
}
