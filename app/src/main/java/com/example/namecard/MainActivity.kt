package com.example.namecard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.namecard.ui.theme.NameCardTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NameCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    NameCard(
                        "Nadya Petroya Sadi",
                        "Mahasiswa",
                        "081344528753",
                        "nadyapetfoya@gmail.com",
                        "napesaaaaaaaaaaa")
                }
            }
        }
    }
}

@Composable
fun NameCard(
    name: String,
    title: String,
    phone: String,
    email: String,
    sosialMedia: String
){
    Column (
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.image),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(30.dp)
            )
            Text(
                text = name,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(10.dp)
                    .align(alignment = Alignment.CenterHorizontally))
            Text(
                text = title,
                fontSize = 20.sp,
                modifier = Modifier
                    .align(alignment = Alignment.CenterHorizontally)
            )
            Spacer(modifier = Modifier.height(20.dp))
        }
        Card (
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
                .align(alignment = Alignment.CenterHorizontally)
        ) {
            Spacer(modifier = Modifier.height(10.dp))
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start,
                modifier = Modifier
                    .padding(5.dp)
            ){
                Spacer(modifier = Modifier.width(20.dp))
                Icon(
                    imageVector = Icons.Default.Phone,
                    contentDescription = null,
                    tint = Color.Black,
                    modifier = Modifier.padding(10.dp)
                )
                Text(
                    text = phone,
                    fontSize = 16.sp,
                    modifier = Modifier
                        .padding(10.dp)
                )
            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start,
                modifier = Modifier
                    .padding(5.dp)
            ){
                Spacer(modifier = Modifier.width(20.dp))
                Icon(
                    imageVector = Icons.Default.AccountCircle,
                    contentDescription = null,
                    tint = Color.Black,
                    modifier = Modifier.padding(10.dp)
                )
                Text(
                    text = sosialMedia,
                    fontSize = 16.sp,
                    modifier = Modifier
                        .padding(10.dp)
                )
            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start,
                modifier = Modifier
                    .padding(5.dp)
            ){
                Spacer(modifier = Modifier.width(20.dp))
                Icon(
                    imageVector = Icons.Default.Email,
                    contentDescription = null,
                    tint = Color.Black,
                    modifier = Modifier.padding(10.dp)
                )
                Text(
                    text = email,
                    fontSize = 16.sp,
                    modifier = Modifier
                        .padding(10.dp)
                )
            }
            Spacer(modifier = Modifier.height(10.dp))
        }
    }
}


@Preview(showBackground = true)
@Composable
fun NameCardPreview() {
    NameCardTheme {
        NameCard(
            "Nadya Petroya Sadi",
            "Mahasiswa",
            "081344528753",
            "nadyapetfoya@gmail.com",
            "napesaaaaaaaaaaa")

    }
}