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

public val BoldGroup.ChatCentered: ImageVector
    get() {
        if (_chatCentered != null) {
            return _chatCentered!!
        }
        _chatCentered = Builder(name = "ChatCentered", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 36.0f)
                lineTo(40.0f, 36.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 20.0f, 56.0f)
                lineTo(20.0f, 184.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(98.11f, 204.0f)
                lineToRelative(12.52f, 21.92f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 34.74f, 0.0f)
                lineTo(157.89f, 204.0f)
                lineTo(216.0f, 204.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(236.0f, 56.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 216.0f, 36.0f)
                close()
                moveTo(212.0f, 180.0f)
                lineTo(150.93f, 180.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -10.42f, 6.05f)
                lineTo(128.0f, 207.94f)
                lineToRelative(-12.51f, -21.89f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 105.07f, 180.0f)
                lineTo(44.0f, 180.0f)
                lineTo(44.0f, 60.0f)
                lineTo(212.0f, 60.0f)
                close()
            }
        }
        .build()
        return _chatCentered!!
    }

private var _chatCentered: ImageVector? = null
