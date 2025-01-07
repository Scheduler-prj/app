package com.example.planq.ui.theme

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.planq.R

val planFontFamily = FontFamily(
    Font(R.font.pretendard_extrabold, FontWeight.W800),
    Font(R.font.pretendard_bold, FontWeight.W700),
    Font(R.font.pretendard_semibold, FontWeight.W600),
    Font(R.font.pretendard_medium, FontWeight.W500),
    Font(R.font.pretendard_regular, FontWeight.W400),
)

object PlanQTypography {
    /**
     * - FontWeight(800) Extra_bold
     * - FontSize(40)
     * - LineHeight(40 * 1.6)
     * */
    val H1 = TextStyle(
        fontFamily = planFontFamily,
        fontWeight = FontWeight.W800,
        fontSize = 40.sp,
        lineHeight = (40 * 1.6).sp
    )

    /**
     * - FontWeight(700) Bold
     * - FontSize(24)
     * - LineHeight(24 * 1.4)
     * */
    val H2 = TextStyle(
        fontFamily = planFontFamily,
        fontWeight = FontWeight.W700,
        fontSize = 24.sp,
        lineHeight = (24 * 1.4).sp
    )

    /**
     * - FontWeight(600) Semi_bold
     * - FontSize(36)
     * - LineHeight(36 * 0.52)
     * */
    val T1 = TextStyle(
        fontFamily = planFontFamily,
        fontWeight = FontWeight.W600,
        fontSize = 36.sp,
        lineHeight = (36 * 0.52).sp
    )

    /**
     * - FontWeight(600) Semi_bold
     * - FontSize(32)
     * - LineHeight(32 * 0.44)
     * */
    val T2 = TextStyle(
        fontFamily = planFontFamily,
        fontWeight = FontWeight.W600,
        fontSize = 32.sp,
        lineHeight = (32 * 0.44).sp
    )

    /**
     * - FontWeight(600) Semi_bold
     * - FontSize(26)
     * - LineHeight(26 * 0.34)
     * */
    val T3 = TextStyle(
        fontFamily = planFontFamily,
        fontWeight = FontWeight.W600,
        fontSize = 26.sp,
        lineHeight = (26 * 0.34).sp
    )

    /**
     * - FontWeight(600) Semi_bold
     * - FontSize(24)
     * - LineHeight(24 * 1.3)
     * */
    val T4 = TextStyle(
        fontFamily = planFontFamily,
        fontWeight = FontWeight.W600,
        fontSize = 24.sp,
        lineHeight = (24 * 1.3).sp
    )

    /**
     * - FontWeight(600) Semi_bold
     * - FontSize(22)
     * - LineHeight(22 * 1.3)
     * */
    val T5 = TextStyle(
        fontFamily = planFontFamily,
        fontWeight = FontWeight.W600,
        fontSize = 22.sp
        // normal
    )

    /**
     * - FontWeight(600) Semi_bold
     * - FontSize(20)
     * - LineHeight(20 * 1.3)
     * */
    val T6 = TextStyle(
        fontFamily = planFontFamily,
        fontWeight = FontWeight.W600,
        fontSize = 20.sp,
        // normal
    )

    /**
     * - FontWeight(600) Semi_bold
     * - FontSize(16)
     * - LineHeight(16 * 1.5)
     * */
    val T7 = TextStyle(
        fontFamily = planFontFamily,
        fontWeight = FontWeight.W600,
        fontSize = 16.sp,
        lineHeight = (16 * 1.5).sp
    )

    /**
     * - FontWeight(500) Medium
     * - FontSize(26)
     * - LineHeight(26 * 0.38)
     * */
    val B1 = TextStyle(
        fontFamily = planFontFamily,
        fontWeight = FontWeight.W500,
        fontSize = 26.sp,
        lineHeight = (26 * 0.38).sp
    )

    /**
     * - FontWeight(500) Medium
     * - FontSize(22)
     * - LineHeight(22 * 1.3)
     * */
    val B2 = TextStyle(
        fontFamily = planFontFamily,
        fontWeight = FontWeight.W500,
        fontSize = 22.sp,
        // normal
    )

    /**
     * - FontWeight(500) Medium
     * - FontSize(20)
     * - LineHeight(20 * 1.3)
     * */
    val B3 = TextStyle(
        fontFamily = planFontFamily,
        fontWeight = FontWeight.W500,
        fontSize = 20.sp,
        // normal
    )

    /**
     * - FontWeight(500) Medium
     * - FontSize(18)
     * - LineHeight(18 * 0.24)
     * */
    val B4 = TextStyle(
        fontFamily = planFontFamily,
        fontWeight = FontWeight.W500,
        fontSize = 18.sp,
        lineHeight = (18 * 0.24).sp
    )

    /**
     * - FontWeight(500) Medium
     * - FontSize(16)
     * - LineHeight(16 * 1.4)
     * */
    val B5 = TextStyle(
        fontFamily = planFontFamily,
        fontWeight = FontWeight.W500,
        fontSize = 16.sp,
        lineHeight = (16 * 1.4).sp
    )

    /**
     * - FontWeight(500) Medium
     * - FontSize(14)
     * - LineHeight(14 * 1.4)
     * */
    val B6 = TextStyle(
        fontFamily = planFontFamily,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp,
        lineHeight = (14 * 1.4).sp
    )

    /**
     * - FontWeight(400)
     * - FontSize(20)
     * - LineHeight(20 * 1.3)
     * **/
    val SubT1 = TextStyle(
        fontFamily = planFontFamily,
        fontWeight = FontWeight.W400,
        fontSize = 20.sp,
        lineHeight = (20 * 1.3).sp
    )

    /**
     * - FontWeight(400)
     * - FontSize(18)
     * - LineHeight(18 * 0.3)
     * */
    val B7 = TextStyle(
        fontFamily = planFontFamily,
        fontWeight = FontWeight.W400,
        fontSize = 18.sp,
        lineHeight = (18 * 0.3).sp
    )

    /**
     * - FontWeight(400)
     * - FontSize(16)
     * - LineHeight(16 * 1.3)
     * */
    val Cap1 = TextStyle(
        fontFamily = planFontFamily,
        fontWeight = FontWeight.W400,
        fontSize = 16.sp,
        lineHeight = (16 * 1.3).sp
    )

    /**
     * - FontWeight(400)
     * - FontSize(13)
     * - LineHeight(13 * 1.3)
     * */
    val Cap2 = TextStyle(
        fontFamily = planFontFamily,
        fontWeight = FontWeight.W400,
        fontSize = 13.sp,
        lineHeight = (13 * 1.3).sp
    )
}

// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )
)