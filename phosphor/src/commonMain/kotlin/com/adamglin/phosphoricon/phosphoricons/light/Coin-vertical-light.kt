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

public val LightGroup.`Coin-vertical-light`: ImageVector
    get() {
        if (`_coin-vertical-light` != null) {
            return `_coin-vertical-light`!!
        }
        `_coin-vertical-light` = Builder(name = "Coin-vertical-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(196.78f, 57.09f)
                curveTo(185.08f, 37.0f, 169.18f, 26.0f, 152.0f, 26.0f)
                lineTo(104.0f, 26.0f)
                curveTo(86.82f, 26.0f, 70.92f, 37.0f, 59.22f, 57.09f)
                curveTo(48.12f, 76.13f, 42.0f, 101.31f, 42.0f, 128.0f)
                reflectiveCurveToRelative(6.12f, 51.87f, 17.22f, 70.91f)
                curveTo(70.92f, 219.0f, 86.82f, 230.0f, 104.0f, 230.0f)
                horizontalLineToRelative(48.0f)
                curveToRelative(17.18f, 0.0f, 33.08f, -11.0f, 44.78f, -31.09f)
                curveToRelative(11.1f, -19.0f, 17.22f, -44.22f, 17.22f, -70.91f)
                reflectiveCurveTo(207.88f, 76.13f, 196.78f, 57.09f)
                close()
                moveTo(201.88f, 122.0f)
                horizontalLineToRelative(-36.0f)
                curveToRelative(-0.65f, -18.84f, -4.37f, -36.73f, -10.74f, -52.0f)
                lineTo(190.0f, 70.0f)
                curveTo(197.06f, 84.74f, 201.16f, 102.77f, 201.88f, 122.0f)
                close()
                moveTo(152.0f, 38.0f)
                curveToRelative(11.31f, 0.0f, 22.22f, 7.06f, 31.14f, 20.0f)
                lineTo(149.28f, 58.0f)
                lineToRelative(-0.5f, -0.91f)
                arcTo(76.8f, 76.8f, 0.0f, false, false, 133.49f, 38.0f)
                close()
                moveTo(69.58f, 192.86f)
                curveTo(59.54f, 175.63f, 54.0f, 152.6f, 54.0f, 128.0f)
                reflectiveCurveToRelative(5.54f, -47.63f, 15.58f, -64.86f)
                curveTo(79.0f, 46.93f, 91.26f, 38.0f, 104.0f, 38.0f)
                reflectiveCurveToRelative(25.0f, 8.93f, 34.42f, 25.14f)
                curveTo(148.46f, 80.37f, 154.0f, 103.4f, 154.0f, 128.0f)
                reflectiveCurveToRelative(-5.54f, 47.63f, -15.58f, 64.86f)
                curveTo(129.0f, 209.07f, 116.74f, 218.0f, 104.0f, 218.0f)
                reflectiveCurveTo(79.0f, 209.07f, 69.58f, 192.86f)
                close()
                moveTo(152.0f, 218.0f)
                lineTo(133.49f, 218.0f)
                arcToRelative(76.8f, 76.8f, 0.0f, false, false, 15.29f, -19.09f)
                lineToRelative(0.5f, -0.91f)
                horizontalLineToRelative(33.86f)
                curveTo(174.22f, 210.94f, 163.31f, 218.0f, 152.0f, 218.0f)
                close()
                moveTo(190.0f, 186.0f)
                lineTo(155.14f, 186.0f)
                curveToRelative(6.37f, -15.27f, 10.09f, -33.16f, 10.74f, -52.0f)
                horizontalLineToRelative(36.0f)
                curveTo(201.16f, 153.23f, 197.06f, 171.26f, 190.0f, 186.0f)
                close()
            }
        }
        .build()
        return `_coin-vertical-light`!!
    }

private var `_coin-vertical-light`: ImageVector? = null
