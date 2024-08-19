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

public val DuotoneGroup.Shieldslash: ImageVector
    get() {
        if (_shieldslash != null) {
            return _shieldslash!!
        }
        _shieldslash = Builder(name = "Shieldslash", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(216.0f, 56.0f)
                verticalLineToRelative(56.0f)
                curveToRelative(0.0f, 96.0f, -88.0f, 120.0f, -88.0f, 120.0f)
                reflectiveCurveTo(40.0f, 208.0f, 40.0f, 112.0f)
                verticalLineTo(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineTo(208.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 216.0f, 56.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(53.92f, 34.62f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 40.26f, 42.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 56.0f)
                verticalLineToRelative(56.0f)
                curveToRelative(0.0f, 52.72f, 25.52f, 84.67f, 46.93f, 102.19f)
                curveToRelative(23.06f, 18.86f, 46.0f, 25.27f, 47.0f, 25.53f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.2f, 0.0f)
                curveToRelative(1.36f, -0.37f, 31.27f, -8.78f, 57.09f, -34.72f)
                lineToRelative(14.89f, 16.38f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 11.84f, -10.76f)
                close()
                moveTo(127.99f, 223.62f)
                arcToRelative(128.48f, 128.48f, 0.0f, false, true, -38.92f, -21.81f)
                curveTo(61.82f, 179.51f, 48.0f, 149.3f, 48.0f, 112.0f)
                lineToRelative(0.0f, -56.0f)
                horizontalLineToRelative(3.71f)
                lineTo(176.41f, 193.15f)
                arcTo(129.26f, 129.26f, 0.0f, false, true, 128.0f, 223.62f)
                close()
                moveTo(224.0f, 56.0f)
                verticalLineToRelative(56.0f)
                curveToRelative(0.0f, 20.58f, -3.89f, 39.61f, -11.56f, 56.59f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 197.86f, 162.0f)
                curveToRelative(6.73f, -14.89f, 10.14f, -31.71f, 10.14f, -50.0f)
                lineTo(208.0f, 56.0f)
                lineTo(98.52f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 0.0f, -16.0f)
                lineTo(208.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 224.0f, 56.0f)
                close()
            }
        }
        .build()
        return _shieldslash!!
    }

private var _shieldslash: ImageVector? = null
