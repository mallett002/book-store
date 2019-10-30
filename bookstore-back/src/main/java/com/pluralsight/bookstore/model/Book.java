package com.pluralsight.bookstore.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Entity
public class Book {

    @Id @GeneratedValue
    private Long id;

    @Column(length = 200)
    private String title;

    @Column(length = 1000)
    private String description;

    @Column(name = "unit_cost")
    private Float unitCost;

    private String isbn;

    @Column(name = "publication_date")
    @Temporal(TemporalType.DATE)
    private Date publicationDate;

    @Column(name = "nb_of_pages")
    private Integer nbOfPages;

    @Column(name = "image_url")
    private String imageUrl;

    private Language language;

    // Getters and setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String des) {
        this.description = des;
    }

    public Float getUnitCost() {
        return unitCost;
    }
    public void setUnitCost(Float u) {
        this.unitCost = u;
    }

    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }
    public void setPublicationDate(Date pubDate) {
        this.publicationDate = pubDate;
    }

    public Integer getNbOfPages() {
        return nbOfPages;
    }
    public void setNbOfPages(Integer n) {
        this.nbOfPages = n;
    }

    public String getImageUrl() {
        return imageUrl;
    }
    public void setImageUrl(String i) {
        this.imageUrl = i;
    }

    public Language getLanguage() {
        return language;
    }
    public void setLanguage(Language l) {
        this.language = l;
    }

    @Override
    public String toString() {
        return "Book: " + title;
    }
}