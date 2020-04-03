
package br.com.search.news.enumerate;

import br.com.search.news.dto.Properties;

public enum NewsSource {

    BING("https://www.bing.com/news/search?q=coronav%c3%adrus&FORM=FRESET", Properties.newsBingSearch()),
    BING_GRAPH_COVID("https://www.bing.com/covid/local/brazil?vert=graph", Properties.newsBingGraphCovid());

    private String url;
    private Properties properties;

    private NewsSource(final String value, Properties propertiesToSearch) {
        url = value;
        properties = propertiesToSearch;
    }

    public Properties getProperties() {
        return properties;
    }

    public String getUrl() {
        return url;
    }
}
