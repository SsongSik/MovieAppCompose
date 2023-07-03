package com.test.movieapp.features.common.repository

interface IMovieDataSource {
    suspend fun getMovieList()
}