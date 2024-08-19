package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.Eggcrack: ImageVector
    get() {
        if (_eggcrack != null) {
            return _eggcrack!!
        }
        _eggcrack = Builder(name = "Eggcrack", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(190.0f, 57.34f)
                curveTo(171.06f, 29.0f, 147.88f, 12.0f, 128.0f, 12.0f)
                reflectiveCurveTo(84.94f, 29.0f, 66.0f, 57.34f)
                curveTo(46.94f, 86.0f, 36.0f, 120.46f, 36.0f, 152.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, false, false, 184.0f, 0.0f)
                curveTo(220.0f, 120.46f, 209.06f, 86.0f, 190.0f, 57.34f)
                close()
                moveTo(128.0f, 220.0f)
                arcToRelative(68.07f, 68.07f, 0.0f, false, true, -68.0f, -68.0f)
                curveToRelative(0.0f, -61.12f, 46.19f, -116.0f, 68.0f, -116.0f)
                curveToRelative(7.59f, 0.0f, 18.13f, 6.65f, 28.64f, 17.88f)
                lineTo(119.05f, 96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 6.0f, 19.63f)
                lineToRelative(20.9f, 5.23f)
                lineToRelative(-5.76f, 28.78f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 9.42f, 14.12f)
                arcTo(11.87f, 11.87f, 0.0f, false, false, 152.0f, 164.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.76f, -9.65f)
                lineToRelative(8.0f, -40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -8.86f, -14.0f)
                lineToRelative(-12.74f, -3.19f)
                lineToRelative(21.4f, -24.0f)
                curveTo(185.2f, 94.34f, 196.0f, 122.44f, 196.0f, 152.0f)
                arcTo(68.07f, 68.07f, 0.0f, false, true, 128.0f, 220.0f)
                close()
            }
        }
        .build()
        return _eggcrack!!
    }

private var _eggcrack: ImageVector? = null
