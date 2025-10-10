// Problem 3: Online Learning Platform 

// Abstract class Course:

// title, duration fields

// abstract method startCourse(), endCourse()

// concrete method courseDetails()

// Subclasses:

// VideoCourse

// LiveCourse

// Interface CertificateProvider with generateCertificate() method.

// Only VideoCourse provides certificates.

// In main method, simulate starting, ending, and generating certificates.

import java.util.*;

interface CertificateProvider {
    public void generateCertificate();
}

abstract class Course {
    private String title;
    private int duration;

    public Course(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public abstract void startCourse();

    public abstract void endCourse();

    public void courseDetails() {
        System.out.println("Course Title: " + title);
        System.out.println("Duration: " + duration + " hours");
    }
}

class VideoCourse extends Course implements CertificateProvider {

    public VideoCourse(String title, int duration) {
        super(title, duration);
    }

    public void startCourse() {
        System.out.println("Video course '" + getTitle() + "' has started. Watch the videos at your own pace!");
    }

    public void endCourse() {
        System.out.println("Video course '" + getTitle() + "' has ended. You can now get your certificate!");
    }

    public void generateCertificate() {
        System.out.println(" Certificate generated for video course: " + getTitle());
    }
}

class LiveCourse extends Course {

    public LiveCourse(String title, int duration) {
        super(title, duration);
    }

    public void startCourse() {
        System.out.println("Live course '" + getTitle() + "' has started. Join the live session now!");
    }

    public void endCourse() {
        System.out.println("Live course '" + getTitle() + "' has ended. Thank you for attending!");
    }
}

class OnlineLearningPlatform{
    public static void main(String[] args) {
        VideoCourse vc = new VideoCourse("Java Programming", 40);
        LiveCourse lc = new LiveCourse("Cyber Security Bootcamp", 20);

        System.out.println(" Course Details:- ");
        vc.courseDetails();
        lc.courseDetails();

        System.out.println(" Course Simulation :- ");
        vc.startCourse();
        vc.endCourse();
        vc.generateCertificate();

        System.out.println();

        lc.startCourse();
        lc.endCourse();
    }
}
