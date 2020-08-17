public class HelloWorld{

     public static void main(String []args){
        int [] num = {1,2,2,2,4,3,4,5};
       
       
         int moda = 0; int x = 0;

    for (int i = 0; i < num.length; ++i) {
        int count = 0;
        for (int j = 0; j < num.length; ++j) {
            if (num[j] == num[i]) ++count;
        }
        if (count > x) {
            x = count;
            moda = num[i];
        }
       
    }
     System.out.println(moda);
     }
}
