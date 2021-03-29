public class IceDragon extends Dragon{ //derived from the dragon class

    public IceDragon(String name, String image){ //constructor creating a new ice dragon object with the inputted name and image
        super(name, image);
    }

    public boolean canBreatheFire(){ //should always return false (ice dragons cannot breathe fire)
        return false;
    }
}