package com.stu70999.lab1_70999

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun GSignUp(){
    Surface (
        color =  Color.LightGray,
    ){
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween,
        )
        {
            TPart()
            MLoginBox()
            BttonPart()
            BttomPart()
        }

    }
}

@Composable
fun TPart(){
    Spacer(modifier = Modifier.height(150.dp))
    Image(painter = painterResource(id = R.drawable.lock_removebg_preview),
        contentDescription = "Lock for gLogin" ,
        modifier = Modifier.requiredSize(110.dp))

    Spacer(modifier = Modifier.height(5.dp))
    Text(text = "Let's create an account for you",
        fontSize = 15.sp,
        color = Color.Black
    )
}

@Composable
fun MLoginBox(){
    Box(modifier = Modifier
        .height(190.dp)
        .width(310.dp)
        .background(Color.LightGray)
    )
    {
        Column( modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            TextField(value = "Email", onValueChange = {},
                colors = TextFieldDefaults.colors(
                    unfocusedContainerColor = Color.White,
                    focusedContainerColor = Color.White),
                modifier = Modifier.fillMaxWidth())

            Spacer(modifier = Modifier.height(10.dp))

            TextField(value = "Password", onValueChange = {},
                colors = TextFieldDefaults.colors(
                    unfocusedContainerColor = Color.White,
                    focusedContainerColor = Color.White),
                modifier = Modifier.fillMaxWidth())

            Spacer(modifier = Modifier.height(10.dp))

            TextField(value = "Confirm password", onValueChange = {},
                colors = TextFieldDefaults.colors(
                    unfocusedContainerColor = Color.White,
                    focusedContainerColor = Color.White),
                modifier = Modifier.fillMaxWidth())

        }
    }

}

@Composable
fun BttonPart() {

    Row(
        modifier = Modifier
            .width(310.dp)
            .padding(bottom = 45.dp),
    ) {
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White)
                .weight(1f),
            onClick = { },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.White,
                contentColor = Color.Black,
            )
        ) {

            Text("Sign Up", fontSize = 20.sp)
        }

    }

}

@Composable
fun BttomPart(){

    Box(modifier = Modifier
        .width(310.dp)
        .background(Color.LightGray)
    ) {
        Row(
            modifier= Modifier
                .padding(bottom = 30.dp)
                .align(Alignment.Center)

        ){

            Text(text = "Already a member?",
                color = Color.Black)
            Spacer(modifier = Modifier.width(5.dp))

            Text(text = "Login Now", fontWeight = FontWeight.Bold, color= Color.Black,
                modifier = Modifier.padding(bottom = 20.dp))

        }
    }
}