package com.bignerdranch.android.froottime.database

import androidx.room.Dao
import androidx.room.Query

@Dao
interface FruitDao {

    @Query("SELECT * FROM fruit")
    fun getRange(): Array<Int>
}