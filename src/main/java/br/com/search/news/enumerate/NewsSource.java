
package br.com.search.news.enumerate;

import br.com.search.news.dto.Properties;
import br.com.search.news.dto.PropertiesGraph;

public enum NewsSource {

    BING("https://www.bing.com/news/search?q=coronav%c3%adrus&FORM=FRESET", Properties.newsBingSearch()),
    BING_GRAPH_COVID("https://covid19-brazil-api.now.sh/api/report/v1/brazil");

    private String url;
    private Properties properties;
    private PropertiesGraph propertiesGraph;

    private NewsSource(final String value, Properties propertiesToSearch) {
        url = value;
        properties = propertiesToSearch;
    }

    private NewsSource(String value, PropertiesGraph properties) {
        url = value;
        propertiesGraph = properties;
    }

    private NewsSource(String value) {
        url = value;
    }

    public Properties getProperties() {
        return properties;
    }

    public PropertiesGraph getPropertiesGraph() {
        return propertiesGraph;
    }

    public String getUrl() {
        return url;
    }
}
