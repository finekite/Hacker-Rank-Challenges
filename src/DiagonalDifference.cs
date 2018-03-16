using System;
using System.Linq;
using System.Text;

namespace HackerRankChallenge
{
    // Given a square matrix this will find the sum of both diagonals and calculate the difference
    class DiagonalDifference
    {
        static void Main(String[] args)
        {
            int n = Convert.ToInt32(Console.ReadLine());
            int[][] a = new int[n][];
            for (int a_i = 0; a_i < n; a_i++)
            {
                string[] a_temp = Console.ReadLine().Split(' ');
                a[a_i] = Array.ConvertAll(a_temp, Int32.Parse);
            }
            int result = diagonalDifference(a);
            Console.WriteLine(result);
        }

        static int diagonalDifference(int[][] a)
        {
            int sum1 = 0;
            int sum2 = 0;
            int arrayLength = a[0].Length-1;
            // Complete this function
            for(int i = 0; i < a.Length; i++)
            {
                sum1 += a[i][i];
                sum2 += a[i][arrayLength];
                arrayLength--;
            }
            return sum1 < sum2 ? sum2 - sum1 : sum1 - sum2;
        }
    }
}
