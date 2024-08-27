package com.amckinn9.namebadge

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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
    //Outer Column
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = androidx.compose.foundation.layout.Arrangement.Center) {
        Column( modifier = Modifier
            .border(width = 2.dp,
                    color = MaterialTheme.colorScheme.primary)
            .scale(.85f),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = androidx.compose.foundation.layout.Arrangement.Center
            ) {
            Text(
                text = "Ashleigh",
                style = MaterialTheme.typography.headlineLarge,
            )
            Text(text = "McKinney")
            BadgePhoto()
            Text(text = "COMPUTER SCIENCE")
            Text(text = "Senior")
            Text(text = "GitHub: @ashmicmck1")
            Text(text = "Email: amckinn9@xula.edu")
            Text(text = "LinkedIn: https://www.linkedin.com/in/ashleigh-mckinney-b3b73722a/ ",
                textAlign = TextAlign.Center)
        }
    }
}

@Composable
fun BadgePhoto() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = androidx.compose.foundation.layout.Arrangement.Center,
        modifier = Modifier.size(100.dp)
    ) {
        Image(
            painter = painterResource(R.drawable.badge_photo),
            contentDescription = "Badge picture",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(200.dp)
                .clip(CircleShape)
        )
    }
}


@Preview(showBackground = true)
@Composable
fun NameBadgePreview() {
    NameBadgeTheme {
        NameBadgeInfo()
    }
}