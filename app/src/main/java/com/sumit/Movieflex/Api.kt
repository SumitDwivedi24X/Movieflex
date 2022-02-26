package com.sumit.movieflex

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query


interface Api {

    @GET("movie/popular")
    fun getPopularMovies(
        @Query("api_key") apiKey: String = "84314b4c1bb5f11194418075bcd53b4d",
        @Query("page") page: Int
    ): Call<GetMoviesResponse>

    @GET("movie/top_rated")
    fun getTopRatedMovies(
        @Query("api_key") apiKey: String = "84314b4c1bb5f11194418075bcd53b4d",
        @Query("page") page: Int
    ): Call<GetMoviesResponse>

    @GET("movie/upcoming")
    fun getUpcomingMovies(
        @Query("api_key") apiKey: String = "84314b4c1bb5f11194418075bcd53b4d",
        @Query("page") page: Int
    ): Call<GetMoviesResponse>
}