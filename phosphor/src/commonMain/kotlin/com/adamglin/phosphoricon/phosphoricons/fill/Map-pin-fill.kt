package com.adamglin.phosphoricon.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.FillGroup

public val FillGroup.`Map-pin-fill`: ImageVector
    get() {
        if (`_map-pin-fill` != null) {
            return `_map-pin-fill`!!
        }
        `_map-pin-fill` = Builder(name = "Map-pin-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 16.0f)
                arcToRelative(88.1f, 88.1f, 0.0f, false, false, -88.0f, 88.0f)
                curveToRelative(0.0f, 75.3f, 80.0f, 132.17f, 83.41f, 134.55f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 9.18f, 0.0f)
                curveTo(136.0f, 236.17f, 216.0f, 179.3f, 216.0f, 104.0f)
                arcTo(88.1f, 88.1f, 0.0f, false, false, 128.0f, 16.0f)
                close()
                moveTo(128.0f, 72.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -32.0f, 32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 128.0f, 72.0f)
                close()
            }
        }
        .build()
        return `_map-pin-fill`!!
    }

private var `_map-pin-fill`: ImageVector? = null
