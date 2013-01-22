package discogsjava.database.release;

public class ReleaseLabel
{
    //Variables
    private String entity_type = null;
    private String catno = null;
    private Integer id = null;
    private String entity_type_name = null;
    private String name = null;
    private String resource_url = null;

    //Functions
    public String getEntityType()
    {
        return entity_type;
    }

    public void setEntityType(String entity_type)
    {
        this.entity_type = entity_type;
    }

    public String getCatno()
    {
        return catno;
    }

    public void setCatno(String catno)
    {
        this.catno = catno;
    }

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getEntityTypeName()
    {
        return entity_type_name;
    }

    public void setEntityTypeName(String entity_type_name)
    {
        this.entity_type_name = entity_type_name;
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
