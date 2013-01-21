package discogsjava.api;


/**
 * Created with IntelliJ IDEA.
 * User: Scott
 * Date: 21/01/13
 * Time: 00:08
 * To change this template use File | Settings | File Templates.
 */
public class Test
{
    public static void main(String[] args)
    {
        DiscogsApiManager d = new DiscogsApiManager();
        System.out.println(d.getArtist("45").toString());

    }
}
