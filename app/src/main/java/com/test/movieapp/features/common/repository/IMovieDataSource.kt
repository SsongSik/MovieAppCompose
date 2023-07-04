package com.test.movieapp.features.common.repository

import com.test.movieapp.features.common.entity.CategoryEntity
import com.test.movieapp.features.common.entity.EntityWrapper
import com.test.movieapp.features.common.entity.MovieDetailEntity
import com.test.movieapp.features.feed.domain.enum.SortOrder

interface IMovieDataSource {
    suspend fun getCategories(sortOrder: SortOrder? = null): EntityWrapper<List<CategoryEntity>>
    suspend fun getMovieDetail(movieName: String): MovieDetailEntity
}