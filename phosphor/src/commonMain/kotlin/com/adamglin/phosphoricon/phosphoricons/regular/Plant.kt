package com.adamglin.phosphoricon.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.RegularGroup

public val RegularGroup.Plant: ImageVector
    get() {
        if (_plant != null) {
            return _plant!!
        }
        _plant = Builder(name = "Plant", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(247.63f, 47.89f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.52f, -7.52f)
                curveToRelative(-51.76f, -3.0f, -93.32f, 12.74f, -111.18f, 42.22f)
                curveToRelative(-11.8f, 19.49f, -11.78f, 43.16f, -0.16f, 65.74f)
                arcToRelative(71.34f, 71.34f, 0.0f, false, false, -14.17f, 27.0f)
                lineTo(98.33f, 159.0f)
                curveToRelative(7.82f, -16.33f, 7.52f, -33.35f, -1.0f, -47.49f)
                curveToRelative(-13.2f, -21.79f, -43.67f, -33.47f, -81.5f, -31.25f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.52f, 7.52f)
                curveToRelative(-2.23f, 37.83f, 9.46f, 68.3f, 31.25f, 81.5f)
                arcTo(45.82f, 45.82f, 0.0f, false, false, 63.44f, 176.0f)
                arcTo(54.58f, 54.58f, 0.0f, false, false, 87.0f, 170.33f)
                lineToRelative(25.0f, 25.0f)
                lineTo(112.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(128.0f, 194.51f)
                arcToRelative(55.61f, 55.61f, 0.0f, false, true, 12.27f, -35.0f)
                arcToRelative(73.91f, 73.91f, 0.0f, false, false, 33.31f, 8.4f)
                arcToRelative(60.9f, 60.9f, 0.0f, false, false, 31.83f, -8.86f)
                curveTo(234.89f, 141.21f, 250.67f, 99.65f, 247.63f, 47.89f)
                close()
                moveTo(47.81f, 155.6f)
                curveTo(32.47f, 146.31f, 23.79f, 124.32f, 24.0f, 96.0f)
                curveToRelative(28.32f, -0.24f, 50.31f, 8.47f, 59.6f, 23.81f)
                curveToRelative(4.85f, 8.0f, 5.64f, 17.33f, 2.46f, 26.94f)
                lineTo(61.65f, 122.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.31f, 11.31f)
                lineToRelative(24.41f, 24.41f)
                curveTo(65.14f, 161.24f, 55.82f, 160.45f, 47.81f, 155.6f)
                close()
                moveTo(197.12f, 145.38f)
                curveToRelative(-13.4f, 8.11f, -29.15f, 8.73f, -45.15f, 2.0f)
                lineToRelative(53.69f, -53.7f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.31f, -11.31f)
                lineTo(140.65f, 136.0f)
                curveToRelative(-6.76f, -16.0f, -6.15f, -31.76f, 2.0f, -45.15f)
                curveToRelative(13.94f, -23.0f, 47.0f, -35.82f, 89.33f, -34.83f)
                curveTo(232.94f, 98.34f, 220.14f, 131.44f, 197.12f, 145.38f)
                close()
            }
        }
        .build()
        return _plant!!
    }

private var _plant: ImageVector? = null
