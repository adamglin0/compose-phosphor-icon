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

public val LightGroup.Chatteardrop: ImageVector
    get() {
        if (_chatteardrop != null) {
            return _chatteardrop!!
        }
        _chatteardrop = Builder(name = "Chatteardrop", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(132.0f, 26.0f)
                arcToRelative(98.11f, 98.11f, 0.0f, false, false, -98.0f, 98.0f)
                verticalLineToRelative(84.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                horizontalLineToRelative(84.0f)
                arcToRelative(98.0f, 98.0f, 0.0f, false, false, 0.0f, -196.0f)
                close()
                moveTo(132.0f, 210.0f)
                lineTo(48.0f, 210.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(46.0f, 124.0f)
                arcToRelative(86.0f, 86.0f, 0.0f, true, true, 86.0f, 86.0f)
                close()
            }
        }
        .build()
        return _chatteardrop!!
    }

private var _chatteardrop: ImageVector? = null
