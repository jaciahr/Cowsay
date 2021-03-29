public class Dragon extends Cow{ //derived from the cow class

    public Dragon(String name, String image){ //constructor creating a new dragon object with the given name and image
        super(name);
        super.setImage(image);
    }

    public boolean canBreatheFire(){ //should always return true because normal dragons can breathe fire
        return true;
    }
}