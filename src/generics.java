public class generics {

    public static Float findmax(Float float_1, Float float_2, Float float_3) {
        Float max;
        if( float_1.compareTo(float_2) >= 0 && float_1.compareTo(float_3) >=0 ){
            max = float_1;
        }else if ( float_2.compareTo(float_3) >= 0 ){
            max = float_2;
        }else{
            max = float_3;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(findmax(10.5f,2.5f,30.6f));
        System.out.println(findmax(10.5f,55.4f,30.6f));
        System.out.println(findmax(99.9f,25.8f,30.4f));
    }


}

