package discogsjava.database.artist;

import java.util.List;

public class ArtistReleases
{
    //Variables
    private ArtistPagination pagination = null;
    private List<ArtistRelease> releases = null;

    //Functions
    public ArtistPagination getPagination()
    {
        return pagination;
    }

    public void setPagination(ArtistPagination pagination)
    {
        this.pagination = pagination;
    }

    public List<ArtistRelease> getReleases()
    {
        return releases;
    }

    public void setReleases(List<ArtistRelease> releases)
    {
        this.releases = releases;
    }

}
