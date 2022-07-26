package com.github.tumusx.myapplication

import android.content.Context
import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import com.github.tumusx.myapplication.data.dao.SchoolDAO
import com.github.tumusx.myapplication.data.entity.UserSchool
import org.junit.After
import org.junit.Before
import org.junit.Test
import kotlin.jvm.Throws

class SchoolTest {
    private lateinit var userDao: SchoolDAO
    private lateinit var db: TestDataBase

    @Before
    fun createDatabaseSchool(){
        val context = ApplicationProvider.getApplicationContext<Context>()
        db = Room.inMemoryDatabaseBuilder(context, TestDataBase::class.java).build()
        userDao = db.schoolDAO()

        userDao.getAllUsers()
    }
    @After
    @Throws(Exception::class)
    fun closeDB(){
        db.close()
    }

    @Test
    fun writeUser(){
        val userSchool: UserSchool = UserSchool(1, "Joao Pessoa", 1)
        userDao.insert(userSchool)
    }
}