package com.affan.trailermark1.network

import com.affan.trailermark1.model.VideoResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {

    @GET("movie/{movie_id}/videos")
    fun getVideoResponse(
        @Path("movie_id") movieId : String,
        @Query("api_key") apiKey : String
    ) : Call<VideoResponse>

}