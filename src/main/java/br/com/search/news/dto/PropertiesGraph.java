package br.com.search.news.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import br.com.search.news.model.Graph;
import br.com.search.news.template.Data;

public class PropertiesGraph {

    @SerializedName("data")
    @Expose
    private Data data;

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Graph converter() {
        final Graph graph = new Graph();
        graph.setLocation(data.getCountry());
        graph.setRecovered(data.getRecovered());
        graph.setCases(data.getCases());
        graph.setDeaths(data.getDeaths());
        graph.setConfirmed(data.getConfirmed());
        return graph;
    }

}
