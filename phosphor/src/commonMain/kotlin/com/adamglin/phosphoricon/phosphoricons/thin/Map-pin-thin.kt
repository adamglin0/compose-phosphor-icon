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

public val ThinGroup.`Map-pin-thin`: ImageVector
    get() {
        if (`_map-pin-thin` != null) {
            return `_map-pin-thin`!!
        }
        `_map-pin-thin` = Builder(name = "Map-pin-thin", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 68.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, 36.0f, 36.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 128.0f, 68.0f)
                close()
                moveTo(128.0f, 132.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, 28.0f, -28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 128.0f, 132.0f)
                close()
                moveTo(128.0f, 20.0f)
                arcToRelative(84.09f, 84.09f, 0.0f, false, false, -84.0f, 84.0f)
                curveToRelative(0.0f, 30.42f, 14.17f, 62.79f, 41.0f, 93.62f)
                arcToRelative(250.0f, 250.0f, 0.0f, false, false, 40.73f, 37.66f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.58f, 0.0f)
                arcTo(250.0f, 250.0f, 0.0f, false, false, 171.0f, 197.62f)
                curveToRelative(26.81f, -30.83f, 41.0f, -63.2f, 41.0f, -93.62f)
                arcTo(84.09f, 84.09f, 0.0f, false, false, 128.0f, 20.0f)
                close()
                moveTo(165.1f, 192.23f)
                arcTo(254.62f, 254.62f, 0.0f, false, true, 128.0f, 227.0f)
                arcToRelative(254.62f, 254.62f, 0.0f, false, true, -37.1f, -34.81f)
                curveTo(73.15f, 171.8f, 52.0f, 139.9f, 52.0f, 104.0f)
                arcToRelative(76.0f, 76.0f, 0.0f, false, true, 152.0f, 0.0f)
                curveTo(204.0f, 139.9f, 182.85f, 171.8f, 165.1f, 192.23f)
                close()
            }
        }
        .build()
        return `_map-pin-thin`!!
    }

private var `_map-pin-thin`: ImageVector? = null
