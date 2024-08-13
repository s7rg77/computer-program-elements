public class FirstJavaClass {

    public static void main(String[] args) {

        double result;
        int a = 4, b = 6, c = 2;
        boolean booleanVariable = true;
        String name = "Sergio";
        
        System.out.println("I haven't assigned any value to the double variable");
        System.out.println("The integer variables have the values " + a + ", " + b + ", and " + c);
        System.out.println("The value of the boolean variable is " + booleanVariable);
        System.out.println("My name is " + name);
        
        result = a + b / c + 1;
        System.out.println("4 + 6 / 2 + 1 = " + result);

        result = (a + b) / c + 1;
        System.out.println("(4 + 6) / 2 + 1 = " + result);

    }

}