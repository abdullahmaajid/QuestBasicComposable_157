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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
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
            fontSize = 60.sp,
            fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.padding(4.dp))

        Text("Ini adalah halaman login",
            fontSize = 20.sp,
            )
        Spacer(modifier = Modifier.padding(30.dp))

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
            fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.padding(0.dp))

        Text("Abdullah Maajid",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Red // Set the color here
        )

        // Use Color.Red to set the text color to red
        Spacer(modifier = Modifier.padding(20.dp))

        Text("20220140157",
            fontSize = 100.sp)
        Spacer(modifier = Modifier.padding(18.dp))

        Image(
            painter = painterResource(id = R.drawable.foto),
            contentDescription = "",
            modifier = Modifier.clip(CircleShape))

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