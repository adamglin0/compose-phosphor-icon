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

public val BoldGroup.ChatDots: ImageVector
    get() {
        if (_chatDots != null) {
            return _chatDots!!
        }
        _chatDots = Builder(name = "ChatDots", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(88.0f, 128.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 88.0f, 128.0f)
                close()
                moveTo(152.0f, 144.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 152.0f, 144.0f)
                close()
                moveTo(236.0f, 64.0f)
                lineTo(236.0f, 192.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, 20.0f)
                lineTo(84.47f, 212.0f)
                lineTo(53.0f, 239.17f)
                lineToRelative(-0.12f, 0.11f)
                arcTo(19.91f, 19.91f, 0.0f, false, true, 40.05f, 244.0f)
                arcToRelative(20.14f, 20.14f, 0.0f, false, true, -8.49f, -1.9f)
                arcTo(19.82f, 19.82f, 0.0f, false, true, 20.0f, 224.0f)
                lineTo(20.0f, 64.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 40.0f, 44.0f)
                lineTo(216.0f, 44.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 236.0f, 64.0f)
                close()
                moveTo(212.0f, 68.0f)
                lineTo(44.0f, 68.0f)
                lineTo(44.0f, 215.23f)
                lineToRelative(28.16f, -24.32f)
                arcTo(11.93f, 11.93f, 0.0f, false, true, 80.0f, 188.0f)
                lineTo(212.0f, 188.0f)
                close()
            }
        }
        .build()
        return _chatDots!!
    }

private var _chatDots: ImageVector? = null
