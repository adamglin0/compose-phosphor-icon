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

public val BoldGroup.Chat: ImageVector
    get() {
        if (_chat != null) {
            return _chat!!
        }
        _chat = Builder(name = "Chat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 44.0f)
                lineTo(40.0f, 44.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 20.0f, 64.0f)
                lineTo(20.0f, 224.0f)
                arcTo(19.82f, 19.82f, 0.0f, false, false, 31.56f, 242.1f)
                arcToRelative(20.14f, 20.14f, 0.0f, false, false, 8.49f, 1.9f)
                arcToRelative(19.91f, 19.91f, 0.0f, false, false, 12.82f, -4.72f)
                lineToRelative(0.12f, -0.11f)
                lineTo(84.47f, 212.0f)
                lineTo(216.0f, 212.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(236.0f, 64.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 216.0f, 44.0f)
                close()
                moveTo(212.0f, 188.0f)
                lineTo(80.0f, 188.0f)
                arcToRelative(11.93f, 11.93f, 0.0f, false, false, -7.84f, 2.92f)
                lineTo(44.0f, 215.23f)
                lineTo(44.0f, 68.0f)
                lineTo(212.0f, 68.0f)
                close()
            }
        }
        .build()
        return _chat!!
    }

private var _chat: ImageVector? = null
