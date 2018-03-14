
using System;
using System.Collections.Generic;
using System.Linq;

namespace QLChallenge
{
    class BinaryNumbers
    {
        private static int[] array;

        static void Main(String[] args)
        {
            int n = Convert.ToInt32(Console.ReadLine());
            string binary = Convert.ToString(n, 2);
            char [] binaryArray = binary.ToCharArray();
            int oneCounter = 0;
            int finalOneCounter = 0;
            for(int i = 0; i < binaryArray.Length; i++)
            {
                if(binaryArray[i] == '1')
                {
                    oneCounter++;
                    if(oneCounter > finalOneCounter)
                    {
                        finalOneCounter = oneCounter;
                    }
                }
                else
                {
                    oneCounter = 0;
                }
            }
            Console.WriteLine(finalOneCounter);
        }
    }
}
