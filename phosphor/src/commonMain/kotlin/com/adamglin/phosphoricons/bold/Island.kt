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

public val BoldGroup.Island: ImageVector
    get() {
        if (_island != null) {
            return _island!!
        }
        _island = Builder(name = "Island", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(241.37f, 231.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -16.87f, 1.87f)
                curveTo(224.16f, 233.1f, 186.64f, 204.0f, 128.0f, 204.0f)
                reflectiveCurveTo(31.83f, 233.1f, 31.46f, 233.39f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -15.0f, -18.76f)
                curveToRelative(1.62f, -1.3f, 37.57f, -29.53f, 95.85f, -34.0f)
                arcTo(123.26f, 123.26f, 0.0f, false, true, 110.0f, 146.06f)
                curveToRelative(1.67f, -20.79f, 9.88f, -47.91f, 37.0f, -69.78f)
                arcToRelative(52.75f, 52.75f, 0.0f, false, false, -6.68f, -0.23f)
                curveToRelative(-17.2f, 0.56f, -27.61f, 10.37f, -32.74f, 30.88f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 96.0f, 116.0f)
                arcToRelative(11.79f, 11.79f, 0.0f, false, true, -2.92f, -0.36f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -8.73f, -14.55f)
                curveToRelative(4.46f, -17.79f, 17.56f, -47.82f, 55.26f, -49.0f)
                arcToRelative(79.14f, 79.14f, 0.0f, false, true, 14.8f, 1.0f)
                curveToRelative(-3.47f, -4.89f, -7.81f, -9.21f, -13.08f, -11.39f)
                curveToRelative(-8.28f, -3.43f, -18.73f, -1.33f, -31.06f, 6.23f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 97.72f, 27.43f)
                curveToRelative(19.3f, -11.84f, 37.11f, -14.5f, 52.93f, -7.89f)
                curveToRelative(10.46f, 4.37f, 19.63f, 12.92f, 26.75f, 24.88f)
                curveToRelative(5.86f, -7.19f, 12.72f, -12.18f, 20.2f, -14.61f)
                curveToRelative(16.42f, -5.35f, 31.7f, 2.47f, 41.63f, 10.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -14.47f, 19.14f)
                curveToRelative(-7.79f, -5.89f, -14.42f, -8.0f, -19.68f, -6.32f)
                curveToRelative(-4.57f, 1.47f, -8.45f, 5.67f, -11.43f, 10.19f)
                arcTo(73.43f, 73.43f, 0.0f, false, true, 210.0f, 69.61f)
                curveTo(225.48f, 78.48f, 244.0f, 97.21f, 244.0f, 136.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                curveToRelative(0.0f, -20.0f, -6.13f, -34.43f, -18.21f, -43.15f)
                arcToRelative(61.84f, 61.84f, 0.0f, false, true, -7.33f, 49.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -20.28f, -12.78f)
                arcToRelative(40.61f, 40.61f, 0.0f, false, false, 5.51f, -15.76f)
                curveToRelative(1.18f, -9.09f, -1.07f, -17.81f, -6.66f, -26.0f)
                curveToRelative(-23.61f, 14.28f, -36.72f, 34.36f, -39.0f, 59.8f)
                arcToRelative(99.84f, 99.84f, 0.0f, false, false, 2.87f, 33.06f)
                curveToRelative(62.23f, 2.71f, 100.91f, 33.07f, 102.6f, 34.42f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 241.37f, 231.5f)
                close()
                moveTo(20.0f, 144.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, 32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 20.0f, 144.0f)
                close()
                moveTo(44.0f, 144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 44.0f, 144.0f)
                close()
            }
        }
        .build()
        return _island!!
    }

private var _island: ImageVector? = null
