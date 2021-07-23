class try_genericClasses{
    public static void main(String[] args){

        GenericClass myInt = new GenericClass(1);
        GenericClass myDouble = new GenericClass(1.14);
        GenericClass myChar = new GenericClass('#');

        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());
        System.out.println(myChar.getValue());

    }
}