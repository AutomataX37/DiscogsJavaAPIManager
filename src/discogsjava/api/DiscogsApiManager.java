package discogsjava.api;

import discogsjava.database.artist.Aliase;
import discogsjava.database.artist.Artist;
import discogsjava.database.artist.Image;
import discogsjava.internal.json.JSONHandler;
import discogsjava.internal.json.JSONObjectParser;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Scott
 * Date: 20/01/13
 * Time: 23:10
 * To change this template use File | Settings | File Templates.
 */
public class DiscogsApiManager
{

    final String ARTISTURL = "http://api.discogs.com/artists/";
    final String ARTISTRELEASESURL = ARTISTURL + "/releases";


    public Artist getArtist(String id)
    {
        Artist artist = new Artist();

        try
        {
            URL url = new URL(ARTISTURL + id);
            JSONObject result = new JSONObject(makeQuery(url));


            artist = buildArtist(result);

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

    private Artist buildArtist(JSONObject a)
    {
        Artist artist = new Artist();

        try
        {
            artist.setId(JSONHandler.getIntOrNull(a, "id"));
            artist.setName(JSONHandler.getStringOrNull(a, "name"));
            artist.setResourceUrl(JSONHandler.getStringOrNull(a, "resource_url"));
            artist.setReleasesUrl(JSONHandler.getStringOrNull(a, "releases_url"));
            artist.setRealname(JSONHandler.getStringOrNull(a, "realname"));
            artist.setProfile(JSONHandler.getStringOrNull(a, "profile"));
            artist.setDataQuality(JSONHandler.getStringOrNull(a, "data_quality"));
            artist.setNamevariations(JSONHandler.getListStringOrNull(a, "namevariations"));
            artist.setAliases(buildAliaseList(JSONHandler.getArrayOrNull(a, "aliases")));
            artist.setUrls(JSONHandler.getListStringOrNull(a, "urls"));
            artist.setImages(buildImagesList(JSONHandler.getArrayOrNull(a, "images")));

        }
        catch (JSONException e)
        {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return artist;
    }

    private Aliase buildAliase(JSONObject a)
    {
        Aliase aliase = new Aliase();

        try
        {
            aliase.setId(JSONHandler.getIntOrNull(a, "id"));
            aliase.setName(JSONHandler.getStringOrNull(a, "name"));
            aliase.setResourceUrl(JSONHandler.getStringOrNull(a, "resource_url"));

        }
        catch (JSONException e)
        {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return aliase;
    }


    private List<Aliase> buildAliaseList(JSONArray aList)
    {
        List<Aliase> aliases = new ArrayList<Aliase>();
        for (int i = 0; i < aList.length(); i++)
        {
            try
            {
                aliases.add(buildAliase(aList.getJSONObject(i)));
            }
            catch (JSONException e)
            {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            }
        }
        return aliases;


    }

    private Image buildImage(JSONObject a)
    {
        Image image = new Image();

        try
        {
            image.setType(JSONHandler.getStringOrNull(a, "type"));
            image.setWidth(JSONHandler.getInt(a,"width"));
            image.setHeight(JSONHandler.getInt(a,"height"));
            image.setUri(JSONHandler.getStringOrNull(a, "uri"));
            image.setUri150(JSONHandler.getStringOrNull(a, "uri150"));
            image.setResourceUrl(JSONHandler.getStringOrNull(a, "resource_url"));


        }
        catch (JSONException e)
        {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return image;
    }

    private List<Image> buildImagesList(JSONArray iList)
    {
        List<Image> images = new ArrayList<Image>();
        for (int i = 0; i < iList.length(); i++)
        {
            try
            {
                images.add(buildImage(iList.getJSONObject(i)));
            }
            catch (JSONException e)
            {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            }
        }
        return images;


    }




    private String makeQuery(URL url)
    {
        String json = null;

        try
        {
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
