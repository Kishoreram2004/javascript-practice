class Student {

    String name;
    int age;

    void study() {
        System.out.println("Studying...");
    }


    public static void main(String[] args){
        Student s1 = new Student();

        s1.name = "John";
        s1.age = 20;

        s1.study();
    }
}