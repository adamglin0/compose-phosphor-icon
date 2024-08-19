package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.Island: ImageVector
    get() {
        if (_island != null) {
            return _island!!
        }
        _island = Builder(name = "Island", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(235.12f, 226.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.62f, 0.62f)
                curveTo(229.11f, 226.81f, 189.72f, 196.0f, 128.0f, 196.0f)
                reflectiveCurveTo(26.89f, 226.81f, 26.5f, 227.13f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.0f, -6.25f)
                curveToRelative(1.63f, -1.31f, 39.56f, -31.08f, 101.0f, -32.79f)
                arcToRelative(116.11f, 116.11f, 0.0f, false, true, -4.45f, -41.4f)
                curveToRelative(1.79f, -22.37f, 11.85f, -52.74f, 48.61f, -74.16f)
                curveToRelative(-6.46f, -2.24f, -16.29f, -4.83f, -26.49f, -4.49f)
                curveToRelative(-20.74f, 0.67f, -34.28f, 13.1f, -40.25f, 36.94f)
                arcTo(4.0f, 4.0f, 0.0f, true, true, 92.12f, 103.0f)
                curveToRelative(8.64f, -34.54f, 30.74f, -42.45f, 47.75f, -43.0f)
                curveToRelative(11.46f, -0.36f, 22.22f, 2.44f, 29.34f, 4.91f)
                curveToRelative(-3.63f, -8.39f, -10.93f, -21.0f, -23.4f, -26.37f)
                curveToRelative(-11.15f, -4.77f, -24.56f, -2.87f, -39.86f, 5.67f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -3.9f, -7.0f)
                curveToRelative(17.6f, -9.82f, 33.4f, -11.85f, 47.0f, -6.0f)
                curveToRelative(14.6f, 6.28f, 23.0f, 20.15f, 27.23f, 29.74f)
                curveToRelative(4.21f, -8.4f, 11.87f, -19.69f, 23.84f, -23.59f)
                curveToRelative(10.55f, -3.43f, 22.1f, -0.49f, 34.33f, 8.76f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -4.82f, 6.38f)
                curveToRelative(-10.0f, -7.57f, -19.1f, -10.11f, -27.0f, -7.54f)
                curveToRelative(-11.14f, 3.61f, -18.0f, 16.42f, -21.0f, 23.46f)
                arcTo(67.51f, 67.51f, 0.0f, false, true, 206.0f, 76.53f)
                curveToRelative(24.81f, 14.18f, 30.0f, 40.17f, 30.0f, 59.47f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                curveToRelative(0.0f, -43.89f, -27.5f, -55.67f, -42.53f, -58.83f)
                curveToRelative(10.67f, 15.0f, 11.46f, 29.37f, 9.92f, 39.44f)
                arcToRelative(54.76f, 54.76f, 0.0f, false, true, -8.18f, 21.7f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.27f, 1.69f)
                arcToRelative(3.92f, 3.92f, 0.0f, false, true, -2.3f, -0.73f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.0f, -5.57f)
                curveToRelative(0.85f, -1.22f, 19.26f, -28.4f, -5.57f, -56.73f)
                curveToRelative(-30.0f, 15.86f, -46.55f, 39.42f, -49.1f, 70.06f)
                arcToRelative(108.78f, 108.78f, 0.0f, false, false, 4.84f, 41.0f)
                curveToRelative(63.0f, 0.91f, 102.0f, 31.5f, 103.65f, 32.83f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 235.12f, 226.5f)
                close()
                moveTo(28.0f, 140.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 24.0f, 24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 28.0f, 140.0f)
                close()
                moveTo(36.0f, 140.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 36.0f, 140.0f)
                close()
            }
        }
        .build()
        return _island!!
    }

private var _island: ImageVector? = null
