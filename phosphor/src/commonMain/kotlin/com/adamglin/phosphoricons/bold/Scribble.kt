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

public val BoldGroup.Scribble: ImageVector
    get() {
        if (_scribble != null) {
            return _scribble!!
        }
        _scribble = Builder(name = "Scribble", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.5f, 192.49f)
                arcToRelative(10.6f, 10.6f, 0.0f, false, false, 0.0f, 15.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, 17.0f)
                arcToRelative(34.62f, 34.62f, 0.0f, false, true, 0.0f, -49.0f)
                lineToRelative(9.37f, -9.37f)
                arcToRelative(10.63f, 10.63f, 0.0f, false, false, -15.0f, -15.0f)
                lineToRelative(-66.76f, 66.75f)
                arcToRelative(34.63f, 34.63f, 0.0f, false, true, -49.0f, -49.0f)
                lineToRelative(98.76f, -98.75f)
                arcToRelative(10.63f, 10.63f, 0.0f, false, false, -15.0f, -15.0f)
                lineTo(87.11f, 121.86f)
                arcToRelative(34.63f, 34.63f, 0.0f, false, true, -49.0f, -49.0f)
                lineTo(79.51f, 31.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 17.0f, 17.0f)
                lineTo(55.1f, 89.86f)
                arcToRelative(10.63f, 10.63f, 0.0f, false, false, 15.0f, 15.0f)
                lineToRelative(66.76f, -66.75f)
                arcToRelative(34.63f, 34.63f, 0.0f, true, true, 49.0f, 49.0f)
                lineTo(87.11f, 185.86f)
                arcToRelative(10.63f, 10.63f, 0.0f, false, false, 15.0f, 15.0f)
                lineToRelative(66.75f, -66.75f)
                arcToRelative(34.63f, 34.63f, 0.0f, false, true, 49.0f, 49.0f)
                close()
            }
        }
        .build()
        return _scribble!!
    }

private var _scribble: ImageVector? = null
