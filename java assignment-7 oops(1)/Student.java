// Student Result Checker
// Create a class Student with fields: name, mathMarks, scienceMarks.
// Use setters to assign values. Add a method getAverage().

class Fields {
    private String name;
    private double mathMarks;
    private double scienceMarks;

    public void setName(String name) {
        this.name = name;
    }

    public void setMathMarks(double mathMarks) {
        this.mathMarks = mathMarks;
    }

    public void setScienceMarks(double scienceMarks) {
        this.scienceMarks = scienceMarks;
    }

    public double getAverage() {
        return (mathMarks + scienceMarks) / 2;
    }

    public void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Math Marks: " + mathMarks);
        System.out.println("Science Marks: " + scienceMarks);
        System.out.println("Average Marks: " + getAverage());
    }
}

class Student {
    public static void main(String[] args) {
        Fields obj = new Fields();
        obj.setName("Siddhi Gupta");
        obj.setMathMarks(93);
        obj.setScienceMarks(88);
        obj.getAverage();
        obj.display();
    }
}