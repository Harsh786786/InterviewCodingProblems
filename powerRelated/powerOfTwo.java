public class powerOfTwo {
    public static void main(String[] args) {
        for (int i = 0; i <=10; i++) {
            System.out.println(check(i)+" "+i);
        }
    }

    public static boolean check(int n){
        if((n>0) && ((n&(n-1))==0)){
            return true;
        }

        return false;
    }
}
