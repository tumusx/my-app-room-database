package com.github.tumusx.myapplication.presenter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.room.Room
import com.github.tumusx.myapplication.R
import com.github.tumusx.myapplication.data.database.AppDataBase
import com.github.tumusx.myapplication.data.entity.UserSchool
import com.github.tumusx.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val databaseInit = Room.databaseBuilder(applicationContext, AppDataBase::class.java, "database-school").build()
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        insertUsers()
        setContentView(binding.root)
    }

    fun insertUsers(){
        val userDao = databaseInit.schoolDAO()
        binding.button.setOnClickListener {
            userDao.insert(UserSchool(2, "Murillo", 1))
        }

    }
}