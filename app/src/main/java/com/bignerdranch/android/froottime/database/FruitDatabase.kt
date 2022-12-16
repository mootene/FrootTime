package com.bignerdranch.android.froottime.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.bignerdranch.android.froottime.Fruit

@Database(entities = [Fruit::class], version = 1)
abstract class FruitDatabase : RoomDatabase() {

    abstract fun fruitDao(): FruitDao
}