/**
 * Created by July on 27.03.2017.
 */

import java.util.*;

public class Main {
    public static void main(String args[]) {
        /* This is how to declare HashMap */
        HashMap<Integer, Substance> newHMap = new HashMap<>();

        int i = 0;
        /*Adding elements to HashMap*/
        while(i<10000) {
            Substance myFirstSubstance = new Substance(0, 0, 0, "smth1");
            Substance mySecondSubstance = new Substance(1, 0, 1, "smth2");
            Substance myThirdSubstance = new Substance(2, 1, 2, "smth3");
            Substance myFourthSubstance = new Substance(3, 2, 0, "smth4");
            Substance myFifthSubstance = new Substance(4, 3, 1, "smth5");

            newHMap.put(myFirstSubstance.ID, myFirstSubstance);
            newHMap.put(mySecondSubstance.ID, mySecondSubstance);
            newHMap.put(myThirdSubstance.ID, myThirdSubstance);
            newHMap.put(myFourthSubstance.ID, myFourthSubstance);
            newHMap.put(myFifthSubstance.ID, myFifthSubstance);
            i++;
        }
        //DataBase.DBConnection();
        Long t3 = new Date().getTime();

        for (Substance s : newHMap.values()){

            System.out.println("ID is: " + (s.ID));
            System.out.println("PreID is: " + (s.preID));
            System.out.println("Generation is: " + (s.generation));
            System.out.println("Info is: " + (s.info));
            //DataBase.DB_INSERT(s.ID, s.preID, s.generation, s.info);
        }
        System.out.println("Your insert is successful!");
        Long t4 = new Date().getTime();

        System.out.println("Time is: " + (t4-t3));





        //////////////////////////////////////////////////////////////////////////////////////////////////
         /* Get values based on key*/
        //Substance var= newHMap.get(2);
        //System.out.println("Value at index 2 is: " + newHMap.get(2));

          /* Remove values based on key*/
        /*newHMap.remove(3);
        System.out.println("Map key and values after removal:");
        Set set2 = hmap.entrySet();
        Iterator iterator2 = set2.iterator();
        while(iterator2.hasNext()) {
            Map.Entry mentry2 = (Map.Entry)iterator2.next();
            System.out.print("Key is: "+mentry2.getKey() + " & Value is: ");
            System.out.println(mentry2.getValue());
        }*/
    }
}

