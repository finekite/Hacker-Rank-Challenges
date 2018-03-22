using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace QLChallenge
{
    class Rotate2DArrayImage
    {
        // Given a 2D array matrix rotate the image 90 degrees
        int[][] rotateImage(int[][] a)
        {
            if (a != null)
            {
                int[][] rotate = new int[a.Length][];
                for (int i = 0; i < a.Length; i++)
                {
                    rotate[i] = new int[a.Length];
                }

                int lengthDecremeter = a.Length - 1;
                int decrementor = lengthDecremeter;
                int iIncrementor = 0;
                for (int i = 0; i <= a.Length - 1; i++)
                {
                    decrementor = lengthDecremeter;
                    iIncrementor = i;
                    for (int j = decrementor; j >= 0; j--)
                    {
                        // top row
                        rotate[i][iIncrementor] = a[decrementor][i];

                        // left side
                        rotate[decrementor][i] = a[lengthDecremeter][decrementor];

                        // bottom
                        rotate[lengthDecremeter][iIncrementor] = a[decrementor][lengthDecremeter];

                        // right side
                        rotate[iIncrementor][lengthDecremeter] = a[i][iIncrementor];
                        decrementor--;
                        iIncrementor++;
                    }
                    lengthDecremeter--;
                }
                return rotate;
            }
            return null;
        }
    }
}
