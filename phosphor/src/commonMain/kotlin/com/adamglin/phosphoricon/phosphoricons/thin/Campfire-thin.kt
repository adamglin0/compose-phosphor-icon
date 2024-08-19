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

public val ThinGroup.`Campfire-thin`: ImageVector
    get() {
        if (`_campfire-thin` != null) {
            return `_campfire-thin`!!
        }
        `_campfire-thin` = Builder(name = "Campfire-thin", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(219.81f, 225.21f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 216.0f, 228.0f)
                arcToRelative(3.92f, 3.92f, 0.0f, false, true, -1.21f, -0.19f)
                lineTo(128.0f, 200.2f)
                lineTo(41.21f, 227.81f)
                arcTo(3.92f, 3.92f, 0.0f, false, true, 40.0f, 228.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.21f, -7.81f)
                lineToRelative(76.0f, -24.19f)
                lineToRelative(-76.0f, -24.19f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 2.42f, -7.62f)
                lineTo(128.0f, 191.8f)
                lineToRelative(86.79f, -27.61f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 2.42f, 7.62f)
                lineToRelative(-76.0f, 24.19f)
                lineToRelative(76.0f, 24.19f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 219.81f, 225.21f)
                close()
                moveTo(72.0f, 108.0f)
                curveToRelative(0.0f, -19.0f, 9.38f, -38.85f, 27.12f, -57.27f)
                arcTo(152.0f, 152.0f, 0.0f, false, true, 125.9f, 28.59f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.2f, 0.0f)
                arcToRelative(152.0f, 152.0f, 0.0f, false, true, 26.78f, 22.14f)
                curveTo(174.62f, 69.15f, 184.0f, 89.0f, 184.0f, 108.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, true, -54.56f, 56.0f)
                curveToRelative(-0.48f, 0.0f, -1.0f, 0.0f, -1.44f, 0.0f)
                reflectiveCurveToRelative(-1.0f, 0.0f, -1.44f, 0.0f)
                arcTo(56.0f, 56.0f, 0.0f, false, true, 72.0f, 108.0f)
                close()
                moveTo(128.0f, 156.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                curveToRelative(0.0f, -17.39f, -14.37f, -30.53f, -20.0f, -35.0f)
                curveToRelative(-5.63f, 4.48f, -20.0f, 17.62f, -20.0f, 35.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 128.0f, 156.0f)
                close()
                moveTo(80.0f, 108.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, 23.28f, 41.13f)
                arcTo(27.83f, 27.83f, 0.0f, false, true, 100.0f, 136.0f)
                curveToRelative(0.0f, -25.84f, 24.73f, -42.63f, 25.78f, -43.33f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.44f, 0.0f)
                curveToRelative(1.05f, 0.7f, 25.78f, 17.49f, 25.78f, 43.33f)
                arcToRelative(27.83f, 27.83f, 0.0f, false, true, -3.28f, 13.13f)
                arcTo(48.0f, 48.0f, 0.0f, false, false, 176.0f, 108.0f)
                curveToRelative(0.0f, -36.37f, -38.49f, -64.76f, -48.0f, -71.21f)
                curveTo(118.5f, 43.25f, 80.0f, 71.68f, 80.0f, 108.0f)
                close()
            }
        }
        .build()
        return `_campfire-thin`!!
    }

private var `_campfire-thin`: ImageVector? = null
