class try_genericMethod{
    public static void main(String[] args){
        Integer[] intArray = {1,2,3,4,5};
        Double[] doubArray = {1.1,2.2,3.3,4.4};
        Character[] charArray = {'a','b','c'};
        String[] stringArray = {"abc","def","ghi"};

        displayArray(intArray);
        displayArray(doubArray);
        displayArray(charArray);
        displayArray(stringArray);

        System.out.println(returnFirst(intArray));
        System.out.println(returnFirst(doubArray));
        System.out.println(returnFirst(charArray));
        }
    public static <T> void displayArray(T[] array) {
        for (T x : array) {
            System.out.println(x); }
    }

    public static <T> T returnFirst(T[] array){
        return array[0];
    }
}
