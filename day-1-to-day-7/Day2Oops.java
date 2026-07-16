class Books{
    static  String college ="abs";
    String name;
    int price;
    String author;
    Books(String name, int price, String author){
        this.name = name;
        this.price = price;
        this.author = author;
    }

    void display(){
        System.out.println(college);
        System.out.println(name);
        System.out.println(author);
        System.out.println(price);

    } 
    public static void main(String[] args) {
        Books obj = new Books("math", 1100, "kishore");
        obj.display();
    }

    
}

class Main{
    public static void main(String[] args) {
        Books obj = new Books("math", 1100, "kishore");
        obj.display();
    }
}