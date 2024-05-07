package com.example.middleexam.ui.theme

import android.provider.SyncStateContract.Columns
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController

@Composable
fun Apage(navController: NavController){
    Column {
        Text(text = "学生信息")
        Image(painter = painterResource(id = R.drawable.ic_launcher_foreground), contentDescription = null)
        Text(text = "Android")
        Button(onClick = {
            navController.navigate(route:"Home")
        }) {
            Text(text = "home")
        }
    }
    }
}