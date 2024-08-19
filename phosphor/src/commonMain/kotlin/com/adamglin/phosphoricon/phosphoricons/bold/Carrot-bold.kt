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

public val BoldGroup.`Carrot-bold`: ImageVector
    get() {
        if (`_carrot-bold` != null) {
            return `_carrot-bold`!!
        }
        `_carrot-bold` = Builder(name = "Carrot-bold", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 60.0f)
                lineTo(213.0f, 60.0f)
                lineToRelative(19.51f, -19.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -17.0f, -17.0f)
                lineTo(196.0f, 43.0f)
                lineTo(196.0f, 24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                lineTo(172.0f, 50.0f)
                arcTo(68.0f, 68.0f, 0.0f, false, false, 96.0f, 63.87f)
                lineToRelative(0.0f, 0.0f)
                horizontalLineToRelative(0.0f)
                lineToRelative(0.0f, 0.0f)
                curveTo(55.45f, 103.68f, 25.18f, 197.0f, 21.78f, 207.77f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 40.0f, 236.0f)
                arcToRelative(20.12f, 20.12f, 0.0f, false, false, 8.24f, -1.78f)
                curveToRelative(7.64f, -2.42f, 56.79f, -18.34f, 98.91f, -41.82f)
                lineToRelative(0.54f, -0.3f)
                curveToRelative(17.1f, -9.57f, 33.0f, -20.39f, 44.44f, -32.0f)
                arcTo(68.0f, 68.0f, 0.0f, false, false, 206.0f, 84.0f)
                horizontalLineToRelative(26.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(175.11f, 143.12f)
                lineTo(175.02f, 143.21f)
                curveToRelative(-8.11f, 8.28f, -19.11f, 16.2f, -31.33f, 23.52f)
                lineToRelative(-23.21f, -23.21f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -17.0f, 17.0f)
                lineToRelative(18.22f, 18.22f)
                curveToRelative(-30.29f, 15.17f, -62.13f, 26.42f, -75.26f, 30.82f)
                curveToRelative(6.77f, -20.22f, 29.79f, -84.8f, 58.34f, -119.74f)
                lineToRelative(30.7f, 30.7f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 17.0f, -17.0f)
                lineTo(122.54f, 73.58f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, true, 52.57f, 69.54f)
                close()
            }
        }
        .build()
        return `_carrot-bold`!!
    }

private var `_carrot-bold`: ImageVector? = null
