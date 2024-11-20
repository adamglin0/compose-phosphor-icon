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

public val LightGroup.Pinwheel: ImageVector
    get() {
        if (_pinwheel != null) {
            return _pinwheel!!
        }
        _pinwheel = Builder(name = "Pinwheel", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.24f, 219.76f)
                lineTo(177.38f, 168.9f)
                arcToRelative(60.19f, 60.19f, 0.0f, false, false, 6.45f, -1.92f)
                arcToRelative(58.0f, 58.0f, 0.0f, false, false, 34.66f, -74.34f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -7.69f, -3.58f)
                lineTo(161.5f, 107.0f)
                arcToRelative(60.16f, 60.16f, 0.0f, false, false, 3.54f, -6.46f)
                arcToRelative(58.0f, 58.0f, 0.0f, false, false, -72.4f, -79.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -3.58f, 7.69f)
                lineTo(107.0f, 78.52f)
                arcTo(60.16f, 60.16f, 0.0f, false, false, 100.54f, 75.0f)
                arcToRelative(58.0f, 58.0f, 0.0f, false, false, -79.0f, 72.4f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.1f, 3.38f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.59f, 0.2f)
                lineTo(78.52f, 133.0f)
                arcTo(58.3f, 58.3f, 0.0f, false, false, 75.0f, 139.48f)
                arcTo(58.06f, 58.06f, 0.0f, false, false, 127.5f, 222.0f)
                arcToRelative(58.25f, 58.25f, 0.0f, false, false, 19.88f, -3.53f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 151.0f, 210.8f)
                lineTo(133.0f, 161.5f)
                arcTo(57.8f, 57.8f, 0.0f, false, false, 162.0f, 170.45f)
                lineToRelative(57.79f, 57.79f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.48f, -8.48f)
                close()
                moveTo(102.52f, 31.11f)
                arcToRelative(46.0f, 46.0f, 0.0f, false, true, 31.2f, 85.72f)
                close()
                moveTo(31.11f, 137.5f)
                arcToRelative(46.0f, 46.0f, 0.0f, false, true, 85.72f, -31.2f)
                close()
                moveTo(137.5f, 208.9f)
                arcToRelative(46.0f, 46.0f, 0.0f, false, true, -31.2f, -85.72f)
                close()
                moveTo(164.45f, 158.49f)
                arcToRelative(46.07f, 46.07f, 0.0f, false, true, -41.27f, -24.77f)
                lineToRelative(85.72f, -31.2f)
                arcToRelative(46.06f, 46.06f, 0.0f, false, true, -44.39f, 56.0f)
                close()
            }
        }
        .build()
        return _pinwheel!!
    }

private var _pinwheel: ImageVector? = null
