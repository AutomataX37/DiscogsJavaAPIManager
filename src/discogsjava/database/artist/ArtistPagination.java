package discogsjava.database.artist;

public class ArtistPagination
{
    //Variables
    private Integer per_page = null;
    private Integer pages = null;
    private Integer page = null;
    private Integer items = null;
    private ArtistUrls urls = null;

    //Functions
    public Integer getPerPage()
    {
        return per_page;
    }

    public void setPerPage(Integer per_page)
    {
        this.per_page = per_page;
    }

    public Integer getPages()
    {
        return pages;
    }

    public void setPages(Integer pages)
    {
        this.pages = pages;
    }

    public Integer getPage()
    {
        return page;
    }

    public void setPage(Integer page)
    {
        this.page = page;
    }

    public Integer getItems()
    {
        return items;
    }

    public void setItems(Integer items)
    {
        this.items = items;
    }

    public ArtistUrls getUrls()
    {
        return urls;
    }

    public void setUrls(ArtistUrls urls)
    {
        this.urls = urls;
    }

}
