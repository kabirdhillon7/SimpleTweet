package com.codepath.apps.restclienttemplate.models;

import com.codepath.apps.restclienttemplate.TimeFormatter;

import org.json.JSONException;
import org.json.JSONObject;

public class User {

    public String name;
    public String screenName;
    public String profileImageUrl;
    public String tvTimestamp;


    public static User fromJson(JSONObject jsonObject) throws JSONException {
        User user = new User();
        user.name = jsonObject.getString("name");
        user.screenName = jsonObject.getString("screen_name");
        user.profileImageUrl = jsonObject.getString("profile_banner_url");
        user.tvTimestamp = getFormattedTimestamp(jsonObject);
        return user;
    }

    private static String getFormattedTimestamp(JSONObject jsonObject) throws JSONException {
        String createdAt = jsonObject.getString("created_at");
        return TimeFormatter.getTimeDifference(createdAt);
    }
}
