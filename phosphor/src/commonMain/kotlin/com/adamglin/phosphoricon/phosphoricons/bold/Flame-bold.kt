package com.adamglin.phosphoricon.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.BoldGroup

public val BoldGroup.`Flame-bold`: ImageVector
    get() {
        if (`_flame-bold` != null) {
            return `_flame-bold`!!
        }
        `_flame-bold` = Builder(name = "Flame-bold", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.69f, 48.72f)
                arcToRelative(225.0f, 225.0f, 0.0f, false, false, -42.52f, -35.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.34f, 0.0f)
                arcToRelative(225.0f, 225.0f, 0.0f, false, false, -42.52f, 35.0f)
                curveTo(51.0f, 78.47f, 36.0f, 111.42f, 36.0f, 144.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, false, false, 184.0f, 0.0f)
                curveTo(220.0f, 111.42f, 205.0f, 78.47f, 176.69f, 48.72f)
                close()
                moveTo(100.0f, 184.0f)
                curveToRelative(0.0f, -13.33f, 5.53f, -26.26f, 16.45f, -38.45f)
                arcTo(93.0f, 93.0f, 0.0f, false, true, 128.0f, 134.72f)
                arcToRelative(93.0f, 93.0f, 0.0f, false, true, 11.55f, 10.83f)
                curveTo(150.47f, 157.74f, 156.0f, 170.67f, 156.0f, 184.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -56.0f, 0.0f)
                close()
                moveTo(179.84f, 187.94f)
                curveToRelative(0.09f, -1.3f, 0.16f, -2.61f, 0.16f, -3.94f)
                curveToRelative(0.0f, -46.26f, -44.0f, -73.17f, -45.83f, -74.29f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.34f, 0.0f)
                curveTo(120.0f, 110.83f, 76.0f, 137.74f, 76.0f, 184.0f)
                curveToRelative(0.0f, 1.33f, 0.07f, 2.64f, 0.16f, 3.94f)
                arcTo(67.68f, 67.68f, 0.0f, false, true, 60.0f, 144.0f)
                curveToRelative(0.0f, -26.52f, 12.21f, -52.86f, 36.28f, -78.3f)
                arcTo(213.07f, 213.07f, 0.0f, false, true, 128.0f, 38.39f)
                curveTo(145.82f, 50.86f, 196.0f, 90.71f, 196.0f, 144.0f)
                arcTo(67.68f, 67.68f, 0.0f, false, true, 179.84f, 187.94f)
                close()
            }
        }
        .build()
        return `_flame-bold`!!
    }

private var `_flame-bold`: ImageVector? = null
