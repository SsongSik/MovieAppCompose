package com.test.movieapp.features.common.network.api

import com.test.movieapp.features.common.network.model.MovieResponse
import com.test.movieapp.library.network.model.ApiResult

interface IMovieAppNetworkApi {

    suspend fun getMovies(): ApiResult<List<MovieResponse>>
}