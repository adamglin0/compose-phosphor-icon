package com.adamglin.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.DuotoneGroup

public val DuotoneGroup.Chatcenteredslash: ImageVector
    get() {
        if (_chatcenteredslash != null) {
            return _chatcenteredslash!!
        }
        _chatcenteredslash = Builder(name = "Chatcenteredslash", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(224.0f, 56.0f)
                verticalLineTo(184.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineTo(150.93f)
                lineToRelative(-16.0f, 28.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -13.9f, 0.0f)
                lineToRelative(-16.0f, -28.0f)
                horizontalLineTo(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                verticalLineTo(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineTo(216.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 224.0f, 56.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(53.92f, 34.62f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 40.0f, 40.0f)
                horizontalLineToRelative(0.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 56.0f)
                lineTo(24.0f, 184.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(60.43f)
                lineToRelative(13.68f, 23.94f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 27.78f, 0.0f)
                lineTo(155.57f, 200.0f)
                horizontalLineToRelative(27.07f)
                lineToRelative(19.44f, 21.38f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 11.84f, -10.76f)
                close()
                moveTo(150.92f, 184.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.0f, 4.0f)
                lineToRelative(-16.0f, 28.0f)
                lineToRelative(-16.0f, -28.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.0f, -4.0f)
                lineTo(40.0f, 184.0f)
                lineTo(40.0f, 56.0f)
                lineTo(51.73f, 56.0f)
                lineTo(168.1f, 184.0f)
                close()
                moveTo(232.0f, 56.0f)
                lineTo(232.0f, 186.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(216.0f, 56.0f)
                lineTo(98.52f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 0.0f, -16.0f)
                lineTo(216.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 232.0f, 56.0f)
                close()
            }
        }
        .build()
        return _chatcenteredslash!!
    }

private var _chatcenteredslash: ImageVector? = null
