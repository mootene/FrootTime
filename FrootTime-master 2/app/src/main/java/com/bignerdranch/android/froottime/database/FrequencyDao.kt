package com.bignerdranch.android.froottime.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query
import androidx.room.Update
import java.util.*

@Dao
interface FrequencyDao {
    @Query("SELECT * FROM fruit")
    fun getFrequencies(): LiveData<List<Int>>

    @Update
    fun updateFrequency()
}