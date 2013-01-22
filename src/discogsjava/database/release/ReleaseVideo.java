package discogsjava.database.release;

public class ReleaseVideo
{
    //Variables
    private String uri = null;
    private Integer duration = null;
    private Boolean embed = null;
    private String description = null;
    private String title = null;

    //Functions
    public String getUri()
    {
        return uri;
    }

    public void setUri(String uri)
    {
        this.uri = uri;
    }

    public Integer getDuration()
    {
        return duration;
    }

    public void setDuration(Integer duration)
    {
        this.duration = duration;
    }

    public boolean getEmbed()
    {
        return embed;
    }

    public void setEmbed(boolean embed)
    {
        this.embed = embed;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

}
