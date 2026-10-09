package com.example.tugasactivity

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
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
@Composable
fun Tugaspam(modifier: Modifier = Modifier){
    val scrollState = rememberScrollState()


    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(scrollState),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(20.dp))


        Text(
            text = stringResource(id = R.string.prodi),
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            color = colorResource(id = R.color.text_dark)
        )
        Text(
            text = stringResource(id = R.string.univ),
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            color = colorResource(id = R.color.text_dark)
        )

        Spacer(modifier = Modifier.height(16.dp))


        CardWidget(
            backgroundColorRes = R.color.card_bg_redbull,
            nameRes = R.string.nama1,
            nameColorRes = R.color.text_redbull_red,
            phoneRes = R.string.phone1,
            phoneColorRes = R.color.text_redbull_red,
            addressRes = R.string.alamat1,
            addressColorRes = R.color.text_redbull_red,
            imageRes = R.drawable.maxxx
        )


        CardWidget(
            backgroundColorRes = R.color.card_bg_ferrari,
            nameRes = R.string.nama2,
            nameColorRes = R.color.text_white,
            phoneRes = R.string.phone2,
            phoneColorRes = R.color.text_white,
            addressRes = R.string.alamat2,
            addressColorRes = R.color.text_white,
            imageRes = R.drawable.hamilton
        )


        CardWidget(
            backgroundColorRes = R.color.card_bg_ferrari,
            nameRes = R.string.nama3,
            nameColorRes = R.color.text_white,
            phoneRes = R.string.phone3,
            phoneColorRes = R.color.text_white,
            addressRes = R.string.alamat3,
            addressColorRes = R.color.text_white,
            imageRes = R.drawable.leclerc
        )


        CardWidget(
            backgroundColorRes = R.color.card_bg_mclaren,
            nameRes = R.string.nama4,
            nameColorRes = R.color.text_dark,
            phoneRes = R.string.phone4,
            phoneColorRes = R.color.text_dark,
            addressRes = R.string.alamat4,
            addressColorRes = R.color.text_dark,
            imageRes = R.drawable.norris
        )

        Spacer(modifier = Modifier.weight(1f, fill = false))


        Spacer(modifier = Modifier.height(30.dp))


        Text(
            text = stringResource(id = R.string.copy),
            fontSize = 14.sp,
            color = colorResource(id = R.color.text_dark),
            modifier = Modifier.padding(bottom = 20.dp)
        )
    }

}
