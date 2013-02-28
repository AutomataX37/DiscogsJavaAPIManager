package discogsjava.database.search;


/**
 * Created with IntelliJ IDEA.
 * User: AutomataX37
 * Date: 24/02/13
 * Time: 13:26
 */
public class DiscogsSearchCriteria
{
    public enum SearchType
    {
        RELEASE, MASTER, ARTIST, LABEL
    }

    ;

    private String query;
    private String artist;
    private String releaseTitle;
    private String label;
    private String title;
    private String catalogNumber;
    private String barcode;
    private String year;
    private SearchType type;


    /**
     * Returns the contents of this DiscogsSearchCritera as URL Formatted values in a String
     *
     * @param rootURL The rootURL to have the query appended to.
     * @return
     */
    public String getFormattedSearchCritera(String rootURL)
    {
        String variableString = "";
        if (query != null)
        {
            variableString = addQuery(variableString, "q=\"" + query + "\"");
        }

        if (type != null)
        {
            variableString = addQuery(variableString, "type=\"" + type.toString().toLowerCase() + "\"");
        }

        if (artist != null)
        {
            variableString = addQuery(variableString, "artist=\"" + artist + "\"");
        }

        if (releaseTitle != null)
        {
            variableString = addQuery(variableString, "release_title=\"" + releaseTitle + "\"");
        }

        if (label != null)
        {
            variableString = addQuery(variableString, "label=\"" + label + "\"");
        }

        if (title != null)
        {
            variableString = addQuery(variableString, "title=\"" + title + "\"");
        }

        if (catalogNumber != null)
        {
            variableString = addQuery(variableString, "catno=\"" + catalogNumber + "\"");
        }

        if (barcode != null)
        {
            variableString = addQuery(variableString, "barcode=\"" + barcode + "\"");
        }

        if (year != null)
        {
            variableString = addQuery(variableString, "year=\"" + year + "\"");
        }


        return rootURL + "?" + variableString;
    }

    private String addQuery(String varString, String query)
    {
        if (varString.isEmpty())
        {
            return varString += query;
        } else
        {
            return varString += "&" + query;
        }
    }

    public String getQuery()
    {
        return query;
    }

    public void setQuery(String query)
    {
        this.query = query;
    }

    public String getArtist()
    {
        return artist;
    }

    public void setArtist(String artist)
    {
        this.artist = artist;
    }

    public String getReleaseTitle()
    {
        return releaseTitle;
    }

    public void setReleaseTitle(String releaseTitle)
    {
        this.releaseTitle = releaseTitle;
    }

    public String getLabel()
    {
        return label;
    }

    public void setLabel(String label)
    {
        this.label = label;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getCatalogNumber()
    {
        return catalogNumber;
    }

    public void setCatalogNumber(String catalogNumber)
    {
        this.catalogNumber = catalogNumber;
    }

    public String getBarcode()
    {
        return barcode;
    }

    public void setBarcode(String barcode)
    {
        this.barcode = barcode;
    }

    public String getYear()
    {
        return year;
    }

    public void setYear(String year)
    {
        this.year = year;
    }

    public SearchType getType()
    {
        return type;
    }

    public void setType(SearchType type)
    {
        this.type = type;
    }


}
