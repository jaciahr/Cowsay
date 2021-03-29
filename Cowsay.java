import java.util.Arrays;

public class Cowsay {

    private static void listCows(Cow[] cows){ //Displays the list of available cows from an array of Cow objects
        Cow[] displayList = cows;
        for (int i = 0; i < displayList.length; i++){ //Iterates through the available cow array
            String s = displayList[i].getName();
            System.out.print(s + " "); //Outputs the list
        }
    }

    private static Cow findCow(String name, Cow[] cows){ //Given a name and an array of Cow objects, return the Cow object with the specified name
        for (int i = 0; i < cows.length; i++){ //Iterate through the cow array
            if (cows[i].getName().compareTo(name) == 0){ //If you find a cow with a matching name (== 0)...
                return cows[i]; //...return the name
            }
        }
        return null; //If it doesn't find a matching name, return null
    }

    public static void main(String[] args){
        int countA = 0; //For -1
        int countB = 0; //For -n
       for (String s : args){
            if (s.equals("-l")){
                countA++; //Increments our counter
            }
        }
        for (String g : args){
            if (g.equals("-n")){
                countB++; //Increments our counter
            }
        }
        //For strings with -l
        if (countA > 0){ //If the string contains our -1 and was thus incremented
            System.out.println();
            System.out.print("Cows available: "); //Output the list of cows available...
            listCows((HeiferGeneratorOld.getCows())); //...by accessing the heiferGenerator getCow() class and using it as an input for the listCows parameter...
        }                                          //...which prints our array of cows
        else if (countB > 0 && args[0].compareTo("-n") == 0){ //Used to compare strings
            int count = 0; //Return a 0 if the two strings match
            Cow getName = null;

            for (int j = 0; j < args.length; j++){ //Iterates through every arg...
                getName = findCow(args[j], (HeiferGeneratorOld.getCows())); //...and checks to see what is returned from findCow (the name or null)
                if (getName == null){
                    count++; //If null, iterate our counter
                }
                if (getName == null && count >= args.length){ //Only enter if the cow name could not be found (is wrong)
                    System.out.println();
                    System.out.println("Could not find " + args[1] + " cow!"); //Output error statement
                }

                if (getName != null){ //If it is NOT null and therefore true
                    String p = Arrays.toString(args); //(used Arrays.toString instead of String p:args to avoid looping issue
                    if (p.contains("World!")){ //for "world" args (String p:args)
                        System.out.println("Hello World!");
                        System.out.println();
                        String image = getName.getImage();
                        System.out.println(image);
                    }
                    else{ //for non-world args
                        System.out.println(args[2]);
                        String image = getName.getImage();
                        System.out.println(image);
                    }
                }
                
            }
        }
        else { //In the event that there were no -n or -l in the args
            Cow getName = findCow("heifer", (HeiferGeneratorOld.getCows())); //(Heifer being the default picture)
            for (int i = 0; i < args.length; i++){
                System.out.print(args[i]+ " "); //Output
            }
            System.out.println();
            String image = getName.getImage(); //Get the name of the cow and then get the image...
            System.out.println(image); //...to return both the name and image
        }
    }
}