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

public val DuotoneGroup.Textsuperscript: ImageVector
    get() {
        if (_textsuperscript != null) {
            return _textsuperscript!!
        }
        _textsuperscript = Builder(name = "Textsuperscript", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(240.0f, 64.0f)
                verticalLineTo(184.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                horizontalLineTo(40.0f)
                verticalLineTo(64.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 56.0f, 48.0f)
                horizontalLineTo(224.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 240.0f, 64.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineTo(192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.4f, -12.8f)
                lineToRelative(43.17f, -57.55f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, -27.86f, -15.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -15.09f, -5.33f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 55.74f, 29.92f)
                lineTo(208.0f, 136.0f)
                horizontalLineToRelative(32.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 248.0f, 144.0f)
                close()
                moveTo(149.24f, 74.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.29f, 0.8f)
                lineTo(92.0f, 127.79f)
                lineToRelative(-45.95f, -53.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 34.0f, 85.24f)
                lineTo(81.41f, 140.0f)
                lineTo(34.0f, 194.76f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 12.1f, 10.48f)
                lineToRelative(46.0f, -53.0f)
                lineToRelative(45.95f, 53.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 12.1f, -10.48f)
                lineTo(102.59f, 140.0f)
                lineToRelative(47.46f, -54.76f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 149.24f, 74.0f)
                close()
            }
        }
        .build()
        return _textsuperscript!!
    }

private var _textsuperscript: ImageVector? = null
