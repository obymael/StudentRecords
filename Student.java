public class Student {
    String name;
    int score;
    Student (String name, int score){
        this.name = name;
        this.score = score;
    }

    public String toString(){
        return name + ": " + score;
    }

}
