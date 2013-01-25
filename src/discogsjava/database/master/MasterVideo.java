package discogsjava.database.master;

public class MasterVideo
{
    //Variables
    private Integer duration = null;
    private Boolean embed = null;
    private String title = null;
    private String description = null;
    private String uri = null;

    //Functions
    public Integer getDuration()
    {
        return duration;
    }

    public void setDuration(Integer duration)
    {
        this.duration = duration;
    }

    public Boolean getEmbed()
    {
        return embed;
    }

    public void setEmbed(Boolean embed)
    {
        this.embed = embed;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getUri()
    {
        return uri;
    }

    public void setUri(String uri)
    {
        this.uri = uri;
    }

}
