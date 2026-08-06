package day10;

public class Student {
    private int id;
    private String name;
    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
}

class main{
    public static void main(String[] args) {
        Student obj = new Student();
        obj.setName("kishore");
        obj.setId(100);
        System.out.println(obj.getId() + "   "+ obj.getName());
    }
}
