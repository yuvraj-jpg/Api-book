package com.bokie.book;
public class Author {
    private String authorName;
    private String gender;
    private int age;
    private double rating;

    public Author() {
    }

    public Author(String authorName, String gender, int age, double rating) {
        this.authorName = authorName;
        this.gender = gender;
        this.age = age;
        this.rating = rating;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
