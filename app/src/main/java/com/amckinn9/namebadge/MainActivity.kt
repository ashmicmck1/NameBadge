package com.amckinn9.namebadge

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.amckinn9.namebadge.ui.theme.NameBadgeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            NameBadgeTheme {
                NameBadgeInfo()
            }
        }
    }
}

@Composable
fun NameBadgeInfo() {
    //Outer Frame
    Column(
        modifier = Modifier
            .padding(10.dp)
            .graphicsLayer(
                translationX = 1f,  // Adjust position horizontally
                translationY = -1f   // Adjust position vertically
            )
            .border(width = 1.dp,
                color = MaterialTheme.colorScheme.primary),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = androidx.compose.foundation.layout.Arrangement.Center,

        ) {
        //Inner Frame
        Column( modifier = Modifier
            .padding(6.dp)
            .border(width = 1.dp,
                    color = MaterialTheme.colorScheme.secondary)
            .scale(.85f),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = androidx.compose.foundation.layout.Arrangement.Center
            ) {
            Text(
                text = "Ashleigh",
                style = MaterialTheme.typography.headlineLarge,
                fontSize = 64.sp,
                fontWeight = FontWeight.Bold
            )
            Text(text = "McKinney",
                fontSize = 40.sp,
                fontWeight = FontWeight.Bold)
            BadgePhoto()
            Text(text = "COMPUTER SCIENCE",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold)
            Text(text = "Senior",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold)
            Text(text = "GitHub: @ashmicmck1",
                fontSize = 12.sp,
                style = MaterialTheme.typography.bodySmall)
            Text(text = "Email: amckinn9@xula.edu",
                fontSize = 12.sp,
                style = MaterialTheme.typography.bodySmall)
            Text(text = "LinkedIn: https://www.linkedin.com/in/ashleigh-mckinney-b3b73722a/ ",
                fontSize = 12.sp,
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.bodySmall)
        }
    }
}

@Composable
fun BadgePhoto() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = androidx.compose.foundation.layout.Arrangement.Center,
        modifier = Modifier.size(279.dp)
    ) {
        Image(
            painter = painterResource(R.drawable.badge_photo),
            contentDescription = "Badge picture",
            contentScale = ContentScale.Crop,
            modifier = Modifier
//                .size(279.dp)
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