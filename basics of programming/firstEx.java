public class firstEx {
    public static void main(String[] args) {
        int nr1= 5, nr2 = 5, nr3 = 5;
        // Checks 2 numbers
        if (nr1 == nr2) {
            System.out.println("The numbers are equal to eachother");
        }else if(nr1 > nr2){
            System.out.println("First number is greater than second number");
        }else if(nr1 >= nr2){
            System.out.println("First number is greater or equal to second number");
        }else if(nr1 != nr2){
            System.out.println("First number is not equal than second number");
        }

        // Checks 3 numbers
        if (nr1 == nr2 && nr1 == nr3) {
            System.out.println("The numbers are equal to eachother");
        }else if(nr1 == nr2 || nr2 == nr3){
            System.out.println("First number is equal to second number or second number equals third number");
        }else if(nr1 > nr2 && nr1 > nr3){
            System.out.println("First number is greater than second number and first number greater than third number");
        }else if(nr1 > nr2){
            System.out.println("First number than second number");
        }
// d. Test if number1 is greater than number2. If not, test if number2 is greater than number3. (Google: C# else if ).

// e. Test if number1 and number2 are equal. If not, test if number1 and number3 are equal.

// 2. Make three string typed variable – for example name1, name2 and name3. Assign values.

// a. Test, if name1 and name2 are equal

// b. Test, if name1 and name2 are not equal

// c. Test, if name1 and name2 are equal. If not, test if name1 and name3 are equal.
    }
}
