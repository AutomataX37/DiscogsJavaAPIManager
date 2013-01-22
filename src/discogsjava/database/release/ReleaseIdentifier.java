package discogsjava.database.release;

public class ReleaseIdentifier
{
    //Variables
    private String type = null;
    private String description = null;
    private String value = null;

    //Functions
    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getValue()
    {
        return value;
    }

    public void setValue(String value)
    {
        this.value = value;
    }

}
