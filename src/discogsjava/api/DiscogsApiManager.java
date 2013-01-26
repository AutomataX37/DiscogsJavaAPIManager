package discogsjava.api;

import discogsjava.database.artist.Artist;
import discogsjava.database.artist.ArtistBuilder;
import discogsjava.database.label.Label;
import discogsjava.database.label.LabelBuilder;
import discogsjava.database.master.Master;
import discogsjava.database.master.MasterBuilder;
import discogsjava.database.release.Release;
import discogsjava.database.release.ReleaseBuilder;
import discogsjava.internal.utils.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created with IntelliJ IDEA.
 * User: Scott
 * Date: 20/01/13
 * Time: 23:10
 * To change this template use File | Settings | File Templates.
 */
public class DiscogsApiManager
{
    final String DISCOGSURL = "http://api.discogs.com";

    final String ARTISTURL = DISCOGSURL + "/artists/{0}";
    final String ARTISTRELEASESURL = ARTISTURL + "/releases";

    final String RELEASAEURL = DISCOGSURL + "/releases/{0}";

    final String MASTERSURL = DISCOGSURL + "/masters/{0}";
    final String MASTERSVERSIONSURL = MASTERSURL + "/versions";

    final String LABELSURL = DISCOGSURL + "/labels/{0})";
    final String LABELSRELEASESURL = LABELSURL + "releases";

    public Artist getArtist(String artistId)
    {
        Artist artist = new Artist();

        try
        {
            artist = ArtistBuilder.buildArtist(new JSONObject(makeQuery(StringUtils.format(ARTISTURL, artistId))));
        }
        catch (JSONException e)
        {
            e.printStackTrace();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return artist;
    }

    public Master getMaster(String masterID)
    {
        Master master = new Master();

        try
        {
            master = MasterBuilder.buildMaster(new JSONObject(makeQuery(StringUtils.format(MASTERSURL, masterID))));
        }
        catch (JSONException e)
        {
            e.printStackTrace();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return master;
    }

    public Label getLabel(String labelID)
    {
        Label label = new Label();

        try
        {
            label = LabelBuilder.buildLabel(new JSONObject(makeQuery(StringUtils.format(MASTERSURL, labelID))));
        }
        catch (JSONException e)
        {
            e.printStackTrace();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return label;
    }

    public Release getRelease(String releaseId)
    {
        Release release = new Release();

        try
        {
            release = ReleaseBuilder.buildRelease(new JSONObject(makeQuery(StringUtils.format(RELEASAEURL, releaseId))));
        }
        catch (JSONException e)
        {
            e.printStackTrace();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return release;
    }

    private String makeQuery(String location)
    {

        String json = null;

        try
        {
            URL url = new URL(location);
            String inputLine;
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();


            InputStream in = connection.getInputStream();
            BufferedReader res = new BufferedReader(new InputStreamReader(in, "UTF-8"));

            StringBuffer sBuffer = new StringBuffer();

            while ((inputLine = res.readLine()) != null)
            {
                sBuffer.append(inputLine);
            }
            res.close();
            return sBuffer.toString();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return json;
    }


}
