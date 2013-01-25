package discogsjava.database.master;

import java.util.List;

public class Master
{
    //Variables
    private Integer id = null;
    private String title = null;
    private String resource_url = null;
    private String versions_url = null;
    private String uri = null;
    private Integer main_release = null;
    private String main_release_url = null;
    private Integer year = null;
    private List<String> styles = null;
    private List<String> genres = null;
    private String data_quality = null;
    private List<MasterVideo> videos = null;
    private List<MasterArtist> artists = null;
    private List<MasterImage> images = null;
    private List<MasterTracklist> tracklist = null;

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

    public String getVersionsUrl()
    {
        return versions_url;
    }

    public void setVersionsUrl(String versions_url)
    {
        this.versions_url = versions_url;
    }

    public String getUri()
    {
        return uri;
    }

    public void setUri(String uri)
    {
        this.uri = uri;
    }

    public Integer getMainRelease()
    {
        return main_release;
    }

    public void setMainRelease(Integer main_release)
    {
        this.main_release = main_release;
    }

    public String getMainReleaseUrl()
    {
        return main_release_url;
    }

    public void setMainReleaseUrl(String main_release_url)
    {
        this.main_release_url = main_release_url;
    }

    public Integer getYear()
    {
        return year;
    }

    public void setYear(Integer year)
    {
        this.year = year;
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

    public String getDataQuality()
    {
        return data_quality;
    }

    public void setDataQuality(String data_quality)
    {
        this.data_quality = data_quality;
    }

    public List<MasterVideo> getVideos()
    {
        return videos;
    }

    public void setVideos(List<MasterVideo> videos)
    {
        this.videos = videos;
    }

    public List<MasterArtist> getArtists()
    {
        return artists;
    }

    public void setArtists(List<MasterArtist> artists)
    {
        this.artists = artists;
    }

    public List<MasterImage> getImages()
    {
        return images;
    }

    public void setImages(List<MasterImage> images)
    {
        this.images = images;
    }

    public List<MasterTracklist> getTracklist()
    {
        return tracklist;
    }

    public void setTracklist(List<MasterTracklist> tracklist)
    {
        this.tracklist = tracklist;
    }

}
