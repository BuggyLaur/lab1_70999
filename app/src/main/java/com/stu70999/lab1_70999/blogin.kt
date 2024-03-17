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
fun blogin(){
    Surface (
        color =  Color.Black,
    ){
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween,
        )
        {
            topPart()
            myLoginBox()
            buttonPart()
            bottomPart()
        }

    }
}

@Composable
fun topPart(){
    Spacer(modifier = Modifier.height(50.dp))
    Image(painter = painterResource(id = R.drawable.lock_removebg_preview),
        contentDescription = "Lock for gLogin" ,
        modifier = Modifier.requiredSize(110.dp))
    Text(text = "Welcome back you've been missed!",
        fontSize = 15.sp,
        color = lightGray
    )
}

@Composable
fun myLoginBox(){
    Box(modifier = Modifier
        .height(170.dp)
        .width(320.dp)
        .background(Color.Black)
    )
    {
        Column( modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            TextField(value = "Email", onValueChange = {},
                colors = TextFieldDefaults.colors(
                    unfocusedTextColor = gray,
                    unfocusedContainerColor = lightBlack,
                    focusedContainerColor = black),

                modifier = Modifier.fillMaxWidth())
            Spacer(modifier = Modifier.height(10.dp))
            TextField(value = "Password", onValueChange = {},
                colors = TextFieldDefaults.colors(
                    unfocusedTextColor = gray,
                    unfocusedContainerColor = lightBlack,
                    focusedContainerColor = black

                ),
                modifier = Modifier.fillMaxWidth())

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp)
            ){
                Text(text = "Forgot Password?", fontSize = 15.sp, color = lightGray,
                    modifier = Modifier.align(Alignment.CenterEnd))

            }
        }
    }

}

@Composable
fun buttonPart() {

    Row(
        modifier = Modifier
            .width(320.dp)
            .padding(top = 10.dp),
    ) {
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .background(lightBlack)
                .weight(1f),
            onClick = { },
            colors = ButtonDefaults.buttonColors(
                containerColor = lightBlack,
                contentColor = Color.White,
            )
        ) {

            Text("Login", fontSize = 20.sp)
        }

    }
    Box(modifier = Modifier
        .width(310.dp)
        .background(Color.Black)
    ) {
        Text(text = "Or continue with", fontSize = 15.sp, color = lightGray,
            modifier = Modifier.align(Alignment.Center))
    }
}

@Composable
fun bottomPart(){
    Row(
        horizontalArrangement = Arrangement.SpaceEvenly,

        ) {
        Image(painter = painterResource(id = R.drawable.bgoogle),
            contentDescription = "Apple for gLogin",
            modifier = Modifier
                .requiredSize(80.dp)
                .padding(5.dp)
        )
        Image(painter = painterResource(id = R.drawable.bapple),
            contentDescription = "google",
            modifier = Modifier
                .requiredSize(80.dp)
                .padding(5.dp))
    }
    Box(modifier = Modifier
        .width(310.dp)
        .background(Color.Black)
    ){
        Row(
            modifier= Modifier
                .padding(top = 10.dp)
                .align(Alignment.Center)

        ){

            Text(text = "Not a member?",
                color = lightGray)
            Spacer(modifier = Modifier.width(5.dp))
            Text(text = "Register now", fontWeight = FontWeight.Bold, color= lightGray,
                modifier = Modifier.padding(bottom = 50.dp))

        }
    }
}