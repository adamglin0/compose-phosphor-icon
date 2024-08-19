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

public val DuotoneGroup.Paperplaneright: ImageVector
    get() {
        if (_paperplaneright != null) {
            return _paperplaneright!!
        }
        _paperplaneright = Builder(name = "Paperplaneright", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(227.91f, 134.86f)
                lineTo(59.93f, 231.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.44f, -9.67f)
                lineTo(80.0f, 128.0f)
                lineTo(48.49f, 34.72f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.44f, -9.67f)
                lineToRelative(168.0f, 95.85f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 227.91f, 134.86f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(231.87f, 114.0f)
                lineToRelative(-168.0f, -95.89f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 40.92f, 37.34f)
                lineTo(71.55f, 128.0f)
                lineTo(40.92f, 218.67f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 56.0f, 240.0f)
                arcToRelative(16.15f, 16.15f, 0.0f, false, false, 7.93f, -2.1f)
                lineToRelative(167.92f, -96.05f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.05f, -27.89f)
                close()
                moveTo(56.0f, 224.0f)
                arcToRelative(0.56f, 0.56f, 0.0f, false, false, 0.0f, -0.12f)
                lineTo(85.74f, 136.0f)
                horizontalLineTo(144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                horizontalLineTo(85.74f)
                lineTo(56.06f, 32.16f)
                arcTo(0.46f, 0.46f, 0.0f, false, false, 56.0f, 32.0f)
                lineToRelative(168.0f, 95.83f)
                close()
            }
        }
        .build()
        return _paperplaneright!!
    }

private var _paperplaneright: ImageVector? = null
