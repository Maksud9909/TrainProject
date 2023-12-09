package Train1;

import com.sun.security.jgss.GSSUtil;

public class Phone {
    public static void main(String[] args) {
       Details details = new Details() {
           @Override
           public void phoneInfo(String model, int memory) {
               System.out.println(model + " " + memory);
           }
       };
       details.phoneInfo("Iphone XR",64);
    }





}


interface Details{
    void phoneInfo(String model,int memory);
}