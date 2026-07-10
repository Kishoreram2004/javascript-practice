class Citizen{
    int aadhar;
    String name;
    Citizen(int aadhar,String name){
        this.aadhar = aadhar;
        this.name = name;
    }
    void display(){
        System.out.println(aadhar);
        System.out.println(name);
    }
}

class Students extends Citizen{
    int studentId;
    Students(int aadhar, String name, int studentId){
        super(aadhar, name);
        this.studentId = studentId;
    }
    void display(){
        super.display();
        System.out.println("=======================");
        System.out.println(aadhar);
        System.out.println(name);
        System.out.println(studentId);
    }
}

class day5oops{
    public static void main(String[] args) {
        Students st = new Students(12568, "kishore", 27 );
        st.display();
    }
}