
package br.com.search.news.scrapy;

import org.springframework.stereotype.Component;

@Component
public class NewsBingGraph {

    // @Scheduled(initialDelay = 5000, fixedDelay = 10000)
    public void searchGraphCovidNews() throws Exception {

        /*
         * final Properties properties = NewsSource.BING_GRAPH_COVID.getProperties();
         * final Document doc =
         * Jsoup.connect(NewsSource.BING_GRAPH_COVID.getUrl()).timeout(3000).get();
         * final Elements location = doc.getElementsByClass(properties.getTitle());
         * final Elements totalPersons =
         * doc.getElementsByClass(properties.getContent()); final Elements totalActive =
         * doc.getElementsByClass(properties.getActive()); final Elements totalRecovered
         * = doc.getElementsByClass(properties.getRecovered()); final Elements
         * totalFatal = doc.getElementsByClass(properties.getFatal());
         * System.out.println(location.get(0).text());
         * System.out.println(totalPersons.get(0).text());
         * System.out.println(totalActive.get(0).text());
         * System.out.println(totalRecovered.get(0).text());
         * System.out.println(totalFatal.get(0).text());
         */

    }

}
