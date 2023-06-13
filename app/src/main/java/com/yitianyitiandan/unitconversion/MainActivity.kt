package com.yitianyitiandan.unitconversion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.yitianyitiandan.unitconversion.ui.theme.UnitConversionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UnitConversionTheme {
                // A surface container using the 'background' color from the theme
                HomePage()
            }
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HomePage() {
    Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
        Column {
            AppTitle(stringResource(R.string.app_name))
            LazyVerticalGrid(
                cells = GridCells.Fixed(2),
                modifier = Modifier.padding(20.dp, 0.dp)
            ) {
                items(UnitType.values().toList()) { unit ->
                    UnitOpt(unit)
                }
            }
        }
    }
}

@Composable
fun AppTitle(name: String) {
    Text(text = name, modifier = Modifier.fillMaxWidth().padding(0.dp, 10.dp), textAlign = TextAlign.Center, fontSize = 30.sp)
}

@Composable
fun UnitOpt(data: UnitType) {
    Image(
        painter = painterResource(data.icon),
        contentDescription = stringResource(id = data.text),
        modifier = Modifier.padding(20.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    UnitConversionTheme {
        HomePage()
    }
}