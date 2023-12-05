package com.example.datasiswa.Repository

import com.example.datasiswa.data.Siswa
import com.example.datasiswa.data.SiswaDao
import kotlinx.coroutines.flow.Flow

class OfflineRepositoriSiswa(private val siswaDao: SiswaDao) : RepositoriSiswa {
    override fun getAllSiswaStream(): Flow<List<Siswa>> = siswaDao.getAllSiswa()
    override fun getSiswaStream(id: Int): Flow<Siswa?> = siswaDao.getSiswa(id)
    override suspend fun insert(siswa: Siswa) =siswaDao.insert(siswa)
    override suspend fun delete(siswa: Siswa) = siswaDao.delete(siswa)
    override suspend fun update(siswa: Siswa) = siswaDao.delete(siswa)
}