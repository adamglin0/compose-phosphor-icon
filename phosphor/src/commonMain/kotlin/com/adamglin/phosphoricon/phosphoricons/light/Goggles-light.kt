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

public val LightGroup.`Goggles-light`: ImageVector
    get() {
        if (`_goggles-light` != null) {
            return `_goggles-light`!!
        }
        `_goggles-light` = Builder(name = "Goggles-light", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(254.0f, 136.0f)
                arcToRelative(70.08f, 70.08f, 0.0f, false, false, -70.0f, -70.0f)
                lineTo(72.0f, 66.0f)
                arcTo(70.08f, 70.08f, 0.0f, false, false, 2.0f, 136.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 16.68f, 21.35f)
                curveToRelative(2.06f, 8.24f, 8.85f, 16.06f, 19.64f, 22.44f)
                reflectiveCurveTo(61.87f, 190.0f, 72.0f, 190.0f)
                arcToRelative(38.05f, 38.05f, 0.0f, false, false, 37.52f, -32.0f)
                horizontalLineToRelative(37.0f)
                arcTo(38.05f, 38.05f, 0.0f, false, false, 184.0f, 190.0f)
                curveToRelative(10.13f, 0.0f, 23.0f, -3.91f, 33.68f, -10.21f)
                reflectiveCurveToRelative(17.58f, -14.2f, 19.64f, -22.44f)
                arcTo(22.0f, 22.0f, 0.0f, false, false, 254.0f, 136.0f)
                close()
                moveTo(44.43f, 169.46f)
                curveTo(35.26f, 164.0f, 30.0f, 157.67f, 30.0f, 152.0f)
                curveToRelative(0.0f, -6.64f, 6.77f, -13.19f, 15.45f, -18.06f)
                lineToRelative(40.19f, 40.18f)
                arcTo(25.81f, 25.81f, 0.0f, false, true, 72.0f, 178.0f)
                curveTo(64.14f, 178.0f, 53.06f, 174.57f, 44.43f, 169.46f)
                close()
                moveTo(94.12f, 165.64f)
                lineTo(57.24f, 128.75f)
                arcTo(48.84f, 48.84f, 0.0f, false, true, 72.0f, 126.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, 22.12f, 39.64f)
                close()
                moveTo(158.0f, 152.0f)
                arcToRelative(25.89f, 25.89f, 0.0f, false, true, 7.39f, -18.13f)
                lineTo(204.55f, 173.0f)
                curveToRelative(-7.07f, 3.07f, -14.63f, 5.0f, -20.55f, 5.0f)
                arcTo(26.0f, 26.0f, 0.0f, false, true, 158.0f, 152.0f)
                close()
                moveTo(215.46f, 167.0f)
                lineTo(175.81f, 127.36f)
                arcTo(25.84f, 25.84f, 0.0f, false, true, 184.0f, 126.0f)
                curveToRelative(7.86f, 0.0f, 18.94f, 3.43f, 27.57f, 8.54f)
                curveTo(220.74f, 140.0f, 226.0f, 146.33f, 226.0f, 152.0f)
                curveTo(226.0f, 157.32f, 221.65f, 162.58f, 215.46f, 167.0f)
                close()
                moveTo(236.77f, 144.82f)
                curveToRelative(-2.57f, -7.56f, -9.12f, -14.68f, -19.09f, -20.58f)
                curveTo(207.0f, 117.91f, 194.13f, 114.0f, 184.0f, 114.0f)
                arcToRelative(38.05f, 38.05f, 0.0f, false, false, -37.52f, 32.0f)
                horizontalLineToRelative(-37.0f)
                arcTo(38.05f, 38.05f, 0.0f, false, false, 72.0f, 114.0f)
                curveToRelative(-10.13f, 0.0f, -23.0f, 3.91f, -33.68f, 10.21f)
                curveToRelative(-10.0f, 5.9f, -16.52f, 13.0f, -19.09f, 20.58f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 14.0f, 136.0f)
                arcTo(58.07f, 58.07f, 0.0f, false, true, 72.0f, 78.0f)
                lineTo(184.0f, 78.0f)
                arcToRelative(58.07f, 58.07f, 0.0f, false, true, 58.0f, 58.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 236.77f, 144.79f)
                close()
            }
        }
        .build()
        return `_goggles-light`!!
    }

private var `_goggles-light`: ImageVector? = null
