package discogsjava.api;

import discogsjava.database.artist.Artist;
import discogsjava.database.artist.ArtistBuilder;
import discogsjava.internal.utils.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

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


    private String makeQuery(String location)
    {

        String json = null;

        try
        {
            URL url = new URL(location);
            String inputLine;
            URLConnection connection = url.openConnection();
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
