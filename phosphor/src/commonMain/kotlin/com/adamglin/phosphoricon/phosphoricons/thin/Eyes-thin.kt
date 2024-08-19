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

public val ThinGroup.`Eyes-thin`: ImageVector
    get() {
        if (`_eyes-thin` != null) {
            return `_eyes-thin`!!
        }
        `_eyes-thin` = Builder(name = "Eyes-thin", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(213.45f, 63.86f)
                curveTo(203.65f, 45.89f, 190.35f, 36.0f, 176.0f, 36.0f)
                reflectiveCurveToRelative(-27.65f, 9.89f, -37.45f, 27.86f)
                arcTo(113.91f, 113.91f, 0.0f, false, false, 128.0f, 92.31f)
                arcToRelative(113.91f, 113.91f, 0.0f, false, false, -10.55f, -28.45f)
                curveTo(107.65f, 45.89f, 94.35f, 36.0f, 80.0f, 36.0f)
                reflectiveCurveTo(52.35f, 45.89f, 42.55f, 63.86f)
                curveTo(33.17f, 81.06f, 28.0f, 103.84f, 28.0f, 128.0f)
                reflectiveCurveToRelative(5.17f, 46.94f, 14.55f, 64.14f)
                curveTo(52.35f, 210.11f, 65.65f, 220.0f, 80.0f, 220.0f)
                reflectiveCurveToRelative(27.65f, -9.89f, 37.45f, -27.86f)
                arcTo(113.91f, 113.91f, 0.0f, false, false, 128.0f, 163.69f)
                arcToRelative(113.91f, 113.91f, 0.0f, false, false, 10.55f, 28.45f)
                curveToRelative(9.8f, 18.0f, 23.1f, 27.86f, 37.45f, 27.86f)
                reflectiveCurveToRelative(27.65f, -9.89f, 37.45f, -27.86f)
                curveToRelative(9.38f, -17.2f, 14.55f, -40.0f, 14.55f, -64.14f)
                reflectiveCurveTo(222.83f, 81.06f, 213.45f, 63.86f)
                close()
                moveTo(110.45f, 188.31f)
                curveTo(102.1f, 203.59f, 91.29f, 212.0f, 80.0f, 212.0f)
                reflectiveCurveToRelative(-22.1f, -8.41f, -30.43f, -23.69f)
                curveToRelative(-6.0f, -11.0f, -10.17f, -24.59f, -12.18f, -39.42f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, 0.0f, -41.78f)
                curveToRelative(2.0f, -14.83f, 6.17f, -28.39f, 12.18f, -39.42f)
                curveTo(57.9f, 52.41f, 68.71f, 44.0f, 80.0f, 44.0f)
                reflectiveCurveToRelative(22.1f, 8.41f, 30.43f, 23.69f)
                curveTo(119.18f, 83.73f, 124.0f, 105.15f, 124.0f, 128.0f)
                reflectiveCurveTo(119.18f, 172.27f, 110.43f, 188.31f)
                close()
                moveTo(36.0f, 128.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, 20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 36.0f, 128.0f)
                close()
                moveTo(206.43f, 188.31f)
                curveTo(198.1f, 203.59f, 187.29f, 212.0f, 176.0f, 212.0f)
                reflectiveCurveToRelative(-22.1f, -8.41f, -30.43f, -23.69f)
                curveToRelative(-6.0f, -11.0f, -10.17f, -24.59f, -12.18f, -39.42f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, 0.0f, -41.78f)
                curveToRelative(2.0f, -14.83f, 6.17f, -28.39f, 12.18f, -39.42f)
                curveTo(153.9f, 52.41f, 164.71f, 44.0f, 176.0f, 44.0f)
                reflectiveCurveToRelative(22.1f, 8.41f, 30.43f, 23.69f)
                curveTo(215.18f, 83.73f, 220.0f, 105.15f, 220.0f, 128.0f)
                reflectiveCurveTo(215.18f, 172.27f, 206.43f, 188.31f)
                close()
                moveTo(132.0f, 128.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, 20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 132.0f, 128.0f)
                close()
            }
        }
        .build()
        return `_eyes-thin`!!
    }

private var `_eyes-thin`: ImageVector? = null
