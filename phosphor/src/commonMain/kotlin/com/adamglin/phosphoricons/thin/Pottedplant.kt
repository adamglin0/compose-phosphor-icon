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

public val ThinGroup.Pottedplant: ImageVector
    get() {
        if (_pottedplant != null) {
            return _pottedplant!!
        }
        _pottedplant = Builder(name = "Pottedplant", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(122.83f, 138.83f)
                horizontalLineToRelative(0.0f)
                lineTo(145.0f, 116.7f)
                curveToRelative(9.0f, 4.89f, 18.06f, 7.35f, 26.81f, 7.35f)
                arcToRelative(45.57f, 45.57f, 0.0f, false, false, 23.87f, -6.74f)
                curveToRelative(22.42f, -13.58f, 34.41f, -45.45f, 32.07f, -85.26f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 224.0f, 28.29f)
                curveToRelative(-39.81f, -2.35f, -71.68f, 9.65f, -85.26f, 32.07f)
                curveToRelative(-9.21f, 15.2f, -9.0f, 33.09f, 0.61f, 50.68f)
                lineTo(120.0f, 130.34f)
                lineToRelative(-17.06f, -17.06f)
                curveToRelative(6.66f, -12.78f, 6.71f, -26.2f, 0.0f, -37.22f)
                curveTo(92.89f, 59.4f, 69.33f, 50.49f, 40.0f, 52.21f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 36.21f, 56.0f)
                curveToRelative(-1.73f, 29.36f, 7.19f, 52.92f, 23.85f, 63.0f)
                arcTo(34.29f, 34.29f, 0.0f, false, false, 78.0f, 124.0f)
                arcToRelative(42.0f, 42.0f, 0.0f, false, false, 19.34f, -5.0f)
                lineToRelative(17.0f, 17.06f)
                lineToRelative(-12.0f, 12.0f)
                lineTo(56.0f, 148.06f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                lineTo(68.79f, 156.06f)
                lineTo(82.7f, 218.6f)
                arcTo(11.93f, 11.93f, 0.0f, false, false, 94.42f, 228.0f)
                horizontalLineToRelative(67.17f)
                arcToRelative(11.93f, 11.93f, 0.0f, false, false, 11.71f, -9.4f)
                lineTo(187.21f, 156.0f)
                lineTo(200.0f, 156.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(113.66f, 148.0f)
                lineToRelative(9.17f, -9.17f)
                close()
                moveTo(145.53f, 64.51f)
                curveTo(157.15f, 45.31f, 184.8f, 34.8f, 219.9f, 36.1f)
                curveToRelative(1.29f, 35.1f, -9.21f, 62.74f, -28.41f, 74.37f)
                curveToRelative(-13.08f, 7.92f, -28.77f, 7.32f, -44.29f, -1.68f)
                curveTo(138.21f, 93.28f, 137.61f, 77.59f, 145.53f, 64.51f)
                close()
                moveTo(95.05f, 111.05f)
                curveToRelative(-10.84f, 6.19f, -21.76f, 6.59f, -30.84f, 1.08f)
                curveTo(50.78f, 104.0f, 43.35f, 84.68f, 44.0f, 60.0f)
                curveToRelative(24.64f, -0.69f, 44.0f, 6.74f, 52.1f, 20.17f)
                curveTo(101.64f, 89.29f, 101.24f, 100.21f, 95.05f, 111.05f)
                close()
                moveTo(179.05f, 156.05f)
                lineTo(165.52f, 216.92f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.9f, 3.13f)
                lineTo(94.42f, 220.05f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.91f, -3.13f)
                lineTo(77.0f, 156.0f)
                close()
            }
        }
        .build()
        return _pottedplant!!
    }

private var _pottedplant: ImageVector? = null
