// 17. Write a Java program to create a class called "Movie" with attributes for title, director, 
// actors, and reviews, and methods for adding and retrieving reviews.

import java.util.ArrayList;

class Movie {
    private String title;
    private String director;
    private ArrayList<String> actors = new ArrayList<String>();
    private ArrayList<String> reviews = new ArrayList<String>();

    public Movie(String title, String director) {
        this.title = title;
        this.director = director;
    }

    public void addActor(String actorName) {
        actors.add(actorName);
    }

    public void addReview(String review) {
        reviews.add(review);
    }

    public void getReviews() {
        System.out.println("\n--- Reviews for " + title + " ---");
        if (reviews.size() == 0) {
            System.out.println("No reviews yet.");
        } else {
            for (String r : reviews) {
                System.out.println("- " + r);
            }
        }
    }

    public void displayMovieDetails() {
        System.out.println("\n--- Movie Details ---");
        System.out.println("Title: " + title);
        System.out.println("Director: " + director);
        System.out.println("Actors: " + actors);
    }
}

class P17 {
    public static void main(String[] args) {
        Movie m = new Movie("Inception", "Christopher Nolan");

        m.addActor("Leonardo DiCaprio");
        m.addActor("Tom Hardy");
        m.addActor("Joseph Gordon-Levitt");

        m.displayMovieDetails();

        m.addReview("Amazing movie with mind-blowing concept!");
        m.addReview("Brilliant direction and acting.");

        m.getReviews();
    }
}
