package com.github.tumusx.myapplication

import androidx.room.Database
import androidx.room.RoomDatabase
import com.github.tumusx.myapplication.data.dao.SchoolDAO
import com.github.tumusx.myapplication.data.entity.UserSchool


@Database(entities = [UserSchool::class], version = 1)
abstract class TestDataBase : RoomDatabase(){
    abstract fun schoolDAO() : SchoolDAO
}