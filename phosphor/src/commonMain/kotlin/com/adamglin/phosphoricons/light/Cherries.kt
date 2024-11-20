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

public val LightGroup.Cherries: ImageVector
    get() {
        if (_cherries != null) {
            return _cherries!!
        }
        _cherries = Builder(name = "Cherries", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.0f, 74.0f)
                arcToRelative(68.2f, 68.2f, 0.0f, false, false, -8.83f, 0.57f)
                arcToRelative(89.81f, 89.81f, 0.0f, false, false, -21.8f, -25.69f)
                curveToRelative(-37.18f, -30.0f, -88.07f, -23.13f, -90.22f, -22.82f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 52.67f, 37.0f)
                curveTo(71.39f, 49.47f, 79.54f, 70.31f, 82.72f, 90.22f)
                arcTo(70.0f, 70.0f, 0.0f, true, false, 141.59f, 205.0f)
                arcTo(70.0f, 70.0f, 0.0f, true, false, 176.0f, 74.0f)
                close()
                moveTo(137.9f, 58.27f)
                arcToRelative(77.61f, 77.61f, 0.0f, false, true, 16.86f, 19.0f)
                arcTo(70.31f, 70.31f, 0.0f, false, false, 122.35f, 99.0f)
                arcToRelative(69.47f, 69.47f, 0.0f, false, false, -27.42f, -8.69f)
                curveToRelative(-3.22f, -22.13f, -11.2f, -40.14f, -23.46f, -53.1f)
                curveTo(88.23f, 37.43f, 116.19f, 40.72f, 137.9f, 58.27f)
                close()
                moveTo(146.1f, 121.0f)
                arcToRelative(70.74f, 70.74f, 0.0f, false, false, -13.77f, -15.12f)
                arcToRelative(58.17f, 58.17f, 0.0f, false, true, 28.23f, -17.74f)
                arcToRelative(113.53f, 113.53f, 0.0f, false, true, 8.78f, 33.31f)
                curveToRelative(-8.61f, -1.5f, -12.92f, -5.51f, -13.1f, -5.68f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 146.1f, 121.0f)
                close()
                moveTo(88.0f, 218.0f)
                arcToRelative(58.0f, 58.0f, 0.0f, false, true, -3.92f, -115.85f)
                arcToRelative(177.17f, 177.17f, 0.0f, false, true, -1.15f, 35.52f)
                curveToRelative(-9.66f, -1.25f, -14.5f, -5.73f, -14.69f, -5.91f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, 8.48f)
                curveToRelative(0.4f, 0.4f, 10.0f, 9.76f, 28.24f, 9.76f)
                reflectiveCurveToRelative(27.84f, -9.36f, 28.24f, -9.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -8.43f, -8.53f)
                curveToRelative(-0.22f, 0.2f, -4.41f, 4.08f, -12.72f, 5.64f)
                arcToRelative(186.4f, 186.4f, 0.0f, false, false, 1.11f, -34.76f)
                arcTo(58.0f, 58.0f, 0.0f, false, true, 88.0f, 218.0f)
                close()
                moveTo(176.0f, 202.0f)
                arcToRelative(57.75f, 57.75f, 0.0f, false, true, -27.47f, -6.91f)
                arcToRelative(69.73f, 69.73f, 0.0f, false, false, 0.0f, -70.12f)
                curveToRelative(2.65f, 2.26f, 11.88f, 9.0f, 27.44f, 9.0f)
                curveToRelative(18.28f, 0.0f, 27.84f, -9.36f, 28.24f, -9.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -8.51f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.46f, 0.0f)
                curveToRelative(-0.23f, 0.22f, -5.0f, 4.59f, -14.36f, 5.91f)
                arcToRelative(129.06f, 129.06f, 0.0f, false, false, -8.66f, -35.52f)
                curveToRelative(1.06f, -0.06f, 2.14f, -0.1f, 3.21f, -0.1f)
                arcToRelative(58.0f, 58.0f, 0.0f, false, true, 0.0f, 116.0f)
                close()
            }
        }
        .build()
        return _cherries!!
    }

private var _cherries: ImageVector? = null
