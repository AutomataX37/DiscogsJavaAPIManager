package discogsjava.api;


import discogsjava.database.master.Master;

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
        // System.out.println(d.getArtist("45").toString());
        //  System.out.println(d.getRelease("45").toString());
        Master m = d.getMaster("8471");
        System.out.println(m.getId());
    }
}
