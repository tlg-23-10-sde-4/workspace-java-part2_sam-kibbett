class Client {

    public static void main(String[] args) {
        // classloader loads Instructor.class, which initializes that static (shared) Projector object
    //    Instructor inst1 = new Instructor("ed", 24);
    //    Instructor inst2 = new Instructor("Jay", 26);
        Instructor.touch();
        Instructor.touch();
    }

}