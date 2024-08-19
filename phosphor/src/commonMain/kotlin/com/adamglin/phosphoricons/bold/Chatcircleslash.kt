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

public val BoldGroup.Chatcircleslash: ImageVector
    get() {
        if (_chatcircleslash != null) {
            return _chatcircleslash!!
        }
        _chatcircleslash = Builder(name = "Chatcircleslash", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(56.88f, 31.93f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 39.12f, 48.07f)
                lineToRelative(7.81f, 8.59f)
                arcTo(108.0f, 108.0f, 0.0f, false, false, 31.85f, 177.23f)
                lineTo(21.0f, 209.66f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 46.34f, 235.0f)
                lineToRelative(32.43f, -10.81f)
                arcToRelative(108.08f, 108.08f, 0.0f, false, false, 112.55f, -8.66f)
                lineToRelative(7.8f, 8.58f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.76f, -16.14f)
                close()
                moveTo(128.0f, 212.0f)
                arcToRelative(83.91f, 83.91f, 0.0f, false, true, -42.0f, -11.27f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -9.82f, -1.0f)
                lineToRelative(-29.79f, 9.93f)
                lineToRelative(9.93f, -29.79f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -1.0f, -9.82f)
                arcToRelative(84.0f, 84.0f, 0.0f, false, true, 7.94f, -95.49f)
                lineToRelative(111.84f, 123.0f)
                arcTo(83.83f, 83.83f, 0.0f, false, true, 128.0f, 212.0f)
                close()
                moveTo(236.0f, 128.0f)
                arcToRelative(107.22f, 107.22f, 0.0f, false, true, -8.65f, 42.4f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 205.28f, 161.0f)
                arcToRelative(84.07f, 84.07f, 0.0f, false, false, -102.77f, -113.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -7.27f, -22.87f)
                arcTo(108.08f, 108.08f, 0.0f, false, true, 236.0f, 128.0f)
                close()
            }
        }
        .build()
        return _chatcircleslash!!
    }

private var _chatcircleslash: ImageVector? = null
