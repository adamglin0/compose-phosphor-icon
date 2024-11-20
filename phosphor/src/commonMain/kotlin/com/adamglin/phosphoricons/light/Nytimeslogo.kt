package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.NyTimesLogo: ImageVector
    get() {
        if (_nyTimesLogo != null) {
            return _nyTimesLogo!!
        }
        _nyTimesLogo = Builder(name = "NyTimesLogo", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(172.0f, 138.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 172.0f, 138.0f)
                close()
                moveTo(185.46f, 101.44f)
                lineTo(119.24f, 70.53f)
                arcTo(74.0f, 74.0f, 0.0f, false, false, 54.0f, 144.0f)
                curveToRelative(0.0f, 0.22f, 0.0f, 0.44f, 0.0f, 0.66f)
                lineToRelative(71.16f, -37.95f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 134.0f, 112.0f)
                lineTo(134.0f, 217.76f)
                arcToRelative(73.63f, 73.63f, 0.0f, false, false, 64.61f, -51.56f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 11.45f, 3.6f)
                arcTo(86.0f, 86.0f, 0.0f, true, true, 54.57f, 99.23f)
                arcTo(34.0f, 34.0f, 0.0f, false, true, 68.0f, 34.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 2.54f, 0.56f)
                lineTo(189.26f, 90.0f)
                arcTo(22.0f, 22.0f, 0.0f, false, false, 188.0f, 46.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, true, 0.0f, 68.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 185.46f, 101.44f)
                close()
                moveTo(102.0f, 213.27f)
                arcToRelative(73.47f, 73.47f, 0.0f, false, false, 20.0f, 4.47f)
                lineTo(122.0f, 122.0f)
                lineToRelative(-20.0f, 10.67f)
                close()
                moveTo(55.27f, 157.59f)
                arcTo(74.22f, 74.22f, 0.0f, false, false, 90.0f, 207.47f)
                verticalLineToRelative(-68.4f)
                close()
                moveTo(101.41f, 62.21f)
                lineTo(66.74f, 46.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, -4.93f, 43.05f)
                curveToRelative(0.86f, -1.0f, 1.75f, -2.06f, 2.67f, -3.07f)
                arcTo(86.0f, 86.0f, 0.0f, false, true, 101.41f, 62.21f)
                close()
            }
        }
        .build()
        return _nyTimesLogo!!
    }

private var _nyTimesLogo: ImageVector? = null
