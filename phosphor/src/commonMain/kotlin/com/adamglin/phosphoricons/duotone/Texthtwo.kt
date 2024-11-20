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

public val DuotoneGroup.TextHTwo: ImageVector
    get() {
        if (_textHTwo != null) {
            return _textHTwo!!
        }
        _textHTwo = Builder(name = "TextHTwo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(240.0f, 72.0f)
                verticalLineTo(208.0f)
                horizontalLineTo(56.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                verticalLineTo(56.0f)
                horizontalLineTo(224.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 240.0f, 72.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineTo(192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.4f, -12.8f)
                lineToRelative(43.16f, -57.56f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, -25.54f, -19.27f)
                arcToRelative(16.28f, 16.28f, 0.0f, false, false, -2.32f, 4.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -15.08f, -5.34f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 55.73f, 29.93f)
                lineTo(208.0f, 200.0f)
                horizontalLineToRelative(32.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 248.0f, 208.0f)
                close()
                moveTo(144.0f, 48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(52.0f)
                horizontalLineTo(48.0f)
                verticalLineTo(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineTo(176.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineTo(124.0f)
                horizontalLineToRelative(88.0f)
                verticalLineToRelative(52.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineTo(56.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 144.0f, 48.0f)
                close()
            }
        }
        .build()
        return _textHTwo!!
    }

private var _textHTwo: ImageVector? = null
