class try_overload_method{
    public static void main(String[] args){
        hello("abcd");
        System.out.println(add(10,15));
        System.out.println(add(10,15, 10 ));
        System.out.println(add(10,15,10,5));
    }

    static void hello(String name){
        System.out.println("hello "+name);
    }

    static int add(int x, int y){
        return x+y;
    }
    static int add(int x, int y, int z){
        return x+y+z;
    }
    static int add(int x, int y, int z, int a){
        return x+y+z+a;
    }

}