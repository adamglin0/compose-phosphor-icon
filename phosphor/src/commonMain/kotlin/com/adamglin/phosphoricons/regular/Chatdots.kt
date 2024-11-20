package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.ChatDots: ImageVector
    get() {
        if (_chatDots != null) {
            return _chatDots!!
        }
        _chatDots = Builder(name = "ChatDots", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(116.0f, 128.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 116.0f, 128.0f)
                close()
                moveTo(84.0f, 140.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 84.0f, 140.0f)
                close()
                moveTo(172.0f, 140.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 172.0f, 140.0f)
                close()
                moveTo(232.0f, 64.0f)
                lineTo(232.0f, 192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(83.0f, 208.0f)
                lineToRelative(-32.6f, 28.16f)
                lineToRelative(-0.09f, 0.07f)
                arcTo(15.89f, 15.89f, 0.0f, false, true, 40.0f, 240.0f)
                arcToRelative(16.13f, 16.13f, 0.0f, false, true, -6.8f, -1.52f)
                arcTo(15.85f, 15.85f, 0.0f, false, true, 24.0f, 224.0f)
                lineTo(24.0f, 64.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 40.0f, 48.0f)
                lineTo(216.0f, 48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 232.0f, 64.0f)
                close()
                moveTo(40.0f, 224.0f)
                horizontalLineToRelative(0.0f)
                close()
                moveTo(216.0f, 64.0f)
                lineTo(40.0f, 64.0f)
                lineTo(40.0f, 224.0f)
                lineToRelative(34.77f, -30.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 80.0f, 192.0f)
                lineTo(216.0f, 192.0f)
                close()
            }
        }
        .build()
        return _chatDots!!
    }

private var _chatDots: ImageVector? = null
