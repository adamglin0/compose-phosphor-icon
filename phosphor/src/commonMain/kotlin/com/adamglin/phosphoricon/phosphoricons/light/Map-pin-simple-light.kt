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

public val LightGroup.`Map-pin-simple-light`: ImageVector
    get() {
        if (`_map-pin-simple-light` != null) {
            return `_map-pin-simple-light`!!
        }
        `_map-pin-simple-light` = Builder(name = "Map-pin-simple-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(182.0f, 72.0f)
                arcToRelative(54.0f, 54.0f, 0.0f, true, false, -60.0f, 53.66f)
                lineTo(122.0f, 232.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(134.0f, 125.66f)
                arcTo(54.07f, 54.07f, 0.0f, false, false, 182.0f, 72.0f)
                close()
                moveTo(128.0f, 114.0f)
                arcToRelative(42.0f, 42.0f, 0.0f, true, true, 42.0f, -42.0f)
                arcTo(42.0f, 42.0f, 0.0f, false, true, 128.0f, 114.0f)
                close()
            }
        }
        .build()
        return `_map-pin-simple-light`!!
    }

private var `_map-pin-simple-light`: ImageVector? = null
