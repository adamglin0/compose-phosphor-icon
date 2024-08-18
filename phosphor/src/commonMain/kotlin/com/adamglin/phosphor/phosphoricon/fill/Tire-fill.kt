package com.adamglin.phosphor.phosphoricon.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.FillGroup

public val FillGroup.`Tire-fill`: ImageVector
    get() {
        if (`_tire-fill` != null) {
            return `_tire-fill`!!
        }
        `_tire-fill` = Builder(name = "Tire-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(184.0f, 128.0f)
                curveToRelative(0.0f, 22.09f, -7.16f, 40.0f, -16.0f, 40.0f)
                reflectiveCurveToRelative(-16.0f, -17.91f, -16.0f, -40.0f)
                reflectiveCurveToRelative(7.16f, -40.0f, 16.0f, -40.0f)
                reflectiveCurveTo(184.0f, 105.91f, 184.0f, 128.0f)
                close()
                moveTo(240.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(92.0f, 232.0f)
                curveToRelative(-33.64f, 0.0f, -60.0f, -45.68f, -60.0f, -104.0f)
                reflectiveCurveTo(58.36f, 24.0f, 92.0f, 24.0f)
                horizontalLineToRelative(72.0f)
                curveToRelative(33.64f, 0.0f, 60.0f, 45.68f, 60.0f, 104.0f)
                curveToRelative(0.0f, 37.47f, -10.88f, 69.73f, -27.59f, 88.0f)
                lineTo(232.0f, 216.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 240.0f, 224.0f)
                close()
                moveTo(57.87f, 111.81f)
                arcToRelative(7.93f, 7.93f, 0.0f, false, false, 4.64f, -1.49f)
                lineTo(80.0f, 97.83f)
                lineToRelative(13.28f, 9.49f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 9.3f, -13.0f)
                lineTo(84.65f, 81.49f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -9.3f, 0.0f)
                lineTo(53.21f, 97.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.66f, 14.51f)
                close()
                moveTo(104.54f, 159.7f)
                lineTo(84.65f, 145.49f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -9.3f, 0.0f)
                lineTo(56.0f, 159.29f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 9.3f, 13.0f)
                lineTo(80.0f, 161.83f)
                lineToRelative(15.24f, 10.88f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 9.3f, -13.0f)
                close()
                moveTo(193.74f, 192.07f)
                curveToRelative(9.19f, -17.0f, 14.26f, -39.74f, 14.26f, -64.07f)
                reflectiveCurveToRelative(-5.07f, -47.09f, -14.26f, -64.07f)
                curveTo(185.38f, 48.5f, 174.82f, 40.0f, 164.0f, 40.0f)
                reflectiveCurveToRelative(-21.38f, 8.5f, -29.74f, 23.93f)
                curveTo(125.07f, 80.91f, 120.0f, 103.67f, 120.0f, 128.0f)
                reflectiveCurveToRelative(5.07f, 47.09f, 14.26f, 64.07f)
                curveTo(142.62f, 207.5f, 153.18f, 216.0f, 164.0f, 216.0f)
                reflectiveCurveTo(185.38f, 207.5f, 193.74f, 192.07f)
                close()
            }
        }
        .build()
        return `_tire-fill`!!
    }

private var `_tire-fill`: ImageVector? = null
