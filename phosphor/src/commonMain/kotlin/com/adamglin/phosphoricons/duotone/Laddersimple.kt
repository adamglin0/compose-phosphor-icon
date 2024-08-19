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

public val DuotoneGroup.Laddersimple: ImageVector
    get() {
        if (_laddersimple != null) {
            return _laddersimple!!
        }
        _laddersimple = Builder(name = "Laddersimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(192.0f, 32.0f)
                verticalLineTo(224.0f)
                horizontalLineTo(64.0f)
                verticalLineTo(32.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                lineTo(184.0f, 64.0f)
                lineTo(72.0f, 64.0f)
                lineTo(72.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                lineTo(56.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(72.0f, 192.0f)
                lineTo(184.0f, 192.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(200.0f, 32.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 192.0f, 24.0f)
                close()
                moveTo(184.0f, 80.0f)
                verticalLineToRelative(40.0f)
                lineTo(72.0f, 120.0f)
                lineTo(72.0f, 80.0f)
                close()
                moveTo(72.0f, 176.0f)
                lineTo(72.0f, 136.0f)
                lineTo(184.0f, 136.0f)
                verticalLineToRelative(40.0f)
                close()
            }
        }
        .build()
        return _laddersimple!!
    }

private var _laddersimple: ImageVector? = null
