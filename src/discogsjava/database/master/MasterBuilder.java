package discogsjava.database.master;

import discogsjava.internal.json.JSONHandler;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class MasterBuilder
{
    private static MasterVideo buildMasterVideo(JSONObject x)
    {
        MasterVideo video = new MasterVideo();

        try
        {
            video.setDuration(JSONHandler.getIntOrNull(x, "duration"));
            video.setEmbed(JSONHandler.getOptionalBool(x, "embed"));
            video.setTitle(JSONHandler.getStringOrNull(x, "title"));
            video.setDescription(JSONHandler.getStringOrNull(x, "description"));
            video.setUri(JSONHandler.getStringOrNull(x, "uri"));
        }
        catch (JSONException e)
        {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return video;
    }

    private static MasterArtist buildMasterArtist(JSONObject x)
    {
        MasterArtist artist = new MasterArtist();

        try
        {
            artist.setId(JSONHandler.getIntOrNull(x, "id"));
            artist.setJoin(JSONHandler.getStringOrNull(x, "join"));
            artist.setTracks(JSONHandler.getStringOrNull(x, "tracks"));
            artist.setRole(JSONHandler.getStringOrNull(x, "role"));
            artist.setAnv(JSONHandler.getStringOrNull(x, "anv"));
            artist.setName(JSONHandler.getStringOrNull(x, "name"));
            artist.setResourceUrl(JSONHandler.getStringOrNull(x, "resource_url"));
        }
        catch (JSONException e)
        {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return artist;
    }

    private static MasterImage buildMasterImage(JSONObject x)
    {
        MasterImage image = new MasterImage();

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

    private static MasterTracklist buildMasterTracklist(JSONObject x)
    {
        MasterTracklist tracklist = new MasterTracklist();

        try
        {
            tracklist.setDuration(JSONHandler.getStringOrNull(x, "duration"));
            tracklist.setPosition(JSONHandler.getStringOrNull(x, "position"));
            tracklist.setTitle(JSONHandler.getStringOrNull(x, "title"));
        }
        catch (JSONException e)
        {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return tracklist;
    }

    public static Master buildMaster(JSONObject x)
    {
        Master master = new Master();

        try
        {
            master.setId(JSONHandler.getIntOrNull(x, "id"));
            master.setTitle(JSONHandler.getStringOrNull(x, "title"));
            master.setResourceUrl(JSONHandler.getStringOrNull(x, "resource_url"));
            master.setVersionsUrl(JSONHandler.getStringOrNull(x, "versions_url"));
            master.setUri(JSONHandler.getStringOrNull(x, "uri"));
            master.setMainRelease(JSONHandler.getIntOrNull(x, "main_release"));
            master.setMainReleaseUrl(JSONHandler.getStringOrNull(x, "main_release_url"));
            master.setYear(JSONHandler.getIntOrNull(x, "year"));
            master.setStyles(JSONHandler.getListStringOrNull(x, "styles"));
            master.setGenres(JSONHandler.getListStringOrNull(x, "genres"));
            master.setDataQuality(JSONHandler.getStringOrNull(x, "data_quality"));
            master.setVideos(buildVideosList(JSONHandler.getArrayOrNull(x, "videos")));
            master.setArtists(buildArtistsList(JSONHandler.getArrayOrNull(x, "artists")));
            master.setImages(buildImagesList(JSONHandler.getArrayOrNull(x, "images")));
            master.setTracklist(buildTracklistList(JSONHandler.getArrayOrNull(x, "tracklist")));


        }
        catch (JSONException e)
        {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return master;
    }

    private static List<MasterVideo> buildVideosList(JSONArray x)
    {
        List<MasterVideo> videos = new ArrayList<MasterVideo>();
        for (int i = 0; i < x.length(); i++)
        {
            try
            {
                videos.add(buildMasterVideo(x.getJSONObject(i)));
            }
            catch (JSONException e)
            {
                e.printStackTrace();
            }
        }
        return videos;
    }

    private static List<MasterArtist> buildArtistsList(JSONArray x)
    {
        List<MasterArtist> artists = new ArrayList<MasterArtist>();
        for (int i = 0; i < x.length(); i++)
        {
            try
            {
                artists.add(buildMasterArtist(x.getJSONObject(i)));
            }
            catch (JSONException e)
            {
                e.printStackTrace();
            }
        }
        return artists;
    }

    private static List<MasterImage> buildImagesList(JSONArray x)
    {
        List<MasterImage> images = new ArrayList<MasterImage>();
        for (int i = 0; i < x.length(); i++)
        {
            try
            {
                images.add(buildMasterImage(x.getJSONObject(i)));
            }
            catch (JSONException e)
            {
                e.printStackTrace();
            }
        }
        return images;
    }

    private static List<MasterTracklist> buildTracklistList(JSONArray x)
    {
        List<MasterTracklist> tracklist = new ArrayList<MasterTracklist>();
        for (int i = 0; i < x.length(); i++)
        {
            try
            {
                tracklist.add(buildMasterTracklist(x.getJSONObject(i)));
            }
            catch (JSONException e)
            {
                e.printStackTrace();
            }
        }
        return tracklist;
    }
}
