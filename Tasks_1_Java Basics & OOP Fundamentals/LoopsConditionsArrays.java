public class LoopsConditionsArrays 
{
    public static void main(String[] args)
    {
        int[] numbers = {3, 7, 2, 9, 4, 6, 1};

        // 1) Sum using a for loop
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) 
        {
            sum += numbers[i];
        }
        System.out.println("Sum = " + sum);

        // 2) Max using enhanced for loop (for-each)
        int max = Integer.MIN_VALUE;
        for (int n : numbers) 
        {
            if (n > max) 
            {
                max = n; // condition inside loop
            }
        }
        System.out.println("Max = " + max);

        // 3) Count even numbers using while loop
        int countEven = 0;
        int i = 0;
        while (i < numbers.length) 
        {
            if (numbers[i] % 2 == 0) 
            {
                countEven++;
            }
            i++;
        }
        System.out.println("Even numbers count = " + countEven);

        // 4) Search for a value with if/else
        int target = 9;
        boolean found = false;
        for (int val : numbers) 
        {
            if (val == target) 
            {
                found = true;
                break;
            }
        }
        if (found) 
        {
            System.out.println(target + " found in the array.");
        } 
        else 
        {
            System.out.println(target + " NOT found in the array.");
        }
    }
}