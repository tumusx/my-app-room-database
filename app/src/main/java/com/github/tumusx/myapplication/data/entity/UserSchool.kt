package com.github.tumusx.myapplication.data.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class UserSchool(
    @ColumnInfo(name = "nota") val nota: Int?,
    @ColumnInfo(name = "name_school") val nameSchool: String?,
    @PrimaryKey val idUserSchool: Int
)
