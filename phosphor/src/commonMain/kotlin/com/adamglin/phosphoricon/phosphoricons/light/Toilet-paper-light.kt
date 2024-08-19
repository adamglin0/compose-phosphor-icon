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

public val LightGroup.`Toilet-paper-light`: ImageVector
    get() {
        if (`_toilet-paper-light` != null) {
            return `_toilet-paper-light`!!
        }
        `_toilet-paper-light` = Builder(name = "Toilet-paper-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(74.0f, 120.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 74.0f, 120.0f)
                close()
                moveTo(238.0f, 120.0f)
                verticalLineToRelative(88.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, 14.0f)
                lineTo(112.0f, 222.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, -14.0f)
                lineTo(98.0f, 178.48f)
                curveTo(89.65f, 195.49f, 77.6f, 206.0f, 64.0f, 206.0f)
                curveToRelative(-25.79f, 0.0f, -46.0f, -37.78f, -46.0f, -86.0f)
                reflectiveCurveTo(38.21f, 34.0f, 64.0f, 34.0f)
                lineTo(192.0f, 34.0f)
                curveTo(217.79f, 34.0f, 238.0f, 71.78f, 238.0f, 120.0f)
                close()
                moveTo(98.0f, 120.0f)
                curveToRelative(0.0f, -44.26f, -17.58f, -74.0f, -34.0f, -74.0f)
                reflectiveCurveTo(30.0f, 75.74f, 30.0f, 120.0f)
                reflectiveCurveToRelative(17.58f, 74.0f, 34.0f, 74.0f)
                reflectiveCurveTo(98.0f, 164.27f, 98.0f, 120.0f)
                close()
                moveTo(226.0f, 208.0f)
                lineTo(226.0f, 126.0f)
                lineTo(208.0f, 126.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(17.88f)
                curveTo(224.37f, 73.08f, 207.67f, 46.0f, 192.0f, 46.0f)
                lineTo(87.76f, 46.0f)
                curveToRelative(12.57f, 13.92f, 21.09f, 38.74f, 22.12f, 68.0f)
                lineTo(128.0f, 114.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                lineTo(110.0f, 126.0f)
                verticalLineToRelative(82.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                lineTo(224.0f, 210.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 226.0f, 208.0f)
                close()
                moveTo(176.0f, 114.0f)
                lineTo(160.0f, 114.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
            }
        }
        .build()
        return `_toilet-paper-light`!!
    }

private var `_toilet-paper-light`: ImageVector? = null
