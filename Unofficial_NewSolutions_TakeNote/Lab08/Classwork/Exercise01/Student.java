public class Student extends Person {
    private int id;
    private double score;

    public Student(String name, int birthYear, int id, double score) {
        super(name, birthYear);
        this.id = id;
        this.score = score;
    }

    public void setID(int id) {
        this.id = id;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public int getID() {
        return this.id;
    }

    public double getScore() {
        return this.score;
    }

    @Override
    public String toString() {
        return String.format("Student[name = %s, birthYear = %d, id = %d, score = %f]", this.name, this.birthYear, this.id, this.score);
    }
}