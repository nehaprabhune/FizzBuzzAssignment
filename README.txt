README for FizzBuzz problem

The FizzBuzzApp takes the input number as a command line argument
The app is build using maven 

To run the app please execute following command being at the target folder in the project folder.

~\FizzBuzzAssignment\target>java -cp FizzBuzzAssignment-1.0.jar com.mns.assignment.FizzBuzzApp <input number>

Note that the assumption is made that input numbers start from 1. (No negative numbers)

The max StringBuilder capacity is reached for the 99999999 as input number

For numbers greater than 99999999, we can consider putting the FizzBuzz string in a file to avoid java heap out of meomory error.

Also, at the moment the data type to store input number is Integer.

But if we using file to store the final string then we can use BigInteger to increase the range of input number.


===============================================
If I had more time to solve the problem, 
then I would consider reusing the conditions of divide by 3 and divide by 5 instead of checking if number is divisible by 15 in the FizzBuzz class.


Checking for the changes