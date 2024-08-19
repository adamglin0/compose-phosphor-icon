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

public val ThinGroup.`Fish-thin`: ImageVector
    get() {
        if (`_fish-thin` != null) {
            return `_fish-thin`!!
        }
        `_fish-thin` = Builder(name = "Fish-thin", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(164.0f, 76.05f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 164.0f, 76.05f)
                close()
                moveTo(213.23f, 141.73f)
                curveToRelative(-19.0f, 34.15f, -54.76f, 52.35f, -106.43f, 54.13f)
                lineToRelative(-23.0f, 53.72f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 80.1f, 252.0f)
                horizontalLineToRelative(-0.26f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.59f, -2.89f)
                lineTo(60.84f, 195.17f)
                lineTo(6.9f, 179.73f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -0.47f, -7.52f)
                lineToRelative(53.72f, -23.0f)
                curveTo(62.0f, 97.6f, 80.16f, 61.81f, 114.3f, 42.85f)
                curveToRelative(45.5f, -25.27f, 103.78f, -11.0f, 106.76f, -9.27f)
                arcTo(4.08f, 4.08f, 0.0f, false, true, 222.48f, 35.0f)
                curveToRelative(0.87f, 1.48f, 4.72f, 16.94f, 5.42f, 36.95f)
                curveTo(228.54f, 90.57f, 226.52f, 117.79f, 213.23f, 141.73f)
                close()
                moveTo(172.77f, 171.5f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 132.0f, 124.0f)
                horizontalLineToRelative(0.0f)
                arcTo(48.05f, 48.05f, 0.0f, false, true, 84.53f, 83.29f)
                curveToRelative(-10.27f, 18.0f, -15.79f, 40.95f, -16.46f, 68.71f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.42f, 3.58f)
                lineTo(19.92f, 175.14f)
                lineToRelative(45.26f, 13.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.74f, 2.74f)
                lineToRelative(12.93f, 45.25f)
                lineToRelative(19.6f, -45.72f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.58f, -2.43f)
                curveTo(131.81f, 187.28f, 154.78f, 181.77f, 172.77f, 171.5f)
                close()
                moveTo(220.0f, 77.25f)
                arcToRelative(169.58f, 169.58f, 0.0f, false, false, -4.2f, -37.0f)
                arcToRelative(169.46f, 169.46f, 0.0f, false, false, -37.0f, -4.2f)
                curveToRelative(-18.81f, -0.12f, -45.93f, 3.0f, -68.2f, 18.49f)
                arcTo(85.22f, 85.22f, 0.0f, false, false, 92.24f, 71.84f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 43.58f, 44.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.36f, 4.36f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 44.06f, 43.56f)
                arcToRelative(85.31f, 85.31f, 0.0f, false, false, 17.26f, -18.33f)
                curveTo(210.0f, 133.16f, 220.18f, 111.35f, 220.0f, 77.25f)
                close()
            }
        }
        .build()
        return `_fish-thin`!!
    }

private var `_fish-thin`: ImageVector? = null
