package io.github.Adam;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.annotations.GenericGenerator;



@Entity
@Table(name = "languages")

public class Dictionary {
    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")


    /**
     * Hibernate need it
     */
    private Long id;
    private String germany;
    private String dutch;
    private String english;

    public Dictionary() {

    }

    public Dictionary(Long id, String germany, String dutch, String english) {
        this.id = id;
        this.germany = germany;
        this.dutch = dutch;
        this.english = english;

    }

    public Dictionary(Dictionary dictionary) {
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }

    public String getGermany() {
        return germany;
    }

    public void setGermany(String germany) {
        this.germany = germany;
    }

    public String getDutch() {
        return dutch;
    }

    public void setDutch(String dutch) {
        this.dutch = dutch;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }
}


