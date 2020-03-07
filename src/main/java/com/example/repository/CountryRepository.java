package com.example.repository;

import com.example.generated.Country;
import com.example.generated.Currency;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Repository
public class CountryRepository {

    private static final Map<String, Country> countries = new HashMap<>();

    @PostConstruct
    public void initialise() {
        countries.put("Poland", createCountry("Poland", 38_000_000, "Warsaw", Currency.PLN));
        countries.put("Germany", createCountry("Germany", 50_000_000, "Berlin", Currency.EUR));
        countries.put("London", createCountry("London", 50_000_000, "UK", Currency.GBP));
        countries.put("Portugal", createCountry("Portugal", 50_000_000, "Lizbona", Currency.EUR));
        countries.put("Spain", createCountry("Spain", 70_000_000, "Barcelona", Currency.EUR));
    }

    public Country getCountry(String name) {
        return countries.get(name);
    }

    private Country createCountry(String name, int population, String capital, Currency currency) {
        Country country = new Country();
        country.setName(name);
        country.setPopulation(population);
        country.setCapital(capital);
        country.setCurrency(currency);

        return country;
    }
}
