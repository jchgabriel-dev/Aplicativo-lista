package com.example.danp4.database

import androidx.paging.PagingSource
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface CountryDao {
    @Insert
    suspend fun insertCountry(country: CountryEntity)

    @Query("SELECT * FROM Country")
    fun pagingSource(): PagingSource<Int, CountryEntity>

}