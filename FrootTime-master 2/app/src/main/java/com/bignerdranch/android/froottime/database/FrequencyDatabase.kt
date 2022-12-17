package com.bignerdranch.android.froottime.database

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Int::class], version=1)
abstract class FrequencyDatabase : RoomDatabase() {
    abstract fun frequencyDao() : FrequencyDao
}
