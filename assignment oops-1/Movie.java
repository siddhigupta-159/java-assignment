//  Movie Rating System
// Create a class Movie with fields: name, genre, and rating.
// Use setters and create a method isHit() that returns true if rating ≥ 8.0.

class Field {
    private String name;
    private String genre;
    private double rating;

    public void setName(String name) {
        this.name = name;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
    public boolean isHit() {
       if (rating >= 8.0)
       return true;
       return false;
    }
    
    public void display() {
        System.out.println("Movie Name: " + name);
        System.out.println("Movie Genre: " + genre);
        System.out.println("Movie Rating: " + rating);
        System.out.println("Is Hit: " +isHit());
    }
}

class Movie {
public static void main(String[] args) {
    Field obj=new Field();
    obj.setName("Saiyara");
    obj.setGenre("Romantic Emotional");
    obj.setRating(7.5);
    obj.isHit();
    obj.display();
}
}
