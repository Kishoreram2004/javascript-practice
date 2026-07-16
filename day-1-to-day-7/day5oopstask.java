class person{
    int age;
    String name;
    person(String name, int age){
        this.name = name;
        this.age = age;
    }
}

class employee extends person{
    int employeeId;
    int salary;
    employee(String name, int age,int employeeId, int salary){
        super(name, age);
        this.employeeId = employeeId;
        this.salary = salary;
    }
    void display(){
        System.out.println("this is employee class");
    }
}


class manager extends employee{
    String department;
    manager(String name, int age,int employeeId, int salary, String department){
        super(name, age, employeeId, salary);
        this.department = department;
    }

    @Override
    void display() {
        // TODO Auto-generated method stub
        super.display();
        System.out.println(name+ " "+age+" "+employeeId+ " "+salary+" "+department);

    }
}

public class day5oopstask {
    public static void main(String[] args) {
        manager obj = new manager("kishore", 21, 154, 2100000, "it");
        obj.display();
    }
}
