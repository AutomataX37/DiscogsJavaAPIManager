package discogsjava.database.label;

import java.util.List;

public class Label
{
    //Variables
    private Integer id = null;
    private String name = null;
    private String profile = null;
    private String resource_url = null;
    private String releases_url = null;
    private String uri = null;
    private String data_quality = null;
    private String contact_info = null;
    private LabelParentLabel parent_label = null;
    private List<LabelSublabel> sublabels = null;
    private List<String> urls = null;
    private List<LabelImage> images = null;

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

    public String getProfile()
    {
        return profile;
    }

    public void setProfile(String profile)
    {
        this.profile = profile;
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

    public String getDataQuality()
    {
        return data_quality;
    }

    public void setDataQuality(String data_quality)
    {
        this.data_quality = data_quality;
    }

    public String getContactInfo()
    {
        return contact_info;
    }

    public void setContactInfo(String contact_info)
    {
        this.contact_info = contact_info;
    }

    public LabelParentLabel getParentLabel()
    {
        return parent_label;
    }

    public void setParentLabel(LabelParentLabel parent_label)
    {
        this.parent_label = parent_label;
    }

    public List<LabelSublabel> getSublabels()
    {
        return sublabels;
    }

    public void setSublabels(List<LabelSublabel> sublabels)
    {
        this.sublabels = sublabels;
    }

    public List<String> getUrls()
    {
        return urls;
    }

    public void setUrls(List<String> urls)
    {
        this.urls = urls;
    }

    public List<LabelImage> getImages()
    {
        return images;
    }

    public void setImages(List<LabelImage> images)
    {
        this.images = images;
    }

}
