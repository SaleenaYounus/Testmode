package com.example.testmode;

public class cards {
    private String userId; /*which is need to connect the DB*/
    private String name; /*which shows the current user*/
    private String profileImageUrl;
    public cards (String userId, String name, String profileImageUrl){
        /* The parameter useId is different from Private String userId*,this is parameter*/
        this.userId = userId;/*The parameter userId is assigned to the DB connectivity userid*/
        this.name = name;
        this.profileImageUrl = profileImageUrl;

    }

    public String getUserId(){
        return userId;
    }
    public void setUserId(String userId){
        this.userId =userId;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getProfileImageUrl(){
        return profileImageUrl;
    }
    public void setProfileImageUrl(String profileImageUrl){
        this.profileImageUrl = profileImageUrl;
    }

}