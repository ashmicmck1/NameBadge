package com.amckinn9.namebadge

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.amckinn9.namebadge.ui.theme.NameBadgeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NameBadgeTheme {
                NameBadgeInfo()
            }
        }
    }
}

@Composable
fun NameBadgeInfo() {
    Column {
        Text(text = "Ashleigh")
        Text(text = "McKinney")
        Image(
            painter = painterResource(R.drawable.badge_photo),
            contentDescription = "Badge picture"
        )
        Text(text = "COMPUTER SCIENCE")
        Text(text = "Senior")
        Column {
            Text(text = "GitHub: @ashmicmck1")
            Text(text = "Email: amckinn9@xula.edu")
            Text(text = "LinkedIn: https://www.linkedin.com/in/ashleigh-mckinney-b3b73722a/ ")

        }
    }
}

@Preview(showBackground = true)
@Composable
fun NameBadgePreview() {
    NameBadgeTheme {
        NameBadgeInfo()
    }
}