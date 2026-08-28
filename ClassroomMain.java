public class ClassroomMain {
    public static void main(String[] args) {
        Classroom c = new Classroom ("davidson", 40 , 33);
        Classroom c1 = new Classroom("morris");
        c1.setDesks(30);
       
        c.printState();
    }
}
