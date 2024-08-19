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

public val LightGroup.`Map-pin-simple-line-light`: ImageVector
    get() {
        if (`_map-pin-simple-line-light` != null) {
            return `_map-pin-simple-line-light`!!
        }
        `_map-pin-simple-line-light` = Builder(name = "Map-pin-simple-line-light", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 210.0f)
                horizontalLineTo(134.0f)
                verticalLineTo(133.66f)
                arcToRelative(54.0f, 54.0f, 0.0f, true, false, -12.0f, 0.0f)
                verticalLineTo(210.0f)
                horizontalLineTo(40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineTo(216.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(86.0f, 80.0f)
                arcToRelative(42.0f, 42.0f, 0.0f, true, true, 42.0f, 42.0f)
                arcTo(42.0f, 42.0f, 0.0f, false, true, 86.0f, 80.0f)
                close()
            }
        }
        .build()
        return `_map-pin-simple-line-light`!!
    }

private var `_map-pin-simple-line-light`: ImageVector? = null
