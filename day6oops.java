class employeee{
    double salary(){
        return 0;
    }
}
class partTime extends employeee{
    @Override
    double salary(){
        return 7000;
    }
}


class fullTime extends employeee{
    @Override
    double salary(){
        return 15000;
    }
}

public class day6oops{
    public static void main(String[] args) {
        
        employeee obj1 = new fullTime();
        employeee obj2 = new partTime();

        System.out.println(obj1.salary());
        System.out.println(obj2.salary());

     }
}