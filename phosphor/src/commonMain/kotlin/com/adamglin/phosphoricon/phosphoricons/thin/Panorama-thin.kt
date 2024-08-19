package com.adamglin.phosphoricon.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.ThinGroup

public val ThinGroup.`Panorama-thin`: ImageVector
    get() {
        if (`_panorama-thin` != null) {
            return `_panorama-thin`!!
        }
        `_panorama-thin` = Builder(name = "Panorama-thin", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(239.31f, 54.49f)
                arcToRelative(11.88f, 11.88f, 0.0f, false, false, -10.39f, -2.08f)
                lineToRelative(-3.47f, 0.93f)
                curveTo(206.47f, 58.47f, 171.14f, 68.0f, 128.0f, 68.0f)
                reflectiveCurveTo(49.53f, 58.47f, 30.55f, 53.34f)
                lineToRelative(-3.47f, -0.93f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 12.0f, 64.0f)
                lineTo(12.0f, 192.0f)
                arcToRelative(11.95f, 11.95f, 0.0f, false, false, 15.09f, 11.59f)
                lineToRelative(3.18f, -0.85f)
                curveTo(49.27f, 197.58f, 84.64f, 188.0f, 128.0f, 188.0f)
                reflectiveCurveToRelative(78.73f, 9.58f, 97.73f, 14.73f)
                lineToRelative(3.18f, 0.85f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 244.0f, 192.0f)
                lineTo(244.0f, 64.0f)
                arcTo(11.92f, 11.92f, 0.0f, false, false, 239.31f, 54.49f)
                close()
                moveTo(21.57f, 60.83f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 24.0f, 60.0f)
                arcToRelative(4.19f, 4.19f, 0.0f, false, true, 1.0f, 0.14f)
                lineToRelative(3.44f, 0.93f)
                curveTo(47.8f, 66.29f, 83.8f, 76.0f, 128.0f, 76.0f)
                reflectiveCurveToRelative(80.2f, -9.71f, 99.54f, -14.93f)
                lineToRelative(3.45f, -0.93f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 236.0f, 64.0f)
                lineTo(236.0f, 192.0f)
                curveToRelative(0.0f, 0.13f, 0.0f, 0.24f, 0.0f, 0.37f)
                lineToRelative(-64.85f, -64.85f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 0.0f)
                lineToRelative(-22.83f, 22.83f)
                lineTo(84.49f, 103.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 0.0f)
                lineTo(20.0f, 151.0f)
                lineTo(20.0f, 64.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 21.57f, 60.83f)
                close()
                moveTo(28.17f, 195.0f)
                lineToRelative(-3.15f, 0.85f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 20.0f, 192.0f)
                lineTo(20.0f, 162.34f)
                lineToRelative(53.17f, -53.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, 0.0f)
                lineToRelative(71.67f, 71.67f)
                curveToRelative(-7.24f, -0.53f, -14.76f, -0.84f, -22.5f, -0.84f)
                curveTo(83.57f, 180.0f, 46.16f, 190.13f, 28.17f, 195.0f)
                close()
                moveTo(163.0f, 182.0f)
                lineToRelative(-26.0f, -26.0f)
                lineToRelative(22.83f, -22.83f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, 0.0f)
                lineToRelative(61.64f, 61.64f)
                curveTo(214.0f, 191.25f, 191.11f, 185.14f, 163.0f, 182.0f)
                close()
                moveTo(196.0f, 108.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 196.0f, 108.0f)
                close()
            }
        }
        .build()
        return `_panorama-thin`!!
    }

private var `_panorama-thin`: ImageVector? = null
