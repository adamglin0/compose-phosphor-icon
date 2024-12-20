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

public val DuotoneGroup.TextAUnderline: ImageVector
    get() {
        if (_textAUnderline != null) {
            return _textAUnderline!!
        }
        _textAUnderline = Builder(name = "TextAUnderline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(173.18f, 128.0f)
                horizontalLineTo(82.82f)
                lineTo(128.0f, 32.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(60.59f, 175.24f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 10.65f, -3.83f)
                lineTo(87.9f, 136.0f)
                horizontalLineToRelative(80.2f)
                lineToRelative(16.66f, 35.41f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 14.48f, -6.82f)
                lineToRelative(-64.0f, -136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -14.48f, 0.0f)
                lineToRelative(-64.0f, 136.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 60.59f, 175.24f)
                close()
                moveTo(128.0f, 50.79f)
                lineTo(160.57f, 120.0f)
                horizontalLineTo(95.43f)
                close()
                moveTo(224.0f, 216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineTo(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineTo(216.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 224.0f, 216.0f)
                close()
            }
        }
        .build()
        return _textAUnderline!!
    }

private var _textAUnderline: ImageVector? = null
