package com.covid.countries.model.view;

import java.util.List;

public class CountryCovidViewModel {
    private String ID;
    private String country;
    private String countryCode;
    private String slug;
    private Integer newConfirmed;
    private Integer totalConfirmed;
    private Integer newDeaths;
    private Integer totalDeaths;
    private Integer newRecovered;
    private Integer totalRecovered;
    private String date;
    private List<Premium> premium;

    public CountryCovidViewModel() {
    }

    public String getID() {
        return ID;
    }

    public CountryCovidViewModel setID(String ID) {
        this.ID = ID;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public CountryCovidViewModel setCountry(String country) {
        this.country = country;
        return this;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public CountryCovidViewModel setCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    public String getSlug() {
        return slug;
    }

    public CountryCovidViewModel setSlug(String slug) {
        this.slug = slug;
        return this;
    }

    public Integer getNewConfirmed() {
        return newConfirmed;
    }

    public CountryCovidViewModel setNewConfirmed(Integer newConfirmed) {
        this.newConfirmed = newConfirmed;
        return this;
    }

    public Integer getTotalConfirmed() {
        return totalConfirmed;
    }

    public CountryCovidViewModel setTotalConfirmed(Integer totalConfirmed) {
        this.totalConfirmed = totalConfirmed;
        return this;
    }

    public Integer getNewDeaths() {
        return newDeaths;
    }

    public CountryCovidViewModel setNewDeaths(Integer newDeaths) {
        this.newDeaths = newDeaths;
        return this;
    }

    public Integer getTotalDeaths() {
        return totalDeaths;
    }

    public CountryCovidViewModel setTotalDeaths(Integer totalDeaths) {
        this.totalDeaths = totalDeaths;
        return this;
    }

    public Integer getNewRecovered() {
        return newRecovered;
    }

    public CountryCovidViewModel setNewRecovered(Integer newRecovered) {
        this.newRecovered = newRecovered;
        return this;
    }

    public Integer getTotalRecovered() {
        return totalRecovered;
    }

    public CountryCovidViewModel setTotalRecovered(Integer totalRecovered) {
        this.totalRecovered = totalRecovered;
        return this;
    }

    public String getDate() {
        return date;
    }

    public CountryCovidViewModel setDate(String date) {
        this.date = date;
        return this;
    }

    public List<Premium> getPremium() {
        return premium;
    }

    public CountryCovidViewModel setPremium(List<Premium> premium) {
        this.premium = premium;
        return this;
    }
}
