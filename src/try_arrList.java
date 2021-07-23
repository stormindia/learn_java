//import  java.util.ArrayList;
import  java.util.*;

class try_arrList{
    public static void main(String[] args){
        //resizable arr which can only store reference data type
        //use wrapper class to store primitive values in arrlist
        //allows modification at runtime

        ArrayList<String> food = new ArrayList<String>();

        food.add("abcd");
        food.add("aasdsdadbcd");
          food.add("abcdfdgdd");

        food.set(0, "asdasd");
        food.remove(3);
        //food.clear();


        for(int i=0; i<food.size();i++){
            System.out.println(food.get(i));
        }
    }
}

class  try_2dArrList{
    public static void main(String[] args){
       ArrayList< ArrayList<String> > outerList = new ArrayList();

       ArrayList<String> list1 = new ArrayList<>();
       list1.add("1");
       list1.add("2");
       list1.add("3");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("4");
        list2.add("5");
        list2.add("6");

        outerList.add(list1);
        outerList.add(list2);

        System.out.println(outerList);

    }
}