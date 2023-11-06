class Instructor {
    // shared among all Instructor objects
    private static Projector projector = new Projector();

    // instance variables for each Instructor object
    private final String name;
    private final int yearsExperience;

    public Instructor(String name, int yearsExperience) {
        this.name = name;
        this.yearsExperience = yearsExperience;
    }

    public static void touch() {
    }

    public String getName() {
        return name;
    }

    public int getYearsExperience() {
        return yearsExperience;
    }

    static {
        System.out.println("static field initialized, Instructor.class loaded into memory");
    }
}