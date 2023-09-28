package com.example.foodsapp

import android.annotation.SuppressLint
import android.app.Activity
import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.foodsapp.entity.Yemekler
import com.skydoves.landscapist.glide.GlideImage


@Composable
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
fun DetaySayfa(yemek: Yemekler) {
    val imageLink = "https://raw.githubusercontent.com/isikparlar/survivalpackimages/main/${yemek.yemek_adi}.png"
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = yemek.yemek_adi!!) },
                colors = TopAppBarDefaults.smallTopAppBarColors(
                    containerColor = colorResource(id = R.color.anaRenk),
                    titleContentColor = colorResource(id = R.color.white)
                )
            )
        },
        content = {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.SpaceEvenly,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                GlideImage(
                    imageModel = { imageLink },
                    modifier = Modifier.size(250.dp)
                )
                Button(
                    onClick = {
                        Log.e("Yemek", "${yemek.yemek_adi} sipariş verildi")
                    },
                    modifier = Modifier
                        .size(250.dp, 50.dp)
                        .padding(vertical = 40.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = colorResource(id = R.color.anaRenk),
                        contentColor = Color.White
                    ),

                )
                { Text(text = "Sipariş Ver") }
            }
        }
    )
}


