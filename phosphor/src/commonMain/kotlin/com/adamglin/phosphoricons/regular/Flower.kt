package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.Flower: ImageVector
    get() {
        if (_flower != null) {
            return _flower!!
        }
        _flower = Builder(name = "Flower", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(210.35f, 129.36f)
                curveToRelative(-0.81f, -0.47f, -1.7f, -0.92f, -2.62f, -1.36f)
                curveToRelative(0.92f, -0.44f, 1.81f, -0.89f, 2.62f, -1.36f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, -40.0f, -69.28f)
                curveToRelative(-0.81f, 0.47f, -1.65f, 1.0f, -2.48f, 1.59f)
                curveToRelative(0.08f, -1.0f, 0.13f, -2.0f, 0.13f, -3.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, -80.0f, 0.0f)
                curveToRelative(0.0f, 0.94f, 0.0f, 1.94f, 0.13f, 3.0f)
                curveToRelative(-0.83f, -0.57f, -1.67f, -1.12f, -2.48f, -1.59f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, -40.0f, 69.28f)
                curveToRelative(0.81f, 0.47f, 1.7f, 0.92f, 2.62f, 1.36f)
                curveToRelative(-0.92f, 0.44f, -1.81f, 0.89f, -2.62f, 1.36f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, 40.0f, 69.28f)
                curveToRelative(0.81f, -0.47f, 1.65f, -1.0f, 2.48f, -1.59f)
                curveToRelative(-0.08f, 1.0f, -0.13f, 2.0f, -0.13f, 2.95f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 80.0f, 0.0f)
                curveToRelative(0.0f, -0.94f, -0.05f, -1.94f, -0.13f, -2.95f)
                curveToRelative(0.83f, 0.57f, 1.67f, 1.12f, 2.48f, 1.59f)
                arcTo(39.79f, 39.79f, 0.0f, false, false, 190.29f, 204.0f)
                arcToRelative(40.43f, 40.43f, 0.0f, false, false, 10.42f, -1.38f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 9.64f, -73.28f)
                close()
                moveTo(104.0f, 128.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 24.0f, 24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 104.0f, 128.0f)
                close()
                moveTo(178.35f, 71.21f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 24.0f, 41.57f)
                curveToRelative(-6.27f, 3.63f, -18.61f, 6.13f, -35.16f, 7.19f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 154.53f, 98.1f)
                curveTo(163.73f, 84.28f, 172.08f, 74.84f, 178.35f, 71.21f)
                close()
                moveTo(128.0f, 32.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 24.0f, 24.0f)
                curveToRelative(0.0f, 7.24f, -4.0f, 19.19f, -11.36f, 34.06f)
                arcToRelative(39.81f, 39.81f, 0.0f, false, false, -25.28f, 0.0f)
                curveTo(108.0f, 75.19f, 104.0f, 63.24f, 104.0f, 56.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 128.0f, 32.0f)
                close()
                moveTo(44.86f, 80.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 32.79f, -8.79f)
                curveToRelative(6.27f, 3.63f, 14.62f, 13.07f, 23.82f, 26.89f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 88.81f, 120.0f)
                curveToRelative(-16.55f, -1.06f, -28.89f, -3.56f, -35.16f, -7.18f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 44.86f, 80.0f)
                close()
                moveTo(77.65f, 184.79f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, -24.0f, -41.57f)
                curveToRelative(6.27f, -3.63f, 18.61f, -6.13f, 35.16f, -7.19f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 12.66f, 21.87f)
                curveTo(92.27f, 171.72f, 83.92f, 181.16f, 77.65f, 184.79f)
                close()
                moveTo(128.0f, 224.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -24.0f, -24.0f)
                curveToRelative(0.0f, -7.24f, 4.0f, -19.19f, 11.36f, -34.06f)
                arcToRelative(39.81f, 39.81f, 0.0f, false, false, 25.28f, 0.0f)
                curveTo(148.0f, 180.81f, 152.0f, 192.76f, 152.0f, 200.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 128.0f, 224.0f)
                close()
                moveTo(211.14f, 176.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -32.79f, 8.79f)
                curveToRelative(-6.27f, -3.63f, -14.62f, -13.07f, -23.82f, -26.89f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 167.19f, 136.0f)
                curveToRelative(16.55f, 1.06f, 28.89f, 3.56f, 35.16f, 7.18f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 211.14f, 176.0f)
                close()
            }
        }
        .build()
        return _flower!!
    }

private var _flower: ImageVector? = null
