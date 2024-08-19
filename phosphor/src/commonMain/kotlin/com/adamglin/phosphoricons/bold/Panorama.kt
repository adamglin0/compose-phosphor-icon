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

public val BoldGroup.Panorama: ImageVector
    get() {
        if (_panorama != null) {
            return _panorama!!
        }
        _panorama = Builder(name = "Panorama", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(244.18f, 48.15f)
                arcToRelative(19.82f, 19.82f, 0.0f, false, false, -17.32f, -3.46f)
                lineToRelative(-3.49f, 0.94f)
                curveTo(204.74f, 50.65f, 170.08f, 60.0f, 128.0f, 60.0f)
                reflectiveCurveTo(51.26f, 50.65f, 32.63f, 45.63f)
                lineToRelative(-3.49f, -0.94f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 4.0f, 64.0f)
                lineTo(4.0f, 192.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 19.94f, 20.0f)
                arcToRelative(20.42f, 20.42f, 0.0f, false, false, 5.23f, -0.69f)
                lineToRelative(3.19f, -0.87f)
                curveTo(51.0f, 205.39f, 85.7f, 196.0f, 128.0f, 196.0f)
                reflectiveCurveToRelative(77.0f, 9.4f, 95.64f, 14.45f)
                lineToRelative(3.19f, 0.87f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 252.0f, 192.0f)
                lineTo(252.0f, 64.0f)
                arcTo(19.85f, 19.85f, 0.0f, false, false, 244.18f, 48.15f)
                close()
                moveTo(128.0f, 84.0f)
                curveToRelative(44.0f, 0.0f, 81.14f, -9.69f, 100.0f, -14.77f)
                lineTo(228.0f, 177.08f)
                lineToRelative(-51.23f, -51.22f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -28.28f, 0.0f)
                lineTo(131.31f, 143.0f)
                lineTo(90.14f, 101.86f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -28.28f, 0.0f)
                lineTo(28.0f, 135.71f)
                lineTo(28.0f, 69.23f)
                curveTo(46.86f, 74.31f, 84.0f, 84.0f, 128.0f, 84.0f)
                close()
                moveTo(148.28f, 160.0f)
                lineTo(162.63f, 145.65f)
                lineTo(196.09f, 179.11f)
                curveToRelative(-10.09f, -2.0f, -21.52f, -3.93f, -33.94f, -5.25f)
                close()
                moveTo(28.0f, 186.76f)
                lineTo(28.0f, 169.65f)
                lineToRelative(48.0f, -48.0f)
                lineTo(126.35f, 172.0f)
                curveTo(83.12f, 172.24f, 46.74f, 181.7f, 28.0f, 186.76f)
                close()
                moveTo(184.0f, 108.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 184.0f, 108.0f)
                close()
            }
        }
        .build()
        return _panorama!!
    }

private var _panorama: ImageVector? = null
