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

public val FillGroup.ChatSlash: ImageVector
    get() {
        if (_chatSlash != null) {
            return _chatSlash!!
        }
        _chatSlash = Builder(name = "ChatSlash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(213.92f, 210.61f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -11.84f, 10.76f)
                lineTo(189.92f, 208.0f)
                horizontalLineTo(83.0f)
                lineToRelative(-32.6f, 28.16f)
                lineToRelative(-0.08f, 0.07f)
                arcTo(15.94f, 15.94f, 0.0f, false, true, 40.0f, 240.0f)
                arcToRelative(16.13f, 16.13f, 0.0f, false, true, -6.8f, -1.52f)
                arcTo(15.85f, 15.85f, 0.0f, false, true, 24.0f, 224.0f)
                verticalLineTo(64.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 40.0f, 48.0f)
                horizontalLineToRelative(4.46f)
                lineToRelative(-2.38f, -2.62f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 53.92f, 34.62f)
                close()
                moveTo(216.0f, 48.0f)
                horizontalLineTo(96.75f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.0f, 6.69f)
                lineTo(225.0f, 199.06f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 7.0f, -2.69f)
                verticalLineTo(64.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 216.0f, 48.0f)
                close()
            }
        }
        .build()
        return _chatSlash!!
    }

private var _chatSlash: ImageVector? = null
