package discogsjava.database.artist;

public class ArtistImage
{
    //Variables
    private String type = null;
    private Integer width = null;
    private Integer height = null;
    private String uri = null;
    private String uri150 = null;
    private String resource_url = null;

    //Functions
    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public Integer getWidth()
    {
        return width;
    }

    public void setWidth(Integer width)
    {
        this.width = width;
    }

    public Integer getHeight()
    {
        return height;
    }

    public void setHeight(Integer height)
    {
        this.height = height;
    }

    public String getUri()
    {
        return uri;
    }

    public void setUri(String uri)
    {
        this.uri = uri;
    }

    public String getUri150()
    {
        return uri150;
    }

    public void setUri150(String uri150)
    {
        this.uri150 = uri150;
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
