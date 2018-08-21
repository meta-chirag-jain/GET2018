package GET2018.com.metacube.DBMS.Assignment5;

public class TopCategory 
{
    private String parentCategoryName;
    private int childCategories;
    
    public TopCategory(String parentCategoryName, int childCategories) {
        
        this.parentCategoryName = parentCategoryName;
        this.childCategories = childCategories;
    }

    public String getParentCategoryName() {
        return parentCategoryName;
    }
    
    public void setParentCategoryName(String parentCategoryName) {
        this.parentCategoryName = parentCategoryName;
    }
    
    public int getChildCategories() {
        return childCategories;
    }
    
    public void setChildCategories(int childCategories) {
        this.childCategories = childCategories;
    }

    @Override
    public String toString() {
        return "TopCategory [parentCategoryName=" + parentCategoryName
                + ", childCategories=" + childCategories + "]";
    }
        
}