public class Cow {

    private String name;
    private String image;

    public Cow(String name){ //This method should be the only constructor for this class. There should not be a default constructor!
        this.name = name;
    }

    public String getName(){ //Returns the name of the cow
        return this.name;
    }

    public String getImage(){ //Returns the image used to display the cow (after the message)
        return image;
    }

    public void setImage(String _image){ //Sets the image used to display the cow (after the message)
        this.image = _image;
    }
}