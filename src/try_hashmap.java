import java.util.HashMap;

class  try_hashmap{

    public static void main(String[] args){
        // HashMap implements the Map interface (need import)
        // HashMap is similar to ArrayList, but with key-value pairs
        // stores objects, need to use Wrapper Class

        HashMap<String,String> countries = new HashMap<String,String>();
        countries.put("ABC","DEF");
        countries.put("FGH","IJK");
        countries.put("FGH","IJJK"); // implicitly updates the value of above set key

        //System.out.println(countries.size());
        //countries.clear();
        //System.out.println(countries.size());
        countries.replace("ABC", "ABCD");
        System.out.println(countries);
        System.out.println(countries.containsKey("FGH"));
        System.out.println(countries.containsValue("IJK"));

        for(String i : countries.keySet()) {
            System.out.print(i+"\t"+"= ");
            System.out.println(countries.get(i));
        }

    }
}