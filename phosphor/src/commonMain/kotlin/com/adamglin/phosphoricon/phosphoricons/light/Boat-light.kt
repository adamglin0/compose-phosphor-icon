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

public val LightGroup.`Boat-light`: ImageVector
    get() {
        if (`_boat-light` != null) {
            return `_boat-light`!!
        }
        `_boat-light` = Builder(name = "Boat-light", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(220.43f, 112.48f)
                lineTo(206.0f, 107.68f)
                lineTo(206.0f, 56.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, -14.0f)
                lineTo(134.0f, 42.0f)
                lineTo(134.0f, 24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                lineTo(122.0f, 42.0f)
                lineTo(64.0f, 42.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 50.0f, 56.0f)
                verticalLineToRelative(51.68f)
                lineToRelative(-14.43f, 4.8f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 26.0f, 125.77f)
                lineTo(26.0f, 152.0f)
                curveToRelative(0.0f, 60.0f, 96.44f, 84.79f, 100.54f, 85.82f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 2.92f, 0.0f)
                arcToRelative(235.44f, 235.44f, 0.0f, false, false, 49.4f, -19.54f)
                curveTo(212.32f, 200.15f, 230.0f, 177.24f, 230.0f, 152.0f)
                lineTo(230.0f, 125.77f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 220.43f, 112.48f)
                close()
                moveTo(62.0f, 56.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                lineTo(192.0f, 54.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(47.68f)
                lineTo(129.9f, 82.31f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -3.8f, 0.0f)
                lineTo(62.0f, 103.68f)
                close()
                moveTo(218.0f, 152.0f)
                curveToRelative(0.0f, 47.1f, -78.28f, 70.54f, -90.0f, 73.79f)
                curveTo(116.27f, 222.54f, 38.0f, 199.1f, 38.0f, 152.0f)
                lineTo(38.0f, 125.77f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.37f, -1.9f)
                lineTo(122.0f, 96.32f)
                lineTo(122.0f, 168.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(134.0f, 96.32f)
                lineToRelative(82.63f, 27.55f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.37f, 1.9f)
                close()
            }
        }
        .build()
        return `_boat-light`!!
    }

private var `_boat-light`: ImageVector? = null
