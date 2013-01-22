package discogsjava.database.release;

import discogsjava.internal.utils.StringUtils;

import java.util.List;

public class Release
{
    //Variables
    private Integer id = null;
    private String title = null;
    private String resource_url = null;
    private String uri = null;
    private String status = null;
    private String data_quality = null;
    private Integer master_id = null;
    private String master_url = null;
    private String country = null;
    private Integer year = null;
    private String released = null;
    private String released_formatted = null;
    private String notes = null;
    private List<String> styles = null;
    private List<String> genres = null;
    private ReleaseCommunity community = null;
    private List<ReleaseLabel> labels = null;
    private List<ReleaseCompanie> companies = null;
    private List<ReleaseExtraartist> extraartists = null;
    private List<ReleaseVideo> videos = null;
    private List<ReleaseArtist> artists = null;
    private List<ReleaseFormat> formats = null;
    private List<ReleaseImage> images = null;
    private List<ReleaseIdentifier> identifiers = null;
    private List<ReleaseTracklist> tracklist = null;

    //Functions
    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getResourceUrl()
    {
        return resource_url;
    }

    public void setResourceUrl(String resource_url)
    {
        this.resource_url = resource_url;
    }

    public String getUri()
    {
        return uri;
    }

    public void setUri(String uri)
    {
        this.uri = uri;
    }

    public String getStatus()
    {
        return status;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }

    public String getDataQuality()
    {
        return data_quality;
    }

    public void setDataQuality(String data_quality)
    {
        this.data_quality = data_quality;
    }

    public Integer getMasterId()
    {
        return master_id;
    }

    public void setMasterId(Integer master_id)
    {
        this.master_id = master_id;
    }

    public String getMasterUrl()
    {
        return master_url;
    }

    public void setMasterUrl(String master_url)
    {
        this.master_url = master_url;
    }

    public String getCountry()
    {
        return country;
    }

    public void setCountry(String country)
    {
        this.country = country;
    }

    public Integer getYear()
    {
        return year;
    }

    public void setYear(Integer year)
    {
        this.year = year;
    }

    public String getReleased()
    {
        return released;
    }

    public void setReleased(String released)
    {
        this.released = released;
    }

    public String getReleasedFormatted()
    {
        return released_formatted;
    }

    public void setReleasedFormatted(String released_formatted)
    {
        this.released_formatted = released_formatted;
    }

    public String getNotes()
    {
        return notes;
    }

    public void setNotes(String notes)
    {
        this.notes = notes;
    }

    public List<String> getStyles()
    {
        return styles;
    }

    public void setStyles(List<String> styles)
    {
        this.styles = styles;
    }

    public List<String> getGenres()
    {
        return genres;
    }

    public void setGenres(List<String> genres)
    {
        this.genres = genres;
    }

    public ReleaseCommunity getCommunity()
    {
        return community;
    }

    public void setCommunity(ReleaseCommunity community)
    {
        this.community = community;
    }

    public List<ReleaseLabel> getLabels()
    {
        return labels;
    }

    public void setLabels(List<ReleaseLabel> labels)
    {
        this.labels = labels;
    }

    public List<ReleaseCompanie> getCompanies()
    {
        return companies;
    }

    public void setCompanies(List<ReleaseCompanie> companies)
    {
        this.companies = companies;
    }

    public List<ReleaseExtraartist> getExtraartists()
    {
        return extraartists;
    }

    public void setExtraartists(List<ReleaseExtraartist> extraartists)
    {
        this.extraartists = extraartists;
    }

    public List<ReleaseVideo> getVideos()
    {
        return videos;
    }

    public void setVideos(List<ReleaseVideo> videos)
    {
        this.videos = videos;
    }

    public List<ReleaseArtist> getArtists()
    {
        return artists;
    }

    public void setArtists(List<ReleaseArtist> artists)
    {
        this.artists = artists;
    }

    public List<ReleaseFormat> getFormats()
    {
        return formats;
    }

    public void setFormats(List<ReleaseFormat> formats)
    {
        this.formats = formats;
    }

    public List<ReleaseImage> getImages()
    {
        return images;
    }

    public void setImages(List<ReleaseImage> images)
    {
        this.images = images;
    }

    public List<ReleaseIdentifier> getIdentifiers()
    {
        return identifiers;
    }

    public void setIdentifiers(List<ReleaseIdentifier> identifiers)
    {
        this.identifiers = identifiers;
    }

    public List<ReleaseTracklist> getTracklist()
    {
        return tracklist;
    }

    public void setTracklist(List<ReleaseTracklist> tracklist)
    {
        this.tracklist = tracklist;
    }

    public String toString()
    {
        return StringUtils.format("Title:\t{0}\nyear\t{1}", getTitle(), getYear().toString());
    }

}
