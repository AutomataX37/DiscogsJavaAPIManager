package discogsjava.database.master;

public class MasterArtist
{
    //Variables
    private Integer id = null;
    private String join = null;
    private String tracks = null;
    private String role = null;
    private String anv = null;
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

    public String getJoin()
    {
        return join;
    }

    public void setJoin(String join)
    {
        this.join = join;
    }

    public String getTracks()
    {
        return tracks;
    }

    public void setTracks(String tracks)
    {
        this.tracks = tracks;
    }

    public String getRole()
    {
        return role;
    }

    public void setRole(String role)
    {
        this.role = role;
    }

    public String getAnv()
    {
        return anv;
    }

    public void setAnv(String anv)
    {
        this.anv = anv;
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
