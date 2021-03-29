/*
  The IceDragon class must be derived from the Dragon class
 */

public class IceDragon extends Dragon
{
    //Constructor; creates a new IceDragon object with the given name and image
    public IceDragon(String name, String image)
    {
        super(name, image);
    }

    //For the IceDragon type, this method should always return false.
    public boolean canBreatheFire()
    {
        return false;
    }
}