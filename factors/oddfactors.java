public class oddfactors {
    public static void main(String[] args) {
        check(10);
    }

    public static void check(int n){

        int i=1;
        while(i*i<n){
            System.out.println(i*i);
            i++;
        }

    }
}
