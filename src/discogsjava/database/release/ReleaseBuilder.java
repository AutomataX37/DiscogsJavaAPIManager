package discogsjava.database.release;

import discogsjava.internal.json.JSONHandler;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: AutomataX37
 * Date: 22/01/13
 * Time: 00:03
 */
public class ReleaseBuilder
{
    public static Release buildRelease(JSONObject x)
    {
        Release release = new Release();

        try
        {
            release.setId(JSONHandler.getIntOrNull(x, "id"));
            release.setTitle(JSONHandler.getStringOrNull(x, "title"));
            release.setResourceUrl(JSONHandler.getStringOrNull(x, "resource_url"));
            release.setUri(JSONHandler.getStringOrNull(x, "uri"));
            release.setStatus(JSONHandler.getStringOrNull(x, "status"));
            release.setDataQuality(JSONHandler.getStringOrNull(x, "data_quality"));
            release.setMasterId(JSONHandler.getIntOrNull(x, "master_id"));
            release.setMasterUrl(JSONHandler.getStringOrNull(x, "master_url"));
            release.setCountry(JSONHandler.getStringOrNull(x, "country"));
            release.setYear(JSONHandler.getIntOrNull(x, "year"));
            release.setReleased(JSONHandler.getStringOrNull(x, "released"));
            release.setReleasedFormatted(JSONHandler.getStringOrNull(x, "released_formatted"));
            release.setNotes(JSONHandler.getStringOrNull(x, "notes"));
            release.setStyles(JSONHandler.getListStringOrNull(x, "styles"));
            release.setGenres(JSONHandler.getListStringOrNull(x, "genres"));
            release.setCommunity(buildReleaseCommunity(JSONHandler.getObjectNotNull(x, "community")));
            release.setLabels(buildReleaseLabelsList(JSONHandler.getArrayOrNull(x, "labels")));
            release.setCompanies(buildCompaniesList(JSONHandler.getArrayOrNull(x, "companies")));
            release.setExtraartists(buildExtraartistsList(JSONHandler.getArrayOrNull(x, "extraartists")));
            release.setVideos(buildVideosList(JSONHandler.getArrayOrNull(x, "videos")));
            release.setArtists(buildArtistsList(JSONHandler.getArrayOrNull(x, "artists")));
            release.setFormats(buildFormatsList(JSONHandler.getArrayOrNull(x, "formats")));
            release.setImages(buildImagesList(JSONHandler.getArrayOrNull(x, "images")));
            release.setIdentifiers(buildIdentifiersList(JSONHandler.getArrayOrNull(x, "identifiers")));
            release.setTracklist(buildTracklistList(JSONHandler.getArrayOrNull(x, "tracklist")));

        }
        catch (JSONException e)
        {
            e.printStackTrace();
        }
        return release;
    }


    private static ReleaseRating buildReleaseRating(JSONObject x)
    {
        ReleaseRating rating = new ReleaseRating();

        try
        {
            rating.setCount(JSONHandler.getIntOrNull(x, "count"));
            rating.setAverage(JSONHandler.getFloatOrNull(x, "average"));

        }
        catch (JSONException e)
        {
            e.printStackTrace();
        }
        return rating;
    }


    private static ReleaseSubmitter buildReleaseSubmitter(JSONObject x)
    {
        ReleaseSubmitter submitter = new ReleaseSubmitter();

        try
        {
            submitter.setUsername(JSONHandler.getStringOrNull(x, "username"));
            submitter.setResourceUrl(JSONHandler.getStringOrNull(x, "resource_url"));

        }
        catch (JSONException e)
        {
            e.printStackTrace();
        }
        return submitter;
    }


    private static ReleaseContributor buildReleaseContributor(JSONObject x)
    {
        ReleaseContributor contributor = new ReleaseContributor();

        try
        {
            contributor.setUsername(JSONHandler.getStringOrNull(x, "username"));
            contributor.setResourceUrl(JSONHandler.getStringOrNull(x, "resource_url"));

        }
        catch (JSONException e)
        {
            e.printStackTrace();
        }
        return contributor;
    }


    private static ReleaseCommunity buildReleaseCommunity(JSONObject x)
    {
        ReleaseCommunity community = new ReleaseCommunity();

        try
        {
            community.setHave(JSONHandler.getIntOrNull(x, "have"));
            community.setWant(JSONHandler.getIntOrNull(x, "want"));
            community.setRating(buildReleaseRating(JSONHandler.getObjectNotNull(x, "rating")));
            community.setSubmitter(buildReleaseSubmitter(JSONHandler.getObjectNotNull(x, "submitter")));
            community.setContributors(buildReleaseContributorsList(JSONHandler.getArrayOrNull(x, "contributors")));

        }
        catch (JSONException e)
        {
            e.printStackTrace();
        }
        return community;
    }


    private static ReleaseLabel buildReleaseLabel(JSONObject x)
    {
        ReleaseLabel label = new ReleaseLabel();

        try
        {
            label.setEntityType(JSONHandler.getStringOrNull(x, "entity_type"));
            label.setCatno(JSONHandler.getStringOrNull(x, "catno"));
            label.setId(JSONHandler.getIntOrNull(x, "id"));
            label.setEntityTypeName(JSONHandler.getStringOrNull(x, "entity_type_name"));
            label.setName(JSONHandler.getStringOrNull(x, "name"));
            label.setResourceUrl(JSONHandler.getStringOrNull(x, "resource_url"));

        }
        catch (JSONException e)
        {
            e.printStackTrace();
        }
        return label;
    }


    private static ReleaseCompanie buildReleaseCompanie(JSONObject x)
    {
        ReleaseCompanie companie = new ReleaseCompanie();

        try
        {
            companie.setEntityType(JSONHandler.getStringOrNull(x, "entity_type"));
            companie.setCatno(JSONHandler.getStringOrNull(x, "catno"));
            companie.setId(JSONHandler.getIntOrNull(x, "id"));
            companie.setEntityTypeName(JSONHandler.getStringOrNull(x, "entity_type_name"));
            companie.setName(JSONHandler.getStringOrNull(x, "name"));
            companie.setResourceUrl(JSONHandler.getStringOrNull(x, "resource_url"));

        }
        catch (JSONException e)
        {
            e.printStackTrace();
        }
        return companie;
    }


    private static ReleaseExtraartist buildReleaseExtraartist(JSONObject x)
    {
        ReleaseExtraartist extraartist = new ReleaseExtraartist();

        try
        {
            extraartist.setId(JSONHandler.getIntOrNull(x, "id"));
            extraartist.setTracks(JSONHandler.getStringOrNull(x, "tracks"));
            extraartist.setRole(JSONHandler.getStringOrNull(x, "role"));
            extraartist.setAnv(JSONHandler.getStringOrNull(x, "anv"));
            extraartist.setJoin(JSONHandler.getStringOrNull(x, "join"));
            extraartist.setName(JSONHandler.getStringOrNull(x, "name"));
            extraartist.setResourceUrl(JSONHandler.getStringOrNull(x, "resource_url"));

        }
        catch (JSONException e)
        {
            e.printStackTrace();
        }
        return extraartist;
    }


    private static ReleaseVideo buildReleaseVideo(JSONObject x)
    {
        ReleaseVideo video = new ReleaseVideo();

        try
        {
            video.setUri(JSONHandler.getStringOrNull(x, "uri"));
            video.setDuration(JSONHandler.getIntOrNull(x, "duration"));
            video.setEmbed(JSONHandler.getOptionalBool(x, "embed"));
            video.setDescription(JSONHandler.getStringOrNull(x, "description"));
            video.setTitle(JSONHandler.getStringOrNull(x, "title"));

        }
        catch (JSONException e)
        {
            e.printStackTrace();
        }
        return video;
    }


    private static ReleaseArtist buildReleaseArtist(JSONObject x)
    {
        ReleaseArtist artist = new ReleaseArtist();

        try
        {
            artist.setId(JSONHandler.getIntOrNull(x, "id"));
            artist.setTracks(JSONHandler.getStringOrNull(x, "tracks"));
            artist.setRole(JSONHandler.getStringOrNull(x, "role"));
            artist.setAnv(JSONHandler.getStringOrNull(x, "anv"));
            artist.setJoin(JSONHandler.getStringOrNull(x, "join"));
            artist.setName(JSONHandler.getStringOrNull(x, "name"));
            artist.setResourceUrl(JSONHandler.getStringOrNull(x, "resource_url"));

        }
        catch (JSONException e)
        {
            e.printStackTrace();
        }
        return artist;
    }


    private static ReleaseFormat buildReleaseFormat(JSONObject x)
    {
        ReleaseFormat format = new ReleaseFormat();

        try
        {
            format.setDescriptions(JSONHandler.getListStringOrNull(x, "descriptions"));
            format.setName(JSONHandler.getStringOrNull(x, "name"));
            format.setQty(JSONHandler.getStringOrNull(x, "qty"));

        }
        catch (JSONException e)
        {
            e.printStackTrace();
        }
        return format;
    }


    private static ReleaseImage buildReleaseImage(JSONObject x)
    {
        ReleaseImage image = new ReleaseImage();

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
            e.printStackTrace();
        }
        return image;
    }


    private static ReleaseIdentifier buildReleaseIdentifier(JSONObject x)
    {
        ReleaseIdentifier identifier = new ReleaseIdentifier();

        try
        {
            identifier.setType(JSONHandler.getStringOrNull(x, "type"));
            identifier.setDescription(JSONHandler.getStringOrNull(x, "description"));
            identifier.setValue(JSONHandler.getStringOrNull(x, "value"));

        }
        catch (JSONException e)
        {
            e.printStackTrace();
        }
        return identifier;
    }


    private static ReleaseTracklist buildReleaseTracklist(JSONObject x)
    {
        ReleaseTracklist tracklist = new ReleaseTracklist();

        try
        {
            tracklist.setDuration(JSONHandler.getStringOrNull(x, "duration"));
            tracklist.setPosition(JSONHandler.getStringOrNull(x, "position"));
            tracklist.setTitle(JSONHandler.getStringOrNull(x, "title"));

        }
        catch (JSONException e)
        {
            e.printStackTrace();
        }
        return tracklist;
    }

    //List Builders

    private static List<ReleaseContributor> buildReleaseContributorsList(JSONArray x)
    {
        List<ReleaseContributor> releaseContributors = new ArrayList<ReleaseContributor>();
        for (int i = 0; i < x.length(); i++)
        {
            try
            {
                releaseContributors.add(buildReleaseContributor(x.getJSONObject(i)));
            }
            catch (JSONException e)
            {
                e.printStackTrace();
            }
        }
        return releaseContributors;
    }

    private static List<ReleaseLabel> buildReleaseLabelsList(JSONArray x)
    {
        List<ReleaseLabel> releaseLabels = new ArrayList<ReleaseLabel>();
        for (int i = 0; i < x.length(); i++)
        {
            try
            {
                releaseLabels.add(buildReleaseLabel(x.getJSONObject(i)));
            }
            catch (JSONException e)
            {
                e.printStackTrace();
            }
        }
        return releaseLabels;
    }


    private static List<ReleaseExtraartist> buildExtraartistsList(JSONArray x)
    {
        List<ReleaseExtraartist> releaseExtraartists = new ArrayList<ReleaseExtraartist>();
        for (int i = 0; i < x.length(); i++)
        {
            try
            {
                releaseExtraartists.add(buildReleaseExtraartist(x.getJSONObject(i)));
            }
            catch (JSONException e)
            {
                e.printStackTrace();
            }
        }
        return releaseExtraartists;
    }

    private static List<ReleaseVideo> buildVideosList(JSONArray x)
    {
        List<ReleaseVideo> releaseVideos = new ArrayList<ReleaseVideo>();
        if (x == null)
            return null;
        for (int i = 0; i < x.length(); i++)
        {
            try
            {
                releaseVideos.add(buildReleaseVideo(x.getJSONObject(i)));
            }
            catch (JSONException e)
            {
                e.printStackTrace();
            }
            catch (NullPointerException e)
            {
                return null;
            }
        }
        return releaseVideos;
    }

    private static List<ReleaseArtist> buildArtistsList(JSONArray x)
    {
        List<ReleaseArtist> releaseArtists = new ArrayList<ReleaseArtist>();
        for (int i = 0; i < x.length(); i++)
        {
            try
            {
                releaseArtists.add(buildReleaseArtist(x.getJSONObject(i)));
            }
            catch (JSONException e)
            {
                e.printStackTrace();
            }
        }
        return releaseArtists;
    }

    private static List<ReleaseFormat> buildFormatsList(JSONArray x)
    {
        List<ReleaseFormat> releaseFormats = new ArrayList<ReleaseFormat>();
        for (int i = 0; i < x.length(); i++)
        {
            try
            {
                releaseFormats.add(buildReleaseFormat(x.getJSONObject(i)));
            }
            catch (JSONException e)
            {
                e.printStackTrace();
            }
        }
        return releaseFormats;
    }

    private static List<ReleaseImage> buildImagesList(JSONArray x)
    {
        List<ReleaseImage> releaseImages = new ArrayList<ReleaseImage>();
        for (int i = 0; i < x.length(); i++)
        {
            try
            {
                releaseImages.add(buildReleaseImage(x.getJSONObject(i)));
            }
            catch (JSONException e)
            {
                e.printStackTrace();
            }
        }
        return releaseImages;
    }


    private static List<ReleaseIdentifier> buildIdentifiersList(JSONArray x)
    {
        List<ReleaseIdentifier> releaseIdentifiers = new ArrayList<ReleaseIdentifier>();
        for (int i = 0; i < x.length(); i++)
        {
            try
            {
                releaseIdentifiers.add(buildReleaseIdentifier(x.getJSONObject(i)));
            }
            catch (JSONException e)
            {
                e.printStackTrace();
            }
        }
        return releaseIdentifiers;
    }

    private static List<ReleaseTracklist> buildTracklistList(JSONArray x)
    {
        List<ReleaseTracklist> releaseTracklists = new ArrayList<ReleaseTracklist>();
        for (int i = 0; i < x.length(); i++)
        {
            try
            {
                releaseTracklists.add(buildReleaseTracklist(x.getJSONObject(i)));
            }
            catch (JSONException e)
            {
                e.printStackTrace();
            }
        }
        return releaseTracklists;
    }

    private static List<ReleaseCompanie> buildCompaniesList(JSONArray x)
    {
        List<ReleaseCompanie> releaseCompanies = new ArrayList<ReleaseCompanie>();
        for (int i = 0; i < x.length(); i++)
        {
            try
            {
                releaseCompanies.add(buildReleaseCompanie(x.getJSONObject(i)));
            }
            catch (JSONException e)
            {
                e.printStackTrace();
            }
        }
        return releaseCompanies;
    }


}
