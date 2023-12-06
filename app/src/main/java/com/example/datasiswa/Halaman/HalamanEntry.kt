package com.example.datasiswa.Halaman

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.datasiswa.Model.EntryViewModel
import com.example.datasiswa.Model.PenyediaViewModel
import com.example.datasiswa.Navigasi.DestinasiNavigasi
import com.example.datasiswa.R.string.entry_siswa

object DestinasiEntry: DestinasiNavigasi {
    override val route = "item_entry"
    override val titleRes = entry_siswa}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EntrySiswaScreen(
    navigateBack: () -> Unit,
    modifier: Modifier = Modifier,
    viewModel: EntryViewModel = viewModel(factory = PenyediaViewModel.Factory)
) {

    val coroutineScope = rememberCoroutineScope()
    val scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior()
}