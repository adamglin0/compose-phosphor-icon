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

public val DuotoneGroup.Signature: ImageVector
    get() {
        if (_signature != null) {
            return _signature!!
        }
        _signature = Builder(name = "Signature", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(67.41f, 142.56f)
                curveTo(35.71f, 129.52f, 45.41f, 32.07f, 78.0f, 32.0f)
                curveTo(111.82f, 32.05f, 92.0f, 90.26f, 67.41f, 142.56f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 168.0f)
                horizontalLineTo(63.86f)
                curveToRelative(2.66f, -5.24f, 5.33f, -10.63f, 8.0f, -16.11f)
                curveToRelative(14.94f, 1.65f, 32.58f, -8.78f, 52.66f, -31.14f)
                curveToRelative(5.0f, 13.46f, 14.45f, 30.93f, 30.58f, 31.25f)
                curveToRelative(9.09f, 0.18f, 18.11f, -5.2f, 27.42f, -16.37f)
                curveTo(189.31f, 143.75f, 203.3f, 152.0f, 232.0f, 152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                curveToRelative(-30.43f, 0.0f, -39.43f, -10.45f, -40.0f, -16.11f)
                arcToRelative(7.67f, 7.67f, 0.0f, false, false, -5.46f, -7.75f)
                arcToRelative(8.14f, 8.14f, 0.0f, false, false, -9.25f, 3.49f)
                curveTo(165.23f, 134.17f, 158.0f, 136.06f, 155.38f, 136.0f)
                curveToRelative(-8.26f, -0.16f, -16.66f, -19.52f, -19.54f, -33.42f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -14.09f, -3.37f)
                curveTo(101.54f, 124.55f, 88.0f, 133.08f, 79.57f, 135.29f)
                curveTo(88.06f, 116.42f, 94.4f, 99.85f, 98.46f, 85.9f)
                curveToRelative(6.82f, -23.44f, 7.32f, -39.83f, 1.51f, -50.1f)
                curveToRelative(-3.0f, -5.38f, -9.34f, -11.8f, -22.06f, -11.8f)
                curveTo(61.85f, 24.0f, 49.18f, 39.18f, 43.14f, 65.65f)
                curveToRelative(-3.59f, 15.71f, -4.18f, 33.21f, -1.62f, 48.0f)
                reflectiveCurveToRelative(7.87f, 25.55f, 15.59f, 31.94f)
                curveToRelative(-3.73f, 7.72f, -7.53f, 15.26f, -11.23f, 22.41f)
                horizontalLineTo(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineTo(37.41f)
                curveToRelative(-11.32f, 21.0f, -20.12f, 35.64f, -20.26f, 35.88f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 13.71f, 8.24f)
                curveToRelative(0.15f, -0.26f, 11.27f, -18.79f, 24.7f, -44.12f)
                horizontalLineTo(232.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(58.74f, 69.21f)
                curveTo(62.72f, 51.74f, 70.43f, 40.0f, 77.91f, 40.0f)
                curveToRelative(5.33f, 0.0f, 7.1f, 1.86f, 8.13f, 3.67f)
                curveToRelative(3.0f, 5.33f, 6.52f, 24.19f, -21.66f, 86.39f)
                curveTo(56.12f, 118.78f, 53.31f, 93.0f, 58.74f, 69.21f)
                close()
            }
        }
        .build()
        return _signature!!
    }

private var _signature: ImageVector? = null
