package AdvancedJava.FP;
import java.util.*;
public class LamdaWCollections {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("ace","alice","bob","john");
        /* traditional way would be to use loop */
        for (String s : names){
            System.out.println(s);
        }
        /* functional way to do so*/
        names.forEach(name-> System.out.println(name)); /* using lambda */
        names.forEach(System.out::println); /* via method reference  */
    }
}
