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

public val LightGroup.Eject: ImageVector
    get() {
        if (_eject != null) {
            return _eject!!
        }
        _eject = Builder(name = "Eject", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 154.0f)
                lineTo(48.0f, 154.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, 14.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(208.0f, 206.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(222.0f, 168.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 208.0f, 154.0f)
                close()
                moveTo(210.0f, 192.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(48.0f, 194.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(46.0f, 168.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                lineTo(208.0f, 166.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                close()
                moveTo(48.24f, 134.0f)
                lineTo(207.76f, 134.0f)
                arcToRelative(14.19f, 14.19f, 0.0f, false, false, 13.1f, -8.55f)
                arcToRelative(13.61f, 13.61f, 0.0f, false, false, -2.72f, -15.0f)
                lineTo(144.41f, 33.0f)
                arcToRelative(22.76f, 22.76f, 0.0f, false, false, -32.82f, 0.0f)
                lineTo(37.86f, 110.5f)
                arcToRelative(13.61f, 13.61f, 0.0f, false, false, -2.72f, 15.0f)
                arcTo(14.19f, 14.19f, 0.0f, false, false, 48.24f, 134.0f)
                close()
                moveTo(46.55f, 118.77f)
                lineTo(120.28f, 41.26f)
                arcToRelative(10.77f, 10.77f, 0.0f, false, true, 15.44f, 0.0f)
                lineToRelative(73.73f, 77.51f)
                arcToRelative(1.67f, 1.67f, 0.0f, false, true, 0.38f, 2.0f)
                arcToRelative(2.11f, 2.11f, 0.0f, false, true, -2.07f, 1.27f)
                lineTo(48.24f, 122.04f)
                arcToRelative(2.11f, 2.11f, 0.0f, false, true, -2.07f, -1.27f)
                arcTo(1.67f, 1.67f, 0.0f, false, true, 46.55f, 118.77f)
                close()
            }
        }
        .build()
        return _eject!!
    }

private var _eject: ImageVector? = null
