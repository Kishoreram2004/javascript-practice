class ageLimitException extends Exception{
    ageLimitException(String message){
        super(message);
    }
}


class java{

    public static void check(int n) throws ageLimitException{
        if(n<18){
            throw  new ageLimitException("under 18");
        }
        System.out.println("passed");
    }

    public static void main(String[] args) throws ageLimitException {
        
        check(3);
    }
}