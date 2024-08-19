package com.adamglin.phosphoricon.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.LightGroup

public val LightGroup.`Money-wavy-light`: ImageVector
    get() {
        if (`_money-wavy-light` != null) {
            return `_money-wavy-light`!!
        }
        `_money-wavy-light` = Builder(name = "Money-wavy-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(243.18f, 61.72f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.81f, -0.3f)
                curveToRelative(-43.66f, 21.32f, -74.69f, 11.39f, -107.54f, 0.88f)
                curveTo(96.16f, 51.53f, 61.35f, 40.4f, 13.37f, 63.84f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 10.0f, 69.23f)
                verticalLineToRelative(120.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.63f, 5.39f)
                curveToRelative(43.66f, -21.32f, 74.69f, -11.39f, 107.54f, -0.88f)
                curveToRelative(19.0f, 6.09f, 38.46f, 12.3f, 60.42f, 12.3f)
                curveToRelative(16.85f, 0.0f, 35.21f, -3.66f, 56.0f, -13.84f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.37f, -5.39f)
                verticalLineToRelative(-120.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 243.18f, 61.72f)
                close()
                moveTo(234.0f, 183.0f)
                curveToRelative(-41.9f, 19.21f, -72.17f, 9.53f, -104.17f, -0.71f)
                curveTo(110.78f, 176.18f, 91.37f, 170.0f, 69.41f, 170.0f)
                curveToRelative(-14.49f, 0.0f, -30.08f, 2.7f, -47.41f, 9.92f)
                lineTo(22.0f, 73.0f)
                curveToRelative(41.9f, -19.21f, 72.17f, -9.53f, 104.17f, 0.71f)
                curveTo(157.78f, 83.84f, 190.41f, 94.28f, 234.0f, 76.11f)
                close()
                moveTo(128.0f, 98.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, true, false, 30.0f, 30.0f)
                arcTo(30.0f, 30.0f, 0.0f, false, false, 128.0f, 98.0f)
                close()
                moveTo(128.0f, 146.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, 18.0f, -18.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 128.0f, 146.0f)
                close()
                moveTo(54.0f, 96.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(42.0f, 96.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 12.0f, 0.0f)
                close()
                moveTo(202.0f, 160.0f)
                lineTo(202.0f, 112.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                close()
            }
        }
        .build()
        return `_money-wavy-light`!!
    }

private var `_money-wavy-light`: ImageVector? = null
