package com.bignerdranch.android.froottime

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.room.Room
import com.bignerdranch.android.froottime.database.FrequencyDatabase

private const val DATABASE_NAME = "frequency-database"
class FrequencyRepository private constructor(context: Context){

    private val database: FrequencyDatabase = Room.databaseBuilder(
        context.applicationContext,
        FrequencyDatabase::class.java,
        DATABASE_NAME
    ).build()

    private val frequencyDao = database.frequencyDao()

    fun getFrequencies(): LiveData<List<Int>> = frequencyDao.getFrequencies()

    companion object {
        private var INSTANCE: FrequencyRepository? = null

        fun initialize(context: Context) {
            if(INSTANCE==null) {
                INSTANCE = FrequencyRepository(context)
            }
        }

        fun get(): FrequencyRepository {
            return INSTANCE?:
            throw IllegalStateException("FrequencyRepository must be initialized")
        }
    }
}