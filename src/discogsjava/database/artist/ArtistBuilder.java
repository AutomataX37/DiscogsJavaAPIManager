package discogsjava.database.artist;

import discogsjava.internal.json.JSONHandler;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: AutomataX37
 * Date: 21/01/13
 * Time: 23:25
 */
public class ArtistBuilder
{
    public static Artist buildArtist(JSONObject x)
    {
        Artist artist = new Artist();

        try
        {
            artist.setId(JSONHandler.getIntOrNull(x, "id"));
            artist.setName(JSONHandler.getStringOrNull(x, "name"));
            artist.setResourceUrl(JSONHandler.getStringOrNull(x, "resource_url"));
            artist.setReleasesUrl(JSONHandler.getStringOrNull(x, "releases_url"));
            artist.setUri(JSONHandler.getStringOrNull(x, "uri"));
            artist.setRealname(JSONHandler.getStringOrNull(x, "realname"));
            artist.setProfile(JSONHandler.getStringOrNull(x, "profile"));
            artist.setDataQuality(JSONHandler.getStringOrNull(x, "data_quality"));
            artist.setNamevariations(JSONHandler.getListStringOrNull(x, "namevariations"));
            artist.setAliases(buildAliasesList(JSONHandler.getArrayOrNull(x, "aliases")));
            artist.setUrls(JSONHandler.getListStringOrNull(x, "urls"));
            artist.setImages(buildImagesList(JSONHandler.getArrayOrNull(x, "images")));

        }
        catch (JSONException e)
        {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return artist;
    }

    private static List<ArtistAliase> buildAliasesList(JSONArray x)
    {
        List<ArtistAliase> aliases = new ArrayList<ArtistAliase>();
        for (int i = 0; i < x.length(); i++)
        {
            try
            {
                aliases.add(buildArtistAliase(x.getJSONObject(i)));
            }
            catch (JSONException e)
            {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            }
        }
        return aliases;
    }

    private static List<ArtistImage> buildImagesList(JSONArray x)
    {
        List<ArtistImage> images = new ArrayList<ArtistImage>();
        for (int i = 0; i < x.length(); i++)
        {
            try
            {
                images.add(buildArtistImage(x.getJSONObject(i)));
            }
            catch (JSONException e)
            {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            }
        }
        return images;
    }

    private List<ArtistRelease> buildArtistReleaseList(JSONArray x)
    {
        List<ArtistRelease> artistReleases = new ArrayList<ArtistRelease>();
        for (int i = 0; i < x.length(); i++)
        {
            try
            {
                artistReleases.add(buildArtistRelease(x.getJSONObject(i)));
            }
            catch (JSONException e)
            {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            }
        }
        return artistReleases;
    }


    private static ArtistAliase buildArtistAliase(JSONObject x)
    {
        ArtistAliase aliase = new ArtistAliase();

        try
        {
            aliase.setId(JSONHandler.getIntOrNull(x, "id"));
            aliase.setName(JSONHandler.getStringOrNull(x, "name"));
            aliase.setResourceUrl(JSONHandler.getStringOrNull(x, "resource_url"));

        }
        catch (JSONException e)
        {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return aliase;
    }


    private static ArtistImage buildArtistImage(JSONObject x)
    {
        ArtistImage image = new ArtistImage();

        try
        {
            image.setType(JSONHandler.getStringOrNull(x, "type"));
            image.setWidth(JSONHandler.getIntOrNull(x, "width"));
            image.setHeight(JSONHandler.getIntOrNull(x, "height"));
            image.setUri(JSONHandler.getStringOrNull(x, "uri"));
            image.setUri150(JSONHandler.getStringOrNull(x, "uri150"));
            image.setResourceUrl(JSONHandler.getStringOrNull(x, "resource_url"));

        }
        catch (JSONException e)
        {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return image;
    }


    private ArtistUrls buildArtistUrls(JSONObject x)
    {
        ArtistUrls urls = new ArtistUrls();

        try
        {
            urls.setNext(JSONHandler.getStringOrNull(x, "next"));
            urls.setPrevious(JSONHandler.getStringOrNull(x, "previous"));
            urls.setLast(JSONHandler.getStringOrNull(x, "last"));
            urls.setFirst(JSONHandler.getStringOrNull(x, "first"));

        }
        catch (JSONException e)
        {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return urls;
    }


    private ArtistPagination buildArtistPagination(JSONObject x)
    {
        ArtistPagination pagination = new ArtistPagination();

        try
        {
            pagination.setPerPage(JSONHandler.getIntOrNull(x, "per_page"));
            pagination.setPages(JSONHandler.getIntOrNull(x, "pages"));
            pagination.setPage(JSONHandler.getIntOrNull(x, "page"));
            pagination.setItems(JSONHandler.getIntOrNull(x, "items"));
            pagination.setUrls(buildArtistUrls(JSONHandler.getObjectNotNull(x, "urls")));

        }
        catch (JSONException e)
        {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return pagination;
    }


    private ArtistRelease buildArtistRelease(JSONObject x)
    {
        ArtistRelease release = new ArtistRelease();

        try
        {
            release.setThumb(JSONHandler.getStringOrNull(x, "thumb"));
            release.setArtist(JSONHandler.getStringOrNull(x, "artist"));
            release.setTitle(JSONHandler.getStringOrNull(x, "title"));
            release.setMainRelease(JSONHandler.getIntOrNull(x, "main_release"));
            release.setRole(JSONHandler.getStringOrNull(x, "role"));
            release.setYear(JSONHandler.getIntOrNull(x, "year"));
            release.setType(JSONHandler.getStringOrNull(x, "type"));
            release.setId(JSONHandler.getIntOrNull(x, "id"));
            release.setResourceUrl(JSONHandler.getStringOrNull(x, "resource_url"));
            release.setStatus(JSONHandler.getStringOrNull(x, "status"));
            release.setFormat(JSONHandler.getStringOrNull(x, "format"));
            release.setLabel(JSONHandler.getStringOrNull(x, "label"));

        }
        catch (JSONException e)
        {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return release;
    }


    private ArtistReleases buildArtistReleases(JSONObject x)
    {
        ArtistReleases artistReleases = new ArtistReleases();

        try
        {
            artistReleases.setPagination(buildArtistPagination(JSONHandler.getObjectNotNull(x, "pagination")));
            artistReleases.setReleases(buildArtistReleaseList(JSONHandler.getArrayOrNull(x, "releases")));

        }
        catch (JSONException e)
        {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return artistReleases;
    }

}
