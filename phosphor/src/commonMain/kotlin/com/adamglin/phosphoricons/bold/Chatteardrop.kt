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

public val BoldGroup.Chatteardrop: ImageVector
    get() {
        if (_chatteardrop != null) {
            return _chatteardrop!!
        }
        _chatteardrop = Builder(name = "Chatteardrop", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
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
            }
        }
        .build()
        return _chatteardrop!!
    }

private var _chatteardrop: ImageVector? = null