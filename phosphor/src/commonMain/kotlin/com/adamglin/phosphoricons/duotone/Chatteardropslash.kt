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

public val DuotoneGroup.ChatTeardropSlash: ImageVector
    get() {
        if (_chatTeardropSlash != null) {
            return _chatTeardropSlash!!
        }
        _chatTeardropSlash = Builder(name = "ChatTeardropSlash", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(224.0f, 124.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, false, true, -92.0f, 92.0f)
                horizontalLineTo(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                verticalLineTo(124.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, false, true, 92.0f, -92.0f)
                horizontalLineToRelative(0.0f)
                arcTo(92.0f, 92.0f, 0.0f, false, true, 224.0f, 124.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(53.92f, 34.62f)
                arcTo(8.0f, 8.0f, 0.0f, true, false, 42.08f, 45.38f)
                lineToRelative(13.18f, 14.5f)
                arcTo(99.39f, 99.39f, 0.0f, false, false, 32.0f, 124.0f)
                verticalLineToRelative(84.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(84.0f)
                arcToRelative(100.33f, 100.33f, 0.0f, false, false, 56.53f, -17.53f)
                lineToRelative(13.55f, 14.91f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 11.84f, -10.76f)
                close()
                moveTo(132.0f, 208.0f)
                lineTo(48.0f, 208.0f)
                lineTo(48.0f, 124.0f)
                arcTo(83.46f, 83.46f, 0.0f, false, true, 66.15f, 71.85f)
                lineTo(177.66f, 194.51f)
                arcTo(83.0f, 83.0f, 0.0f, false, true, 132.0f, 208.0f)
                close()
                moveTo(232.0f, 124.0f)
                arcToRelative(99.87f, 99.87f, 0.0f, false, true, -14.35f, 51.65f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -13.7f, -8.28f)
                arcTo(84.0f, 84.0f, 0.0f, false, false, 95.66f, 48.25f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.94f, -14.42f)
                arcTo(100.0f, 100.0f, 0.0f, false, true, 232.0f, 124.0f)
                close()
            }
        }
        .build()
        return _chatTeardropSlash!!
    }

private var _chatTeardropSlash: ImageVector? = null
