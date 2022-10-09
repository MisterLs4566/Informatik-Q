package KonsoleQ1;

public class zeichen_generator {
    public static void zeichen(int n, char iter, String gener) {
        if (n==0) {
            System.out.println(gener);
            return;
        }
        String z = "";
        char[] arr = gener.toCharArray();
        for(int i=0; i<n; i++){
            for (int j=0; j<=arr.length-1; j++) {
                if(arr[j] == iter) {
                    z+=gener;
                }
                else
                {
                    z+=arr[j];
                }
            }
            arr = z.toCharArray();
        }
        System.out.println(z);
    }

    public static void main(String[] args) {
        zeichen(7, 'V', "VRVLVRV");
    }
}
