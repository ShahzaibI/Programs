/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casting_typeconverion_exp;
import java.lang.Integer;//both packegs not necessary if not write the program run
//accurate
import java.lang.Double;
/**
 *
 * @author Shahzaib Islam
 */
public class Casting_typeConverion_exp 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        //Implicit casting mean automatic casting
        //byte > short > int > long
        short x=1;
        int y=x+2;
        System.out.println(y);
        //byte > short > int > long > float > double
        double i=1.1;
        double j = i+2;// 2 change in double data type automaticaly
        System.out.println(j);
        //Explicit casting
        double k = 1.1;
        int l = (int)k + 2;//explicit casting siraf unhi types par compatible
        //jo oper likhy han like byte > short > int > long > float > double
        System.out.println(l);
        String m = "1";
        int n = Integer.parseInt(m)+ 2;
        System.out.println(n);
        
        
        String o = "1.1";
        double p = Double.parseDouble(o)+2;
        System.out.println(p);
    }
    
}
