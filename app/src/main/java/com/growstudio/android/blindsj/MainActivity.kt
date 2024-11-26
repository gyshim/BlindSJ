package com.growstudio.android.blindsj

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.growstudio.android.blindsj.ui.theme.BlindSJTheme

class MainActivity : ComponentActivity() { // componentActivity는 컴포즈에서 ui를 작성하는 기본 액티비티
    override fun onCreate(savedInstanceState: Bundle?) { // componentActivity의 onCreate 메서드를 재정의
        super.onCreate(savedInstanceState) // 부모의 기본 동작 (원본 onCreate)
        enableEdgeToEdge()
        setContent {
            BlindSJTheme {  // 앱의 테마
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
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
    BlindSJTheme {
        Greeting("Android")
    }
}