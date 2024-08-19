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

public val BoldGroup.Chatcenteredslash: ImageVector
    get() {
        if (_chatcenteredslash != null) {
            return _chatcenteredslash!!
        }
        _chatcenteredslash = Builder(name = "Chatcenteredslash", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(56.88f, 31.93f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -20.29f, 4.38f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 20.0f, 56.0f)
                verticalLineTo(184.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineTo(98.11f)
                lineToRelative(12.52f, 21.92f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 34.73f, 0.0f)
                lineTo(157.89f, 204.0f)
                horizontalLineToRelative(23.0f)
                lineToRelative(18.25f, 20.07f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.76f, -16.14f)
                close()
                moveTo(150.93f, 180.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -10.42f, 6.05f)
                lineTo(128.0f, 207.94f)
                lineToRelative(-12.51f, -21.89f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 105.07f, 180.0f)
                horizontalLineTo(44.0f)
                verticalLineTo(60.0f)
                horizontalLineToRelative(6.0f)
                lineToRelative(109.1f, 120.0f)
                close()
                moveTo(236.0f, 56.0f)
                verticalLineTo(174.14f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                verticalLineTo(60.0f)
                horizontalLineTo(109.33f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 0.0f, -24.0f)
                horizontalLineTo(216.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 236.0f, 56.0f)
                close()
            }
        }
        .build()
        return _chatcenteredslash!!
    }

private var _chatcenteredslash: ImageVector? = null
