class try_arr{
    public static void main(String[] args){
        String[] cars = {"abcd", "def", "ghi"};

        //System.out.println(cars[0]);

        String[] cars2 = new String[3];

        for(int i = 0; i<cars.length; i++){
            System.out.println(cars[i]);
        }

        String [][] cars2d = new String[3][5];
        System.out.println(cars2d.length); //rows
        System.out.println(cars2d[0].length); //columns

        for(int j = 0; j<cars2d.length; j++){
            for (int k = 0; k<cars2d[0].length; k++){
                cars2d[j][k] = String.valueOf(j);
                System.out.println(cars2d[j][k]);
            }
        }
        //System.out.println(cars2d);
    }
}