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

public val ThinGroup.`Football-thin`: ImageVector
    get() {
        if (`_football-thin` != null) {
            return `_football-thin`!!
        }
        `_football-thin` = Builder(name = "Football-thin", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(225.12f, 54.56f)
                arcToRelative(28.94f, 28.94f, 0.0f, false, false, -23.68f, -23.68f)
                curveToRelative(-31.61f, -5.36f, -91.16f, -7.83f, -134.78f, 35.78f)
                reflectiveCurveTo(25.52f, 169.83f, 30.88f, 201.44f)
                arcToRelative(28.94f, 28.94f, 0.0f, false, false, 23.68f, 23.68f)
                arcTo(203.34f, 203.34f, 0.0f, false, false, 88.25f, 228.0f)
                curveToRelative(31.3f, 0.0f, 70.19f, -7.77f, 101.09f, -38.66f)
                curveTo(233.0f, 145.72f, 230.48f, 86.17f, 225.12f, 54.56f)
                close()
                moveTo(167.42f, 35.9f)
                arcToRelative(196.29f, 196.29f, 0.0f, false, true, 32.69f, 2.86f)
                arcToRelative(21.0f, 21.0f, 0.0f, false, true, 17.13f, 17.13f)
                arcTo(185.26f, 185.26f, 0.0f, false, true, 219.56f, 102.0f)
                lineTo(154.0f, 36.43f)
                curveTo(158.33f, 36.09f, 162.79f, 35.9f, 167.42f, 35.9f)
                close()
                moveTo(55.89f, 217.24f)
                arcToRelative(21.0f, 21.0f, 0.0f, false, true, -17.13f, -17.13f)
                arcTo(185.26f, 185.26f, 0.0f, false, true, 36.44f, 154.0f)
                lineTo(102.0f, 219.56f)
                arcTo(185.26f, 185.26f, 0.0f, false, true, 55.89f, 217.24f)
                close()
                moveTo(183.68f, 183.68f)
                curveToRelative(-12.22f, 12.23f, -35.23f, 29.34f, -71.56f, 34.73f)
                lineTo(37.59f, 143.88f)
                curveTo(43.0f, 107.55f, 60.09f, 84.54f, 72.32f, 72.32f)
                reflectiveCurveTo(107.56f, 43.0f, 143.89f, 37.6f)
                lineToRelative(74.52f, 74.52f)
                curveTo(213.0f, 148.45f, 195.91f, 171.46f, 183.68f, 183.68f)
                close()
                moveTo(162.81f, 93.19f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 5.65f)
                lineTo(145.65f, 116.0f)
                lineToRelative(9.17f, 9.16f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, 5.66f)
                lineTo(140.0f, 121.66f)
                lineTo(121.66f, 140.0f)
                lineToRelative(9.17f, 9.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, 5.66f)
                lineTo(116.0f, 145.65f)
                lineTo(98.84f, 162.81f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -5.65f, -5.65f)
                lineTo(110.35f, 140.0f)
                lineToRelative(-9.17f, -9.16f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 5.66f, -5.66f)
                lineToRelative(9.17f, 9.17f)
                lineTo(134.34f, 116.0f)
                lineToRelative(-9.17f, -9.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 5.66f, -5.66f)
                lineToRelative(9.16f, 9.17f)
                lineToRelative(17.17f, -17.16f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 162.81f, 93.19f)
                close()
            }
        }
        .build()
        return `_football-thin`!!
    }

private var `_football-thin`: ImageVector? = null
