class try_method{
    public static void main(String[] args){
        hello("abcd");
        System.out.println(add(10,15));
    }

    static void hello(String name){
        System.out.println("hello "+name);
    }

    static int add(int x, int y){
        return x+y;
    }
}