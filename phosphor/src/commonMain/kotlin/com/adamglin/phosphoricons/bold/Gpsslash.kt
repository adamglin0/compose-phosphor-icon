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

public val BoldGroup.GpsSlash: ImageVector
    get() {
        if (_gpsSlash != null) {
            return _gpsSlash!!
        }
        _gpsSlash = Builder(name = "GpsSlash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(252.0f, 128.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(219.21f, 140.0f)
                arcToRelative(91.65f, 91.65f, 0.0f, false, true, -3.56f, 16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -11.43f, 8.35f)
                arcToRelative(12.19f, 12.19f, 0.0f, false, true, -3.65f, -0.57f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -7.78f, -15.09f)
                arcTo(68.06f, 68.06f, 0.0f, false, false, 128.0f, 60.0f)
                arcToRelative(68.73f, 68.73f, 0.0f, false, false, -14.48f, 1.54f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -5.08f, -23.45f)
                curveToRelative(2.49f, -0.54f, 5.0f, -1.0f, 7.56f, -1.31f)
                lineTo(116.0f, 16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                lineTo(140.0f, 36.78f)
                arcTo(92.21f, 92.21f, 0.0f, false, true, 219.22f, 116.0f)
                lineTo(240.0f, 116.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 252.0f, 128.0f)
                close()
                moveTo(216.88f, 207.93f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -17.76f, 16.14f)
                lineToRelative(-18.65f, -20.51f)
                arcTo(91.6f, 91.6f, 0.0f, false, true, 140.0f, 219.2f)
                lineTo(140.0f, 240.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(116.0f, 219.22f)
                arcTo(92.21f, 92.21f, 0.0f, false, true, 36.78f, 140.0f)
                lineTo(16.0f, 140.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                lineTo(36.79f, 116.0f)
                arcToRelative(92.36f, 92.36f, 0.0f, false, true, 21.0f, -47.42f)
                lineTo(39.12f, 48.07f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 56.88f, 31.93f)
                lineTo(190.69f, 179.11f)
                horizontalLineToRelative(0.0f)
                close()
                moveTo(164.14f, 185.6f)
                lineToRelative(-90.0f, -99.0f)
                arcToRelative(68.0f, 68.0f, 0.0f, false, false, 90.0f, 99.0f)
                close()
            }
        }
        .build()
        return _gpsSlash!!
    }

private var _gpsSlash: ImageVector? = null
