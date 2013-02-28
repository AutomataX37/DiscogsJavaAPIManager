package discogsjava.api;


import discogsjava.database.search.DiscogsSearchCriteria;

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
        DiscogsSearchCriteria dsc = new DiscogsSearchCriteria();
        dsc.setType(DiscogsSearchCriteria.SearchType.RELEASE);
        dsc.setTitle("Ken Ishii");

        System.out.println(dsc.getFormattedSearchCritera("http://api.discogs.com/database/search"));
    }
}
