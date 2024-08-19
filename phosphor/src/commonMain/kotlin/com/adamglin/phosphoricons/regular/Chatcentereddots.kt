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

public val RegularGroup.Chatcentereddots: ImageVector
    get() {
        if (_chatcentereddots != null) {
            return _chatcentereddots!!
        }
        _chatcentereddots = Builder(name = "Chatcentereddots", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(116.0f, 120.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 116.0f, 120.0f)
                close()
                moveTo(84.0f, 132.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 84.0f, 132.0f)
                close()
                moveTo(172.0f, 132.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 172.0f, 132.0f)
                close()
                moveTo(232.0f, 56.0f)
                lineTo(232.0f, 184.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(155.57f, 200.0f)
                lineToRelative(-13.68f, 23.94f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -27.78f, 0.0f)
                lineTo(100.43f, 200.0f)
                lineTo(40.0f, 200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(24.0f, 56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 40.0f, 40.0f)
                lineTo(216.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 232.0f, 56.0f)
                close()
                moveTo(216.0f, 56.0f)
                lineTo(40.0f, 56.0f)
                lineTo(40.0f, 184.0f)
                horizontalLineToRelative(65.07f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 7.0f, 4.0f)
                lineToRelative(16.0f, 28.0f)
                lineToRelative(16.0f, -28.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 7.0f, -4.0f)
                lineTo(216.0f, 184.0f)
                close()
            }
        }
        .build()
        return _chatcentereddots!!
    }

private var _chatcentereddots: ImageVector? = null
