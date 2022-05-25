public class Student {
    private String name;
    private String address;
    private String sex;
    private double score;

    public Student(String name, String address, String sex, double score) {
        this.name = name;
        this.address = address;
        this.sex = sex;
        this.score = score;
    }

    class StudentOperator {
        public void print() {
            System.out.println(String.format("Student[%s, %s, %s, %f]", name, address, sex, score));
        }

        public String type() {
            if (score > 8) {
                return "A";
            }
            else {
                if (score >= 5) {
                    return "B";
                }
                else {
                    return "C";
                }
            }
        }
    }
}