public class generics {

    public static Integer findmax(Integer int_1, Integer int_2, Integer int_3) {
        Integer max;
        if( int_1.compareTo(int_2) >= 0 ){
            max = int_1;
        }else if ( int_2.compareTo(int_3) >= 0 ){
            max = int_2;
        }else{
            max = int_3;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(findmax(10,25,30));
        System.out.println(findmax(10,55,30));
        System.out.println(findmax(99,25,30));
    }


}

