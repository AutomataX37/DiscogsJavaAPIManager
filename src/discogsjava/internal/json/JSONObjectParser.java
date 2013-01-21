package discogsjava.internal.json;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created with IntelliJ IDEA.
 * User: Scott
 * Date: 18/09/12
 * Time: 23:22
 * To change this template use File | Settings | File Templates.
 */


public interface JSONObjectParser<T>
{
    public T parse(JSONObject input) throws JSONException;
}