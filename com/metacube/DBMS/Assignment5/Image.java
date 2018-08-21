package GET2018.com.metacube.DBMS.Assignment5;

public class Image
{
    private String url;
    private String alternateText;
    
    public Image(String url, String alternateText) {
        this.url = url;
        this.alternateText = alternateText;
    }

    public String getUrl() {
        return url;
    }
    
    public void setUrl(String url) {
        this.url = url;
    }
    
    public String getAlternateText() {
        return alternateText;
    }
    
    public void setAlternateText(String alternateText) {
        this.alternateText = alternateText;
    }
    
}