package com.pinaksoftwares.retrofit;

import com.pinaksoftwares.retrofit.model.GitHubRepo;
import com.pinaksoftwares.retrofit.model.Movie;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GitHubClient {
    @GET("users/{user}/repos")
    Call<List<GitHubRepo>> listRepos(@Path("user") String user);

/*
    @GET("users/mehul/repos")
    Call<List<Movie>> reposForUser(String user);
*/
}
