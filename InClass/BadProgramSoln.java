/*
 * This is a bad program.
 *
 * @author Mr. King
 * @version 9/1/2021
 */

/*
 * Correct all syntax errors.
 * Modify the program to comply with indentation and naming conventions.
 */

public class BadProgramSoln  // class (and file) names start with captial letter
{
    public static void main(String[] args) // move opening brace to next line to match line 14
    {
        String boredMsg;  // String is capitalized, rename a to be more descriptive
        double three;  // rename b to be more descriptive
        double pi = 3.1;  // int variable can't be set equal to double
        double alsoPi;  // change also_pi (snake case) to alsoPi (camel case)
        String varNameMsg;  // change from int to String, rename c to be more descriptive
        
        boredMsg = "This is not interesting";
        pi = 3.1415926;
        alsoPi = 3.1415926;
        three = 3;  // missing semi colon
        varNameMsg = "a, b, and c are very nondescriptive variable names";
     
        System.out.print(a);  // add indent
        System.out.println(" b = " + b);  // add indent, change to double quotes, add plus to combine String and variable 
        System.out.println(c);  // add indent
    }
}

