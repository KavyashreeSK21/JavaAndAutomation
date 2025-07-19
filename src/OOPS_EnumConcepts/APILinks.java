package OOPS_EnumConcepts;

public enum APILinks {

    //When we use Enums??
    //We are stroing contant values in Enums
    //ex all the API links,All the locators etc
    //we can access directly by using getter method

    //create enum
    //create constructors
    //create private variables
    //create getter method to access


    googleLinks("https://www.google.com/"),
    gmailLink("https://mail.google.com/"),
    linkedInLink("https://www.linkedin.com/");

    public String getLinks() {
        return links;
    }

    private String links;



    APILinks(String links)
    {
        this.links=links;
    }

}
