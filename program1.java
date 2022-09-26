class program1 {
    //declared static variable
    static String FirstName = "Sakshi";
    static String LastName = "Nailwal";
    static int age = 21;

     // print using static variable
     public static void printUsingStaticVariable() {
        System.out.println(FirstName + " " + LastName + " " + age);
    }
    // print using static method
    public static void printUsingStaticMethod() {
        String FirstName2 = "Shanaya";
        String LastName2 = "Sehgal";
        int age2 = 24;
        System.out.println(FirstName2 + " " + LastName2 + " " + age2);

    }
    //print using static block
    class static_block {
        static String FirstName1;
        static String LastName1;
        static int age1;

        static {
            FirstName1 = "Swati";
            LastName1 = "Arora";
            age1 = 22;
            System.out.println(FirstName1 + " " + LastName1 + " " + age1);
        }

    }
    public static void main(String[] args) {
        System.out.println(static_block.FirstName1);
        System.out.println(static_block.LastName1);
        System.out.println(static_block.age1);

        // print using static method
        printUsingStaticMethod();

        // print using static variable
        printUsingStaticVariable();
    }
}