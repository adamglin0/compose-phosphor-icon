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

public val LightGroup.`Needle-light`: ImageVector
    get() {
        if (`_needle-light` != null) {
            return `_needle-light`!!
        }
        `_needle-light` = Builder(name = "Needle-light", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(188.24f, 67.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 8.48f)
                lineToRelative(-16.0f, 16.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.48f, -8.48f)
                lineToRelative(16.0f, -16.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 188.24f, 67.76f)
                close()
                moveTo(222.0f, 72.0f)
                arcToRelative(37.74f, 37.74f, 0.0f, false, true, -11.13f, 26.87f)
                lineToRelative(-24.0f, 24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -3.23f, 1.67f)
                curveToRelative(-52.14f, 9.0f, -138.53f, 94.84f, -139.4f, 95.7f)
                arcToRelative(5.81f, 5.81f, 0.0f, false, true, -1.82f, 1.25f)
                horizontalLineToRelative(0.0f)
                arcTo(6.12f, 6.12f, 0.0f, false, true, 40.0f, 222.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -4.24f, -10.24f)
                horizontalLineToRelative(0.0f)
                curveToRelative(1.4f, -1.41f, 86.78f, -87.44f, 95.69f, -139.39f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 1.67f, -3.23f)
                lineToRelative(24.0f, -24.0f)
                arcTo(38.0f, 38.0f, 0.0f, false, true, 222.0f, 72.0f)
                close()
                moveTo(210.0f, 72.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, false, -44.38f, -18.38f)
                lineTo(142.93f, 76.3f)
                curveToRelative(-4.14f, 20.79f, -18.62f, 47.61f, -43.13f, 79.9f)
                curveToRelative(32.29f, -24.51f, 59.11f, -39.0f, 79.9f, -43.13f)
                lineToRelative(22.68f, -22.69f)
                arcTo(25.79f, 25.79f, 0.0f, false, false, 210.0f, 72.0f)
                close()
            }
        }
        .build()
        return `_needle-light`!!
    }

private var `_needle-light`: ImageVector? = null
