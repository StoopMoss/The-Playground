// Entry point name must be "Solution"
using System;

public static class Solution
{
    private static void Main()
    {
        Console.WriteLine("Hello, world!");       
        int n = 11;
        PrintPrimes(n);
    }
    
    private static void PrintPrimes(int n)
    {
        for (int i = 1; i <= n; i++)
        {
            if (IsPrime(i))
            {
                Console.WriteLine(i);
            }
        }
    }
    
    private static bool IsPrime(int n)
    {
        if (n == 1)
        {
            return false;
        }
        else if (n == 2) 
        {
            return true;
        }

        for (int i = 3; i < (n/2); i+=2)
        {
            if (n % i == 0 )
            {
                return false;
            }
        }
        return true;
    }
}

// given a number, n, print all primes less than or equal to n

https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes
