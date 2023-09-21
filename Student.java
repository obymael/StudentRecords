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
    /*// So you don't have to write them separately as:
    System.out.println(alice.name + ": " + alice.score);
    System.out.println(bob.name + ": " + bob.score);
    System.out.println(charlie.name + ": " + charlie.score);
    System.out.println(david.name + ": " + david.score);*/
}
