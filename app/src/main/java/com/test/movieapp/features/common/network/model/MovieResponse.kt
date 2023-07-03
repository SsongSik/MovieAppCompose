package com.test.movieapp.features.common.network.model

import com.google.gson.annotations.SerializedName

data class MovieResponse(
    @SerializedName("actors")
    val actors: List<String>,
    @SerializedName("desc")
    val desc: String,
    @SerializedName("directors")
    val directors: List<String>,
    @SerializedName("genre")
    val genre: List<String>,
    @SerializedName("image_url")
    val imageUrl: String,
    @SerializedName("thumb_url")
    val thumbUrl: String,
    @SerializedName("imdb_url")
    val imdbPath: String,
    @SerializedName("name")
    val title: String,
    @SerializedName("rating")
    val rating: Float,
    @SerializedName("year")
    val year: Int?
)