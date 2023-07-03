package com.test.movieapp.features.feed.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.test.movieapp.features.common.repository.IMovieDataSource
import com.test.movieapp.features.feed.presentation.output.FeedState
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
) : ViewModel() {

    // Ui 를 위한 StateFlow
    private val _feedState: MutableStateFlow<FeedState> = MutableStateFlow(FeedState.Loading)
    val feedState: StateFlow<FeedState> get() = _feedState

    private val _feedUiEffect = MutableSharedFlow<FeedUiState>(replay = 0)
    val feedUiEffect: SharedFlow<FeedUiState> get() = _feedUiEffect

    fun getMovie() {
        viewModelScope.launch {
            movieRepository.getMovieList()
        }
    }
}