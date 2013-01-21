package discogsjava.internal.utils;

/**
 * Created with IntelliJ IDEA.
 * User: Scott
 * Date: 21/01/13
 * Time: 19:10
 * To change this template use File | Settings | File Templates.
 */
public class StringUtils
{
    public static String format(String text, String... enteries)
    {

        for (int i = 0; i < enteries.length; i++)
        {
            text = text.replace("{" + i + "}", enteries[i]);
        }
        return text;
    }
}
