class Student{
    String name;
    int id;
    int marks;
    Student(int id, String name, int marks){
        this.name = name;
        this.id = id;
        this.marks = marks;
    }
    void display(){
        System.out.println("name: "+ name);
        System.out.println("id: "+ id);
        System.out.println("marks: "+ marks);

    }   

    public static void main(String[] args){
        Student s1 = new Student(1,"kishore",100);
        s1.display();
    }
}

