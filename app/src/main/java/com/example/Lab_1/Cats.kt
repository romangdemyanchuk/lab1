package com.example.Lab_1

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
        @Parcelize
        data class Cats(
          val name: String,
          val poroda: String,
          val data: String,
          val opus: String,
          ) : Parcelable
