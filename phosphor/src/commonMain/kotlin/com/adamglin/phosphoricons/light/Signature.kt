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

public val LightGroup.Signature: ImageVector
    get() {
        if (_signature != null) {
            return _signature!!
        }
        _signature = Builder(name = "Signature", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 170.0f)
                horizontalLineTo(60.6f)
                curveToRelative(3.34f, -6.54f, 6.73f, -13.35f, 10.06f, -20.29f)
                arcToRelative(26.64f, 26.64f, 0.0f, false, false, 4.3f, 0.35f)
                curveToRelative(14.23f, 0.0f, 31.09f, -11.12f, 50.33f, -33.22f)
                curveToRelative(1.0f, 3.0f, 2.2f, 6.25f, 3.68f, 9.56f)
                curveToRelative(6.89f, 15.45f, 15.68f, 23.39f, 26.14f, 23.6f)
                horizontalLineToRelative(0.39f)
                curveToRelative(8.81f, 0.0f, 17.71f, -5.77f, 27.0f, -17.58f)
                curveTo(188.33f, 140.68f, 201.62f, 150.0f, 232.0f, 150.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                curveToRelative(-39.69f, 0.0f, -41.88f, -16.61f, -42.0f, -18.06f)
                arcToRelative(5.83f, 5.83f, 0.0f, false, false, -4.15f, -5.8f)
                arcToRelative(6.09f, 6.09f, 0.0f, false, false, -6.88f, 2.59f)
                curveTo(166.81f, 135.4f, 158.9f, 138.06f, 155.34f, 138.0f)
                curveToRelative(-10.78f, -0.21f, -19.11f, -23.68f, -21.46f, -35.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -10.57f, -2.53f)
                curveTo(104.64f, 123.86f, 88.0f, 137.0f, 76.18f, 137.92f)
                curveTo(100.0f, 85.84f, 107.23f, 52.7f, 98.23f, 36.78f)
                curveTo(95.44f, 31.86f, 89.66f, 26.0f, 77.91f, 26.0f)
                curveToRelative(-15.0f, 0.0f, -27.0f, 14.62f, -32.82f, 40.1f)
                curveTo(38.28f, 95.94f, 42.12f, 132.0f, 59.62f, 145.0f)
                curveToRelative(-4.15f, 8.64f, -8.4f, 17.08f, -12.52f, 25.0f)
                horizontalLineTo(24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineTo(40.76f)
                curveTo(28.65f, 204.58f, 19.0f, 220.66f, 18.86f, 220.91f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 10.28f, 6.18f)
                curveToRelative(0.16f, -0.26f, 11.56f, -19.27f, 25.21f, -45.09f)
                horizontalLineTo(232.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(56.79f, 68.77f)
                curveTo(61.05f, 50.08f, 69.34f, 38.0f, 77.91f, 38.0f)
                curveToRelative(6.4f, 0.0f, 8.64f, 2.51f, 9.87f, 4.69f)
                curveToRelative(4.0f, 7.0f, 6.0f, 28.15f, -22.88f, 91.0f)
                curveTo(54.59f, 123.39f, 50.73f, 95.3f, 56.79f, 68.77f)
                close()
            }
        }
        .build()
        return _signature!!
    }

private var _signature: ImageVector? = null
