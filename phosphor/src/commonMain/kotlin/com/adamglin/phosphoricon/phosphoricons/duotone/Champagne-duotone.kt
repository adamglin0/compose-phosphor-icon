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

public val DuotoneGroup.`Champagne-duotone`: ImageVector
    get() {
        if (`_champagne-duotone` != null) {
            return `_champagne-duotone`!!
        }
        `_champagne-duotone` = Builder(name = "Champagne-duotone", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(120.0f, 176.0f)
                curveToRelative(-44.7f, 0.0f, -43.7f, -57.87f, -35.8f, -104.0f)
                horizontalLineToRelative(71.6f)
                curveTo(163.7f, 118.13f, 164.7f, 176.0f, 120.0f, 176.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(149.91f, 13.53f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 142.3f, 8.0f)
                lineTo(97.71f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.61f, 5.53f)
                arcToRelative(451.0f, 451.0f, 0.0f, false, false, -14.21f, 59.7f)
                curveToRelative(-7.26f, 44.25f, -4.35f, 75.76f, 8.65f, 93.66f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 112.0f, 183.42f)
                lineTo(112.0f, 232.0f)
                lineTo(96.0f, 232.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 0.0f, 16.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(128.0f, 232.0f)
                lineTo(128.0f, 183.42f)
                arcToRelative(39.94f, 39.94f, 0.0f, false, false, 27.46f, -16.53f)
                curveToRelative(13.0f, -17.9f, 15.92f, -49.41f, 8.66f, -93.66f)
                arcTo(451.0f, 451.0f, 0.0f, false, false, 149.91f, 13.53f)
                close()
                moveTo(103.59f, 24.0f)
                horizontalLineToRelative(32.83f)
                curveToRelative(3.06f, 10.19f, 6.77f, 24.42f, 9.8f, 40.0f)
                lineTo(93.8f, 64.0f)
                curveTo(96.83f, 48.42f, 100.53f, 34.19f, 103.59f, 24.0f)
                close()
                moveTo(142.52f, 157.48f)
                curveTo(137.38f, 164.56f, 130.0f, 168.0f, 120.0f, 168.0f)
                reflectiveCurveToRelative(-17.37f, -3.44f, -22.51f, -10.51f)
                curveTo(85.9f, 141.54f, 86.55f, 110.0f, 91.0f, 80.0f)
                lineTo(149.0f, 80.0f)
                curveTo(153.47f, 110.0f, 154.12f, 141.52f, 142.52f, 157.48f)
                close()
                moveTo(232.0f, 52.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 232.0f, 52.0f)
                close()
                moveTo(184.0f, 20.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 184.0f, 20.0f)
                close()
                moveTo(208.0f, 100.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 208.0f, 100.0f)
                close()
            }
        }
        .build()
        return `_champagne-duotone`!!
    }

private var `_champagne-duotone`: ImageVector? = null
