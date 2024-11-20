package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.ChatCenteredSlash: ImageVector
    get() {
        if (_chatCenteredSlash != null) {
            return _chatCenteredSlash!!
        }
        _chatCenteredSlash = Builder(name = "ChatCenteredSlash", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 56.0f)
                verticalLineTo(184.0f)
                arcToRelative(15.93f, 15.93f, 0.0f, false, true, -4.82f, 11.42f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.68f, -0.25f)
                lineTo(86.52f, 46.69f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.0f, -6.69f)
                horizontalLineTo(216.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 232.0f, 56.0f)
                close()
                moveTo(53.92f, 34.62f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 40.0f, 40.0f)
                horizontalLineToRelative(0.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 56.0f)
                verticalLineTo(184.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(60.43f)
                lineToRelative(13.68f, 23.94f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 27.78f, 0.0f)
                lineTo(155.57f, 200.0f)
                horizontalLineToRelative(27.07f)
                lineToRelative(19.44f, 21.38f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 11.84f, -10.76f)
                close()
            }
        }
        .build()
        return _chatCenteredSlash!!
    }

private var _chatCenteredSlash: ImageVector? = null
