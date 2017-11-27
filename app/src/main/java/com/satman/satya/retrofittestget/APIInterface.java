package com.satman.satya.retrofittestget;

import com.satman.satya.retrofittestget.pojo.MultipleResource;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by satya on 27-11-2017.
 */

public interface APIInterface {


    @GET("/api/unknown")
    Call<MultipleResource> doGetListResources();




}
