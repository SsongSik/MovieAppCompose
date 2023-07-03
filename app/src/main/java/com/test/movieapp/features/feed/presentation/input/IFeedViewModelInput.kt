package com.test.movieapp.features.feed.presentation.input

interface IFeedViewModelInput {
    fun openDetail(movieName: String)
    fun openDialog()
    fun refreshFeed()
}