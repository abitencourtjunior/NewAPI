package br.com.search.news.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Graph {

    private static final long serialVersionUID = -1941846979845881959L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String location;
    private Long cases;
    private Long recovered;
    private Long deaths;
    private Long confirmed;
    private final LocalDateTime localDateTime = LocalDateTime.now();

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Long getRecovered() {
        return recovered;
    }

    public void setRecovered(Long recovered) {
        this.recovered = recovered;
    }

    public Long getCases() {
        return cases;
    }

    public void setCases(Long cases) {
        this.cases = cases;
    }

    public Long getDeaths() {
        return deaths;
    }

    public void setDeaths(Long deaths) {
        this.deaths = deaths;
    }

    public Long getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(Long confirmed) {
        this.confirmed = confirmed;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    @Override
    public String toString() {
        return "Graph [id=" + id + ", location=" + location + ", cases=" + cases + ", recovered=" + recovered + ", deaths=" + deaths + ", confirmed=" + confirmed + ", localDateTime=" + localDateTime
                + "]";
    }

}
