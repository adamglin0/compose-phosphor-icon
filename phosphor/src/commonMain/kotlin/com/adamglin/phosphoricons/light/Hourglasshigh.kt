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

public val LightGroup.HourglassHigh: ImageVector
    get() {
        if (_hourglassHigh != null) {
            return _hourglassHigh!!
        }
        _hourglassHigh = Builder(name = "HourglassHigh", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(184.0f, 26.0f)
                lineTo(72.0f, 26.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 58.0f, 40.0f)
                lineTo(58.0f, 76.0f)
                arcToRelative(14.06f, 14.06f, 0.0f, false, false, 5.6f, 11.2f)
                lineTo(118.0f, 128.0f)
                lineTo(63.6f, 168.8f)
                arcTo(14.06f, 14.06f, 0.0f, false, false, 58.0f, 180.0f)
                verticalLineToRelative(36.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(184.0f, 230.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(198.0f, 180.36f)
                arcToRelative(14.08f, 14.08f, 0.0f, false, false, -5.56f, -11.17f)
                lineTo(138.0f, 128.0f)
                lineToRelative(54.49f, -41.19f)
                arcTo(14.08f, 14.08f, 0.0f, false, false, 198.0f, 75.64f)
                lineTo(198.0f, 40.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 184.0f, 26.0f)
                close()
                moveTo(72.0f, 38.0f)
                lineTo(184.0f, 38.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                lineTo(186.0f, 58.0f)
                lineTo(70.0f, 58.0f)
                lineTo(70.0f, 40.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 72.0f, 38.0f)
                close()
                moveTo(186.0f, 180.36f)
                lineTo(186.0f, 216.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(72.0f, 218.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(70.0f, 180.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.8f, -1.6f)
                lineTo(128.0f, 135.51f)
                lineToRelative(57.22f, 43.25f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 186.0f, 180.36f)
                close()
                moveTo(185.21f, 77.24f)
                lineTo(128.0f, 120.49f)
                lineTo(70.8f, 77.6f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 70.0f, 76.0f)
                lineTo(70.0f, 70.0f)
                lineTo(186.0f, 70.0f)
                verticalLineToRelative(5.64f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 185.21f, 77.24f)
                close()
            }
        }
        .build()
        return _hourglassHigh!!
    }

private var _hourglassHigh: ImageVector? = null
