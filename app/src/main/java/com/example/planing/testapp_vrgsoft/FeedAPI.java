package com.example.planing.testapp_vrgsoft;

import com.example.planing.testapp_vrgsoft.package1.Feed;

import retrofit2.Call;
import retrofit2.http.GET;

public interface FeedAPI {

    String URL = "https://www.reddit.com/r/";
    @GET("top/.rss")
    Call<Feed> getFeed();

}
