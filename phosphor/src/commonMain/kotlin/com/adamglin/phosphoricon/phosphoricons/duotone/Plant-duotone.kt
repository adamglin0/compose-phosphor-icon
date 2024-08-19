package com.adamglin.phosphoricon.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.DuotoneGroup

public val DuotoneGroup.`Plant-duotone`: ImageVector
    get() {
        if (`_plant-duotone` != null) {
            return `_plant-duotone`!!
        }
        `_plant-duotone` = Builder(name = "Plant-duotone", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(138.54f, 149.46f)
                curveTo(106.62f, 96.25f, 149.18f, 43.05f, 239.63f, 48.37f)
                curveTo(245.0f, 138.82f, 191.75f, 181.39f, 138.54f, 149.46f)
                close()
                moveTo(16.26f, 88.26f)
                curveToRelative(-3.8f, 64.61f, 34.21f, 95.0f, 72.21f, 72.21f)
                curveTo(111.27f, 122.47f, 80.87f, 84.46f, 16.26f, 88.26f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(247.63f, 47.89f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.52f, -7.52f)
                curveToRelative(-51.76f, -3.0f, -93.32f, 12.74f, -111.18f, 42.22f)
                curveToRelative(-11.8f, 19.48f, -11.78f, 43.16f, -0.16f, 65.74f)
                arcToRelative(71.37f, 71.37f, 0.0f, false, false, -14.17f, 26.95f)
                lineTo(98.33f, 159.0f)
                curveToRelative(7.82f, -16.33f, 7.52f, -33.36f, -1.0f, -47.49f)
                curveTo(84.09f, 89.73f, 53.62f, 78.0f, 15.79f, 80.27f)
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
                moveTo(86.06f, 146.74f)
                lineToRelative(-24.41f, -24.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.31f, 11.31f)
                lineToRelative(24.41f, 24.41f)
                curveToRelative(-9.61f, 3.18f, -18.93f, 2.39f, -26.94f, -2.46f)
                curveTo(32.47f, 146.31f, 23.79f, 124.32f, 24.0f, 96.0f)
                curveToRelative(28.31f, -0.25f, 50.31f, 8.47f, 59.6f, 23.81f)
                curveTo(88.45f, 127.82f, 89.24f, 137.14f, 86.06f, 146.74f)
                close()
                moveTo(197.12f, 145.38f)
                curveToRelative(-13.4f, 8.11f, -29.15f, 8.73f, -45.15f, 2.0f)
                lineToRelative(53.69f, -53.7f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.31f, -11.32f)
                lineTo(140.65f, 136.0f)
                curveToRelative(-6.76f, -16.0f, -6.15f, -31.76f, 2.0f, -45.15f)
                curveToRelative(13.94f, -23.0f, 47.0f, -35.8f, 89.33f, -34.83f)
                curveTo(232.94f, 98.34f, 220.14f, 131.44f, 197.12f, 145.38f)
                close()
            }
        }
        .build()
        return `_plant-duotone`!!
    }

private var `_plant-duotone`: ImageVector? = null
