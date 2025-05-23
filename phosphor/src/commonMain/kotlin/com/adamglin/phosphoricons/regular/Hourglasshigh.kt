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

public val RegularGroup.HourglassHigh: ImageVector
    get() {
        if (_hourglassHigh != null) {
            return _hourglassHigh!!
        }
        _hourglassHigh = Builder(name = "HourglassHigh", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(184.0f, 24.0f)
                lineTo(72.0f, 24.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 56.0f, 40.0f)
                lineTo(56.0f, 76.0f)
                arcToRelative(16.07f, 16.07f, 0.0f, false, false, 6.4f, 12.8f)
                lineTo(114.67f, 128.0f)
                lineTo(62.4f, 167.2f)
                arcTo(16.07f, 16.07f, 0.0f, false, false, 56.0f, 180.0f)
                verticalLineToRelative(36.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(184.0f, 232.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(200.0f, 180.36f)
                arcToRelative(16.09f, 16.09f, 0.0f, false, false, -6.35f, -12.77f)
                lineTo(141.27f, 128.0f)
                lineToRelative(52.38f, -39.6f)
                arcTo(16.05f, 16.05f, 0.0f, false, false, 200.0f, 75.64f)
                lineTo(200.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 184.0f, 24.0f)
                close()
                moveTo(184.0f, 40.0f)
                lineTo(184.0f, 56.0f)
                lineTo(72.0f, 56.0f)
                lineTo(72.0f, 40.0f)
                close()
                moveTo(184.0f, 216.0f)
                lineTo(72.0f, 216.0f)
                lineTo(72.0f, 180.0f)
                lineToRelative(56.0f, -42.0f)
                lineToRelative(56.0f, 42.35f)
                close()
                moveTo(128.0f, 118.0f)
                lineTo(72.0f, 76.0f)
                lineTo(72.0f, 72.0f)
                lineTo(184.0f, 72.0f)
                verticalLineToRelative(3.64f)
                close()
            }
        }
        .build()
        return _hourglassHigh!!
    }

private var _hourglassHigh: ImageVector? = null
