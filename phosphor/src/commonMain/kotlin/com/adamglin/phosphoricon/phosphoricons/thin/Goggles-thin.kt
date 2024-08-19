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

public val ThinGroup.`Goggles-thin`: ImageVector
    get() {
        if (`_goggles-thin` != null) {
            return `_goggles-thin`!!
        }
        `_goggles-thin` = Builder(name = "Goggles-thin", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(252.0f, 136.0f)
                arcToRelative(68.07f, 68.07f, 0.0f, false, false, -68.0f, -68.0f)
                lineTo(72.0f, 68.0f)
                arcTo(68.07f, 68.07f, 0.0f, false, false, 4.0f, 136.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 16.35f, 19.65f)
                curveTo(23.91f, 174.84f, 54.81f, 188.0f, 72.0f, 188.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 35.77f, -32.0f)
                horizontalLineToRelative(40.46f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 184.0f, 188.0f)
                curveToRelative(17.19f, 0.0f, 48.09f, -13.16f, 51.65f, -32.35f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 252.0f, 136.0f)
                close()
                moveTo(28.0f, 152.0f)
                curveToRelative(0.0f, -7.75f, 7.92f, -15.25f, 17.81f, -20.53f)
                lineToRelative(43.0f, 42.95f)
                arcTo(27.89f, 27.89f, 0.0f, false, true, 72.0f, 180.0f)
                curveTo(55.45f, 180.0f, 28.0f, 166.44f, 28.0f, 152.0f)
                close()
                moveTo(94.42f, 168.76f)
                lineTo(53.58f, 127.92f)
                curveTo(60.0f, 125.46f, 66.58f, 124.0f, 72.0f, 124.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 22.42f, 44.76f)
                close()
                moveTo(156.0f, 152.0f)
                arcToRelative(27.94f, 27.94f, 0.0f, false, true, 9.42f, -20.92f)
                lineTo(208.0f, 173.65f)
                curveToRelative(-8.0f, 3.91f, -17.0f, 6.35f, -24.0f, 6.35f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 156.0f, 152.0f)
                close()
                moveTo(215.2f, 169.55f)
                lineTo(172.25f, 126.55f)
                arcTo(27.86f, 27.86f, 0.0f, false, true, 184.0f, 124.0f)
                curveToRelative(16.55f, 0.0f, 44.0f, 13.56f, 44.0f, 28.0f)
                curveTo(228.0f, 158.39f, 222.62f, 164.6f, 215.2f, 169.55f)
                close()
                moveTo(235.46f, 147.49f)
                curveTo(231.15f, 128.77f, 200.93f, 116.0f, 184.0f, 116.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -35.77f, 32.0f)
                lineTo(107.77f, 148.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 72.0f, 116.0f)
                curveToRelative(-16.93f, 0.0f, -47.15f, 12.77f, -51.46f, 31.49f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 12.0f, 136.0f)
                arcTo(60.07f, 60.07f, 0.0f, false, true, 72.0f, 76.0f)
                lineTo(184.0f, 76.0f)
                arcToRelative(60.07f, 60.07f, 0.0f, false, true, 60.0f, 60.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 235.46f, 147.49f)
                close()
            }
        }
        .build()
        return `_goggles-thin`!!
    }

private var `_goggles-thin`: ImageVector? = null
