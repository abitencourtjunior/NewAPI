
package br.com.search.news.scrapy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import br.com.search.news.dto.PropertiesGraph;
import br.com.search.news.enumerate.NewsSource;
import br.com.search.news.model.Graph;
import br.com.search.news.repository.GraphRepository;
import kong.unirest.Unirest;

@Component
public class NewsBingGraph {

    @Autowired
    private GraphRepository graphRepository;

    @Scheduled(cron = "0 50 8 * * ?")
    public void searchGraphCovidNews() throws Exception {

        final PropertiesGraph data = Unirest.get(NewsSource.BING_GRAPH_COVID.getUrl()).asObject(PropertiesGraph.class).getBody();
        final Graph currentData = data.converter();
        graphRepository.save(currentData);
        System.out.println(currentData.toString());
    }

}
