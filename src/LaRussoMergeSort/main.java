
package LaRussoMergeSort;

/**
 * *******************************************************************
 * Program Number: A4_<Problem # 1 >
 * Purpose/Description: MergeSort
 * Author Brian LaRusso
 * Due Date: 07/22/15 
 * Certification: I hereby certify that this work is my own
 * and none of it is the work of any other person. 
 * 
 *                      Brian LaRusso
 *
 ********************************************************************
 */

public class main
{

    public static void main(String[] args)
    {
        Comparable[] temp =
        {
            8, 4, 3, 5, 6, 7, 6, 11
        };

        for (int i = 0; i < temp.length; i++)
        {
            System.out.println(temp[i]);
        }
        
        temp = mergeSort.mergeSort(temp);

        for (int i = 0; i < temp.length; i++)
        {
            System.out.println(temp[i]);
        }

    }

   

}
