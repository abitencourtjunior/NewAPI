
package br.com.search.news.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.search.news.model.Graph;
import br.com.search.news.repository.GraphRepository;

@RestController
@RequestMapping("/v1/graph")
public class GraphController {

    @Autowired
    private GraphRepository graphRepository;

    @GetMapping("/tmp")
    public List<Graph> listTestNews() {

        final List<Graph> newsResult = graphRepository.findAll();

        return newsResult;

    }

}
