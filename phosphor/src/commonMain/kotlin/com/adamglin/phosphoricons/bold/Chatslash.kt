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

public val BoldGroup.Chatslash: ImageVector
    get() {
        if (_chatslash != null) {
            return _chatslash!!
        }
        _chatslash = Builder(name = "Chatslash", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(56.88f, 31.93f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 36.8f, 44.28f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 20.0f, 64.0f)
                verticalLineTo(224.0f)
                arcTo(19.82f, 19.82f, 0.0f, false, false, 31.56f, 242.1f)
                arcToRelative(20.14f, 20.14f, 0.0f, false, false, 8.49f, 1.9f)
                arcToRelative(19.91f, 19.91f, 0.0f, false, false, 12.82f, -4.72f)
                lineToRelative(0.12f, -0.11f)
                lineTo(84.47f, 212.0f)
                horizontalLineTo(188.15f)
                lineToRelative(11.0f, 12.07f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.76f, -16.15f)
                close()
                moveTo(80.0f, 188.0f)
                arcToRelative(11.93f, 11.93f, 0.0f, false, false, -7.84f, 2.92f)
                lineTo(44.0f, 215.23f)
                verticalLineTo(68.0f)
                horizontalLineTo(57.24f)
                lineTo(166.33f, 188.0f)
                close()
                moveTo(236.0f, 64.0f)
                verticalLineTo(174.12f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                verticalLineTo(68.0f)
                horizontalLineTo(116.6f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineTo(216.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 236.0f, 64.0f)
                close()
            }
        }
        .build()
        return _chatslash!!
    }

private var _chatslash: ImageVector? = null
