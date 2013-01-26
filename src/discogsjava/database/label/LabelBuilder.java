package discogsjava.database.label;

import discogsjava.internal.json.JSONHandler;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class LabelBuilder
{


    private static LabelParentLabel buildParentLabel(JSONObject x)
    {
        LabelParentLabel parent_label = new LabelParentLabel();

        try
        {
            parent_label.setId(JSONHandler.getIntOrNull(x, "id"));
            parent_label.setName(JSONHandler.getStringOrNull(x, "name"));


        }
        catch (JSONException e)
        {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return parent_label;
    }

    private static LabelSublabel buildLabelSublabel(JSONObject x)
    {
        LabelSublabel sublabel = new LabelSublabel();

        try
        {
            sublabel.setId(JSONHandler.getIntOrNull(x, "id"));
            sublabel.setName(JSONHandler.getStringOrNull(x, "name"));
            sublabel.setResourceUrl(JSONHandler.getStringOrNull(x, "resource_url"));


        }
        catch (JSONException e)
        {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return sublabel;
    }

    private static LabelImage buildLabelImage(JSONObject x)
    {
        LabelImage image = new LabelImage();

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

    private static List<LabelSublabel> buildSublabelsList(JSONArray x)
    {
        List<LabelSublabel> sublabels = new ArrayList<LabelSublabel>();
        for (int i = 0; i < x.length(); i++)
        {
            try
            {
                sublabels.add(buildLabelSublabel(x.getJSONObject(i)));
            }
            catch (JSONException e)
            {
                e.printStackTrace();
            }
        }
        return sublabels;
    }

    private static List<LabelImage> buildImagesList(JSONArray x)
    {
        List<LabelImage> images = new ArrayList<LabelImage>();
        for (int i = 0; i < x.length(); i++)
        {
            try
            {
                images.add(buildLabelImage(x.getJSONObject(i)));
            }
            catch (JSONException e)
            {
                e.printStackTrace();
            }
        }
        return images;
    }

    public static Label buildLabel(JSONObject x)
    {
        Label label = new Label();

        try
        {
            label.setId(JSONHandler.getIntOrNull(x, "id"));
            label.setName(JSONHandler.getStringOrNull(x, "name"));
            label.setProfile(JSONHandler.getStringOrNull(x, "profile"));
            label.setResourceUrl(JSONHandler.getStringOrNull(x, "resource_url"));
            label.setReleasesUrl(JSONHandler.getStringOrNull(x, "releases_url"));
            label.setUri(JSONHandler.getStringOrNull(x, "uri"));
            label.setDataQuality(JSONHandler.getStringOrNull(x, "data_quality"));
            label.setContactInfo(JSONHandler.getStringOrNull(x, "contact_info"));
            label.setParentLabel(buildParentLabel(JSONHandler.getObjectNotNull(x, "parent_label")));
            label.setSublabels(buildSublabelsList(JSONHandler.getArrayOrNull(x, "sublabels")));
            label.setUrls(JSONHandler.getListStringOrNull(x, "urls"));
            label.setImages(buildImagesList(JSONHandler.getArrayOrNull(x, "images")));


        }
        catch (JSONException e)
        {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return label;
    }
}
