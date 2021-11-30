package Minites.Student;

public class Student {
    private int id;
    private String name;
    private int mathScores;
    private int chemistryScores;
    private int physicsScores;

    public Student(int id, String name, int mathScores, int chemistryScores, int physicsScores) {
        this.id = id;
        this.name = name;
        this.mathScores = mathScores;
        this.chemistryScores = chemistryScores;
        this.physicsScores = physicsScores;
    }

    public Student() {
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

    public int getMathScores() {
        return mathScores;
    }

    public void setMathScores(int mathScores) {
        this.mathScores = mathScores;
    }

    public int getChemistryScores() {
        return chemistryScores;
    }

    public void setChemistryScores(int chemistryScores) {
        this.chemistryScores = chemistryScores;
    }

    public int getPhysicsScores() {
        return physicsScores;
    }

    public void setPhysicsScores(int physicsScores) {
        this.physicsScores = physicsScores;
    }
}
