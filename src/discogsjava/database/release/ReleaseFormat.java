package discogsjava.database.release;

import java.util.List;

public class ReleaseFormat
{
    //Variables
    private List<String> descriptions = null;
    private String name = null;
    private String qty = null;

    //Functions
    public List<String> getDescriptions()
    {
        return descriptions;
    }

    public void setDescriptions(List<String> descriptions)
    {
        this.descriptions = descriptions;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getQty()
    {
        return qty;
    }

    public void setQty(String qty)
    {
        this.qty = qty;
    }

}
