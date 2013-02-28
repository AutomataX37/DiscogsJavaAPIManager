package discogsjava.api;

import discogsjava.database.artist.Artist;
import discogsjava.database.artist.ArtistBuilder;
import discogsjava.database.label.Label;
import discogsjava.database.label.LabelBuilder;
import discogsjava.database.master.Master;
import discogsjava.database.master.MasterBuilder;
import discogsjava.database.release.Release;
import discogsjava.database.release.ReleaseBuilder;
import discogsjava.exception.*;
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

    final String SEARCHURL = DISCOGSURL + "/search?";

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
        catch (StatusCodeException e)
        {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
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
        catch (StatusCodeException e)
        {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
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
        catch (StatusCodeException e)
        {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
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
        catch (StatusCodeException e)
        {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

        return release;
    }

    public void search(String query)
    {
    }

    private String makeQuery(String location) throws StatusCodeException
    {

        String json = null;

        try
        {
            URL url = new URL(location);
            String inputLine;
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestProperty("User-Agent", "DiscogsJavaAPIManager/0.1 +https://github.com/AutomataX37/DiscogsJavaAPIManager");
            connection.setRequestMethod("GET");
            connection.connect();
            System.out.println(connection.getResponseMessage());
            switch (connection.getResponseCode())
            {
                case (200):
                {
                    break;
                }

                case (201):
                {
                    break;
                }

                case (204):
                {
                    break;
                }

                case (401):
                {
                    throw new StatusCodeUnauthorizedException();
                }

                case (403):
                {
                    throw new StatusCodeForbiddenException();
                }

                case (404):
                {
                    throw new StatusCodeNotFoundException();
                }

                case (405):
                {
                    throw new StatusCodeMethodNotAllowedException();
                }

                case (422):
                {
                    throw new StatusCodeUnprocessableEntityException();
                }

                case (500):
                {
                    throw new StatusCodeInternalServerErrorException();
                }

            }

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
