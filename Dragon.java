public class Dragon extends Cow
{
    //Constructor; creates a new Dragon object with the given name and image
    public Dragon(String name, String image)
    {
        super(name);
        super.setImage(image);
    }

    //This method should exist in every Dragon class. For the default Dragon type, it should always return true.
    public boolean canBreatheFire()
    {
        return true;
    }
}