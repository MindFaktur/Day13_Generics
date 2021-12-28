public class generics {

    public static String findmax(String String_1, String String_2, String String_3) {
        String max;
        if( String_1.compareTo(String_2) >= 0 && String_1.compareTo(String_3) >=0 ){
            max = String_1;
        }else if ( String_2.compareTo(String_3) >= 0 ){
            max = String_2;
        }else{
            max = String_3;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(findmax("Apple","peach","Banana"));
        System.out.println(findmax("A","App","cap"));
        System.out.println(findmax("donkey","dog","cat"));
    }


}

