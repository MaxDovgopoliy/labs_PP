package com;


import java.util.Scanner;

public class book {
    Scanner in = new Scanner(System.in);
    private int id;
    private String name;
    private String autor;
    private String published;
    private float price;
    private int year;
    private int page;

    public book() {
        this.id = id;
        this.name = name;
        this.autor = autor;
        this.published = published;
        this.price = price;
        this.year = year;
        this.page = page;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getPublished() {
        return published;
    }

    public void setPublished(String published) {
        this.published = published;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    @Override
    public String toString() {
        return "book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", autor='" + autor + '\'' +
                ", published='" + published + '\'' +
                ", price=" + price +
                ", year=" + year +
                ", page=" + page +
                '}';
    }
}