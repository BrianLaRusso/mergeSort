package LaRussoMergeSort;

public class mergeSort{

 public static Comparable[] mergeSort(Comparable[] input)
    {

        int front;
        int back;
        int front2;
        int back2;
        int pointerA;
        int pointerB;
        int pointerC = 0;

        Comparable[] tempA = (Comparable[]) input.clone();
        Comparable[] tempB = new Comparable[input.length];

        //passes of 2 ,4, 8, 16 ...
        // i is the size of the current pass
        for (int i = 1; i <= tempA.length / 2; i = 2 * i)
        {
            System.out.println("passes started pass size is " + i);
            int j = i + i; //  double gap size
            int k = 0;
            pointerC = 0;

            while (k < (tempA.length / j))
            {

                int h = j * k;

                System.out.println("determining pointers");
                front = h;
                System.out.println("front is " + front);
                back = h + i - 1;
                System.out.println("back is " + back);
                front2 = front + i;
                System.out.println("front2 is " + front2);
                back2 = front2 + i - 1;
                System.out.println("back2 is " + back2);

                pointerA = front;
                System.out.println("pointerA is " + pointerA);
                pointerB = front2;
                System.out.println("pointerB is " + pointerB);

                //merge
                while (pointerA <= back || pointerB <= back2)
                {
                    System.out.println("merge ");
                    System.out.println("pointerA is now " + pointerA);
                    System.out.println("pointerB is now " + pointerB);
                    
                    if (pointerB > back2)
                    {
                        System.out.println("exception pointb");
                        tempB[pointerC] = tempA[pointerA];
                        pointerA++;
                        pointerC++;
                    }

                    else if (pointerA > back)
                    {
                        System.out.println("exception pointa");
                        tempB[pointerC] = tempA[pointerB];
                        pointerB++;
                        pointerC++;
                    }

                    else if (tempA[pointerA].compareTo(tempA[pointerB]) > 0)
                    {
                        tempB[pointerC] = tempA[pointerB];
                        pointerB++;
                        pointerC++;

                    }
                     else
                    {
                        tempB[pointerC] = tempA[pointerA];
                        pointerA++;
                        pointerC++;

                    }

                    

                } //end of while loop for merge

                k++;
            } // end of while loop for gap shift
            System.out.println("setting temp array to main");
            //System.out.println(tempB[0].toString());
            tempA = (Comparable[]) tempB.clone();
        }
        return tempA;
    }
}