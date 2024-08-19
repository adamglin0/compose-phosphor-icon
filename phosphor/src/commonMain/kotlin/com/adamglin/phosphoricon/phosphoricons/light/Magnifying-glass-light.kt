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

public val LightGroup.`Magnifying-glass-light`: ImageVector
    get() {
        if (`_magnifying-glass-light` != null) {
            return `_magnifying-glass-light`!!
        }
        `_magnifying-glass-light` = Builder(name = "Magnifying-glass-light", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.24f, 219.76f)
                lineToRelative(-51.38f, -51.38f)
                arcToRelative(86.15f, 86.15f, 0.0f, true, false, -8.48f, 8.48f)
                lineToRelative(51.38f, 51.38f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.48f, -8.48f)
                close()
                moveTo(38.0f, 112.0f)
                arcToRelative(74.0f, 74.0f, 0.0f, true, true, 74.0f, 74.0f)
                arcTo(74.09f, 74.09f, 0.0f, false, true, 38.0f, 112.0f)
                close()
            }
        }
        .build()
        return `_magnifying-glass-light`!!
    }

private var `_magnifying-glass-light`: ImageVector? = null
