package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.Broom: ImageVector
    get() {
        if (_broom != null) {
            return _broom!!
        }
        _broom = Builder(name = "Broom", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(234.62f, 218.6f)
                curveTo(211.35f, 207.29f, 198.0f, 183.0f, 198.0f, 152.0f)
                verticalLineTo(134.7f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -8.82f, -13.0f)
                lineToRelative(-24.89f, -9.83f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -5.59f, -13.0f)
                lineTo(180.0f, 45.9f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, false, -15.0f, -34.33f)
                curveToRelative(-12.95f, -4.83f, -27.88f, 1.84f, -33.31f, 15.0f)
                lineToRelative(-21.0f, 53.11f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -13.0f, 5.61f)
                lineTo(72.37f, 75.0f)
                arcToRelative(13.9f, 13.9f, 0.0f, false, false, -15.2f, 3.19f)
                curveTo(36.49f, 99.42f, 26.0f, 124.26f, 26.0f, 152.0f)
                arcToRelative(109.53f, 109.53f, 0.0f, false, false, 30.62f, 76.16f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 61.0f, 230.0f)
                horizontalLineTo(232.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 2.62f, -11.4f)
                close()
                moveTo(65.77f, 86.52f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.12f, -0.43f)
                lineToRelative(25.4f, 10.29f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 28.63f, -12.32f)
                lineToRelative(21.0f, -53.0f)
                curveToRelative(3.0f, -7.13f, 11.0f, -10.81f, 18.0f, -8.21f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 8.0f, 18.54f)
                lineToRelative(-21.36f, 53.1f)
                arcTo(22.05f, 22.05f, 0.0f, false, false, 159.86f, 123.0f)
                lineToRelative(24.88f, 9.83f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 186.0f, 134.7f)
                verticalLineTo(152.0f)
                curveToRelative(0.0f, 1.34f, 0.0f, 2.65f, 0.08f, 4.0f)
                lineTo(52.74f, 102.61f)
                arcTo(110.07f, 110.07f, 0.0f, false, true, 65.77f, 86.52f)
                close()
                moveTo(114.33f, 218.0f)
                arcToRelative(89.6f, 89.6f, 0.0f, false, true, -25.5f, -43.5f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -11.62f, 3.0f)
                arcTo(102.87f, 102.87f, 0.0f, false, false, 97.81f, 218.0f)
                horizontalLineTo(63.56f)
                arcTo(97.56f, 97.56f, 0.0f, false, true, 38.0f, 152.0f)
                arcToRelative(87.42f, 87.42f, 0.0f, false, true, 8.71f, -38.86f)
                lineTo(187.35f, 169.4f)
                curveToRelative(3.15f, 19.92f, 11.77f, 36.66f, 25.0f, 48.6f)
                close()
            }
        }
        .build()
        return _broom!!
    }

private var _broom: ImageVector? = null
