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

public val LightGroup.Plant: ImageVector
    get() {
        if (_plant != null) {
            return _plant!!
        }
        _plant = Builder(name = "Plant", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(245.63f, 48.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 240.0f, 42.37f)
                curveToRelative(-51.0f, -3.0f, -91.88f, 12.42f, -109.35f, 41.26f)
                curveToRelative(-11.63f, 19.21f, -11.38f, 42.68f, 0.53f, 65.0f)
                arcToRelative(69.42f, 69.42f, 0.0f, false, false, -15.48f, 30.59f)
                lineTo(95.9f, 159.41f)
                curveToRelative(8.15f, -16.1f, 8.1f, -32.95f, -0.32f, -46.85f)
                curveTo(82.77f, 91.41f, 53.0f, 80.07f, 15.9f, 82.27f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.63f, 5.64f)
                curveTo(8.09f, 125.0f, 19.41f, 154.77f, 40.56f, 167.58f)
                arcTo(43.75f, 43.75f, 0.0f, false, false, 63.44f, 174.0f)
                arcToRelative(53.17f, 53.17f, 0.0f, false, false, 24.0f, -6.0f)
                lineTo(114.0f, 194.48f)
                lineTo(114.0f, 224.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(126.0f, 194.51f)
                arcTo(57.55f, 57.55f, 0.0f, false, true, 139.76f, 157.0f)
                curveToRelative(11.21f, 5.93f, 22.72f, 8.91f, 33.82f, 8.91f)
                arcToRelative(58.9f, 58.9f, 0.0f, false, false, 30.79f, -8.57f)
                curveTo(233.21f, 139.89f, 248.63f, 99.0f, 245.63f, 48.0f)
                close()
                moveTo(46.78f, 157.31f)
                curveTo(30.47f, 147.44f, 21.39f, 124.0f, 22.0f, 94.0f)
                curveToRelative(30.0f, -0.65f, 53.41f, 8.44f, 63.28f, 24.75f)
                curveToRelative(5.68f, 9.37f, 6.16f, 20.38f, 1.54f, 31.59f)
                lineTo(60.24f, 123.75f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.49f, 8.49f)
                lineToRelative(26.62f, 26.61f)
                curveTo(67.16f, 163.47f, 56.15f, 163.0f, 46.78f, 157.31f)
                close()
                moveTo(198.16f, 147.09f)
                curveToRelative(-14.74f, 8.92f, -32.14f, 9.18f, -49.67f, 0.9f)
                lineToRelative(55.76f, -55.75f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.49f, -8.49f)
                lineTo(140.0f, 139.51f)
                curveToRelative(-8.28f, -17.53f, -8.0f, -34.93f, 0.9f, -49.66f)
                curveToRelative(14.52f, -24.0f, 49.06f, -37.18f, 93.0f, -35.75f)
                curveTo(235.33f, 98.0f, 222.14f, 132.56f, 198.16f, 147.09f)
                close()
            }
        }
        .build()
        return _plant!!
    }

private var _plant: ImageVector? = null
