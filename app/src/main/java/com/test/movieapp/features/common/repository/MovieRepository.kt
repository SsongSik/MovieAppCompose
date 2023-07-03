package com.test.movieapp.features.common.repository

import com.test.movieapp.features.common.network.api.IMovieAppNetworkApi
import com.test.movieapp.library.network.model.ApiResponse
import timber.log.Timber
import javax.inject.Inject

class MovieRepository @Inject constructor(
    private val movieNetworkApi: IMovieAppNetworkApi
): IMovieDataSource {

    override suspend fun getMovieList() {
        val data = movieNetworkApi.getMovies()
        if(data.response is ApiResponse.Success) {
            val movieList = data.response.data
        }
    }
}