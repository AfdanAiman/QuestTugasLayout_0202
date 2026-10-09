package com.example.tugasactivity

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun CardWidget(
    backgroundColorRes: Int,
    nameRes: Int,
    nameColorRes: Int,
    nameFontFamily: FontFamily = FontFamily.Default,
    phoneRes: Int? = null,
    phoneColorRes: Int? = null,
    addressRes: Int,
    addressColorRes: Int,
    imageRes: Int,
    modifier: Modifier = Modifier
){

    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 6.dp),
        colors = CardDefaults.cardColors(
            containerColor = colorResource(id = backgroundColorRes)
        )
    ){

        Row(
            modifier = Modifier.fillMaxWidth()
            .padding(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ){
            Image(
                painter = painterResource(id = imageRes),
                contentDescription = null,
                modifier = Modifier.size(60.dp)
            )

            Spacer(modifier = Modifier.width(12.dp))
            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = stringResource(id = nameRes),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = nameFontFamily,
                    color = colorResource(id = nameColorRes)
                )

                if (phoneRes != null && phoneColorRes != null) {
                    Text(
                        text = stringResource(id = phoneRes),
                        fontSize = 14.sp,
                        color = colorResource(id = phoneColorRes),
                        modifier = Modifier.padding(top = 2.dp)
                    )
                }

                Text(
                    text = stringResource(id = addressRes),
                    fontSize = 14.sp,
                    color = colorResource(id = addressColorRes),
                    modifier = Modifier.padding(top = 2.dp)
                )
            }
            Spacer(modifier = Modifier.width(12.dp))


            Image(
                painter = painterResource(id = imageRes),
                contentDescription = null,
                modifier = Modifier.size(60.dp)
            )
        }
    }
}

fun TugasPAM(modifier: Modifier = Modifier){

}
