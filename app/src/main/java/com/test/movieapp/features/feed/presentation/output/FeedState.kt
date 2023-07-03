package com.test.movieapp.features.feed.presentation.output

sealed class FeedState {
    object Loading: FeedState()

    class Main(
        val movieList: List<MovieFeedItemEntity>
    ): FeedState()

    class Failed(
        val response: String
    ): FeedState()
}