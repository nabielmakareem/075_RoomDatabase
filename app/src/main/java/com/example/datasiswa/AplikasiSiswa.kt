package com.example.datasiswa

import android.app.Application
import com.example.datasiswa.Repository.ContainerApp
import com.example.datasiswa.Repository.ContainerDataApp

class AplikasiSiswa : Application() {
    /**
     * App Container instance digunakan oleh kelas-kelas lainnya untuk mendapatkan dependensi
     */
    lateinit var container: ContainerApp

    override fun onCreate() {
        super.onCreate()
        container = ContainerDataApp(this)
    }
}