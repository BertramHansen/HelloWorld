public class arrayOpgaver {
    public static void main(String[] args) {
        //opretter et array med 8 elementer
        int[] array =new int[8];
        //sætter index 0 til værdien 34
        array[0] = 34;
        //og det sidste element til værdien 117 da det sidste element altid er array.length -1 da index starter på 0
        array [7] = 117;
//laver et for loop der interere hele arrayen og printer array[i] hver gang loopet kører (altså alle elementerne)
        for (int i = 0; i<=7; i++){
            System.out.println(array[i]);
        }
//opretter ny array med String
        String[] array1 ={"Hej", "med", "dig"};
//for loop der interere hele arrayan og printer hvert element på samme linje og et mellemrum imellem hver
        for (int j=0; j<=2; j++){
            System.out.print(array1[j] + " ");
        }
//array med forudbestsmte elementer, printer 3 element ud og beder om arraylength. 
        double[] array2 = {3.5, 2.5, 1.2, 6.7};

        System.out.println(("\n") + array2[2]);
        System.out.println(array2.length);

    }
}
