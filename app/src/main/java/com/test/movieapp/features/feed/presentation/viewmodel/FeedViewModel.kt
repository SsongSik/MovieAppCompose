package com.test.movieapp.features.feed.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.test.movieapp.features.common.repository.IMovieDataSource
import com.test.movieapp.features.feed.presentation.input.IFeedViewModelInput
import com.test.movieapp.features.feed.presentation.output.FeedState
import com.test.movieapp.features.feed.presentation.output.FeedUiEffect
import com.test.movieapp.features.feed.presentation.output.IFeedViewModelOutput
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class FeedViewModel @Inject constructor(
    private val movieRepository: IMovieDataSource
) : ViewModel(), IFeedViewModelOutput, IFeedViewModelInput {

    // Ui 를 위한 StateFlow
    private val _feedState: MutableStateFlow<FeedState> = MutableStateFlow(FeedState.Loading)
    override val feedState: StateFlow<FeedState> get() = _feedState

    // 유저로부터 입력을 위한 SharedFlow
    private val _feedUiEffect = MutableSharedFlow<FeedUiEffect>(replay = 0)
    override val feedUiEffect: SharedFlow<FeedUiEffect> get() = _feedUiEffect

    fun getMovie() {
        viewModelScope.launch {
            movieRepository.getMovieList()
        }
    }

    override fun openDetail(movieName: String) {
        TODO("Not yet implemented")
    }

    override fun openDialog() {
        TODO("Not yet implemented")
    }

    override fun refreshFeed() {
        TODO("Not yet implemented")
    }
}