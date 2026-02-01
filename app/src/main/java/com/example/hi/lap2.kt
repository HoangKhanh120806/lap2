package com.example.hi


import androidx.compose.material3.Surface
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun lap2(){
    Surface(
        modifier = Modifier.fillMaxSize()
    ){
        Box(
            modifier = Modifier.fillMaxSize()
        ){
            ProfileSection(Modifier.align(Alignment.Center))
            ContactSection(
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .padding(bottom = 32.dp))
            Box(
                modifier = Modifier.fillMaxSize().background(Color(0xFFDDEFE0).copy(alpha=0.6f))
            )
        }
    }
}
@Composable
fun ProfileSection(modifier: Modifier = Modifier){
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Image(
            painter = painterResource(id = R.drawable.anh1),
            contentDescription = "Androi Logo",
            modifier = Modifier
                .size(100.dp)
                .padding(8.dp)
                .background(Color(0xFF073042))
        )

        Text(
            text = "Hoàng Khanh",
            fontSize = 32.sp,
            color = Color.Black
        )

        Text(
            text = "hi",
            fontSize = 16.sp,
            color = Color(0xFF3DDC84),
            fontWeight = FontWeight.Medium
        )
    }
}
@Composable
fun ContactSection(modifier: Modifier = Modifier){
    Column(modifier = modifier){
        ContactRow(
            icon = Icons.Default.Phone,
            text = "0386037775"
        )
        ContactRow(
            icon = Icons.Default.Share,
            text = "@AndroiDev"
        )
        ContactRow(
            icon = Icons.Default.Email,
            text = "khanh@gmail.com"

        )
    }
}
@Composable
fun ContactRow(icon: ImageVector, text: String){
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(8.dp)
    ){
        Icon(
            imageVector = icon,
            contentDescription = null,
            tint = Color(0xFF3DDC84)
        )
        Spacer(modifier= Modifier.width(16.dp))
        Text(text = text)
    }
}