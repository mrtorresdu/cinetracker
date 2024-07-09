package com.mrtorresdu.cinetracker

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieApiService {
    @GET("movie/now_playing")
    suspend fun getMovies(
        @Query("api_key") type: String):Response<MovieModels>
}