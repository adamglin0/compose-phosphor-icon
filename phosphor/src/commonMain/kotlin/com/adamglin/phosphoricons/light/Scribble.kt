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

public val LightGroup.Scribble: ImageVector
    get() {
        if (_scribble != null) {
            return _scribble!!
        }
        _scribble = Builder(name = "Scribble", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(204.25f, 188.24f)
                arcToRelative(16.63f, 16.63f, 0.0f, false, false, 0.0f, 23.52f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -8.48f, 8.48f)
                arcToRelative(28.61f, 28.61f, 0.0f, false, true, 0.0f, -40.48f)
                lineToRelative(9.37f, -9.38f)
                arcToRelative(16.63f, 16.63f, 0.0f, false, false, -23.52f, -23.51f)
                lineToRelative(-66.75f, 66.75f)
                arcToRelative(28.63f, 28.63f, 0.0f, false, true, -40.49f, -40.49f)
                lineToRelative(98.76f, -98.75f)
                arcToRelative(16.63f, 16.63f, 0.0f, false, false, -23.52f, -23.51f)
                lineTo(82.86f, 117.62f)
                arcTo(28.63f, 28.63f, 0.0f, false, true, 42.37f, 77.13f)
                lineTo(83.75f, 35.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 8.49f, 8.48f)
                lineTo(50.86f, 85.62f)
                arcToRelative(16.63f, 16.63f, 0.0f, false, false, 23.52f, 23.51f)
                lineToRelative(66.75f, -66.75f)
                arcToRelative(28.63f, 28.63f, 0.0f, false, true, 40.49f, 40.49f)
                lineTo(82.86f, 181.62f)
                arcToRelative(16.63f, 16.63f, 0.0f, false, false, 23.52f, 23.51f)
                lineToRelative(66.76f, -66.75f)
                arcToRelative(28.63f, 28.63f, 0.0f, false, true, 40.49f, 40.49f)
                close()
            }
        }
        .build()
        return _scribble!!
    }

private var _scribble: ImageVector? = null
