package GET2018.com.metacube.DBMS.Assignment5;

/**
 * Copyright (c) 2018 Metacube.com. All rights reserved.
 * Class to insert images in batch.
 * @author Chirag Jain
 */
public class Image
{
    private String url;
    private String alternateText;
    
    
    /**
     * constructor
     * @param url
     * @param alternateText
     */
    public Image(String url, String alternateText) {
        this.url = url;
        this.alternateText = alternateText;
    }
     
    /**
     * getter method for url
     * @return url
     */
    public String getUrl() {
        return url;
    }
    
    
    /**
     * setter method for url
     * @param url
     */
    public void setUrl(String url) {
        this.url = url;
    }
    
    
    /**
     * getter method for alternameText
     * @return alternameText
     */
    public String getAlternateText() {
        return alternateText;
    }
    
    
    /**
     * setter method for alternameText
     * @param alternateText
     */
    public void setAlternateText(String alternateText) {
        this.alternateText = alternateText;
    }
    
}