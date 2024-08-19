package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.Signature: ImageVector
    get() {
        if (_signature != null) {
            return _signature!!
        }
        _signature = Builder(name = "Signature", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 164.0f)
                horizontalLineTo(70.38f)
                curveToRelative(2.2f, -4.42f, 4.41f, -8.94f, 6.59f, -13.52f)
                lineToRelative(0.79f, -1.66f)
                curveToRelative(13.52f, -1.65f, 28.69f, -11.3f, 45.38f, -28.87f)
                curveToRelative(5.31f, 12.0f, 14.0f, 24.73f, 27.59f, 27.29f)
                curveToRelative(5.26f, 1.0f, 13.51f, 0.79f, 22.93f, -5.82f)
                arcToRelative(57.86f, 57.86f, 0.0f, false, false, 9.0f, -7.91f)
                curveTo(190.9f, 141.2f, 205.68f, 148.0f, 232.0f, 148.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                curveToRelative(-31.0f, 0.0f, -35.42f, -10.49f, -36.0f, -12.38f)
                curveToRelative(0.49f, -5.37f, -2.75f, -9.76f, -7.88f, -11.63f)
                reflectiveCurveToRelative(-11.17f, 0.78f, -14.22f, 5.46f)
                curveToRelative(-10.0f, 15.32f, -16.62f, 18.62f, -18.75f, 18.21f)
                curveToRelative(-4.88f, -0.91f, -12.39f, -15.54f, -15.44f, -30.09f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -21.13f, -5.0f)
                curveToRelative(-10.3f, 12.92f, -19.16f, 21.79f, -26.47f, 27.56f)
                curveToRelative(21.19f, -52.94f, 17.0f, -72.22f, 11.37f, -82.25f)
                curveTo(98.48f, 24.91f, 89.41f, 20.0f, 78.0f, 20.0f)
                curveTo(59.92f, 20.0f, 45.36f, 36.55f, 39.0f, 64.26f)
                curveToRelative(-3.45f, 15.1f, -4.0f, 31.81f, -1.46f, 45.85f)
                curveToRelative(2.65f, 14.71f, 8.36f, 25.7f, 16.68f, 32.23f)
                curveTo(50.69f, 149.78f, 47.0f, 157.06f, 43.47f, 164.0f)
                horizontalLineTo(24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(6.7f)
                curveToRelative(-9.7f, 17.67f, -16.85f, 29.6f, -17.0f, 29.81f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 20.56f, 12.38f)
                curveTo(34.91f, 229.15f, 45.23f, 212.0f, 58.0f, 188.0f)
                horizontalLineTo(232.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(62.43f, 69.6f)
                curveTo(65.77f, 55.0f, 72.45f, 44.0f, 78.0f, 44.0f)
                curveToRelative(3.71f, 0.0f, 4.29f, 1.0f, 4.64f, 1.64f)
                curveToRelative(1.43f, 2.53f, 6.55f, 17.07f, -17.44f, 72.78f)
                arcToRelative(44.64f, 44.64f, 0.0f, false, true, -4.0f, -12.56f)
                curveTo(59.23f, 94.89f, 59.68f, 81.67f, 62.43f, 69.6f)
                close()
            }
        }
        .build()
        return _signature!!
    }

private var _signature: ImageVector? = null
