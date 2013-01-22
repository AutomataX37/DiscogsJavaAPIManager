package discogsjava.database.release;

import java.util.List;

public class ReleaseCommunity
{
    //Variables
    private Integer have = null;
    private Integer want = null;
    private ReleaseRating rating = null;
    private ReleaseSubmitter submitter = null;
    private List<ReleaseContributor> contributors = null;

    //Functions
    public Integer getHave()
    {
        return have;
    }

    public void setHave(Integer have)
    {
        this.have = have;
    }

    public Integer getWant()
    {
        return want;
    }

    public void setWant(Integer want)
    {
        this.want = want;
    }

    public ReleaseRating getRating()
    {
        return rating;
    }

    public void setRating(ReleaseRating rating)
    {
        this.rating = rating;
    }

    public ReleaseSubmitter getSubmitter()
    {
        return submitter;
    }

    public void setSubmitter(ReleaseSubmitter submitter)
    {
        this.submitter = submitter;
    }

    public List<ReleaseContributor> getContributors()
    {
        return contributors;
    }

    public void setContributors(List<ReleaseContributor> contributors)
    {
        this.contributors = contributors;
    }

}
