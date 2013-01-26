package discogsjava.database.label;

public class LabelSublabel
{
    //Variables
    private Integer id = null;
    private String name = null;
    private String resource_url = null;

    //Functions
    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getResourceUrl()
    {
        return resource_url;
    }

    public void setResourceUrl(String resource_url)
    {
        this.resource_url = resource_url;
    }

}
