package com.test.movieapp.features.feed.presentation.output

import com.test.movieapp.features.common.entity.MovieFeedItemEntity

sealed class FeedState {
    object Loading: FeedState()

    class Main(
        val movieList: List<MovieFeedItemEntity>
    ): FeedState()

    class Failed(
        val response: String
    ): FeedState()
}