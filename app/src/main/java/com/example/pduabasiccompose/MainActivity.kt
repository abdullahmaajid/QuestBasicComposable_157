package com.example.pduabasiccompose

import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.layout.ContentScale

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color

import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pduabasiccompose.ui.theme.PDuaBasicComposeTheme
import org.intellij.lang.annotations.JdkConstants.FontStyle
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PDuaBasicComposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BasicColoumn(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun BasicColoumn(modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 0.dp)) {
        Text("Login",
            fontSize = 55.sp,
            fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.padding(2.dp))

        Text("Ini adalah halaman login",
            fontSize = 18.sp,
            )
        Spacer(modifier = Modifier.padding(20.dp))

        Image(
            painter = painterResource(id = R.drawable.logoumy),
            contentDescription = "",
            modifier = Modifier
                .size(250.dp)
                .clip(CircleShape)
        )// Set the desired size here, e.g., 100dp
        Spacer(modifier = Modifier.padding(5.dp))

        Text("Nama",
            fontSize = 20.sp,
            fontWeight = FontWeight.Normal)
        Spacer(modifier = Modifier.padding(0.dp))

        Text("Abdullah Maajid",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Red // Set the color here
        )

        // Use Color.Red to set the text color to red
        Spacer(modifier = Modifier.padding(0.dp))

        Text("20220140157",
            fontSize = 40.sp)
        Spacer(modifier = Modifier.padding(0.dp))

        Image(
            painter = painterResource(id = R.drawable.foto),
            contentDescription = "",
            modifier = Modifier
                .padding(16.dp)
                .size(235.dp, 800.dp) // Increased size for a larger oval shape
                .clip(RoundedCornerShape(150.dp)) // Round corners for a smoother oval shape
                .graphicsLayer(
                    alpha = 1.0f, // Set transparency for crumple effect
                    translationX = -10f, // Slight positional effect
                    scaleX = 1.1f, // Increased scale factor for width
                    scaleY = 1.1f  // Increased scale factor for height
                )
                .fillMaxSize(), // Optional: This may be adjusted based on your layout
            contentScale = ContentScale.Crop // Crop the image to fit the oval shape
        )


        // Rounded corners for the oval shape

    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PDuaBasicComposeTheme {
        BasicColoumn()
    }
}