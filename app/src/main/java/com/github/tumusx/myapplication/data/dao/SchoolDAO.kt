package com.github.tumusx.myapplication.data.dao

import androidx.room.*
import com.github.tumusx.myapplication.data.entity.UserSchool


@Dao
interface SchoolDAO {

    @Query("SELECT * FROM userschool")
    fun getAllUsers(): List<UserSchool>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert (vararg S: UserSchool)

    @Delete
    fun deletUser(userSchool: UserSchool)
}