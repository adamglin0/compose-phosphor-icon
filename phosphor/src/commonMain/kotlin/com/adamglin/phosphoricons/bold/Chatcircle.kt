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

public val BoldGroup.Chatcircle: ImageVector
    get() {
        if (_chatcircle != null) {
            return _chatcircle!!
        }
        _chatcircle = Builder(name = "Chatcircle", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 20.0f)
                arcTo(108.0f, 108.0f, 0.0f, false, false, 31.85f, 177.23f)
                lineTo(21.0f, 209.66f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 46.34f, 235.0f)
                lineToRelative(32.43f, -10.81f)
                arcTo(108.0f, 108.0f, 0.0f, true, false, 128.0f, 20.0f)
                close()
                moveTo(128.0f, 212.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, false, true, -42.06f, -11.27f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -6.0f, -1.62f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, -3.8f, 0.62f)
                lineToRelative(-29.79f, 9.93f)
                lineToRelative(9.93f, -29.79f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -1.0f, -9.81f)
                arcTo(84.0f, 84.0f, 0.0f, true, true, 128.0f, 212.0f)
                close()
            }
        }
        .build()
        return _chatcircle!!
    }

private var _chatcircle: ImageVector? = null
