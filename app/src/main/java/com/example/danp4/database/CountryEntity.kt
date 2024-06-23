package com.example.danp4.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Country")
class CountryEntity (
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "CouId")
    val CouId: Int,

    @ColumnInfo(name = "CouNamEn")
    val CouNamEn: String,
    @ColumnInfo(name = "CouNamEs")
    val CouNamEs: String,

    @ColumnInfo(name = "CouConEn")
    val CouConEn: String,
    @ColumnInfo(name = "CouConEs")
    val CouConEs: String,

    @ColumnInfo(name = "CouCapEn")
    val CouCapEn: String,
    @ColumnInfo(name = "CouCapEs")
    val CouCapEs: String,


    @ColumnInfo(name = "CouDia")
    val CouDia: String,

    @ColumnInfo(name = "CouCod2")
    val CouCod2: String,

    @ColumnInfo(name = "CouCod3")
    val CouCod3: String,

    @ColumnInfo(name = "CouTld")
    val CouTld: String,

    @ColumnInfo(name = "CouKm2")
    val CouKm2: String,
)