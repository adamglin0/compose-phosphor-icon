package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.Champagne: ImageVector
    get() {
        if (_champagne != null) {
            return _champagne!!
        }
        _champagne = Builder(name = "Champagne", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(184.0f, 20.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 184.0f, 20.0f)
                close()
                moveTo(164.12f, 73.23f)
                curveToRelative(7.26f, 44.25f, 4.35f, 75.76f, -8.66f, 93.66f)
                arcTo(39.94f, 39.94f, 0.0f, false, true, 128.0f, 183.42f)
                lineTo(128.0f, 232.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(96.0f, 248.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(16.0f)
                lineTo(112.0f, 183.42f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, -27.46f, -16.53f)
                curveToRelative(-13.0f, -17.9f, -15.91f, -49.41f, -8.65f, -93.66f)
                arcTo(451.0f, 451.0f, 0.0f, false, true, 90.1f, 13.53f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 97.71f, 8.0f)
                lineTo(142.3f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 7.61f, 5.53f)
                arcTo(451.0f, 451.0f, 0.0f, false, true, 164.12f, 73.23f)
                close()
                moveTo(93.8f, 64.0f)
                horizontalLineToRelative(52.4f)
                curveToRelative(-3.0f, -15.58f, -6.72f, -29.81f, -9.78f, -40.0f)
                lineTo(103.59f, 24.0f)
                curveTo(100.53f, 34.19f, 96.83f, 48.42f, 93.8f, 64.0f)
                close()
                moveTo(149.0f, 80.0f)
                lineTo(91.0f, 80.0f)
                curveToRelative(-4.49f, 30.0f, -5.14f, 61.54f, 6.45f, 77.49f)
                curveTo(102.63f, 164.56f, 110.0f, 168.0f, 120.0f, 168.0f)
                reflectiveCurveToRelative(17.38f, -3.44f, 22.52f, -10.51f)
                curveTo(154.1f, 141.54f, 153.46f, 110.0f, 149.0f, 80.0f)
                close()
                moveTo(220.0f, 40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 220.0f, 40.0f)
                close()
                moveTo(196.0f, 88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 196.0f, 88.0f)
                close()
            }
        }
        .build()
        return _champagne!!
    }

private var _champagne: ImageVector? = null
