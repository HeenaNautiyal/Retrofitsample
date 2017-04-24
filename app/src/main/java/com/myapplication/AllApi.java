package com.myapplication;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by sushil.kumar on 24/9/16.
 */
public interface AllApi {

    @FormUrlEncoded
    @POST("insertdata.php")
    public Call<ResponseBody> loginUser(@Field("caseid") String caseid,@Field("email") String email,@Field("password") String password);



}
