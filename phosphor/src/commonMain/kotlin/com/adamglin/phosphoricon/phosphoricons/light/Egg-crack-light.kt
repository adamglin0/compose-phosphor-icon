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

public val LightGroup.`Egg-crack-light`: ImageVector
    get() {
        if (`_egg-crack-light` != null) {
            return `_egg-crack-light`!!
        }
        `_egg-crack-light` = Builder(name = "Egg-crack-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(185.0f, 60.67f)
                curveTo(167.18f, 34.0f, 145.87f, 18.0f, 128.0f, 18.0f)
                reflectiveCurveTo(88.82f, 34.0f, 71.0f, 60.67f)
                curveTo(52.57f, 88.32f, 42.0f, 121.61f, 42.0f, 152.0f)
                arcToRelative(86.0f, 86.0f, 0.0f, false, false, 172.0f, 0.0f)
                curveTo(214.0f, 121.61f, 203.43f, 88.32f, 185.0f, 60.67f)
                close()
                moveTo(128.0f, 226.0f)
                arcToRelative(74.09f, 74.09f, 0.0f, false, true, -74.0f, -74.0f)
                curveToRelative(0.0f, -28.08f, 9.84f, -58.94f, 27.0f, -84.67f)
                curveTo(96.11f, 44.65f, 114.56f, 30.0f, 128.0f, 30.0f)
                curveToRelative(10.52f, 0.0f, 24.12f, 9.0f, 36.78f, 23.77f)
                lineTo(123.52f, 100.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.0f, 9.82f)
                lineTo(153.0f, 116.43f)
                lineToRelative(-6.87f, 34.39f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.7f, 7.06f)
                arcTo(6.08f, 6.08f, 0.0f, false, false, 152.0f, 158.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.87f, -4.82f)
                lineToRelative(8.0f, -40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -4.42f, -7.0f)
                lineToRelative(-22.37f, -5.59f)
                lineToRelative(33.2f, -37.2f)
                quadToRelative(1.36f, 1.92f, 2.72f, 3.94f)
                curveToRelative(17.15f, 25.73f, 27.0f, 56.59f, 27.0f, 84.67f)
                arcTo(74.09f, 74.09f, 0.0f, false, true, 128.0f, 226.0f)
                close()
            }
        }
        .build()
        return `_egg-crack-light`!!
    }

private var `_egg-crack-light`: ImageVector? = null
