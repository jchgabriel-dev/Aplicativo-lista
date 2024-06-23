package com.example.danp4.database

import androidx.paging.PagingSource

class CountryRepository(private val countryDao: CountryDao) {
    val browsecountry : PagingSource<Int, CountryEntity> = countryDao.pagingSource()

    suspend fun insertCountryr(country: CountryEntity){
        countryDao.insertCountry(country)
    }

}