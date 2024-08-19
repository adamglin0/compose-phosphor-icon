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

public val RegularGroup.Atom: ImageVector
    get() {
        if (_atom != null) {
            return _atom!!
        }
        _atom = Builder(name = "Atom", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(196.12f, 128.0f)
                curveToRelative(24.65f, -34.61f, 37.22f, -70.38f, 19.74f, -87.86f)
                reflectiveCurveTo(162.61f, 35.23f, 128.0f, 59.88f)
                curveTo(93.39f, 35.23f, 57.62f, 22.66f, 40.14f, 40.14f)
                reflectiveCurveTo(35.23f, 93.39f, 59.88f, 128.0f)
                curveToRelative(-24.65f, 34.61f, -37.22f, 70.38f, -19.74f, 87.86f)
                horizontalLineToRelative(0.0f)
                curveToRelative(5.63f, 5.63f, 13.15f, 8.14f, 21.91f, 8.14f)
                curveToRelative(18.48f, 0.0f, 42.48f, -11.17f, 66.0f, -27.88f)
                curveTo(151.47f, 212.83f, 175.47f, 224.0f, 194.0f, 224.0f)
                curveToRelative(8.76f, 0.0f, 16.29f, -2.52f, 21.91f, -8.14f)
                horizontalLineToRelative(0.0f)
                curveTo(233.34f, 198.38f, 220.77f, 162.61f, 196.12f, 128.0f)
                close()
                moveTo(204.55f, 51.45f)
                curveToRelative(7.64f, 7.64f, 2.48f, 32.4f, -18.52f, 63.28f)
                arcToRelative(300.33f, 300.33f, 0.0f, false, false, -21.19f, -23.57f)
                arcTo(300.33f, 300.33f, 0.0f, false, false, 141.27f, 70.0f)
                curveTo(172.15f, 49.0f, 196.91f, 43.8f, 204.55f, 51.45f)
                close()
                moveTo(176.29f, 128.0f)
                arcToRelative(289.14f, 289.14f, 0.0f, false, true, -22.76f, 25.53f)
                arcTo(289.14f, 289.14f, 0.0f, false, true, 128.0f, 176.29f)
                arcToRelative(289.14f, 289.14f, 0.0f, false, true, -25.53f, -22.76f)
                arcTo(289.14f, 289.14f, 0.0f, false, true, 79.71f, 128.0f)
                arcTo(298.62f, 298.62f, 0.0f, false, true, 128.0f, 79.71f)
                arcToRelative(289.14f, 289.14f, 0.0f, false, true, 25.53f, 22.76f)
                arcTo(289.14f, 289.14f, 0.0f, false, true, 176.29f, 128.0f)
                close()
                moveTo(51.45f, 51.45f)
                curveToRelative(2.2f, -2.21f, 5.83f, -3.35f, 10.62f, -3.35f)
                curveTo(73.89f, 48.1f, 92.76f, 55.0f, 114.72f, 70.0f)
                arcTo(304.0f, 304.0f, 0.0f, false, false, 91.16f, 91.16f)
                arcTo(300.33f, 300.33f, 0.0f, false, false, 70.0f, 114.73f)
                curveTo(49.0f, 83.85f, 43.81f, 59.09f, 51.45f, 51.45f)
                close()
                moveTo(51.45f, 204.55f)
                curveTo(43.81f, 196.91f, 49.0f, 172.15f, 70.0f, 141.27f)
                arcToRelative(300.33f, 300.33f, 0.0f, false, false, 21.19f, 23.57f)
                arcTo(304.18f, 304.18f, 0.0f, false, false, 114.73f, 186.0f)
                curveTo(83.85f, 207.0f, 59.09f, 212.2f, 51.45f, 204.55f)
                close()
                moveTo(204.55f, 204.55f)
                curveToRelative(-7.64f, 7.65f, -32.4f, 2.48f, -63.28f, -18.52f)
                arcToRelative(304.18f, 304.18f, 0.0f, false, false, 23.57f, -21.19f)
                arcTo(300.33f, 300.33f, 0.0f, false, false, 186.0f, 141.27f)
                curveTo(207.0f, 172.15f, 212.19f, 196.91f, 204.55f, 204.55f)
                close()
                moveTo(140.0f, 128.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 140.0f, 128.0f)
                close()
            }
        }
        .build()
        return _atom!!
    }

private var _atom: ImageVector? = null
