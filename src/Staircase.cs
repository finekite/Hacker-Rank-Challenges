using System;
using System.Linq;
using System.Text;

namespace HackerRankChallenge
{
    // Print a staircase of any given size
    class Staircase
    {
        static void Main(String[] args)
        {
            int n = Convert.ToInt32(Console.ReadLine());
            staircase(n);
        }

        static void staircase(int n)
        {
            StringBuilder staircase = new StringBuilder(new string(' ', n));
            for(int i = staircase.Length-1; i >= 0; i--)
            {
                staircase[i] = '#';
                Console.WriteLine(staircase);
            }
        }
    }
}
