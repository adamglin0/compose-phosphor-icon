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

public val DuotoneGroup.Lasso: ImageVector
    get() {
        if (_lasso != null) {
            return _lasso!!
        }
        _lasso = Builder(name = "Lasso", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(232.0f, 112.0f)
                curveToRelative(0.0f, 35.35f, -46.56f, 64.0f, -104.0f, 64.0f)
                reflectiveCurveTo(24.0f, 147.35f, 24.0f, 112.0f)
                reflectiveCurveTo(70.56f, 48.0f, 128.0f, 48.0f)
                reflectiveCurveTo(232.0f, 76.65f, 232.0f, 112.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(205.73f, 59.93f)
                curveTo(184.85f, 47.08f, 157.24f, 40.0f, 128.0f, 40.0f)
                reflectiveCurveTo(71.15f, 47.08f, 50.27f, 59.93f)
                curveTo(28.17f, 73.52f, 16.0f, 92.0f, 16.0f, 112.0f)
                reflectiveCurveTo(28.17f, 150.44f, 50.27f, 164.0f)
                curveToRelative(19.0f, 11.67f, 43.49f, 18.56f, 69.73f, 19.73f)
                verticalLineToRelative(0.0f)
                arcToRelative(37.35f, 37.35f, 0.0f, false, true, -18.58f, 33.0f)
                curveToRelative(-14.64f, 8.86f, -34.62f, 9.52f, -49.72f, 1.64f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -7.4f, 14.18f)
                arcTo(66.4f, 66.4f, 0.0f, false, false, 75.0f, 240.0f)
                arcToRelative(67.31f, 67.31f, 0.0f, false, false, 34.74f, -9.5f)
                curveToRelative(17.0f, -10.27f, 26.29f, -26.86f, 26.29f, -46.7f)
                verticalLineToRelative(0.0f)
                curveToRelative(26.24f, -1.17f, 50.76f, -8.06f, 69.73f, -19.73f)
                curveTo(227.83f, 150.44f, 240.0f, 132.0f, 240.0f, 112.0f)
                reflectiveCurveTo(227.83f, 73.52f, 205.73f, 59.93f)
                close()
                moveTo(67.41f, 155.18f)
                curveToRelative(5.24f, -9.55f, 15.45f, -12.0f, 23.53f, -11.0f)
                curveToRelative(10.9f, 1.42f, 21.86f, 9.13f, 26.61f, 23.42f)
                curveTo(99.11f, 166.45f, 81.85f, 162.16f, 67.41f, 155.18f)
                close()
                moveTo(197.35f, 150.41f)
                curveToRelative(-16.95f, 10.43f, -39.17f, 16.53f, -63.13f, 17.43f)
                arcToRelative(54.37f, 54.37f, 0.0f, false, false, -11.39f, -23.07f)
                arcTo(47.17f, 47.17f, 0.0f, false, false, 93.0f, 128.35f)
                curveToRelative(-17.0f, -2.2f, -31.72f, 5.11f, -39.38f, 18.7f)
                curveTo(39.64f, 137.0f, 32.0f, 124.73f, 32.0f, 112.0f)
                curveToRelative(0.0f, -14.21f, 9.47f, -27.86f, 26.65f, -38.43f)
                curveTo(77.05f, 62.23f, 101.68f, 56.0f, 128.0f, 56.0f)
                reflectiveCurveTo(179.0f, 62.23f, 197.35f, 73.55f)
                curveTo(214.53f, 84.12f, 224.0f, 97.77f, 224.0f, 112.0f)
                reflectiveCurveTo(214.53f, 139.84f, 197.35f, 150.41f)
                close()
            }
        }
        .build()
        return _lasso!!
    }

private var _lasso: ImageVector? = null
