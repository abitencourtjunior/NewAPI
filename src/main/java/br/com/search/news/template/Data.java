package br.com.search.news.template;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {

    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("cases")
    @Expose
    private Long cases;
    @SerializedName("confirmed")
    @Expose
    private Long confirmed;
    @SerializedName("deaths")
    @Expose
    private Long deaths;
    @SerializedName("recovered")
    @Expose
    private Long recovered;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Long getCases() {
        return cases;
    }

    public void setCases(Long cases) {
        this.cases = cases;
    }

    public Long getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(Long confirmed) {
        this.confirmed = confirmed;
    }

    public Long getDeaths() {
        return deaths;
    }

    public void setDeaths(Long deaths) {
        this.deaths = deaths;
    }

    public Long getRecovered() {
        return recovered;
    }

    public void setRecovered(Long recovered) {
        this.recovered = recovered;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

}