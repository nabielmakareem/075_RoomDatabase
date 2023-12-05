package com.example.datasiswa.Repository

import com.example.datasiswa.data.Siswa
import kotlinx.coroutines.flow.Flow

interface RepositoriSiswa {
    fun getAllSiswaStream(): Flow<List<Siswa>>
    fun getSiswaStream(id:Int): Flow<Siswa?>
    suspend fun insert(siswa: Siswa)
    suspend fun update(siswa: Siswa)
    suspend fun delete(siswa:Siswa)
}