package discogsjava.database.artist;

import discogsjava.internal.utils.StringUtils;

import java.util.List;

public class Artist
{
    //Variables
    private Integer id = null;
    private String name = null;
    private String resource_url = null;
    private String releases_url = null;
    private String uri = null;
    private String realname = null;
    private String profile = null;
    private String data_quality = null;
    private List<String> namevariations = null;
    private List<ArtistAliase> aliases = null;
    private List<String> urls = null;
    private List<ArtistImage> images = null;

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

    public String getReleasesUrl()
    {
        return releases_url;
    }

    public void setReleasesUrl(String releases_url)
    {
        this.releases_url = releases_url;
    }

    public String getUri()
    {
        return uri;
    }

    public void setUri(String uri)
    {
        this.uri = uri;
    }

    public String getRealname()
    {
        return realname;
    }

    public void setRealname(String realname)
    {
        this.realname = realname;
    }

    public String getProfile()
    {
        return profile;
    }

    public void setProfile(String profile)
    {
        this.profile = profile;
    }

    public String getDataQuality()
    {
        return data_quality;
    }

    public void setDataQuality(String data_quality)
    {
        this.data_quality = data_quality;
    }

    public List<String> getNamevariations()
    {
        return namevariations;
    }

    public void setNamevariations(List<String> namevariations)
    {
        this.namevariations = namevariations;
    }

    public List<ArtistAliase> getAliases()
    {
        return aliases;
    }

    public void setAliases(List<ArtistAliase> aliases)
    {
        this.aliases = aliases;
    }

    public List<String> getUrls()
    {
        return urls;
    }

    public void setUrls(List<String> urls)
    {
        this.urls = urls;
    }

    public List<ArtistImage> getImages()
    {
        return images;
    }

    public void setImages(List<ArtistImage> images)
    {
        this.images = images;
    }

    public String toString()
    {
        return StringUtils.format("Name:\t{0}\nRealname\t{1}", getName(), getRealname());
    }

}
