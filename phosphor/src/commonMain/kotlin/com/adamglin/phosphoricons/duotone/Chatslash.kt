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

public val DuotoneGroup.ChatSlash: ImageVector
    get() {
        if (_chatSlash != null) {
            return _chatSlash!!
        }
        _chatSlash = Builder(name = "ChatSlash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(224.0f, 64.0f)
                verticalLineTo(192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineTo(80.0f)
                lineTo(45.15f, 230.11f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 32.0f, 224.0f)
                verticalLineTo(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineTo(216.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 224.0f, 64.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(53.92f, 34.62f)
                arcTo(8.0f, 8.0f, 0.0f, true, false, 42.08f, 45.38f)
                lineTo(44.46f, 48.0f)
                horizontalLineTo(40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 64.0f)
                verticalLineTo(224.0f)
                arcToRelative(15.85f, 15.85f, 0.0f, false, false, 9.24f, 14.5f)
                arcTo(16.13f, 16.13f, 0.0f, false, false, 40.0f, 240.0f)
                arcToRelative(15.94f, 15.94f, 0.0f, false, false, 10.26f, -3.78f)
                lineToRelative(0.08f, -0.07f)
                lineTo(83.0f, 208.0f)
                horizontalLineTo(189.92f)
                lineToRelative(12.16f, 13.38f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 11.84f, -10.76f)
                close()
                moveTo(80.0f, 192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.23f, 1.95f)
                lineTo(40.0f, 224.0f)
                verticalLineTo(64.0f)
                horizontalLineTo(59.0f)
                lineTo(175.37f, 192.0f)
                close()
                moveTo(232.0f, 64.0f)
                verticalLineTo(186.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                verticalLineTo(64.0f)
                horizontalLineTo(105.79f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineTo(216.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 232.0f, 64.0f)
                close()
            }
        }
        .build()
        return _chatSlash!!
    }

private var _chatSlash: ImageVector? = null
