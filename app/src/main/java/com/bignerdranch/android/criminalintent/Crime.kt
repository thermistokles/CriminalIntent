package com.bignerdranch.android.criminalintent

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date
import java.util.UUID

@Entity
data class Crime(
    @PrimaryKey val id: UUID,
    val title: String,
    val date: Date,
    val isSolved: Boolean,
    val suspect: String = "",
    val photoFileOneName: String? = null,
    val photoFileTwoName: String? = null,
    val photoFileThreeName: String? = null,
    val photoFileFourName: String? = null,
    val position: Int? = null
)
