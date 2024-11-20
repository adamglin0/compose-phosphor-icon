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

public val BoldGroup.WheelchairMotion: ImageVector
    get() {
        if (_wheelchairMotion != null) {
            return _wheelchairMotion!!
        }
        _wheelchairMotion = Builder(name = "WheelchairMotion", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.0f, 84.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, -36.0f, -36.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 176.0f, 84.0f)
                close()
                moveTo(176.0f, 36.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 176.0f, 36.0f)
                close()
                moveTo(205.28f, 132.39f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 2.49f, 10.0f)
                lineToRelative(-16.0f, 80.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 180.0f, 232.0f)
                arcToRelative(11.87f, 11.87f, 0.0f, false, true, -2.36f, -0.23f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -9.42f, -14.12f)
                lineTo(181.36f, 152.0f)
                lineTo(124.0f, 152.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -10.4f, -18.0f)
                lineToRelative(17.92f, -31.2f)
                arcToRelative(76.1f, 76.1f, 0.0f, false, false, -79.88f, 10.55f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 36.36f, 94.86f)
                arcToRelative(100.0f, 100.0f, 0.0f, false, true, 118.19f, -6.68f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 3.85f, 16.0f)
                lineTo(144.74f, 128.0f)
                lineTo(196.0f, 128.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 205.28f, 132.39f)
                close()
                moveTo(163.81f, 176.91f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, true, -73.64f, -68.16f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 3.66f, 23.72f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, 46.05f, 42.62f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 23.93f, 1.82f)
                close()
            }
        }
        .build()
        return _wheelchairMotion!!
    }

private var _wheelchairMotion: ImageVector? = null
