package com.easebuzz.testing.ixigoclone.Base.managers;

import javax.xml.transform.sax.SAXResult;

public class ApiUriManager {
    public static final String BASE_URL="https://pnr-status-for-railways-api.onrender.com/";
    public static final String BASE_TEST_URL="https://jsonplaceholder.typicode.com";

    //Pnr
    public static final String STATUS="/status";
    //Posts
    public static final String POSTS="/posts";

    public  static final String COMMENTS="/posts/{id}/comments";
    public  static final String COMMENTS_ID="/comments";

}
