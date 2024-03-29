package com.androiduniverse.coquardmassard.androiduniverse;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by alexiscoquard on 17/04/2017.
 */

class ApiClient {
    private static final String BASE_URL = "http://api.deezer.com/";
    private static Retrofit retrofit = null;
    private static final String API_TOKEN = "YOUR TOKEN";


    static Retrofit getClient() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
