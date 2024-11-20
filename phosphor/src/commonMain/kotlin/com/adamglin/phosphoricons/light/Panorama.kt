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

public val LightGroup.Panorama: ImageVector
    get() {
        if (_panorama != null) {
            return _panorama!!
        }
        _panorama = Builder(name = "Panorama", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.53f, 52.9f)
                arcToRelative(13.88f, 13.88f, 0.0f, false, false, -12.12f, -2.42f)
                lineToRelative(-3.48f, 0.94f)
                curveTo(206.0f, 56.51f, 170.87f, 66.0f, 128.0f, 66.0f)
                reflectiveCurveTo(50.0f, 56.51f, 31.07f, 51.42f)
                lineToRelative(-3.48f, -0.94f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 10.0f, 64.0f)
                verticalLineTo(192.0f)
                arcToRelative(13.95f, 13.95f, 0.0f, false, false, 17.61f, 13.52f)
                lineToRelative(3.18f, -0.85f)
                curveTo(49.7f, 199.53f, 84.91f, 190.0f, 128.0f, 190.0f)
                reflectiveCurveToRelative(78.3f, 9.53f, 97.21f, 14.66f)
                lineToRelative(3.18f, 0.85f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 246.0f, 192.0f)
                verticalLineTo(64.0f)
                arcTo(13.93f, 13.93f, 0.0f, false, false, 240.53f, 52.9f)
                close()
                moveTo(22.78f, 62.42f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 24.0f, 62.0f)
                arcToRelative(2.06f, 2.06f, 0.0f, false, true, 0.52f, 0.08f)
                lineToRelative(3.44f, 0.92f)
                curveTo(47.37f, 68.24f, 83.54f, 78.0f, 128.0f, 78.0f)
                reflectiveCurveToRelative(80.63f, -9.76f, 100.06f, -15.0f)
                lineToRelative(3.44f, -0.92f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 234.0f, 64.0f)
                verticalLineTo(187.57f)
                lineTo(172.53f, 126.1f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -19.8f, 0.0f)
                lineToRelative(-21.42f, 21.41f)
                lineTo(85.9f, 102.1f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -19.8f, 0.0f)
                lineTo(22.0f, 146.2f)
                verticalLineTo(64.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 22.78f, 62.42f)
                close()
                moveTo(220.41f, 191.0f)
                arcToRelative(400.39f, 400.39f, 0.0f, false, false, -56.52f, -10.86f)
                lineTo(139.8f, 156.0f)
                lineToRelative(21.41f, -21.41f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.83f, 0.0f)
                close()
                moveTo(27.65f, 193.07f)
                lineToRelative(-3.15f, 0.86f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 22.0f, 192.0f)
                verticalLineTo(163.17f)
                lineToRelative(52.58f, -52.58f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.84f, 0.0f)
                lineToRelative(67.91f, 67.91f)
                curveToRelative(-5.63f, -0.32f, -11.42f, -0.5f, -17.33f, -0.5f)
                curveTo(83.31f, 178.0f, 45.72f, 188.18f, 27.65f, 193.07f)
                close()
                moveTo(194.0f, 108.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 10.0f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 194.0f, 108.0f)
                close()
            }
        }
        .build()
        return _panorama!!
    }

private var _panorama: ImageVector? = null
