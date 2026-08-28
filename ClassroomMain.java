public class ClassroomMain {
    public static void main(String[] args) {
        Classroom c = new Classroom ("Davidson", 40 , 33);
        Classroom c1 = new Classroom("Morris");
        c1.setDesks(30);
       
        c.printState();
    }
}
