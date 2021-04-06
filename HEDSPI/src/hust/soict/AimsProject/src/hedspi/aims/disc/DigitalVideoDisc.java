package hedspi.aims.disc;

import hedspi.aims.media.Media;

public class DigitalVideoDisc extends Media {
    private final String director;
    private final int length;


    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public DigitalVideoDisc(String title, String director, int length) {
       setTitle(title);
        this.director = director;
        this.length = length;
    }

    public DigitalVideoDisc(String title, String category, String director, int length) {
        setTitle(title);
        setCategory(category);
        this.director = director;
        this.length = length;
    }

    public DigitalVideoDisc(int id,String title, String category, String director, int length ,float cost) {
        setTitle(title);
        setCategory(category);
        setId(id);
        setCost(cost);
        this.director = director;
        this.length = length;
    }



    @Override
    public String showInfo() {
        return "DVD  . ID: " + getId() + " - Title: " + getTitle() + ", Category: " + getCategory() + ", Director: " + getDirector() + ", Length: " + getLength() + ", Price: "+ getCost();
    }
}