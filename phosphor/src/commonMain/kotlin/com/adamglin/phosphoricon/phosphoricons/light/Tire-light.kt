package com.adamglin.phosphoricon.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.LightGroup

public val LightGroup.`Tire-light`: ImageVector
    get() {
        if (`_tire-light` != null) {
            return `_tire-light`!!
        }
        `_tire-light` = Builder(name = "Tire-light", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(168.0f, 174.0f)
                curveToRelative(14.44f, 0.0f, 22.0f, -23.14f, 22.0f, -46.0f)
                reflectiveCurveToRelative(-7.56f, -46.0f, -22.0f, -46.0f)
                reflectiveCurveToRelative(-22.0f, 23.14f, -22.0f, 46.0f)
                reflectiveCurveTo(153.56f, 174.0f, 168.0f, 174.0f)
                close()
                moveTo(168.0f, 94.0f)
                curveToRelative(2.57f, 0.0f, 10.0f, 11.69f, 10.0f, 34.0f)
                reflectiveCurveToRelative(-7.43f, 34.0f, -10.0f, 34.0f)
                reflectiveCurveToRelative(-10.0f, -11.69f, -10.0f, -34.0f)
                reflectiveCurveTo(165.43f, 94.0f, 168.0f, 94.0f)
                close()
                moveTo(232.0f, 218.0f)
                lineTo(191.71f, 218.0f)
                curveTo(209.89f, 201.0f, 222.0f, 167.43f, 222.0f, 128.0f)
                curveToRelative(0.0f, -57.2f, -25.48f, -102.0f, -58.0f, -102.0f)
                lineTo(92.0f, 26.0f)
                curveTo(59.48f, 26.0f, 34.0f, 70.8f, 34.0f, 128.0f)
                reflectiveCurveTo(59.48f, 230.0f, 92.0f, 230.0f)
                lineTo(232.0f, 230.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(210.0f, 128.0f)
                curveToRelative(0.0f, 48.79f, -21.07f, 90.0f, -46.0f, 90.0f)
                reflectiveCurveToRelative(-46.0f, -41.21f, -46.0f, -90.0f)
                reflectiveCurveToRelative(21.07f, -90.0f, 46.0f, -90.0f)
                reflectiveCurveTo(210.0f, 79.21f, 210.0f, 128.0f)
                close()
                moveTo(46.0f, 128.0f)
                curveToRelative(0.0f, -2.86f, 0.08f, -5.69f, 0.22f, -8.5f)
                lineTo(80.0f, 95.37f)
                lineToRelative(26.5f, 18.93f)
                curveToRelative(-0.33f, 4.47f, -0.5f, 9.0f, -0.5f, 13.7f)
                arcToRelative(175.72f, 175.72f, 0.0f, false, false, 4.0f, 38.08f)
                lineToRelative(-26.55f, -19.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -7.0f, 0.0f)
                lineToRelative(-26.1f, 18.64f)
                arcTo(160.24f, 160.24f, 0.0f, false, true, 46.0f, 128.0f)
                close()
                moveTo(92.0f, 38.0f)
                horizontalLineToRelative(44.29f)
                curveTo(122.49f, 50.92f, 112.2f, 73.35f, 108.0f, 100.65f)
                lineTo(83.49f, 83.12f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -7.0f, 0.0f)
                lineTo(47.79f, 103.63f)
                curveTo(53.37f, 66.24f, 71.36f, 38.0f, 92.0f, 38.0f)
                close()
                moveTo(92.0f, 218.0f)
                curveTo(76.42f, 218.0f, 62.36f, 201.92f, 54.0f, 178.0f)
                lineToRelative(26.0f, -18.58f)
                lineToRelative(35.53f, 25.39f)
                curveToRelative(5.22f, 13.92f, 12.34f, 25.35f, 20.76f, 33.24f)
                close()
            }
        }
        .build()
        return `_tire-light`!!
    }

private var `_tire-light`: ImageVector? = null
