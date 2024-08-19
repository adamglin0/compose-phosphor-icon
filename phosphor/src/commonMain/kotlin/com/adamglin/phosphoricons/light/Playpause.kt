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

public val LightGroup.Playpause: ImageVector
    get() {
        if (_playpause != null) {
            return _playpause!!
        }
        _playpause = Builder(name = "Playpause", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(182.0f, 64.0f)
                lineTo(182.0f, 192.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(170.0f, 64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                close()
                moveTo(224.0f, 58.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                lineTo(218.0f, 192.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(230.0f, 64.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 224.0f, 58.0f)
                close()
                moveTo(142.0f, 128.0f)
                arcToRelative(13.77f, 13.77f, 0.0f, false, true, -6.41f, 11.65f)
                lineTo(47.41f, 195.8f)
                arcTo(13.91f, 13.91f, 0.0f, false, true, 26.0f, 184.15f)
                lineTo(26.0f, 71.85f)
                arcTo(13.91f, 13.91f, 0.0f, false, true, 47.41f, 60.2f)
                lineToRelative(88.18f, 56.15f)
                arcTo(13.77f, 13.77f, 0.0f, false, true, 142.0f, 128.0f)
                close()
                moveTo(130.0f, 128.0f)
                arcToRelative(1.77f, 1.77f, 0.0f, false, false, -0.85f, -1.53f)
                lineTo(41.0f, 70.32f)
                arcToRelative(1.87f, 1.87f, 0.0f, false, false, -1.0f, -0.32f)
                arcToRelative(2.13f, 2.13f, 0.0f, false, false, -1.0f, 0.25f)
                arcToRelative(1.76f, 1.76f, 0.0f, false, false, -1.0f, 1.6f)
                verticalLineToRelative(112.3f)
                arcToRelative(1.76f, 1.76f, 0.0f, false, false, 1.0f, 1.6f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, false, 2.0f, -0.07f)
                lineToRelative(88.19f, -56.15f)
                arcTo(1.77f, 1.77f, 0.0f, false, false, 130.0f, 128.0f)
                close()
            }
        }
        .build()
        return _playpause!!
    }

private var _playpause: ImageVector? = null
