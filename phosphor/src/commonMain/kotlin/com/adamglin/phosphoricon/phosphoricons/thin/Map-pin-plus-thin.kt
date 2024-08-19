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

public val ThinGroup.`Map-pin-plus-thin`: ImageVector
    get() {
        if (`_map-pin-plus-thin` != null) {
            return `_map-pin-plus-thin`!!
        }
        `_map-pin-plus-thin` = Builder(name = "Map-pin-plus-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(164.0f, 104.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(132.0f, 108.0f)
                verticalLineToRelative(28.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(124.0f, 108.0f)
                lineTo(96.0f, 108.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(28.0f)
                lineTo(124.0f, 72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                verticalLineToRelative(28.0f)
                horizontalLineToRelative(28.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 164.0f, 104.0f)
                close()
                moveTo(212.0f, 104.0f)
                curveToRelative(0.0f, 30.42f, -14.17f, 62.79f, -41.0f, 93.62f)
                arcToRelative(250.0f, 250.0f, 0.0f, false, true, -40.73f, 37.66f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.58f, 0.0f)
                arcTo(250.0f, 250.0f, 0.0f, false, true, 85.0f, 197.62f)
                curveTo(58.17f, 166.79f, 44.0f, 134.42f, 44.0f, 104.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, false, true, 168.0f, 0.0f)
                close()
                moveTo(204.0f, 104.0f)
                arcToRelative(76.0f, 76.0f, 0.0f, false, false, -152.0f, 0.0f)
                curveToRelative(0.0f, 35.9f, 21.15f, 67.8f, 38.9f, 88.23f)
                arcTo(254.62f, 254.62f, 0.0f, false, false, 128.0f, 227.0f)
                arcToRelative(254.62f, 254.62f, 0.0f, false, false, 37.1f, -34.81f)
                curveTo(182.85f, 171.8f, 204.0f, 139.9f, 204.0f, 104.0f)
                close()
            }
        }
        .build()
        return `_map-pin-plus-thin`!!
    }

private var `_map-pin-plus-thin`: ImageVector? = null
