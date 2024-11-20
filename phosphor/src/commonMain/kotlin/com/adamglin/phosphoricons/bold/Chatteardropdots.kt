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

public val BoldGroup.ChatTeardropDots: ImageVector
    get() {
        if (_chatTeardropDots != null) {
            return _chatTeardropDots!!
        }
        _chatTeardropDots = Builder(name = "ChatTeardropDots", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(132.0f, 20.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, false, 28.0f, 124.0f)
                verticalLineToRelative(84.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineToRelative(84.0f)
                arcToRelative(104.0f, 104.0f, 0.0f, false, false, 0.0f, -208.0f)
                close()
                moveTo(132.0f, 204.0f)
                lineTo(52.0f, 204.0f)
                lineTo(52.0f, 124.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, true, 80.0f, 80.0f)
                close()
                moveTo(124.0f, 128.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 124.0f, 128.0f)
                close()
                moveTo(172.0f, 128.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 172.0f, 128.0f)
                close()
            }
        }
        .build()
        return _chatTeardropDots!!
    }

private var _chatTeardropDots: ImageVector? = null
