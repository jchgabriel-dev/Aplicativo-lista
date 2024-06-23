package com.example.danp4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import com.example.danp4.database.AdapterCountryPaging
import com.example.danp4.database.CountryEntity
import com.example.danp4.database.CountryViewModel
import com.example.danp4.ui.theme.DANP4Theme
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    private lateinit var viewModel: CountryViewModel

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(this).get(CountryViewModel::class.java)
        val adapterCountry = AdapterCountryPaging()
        val rv = findViewById<RecyclerView>(R.id.rv_activityMain_browse)
        rv.adapter = adapterCountry

        GlobalScope.launch(Dispatchers.IO){
            viewModel.pagingSource().collect(){
                adapterCountry.submitData(it)
            }
        }
    }
}
