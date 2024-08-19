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

public val LightGroup.`Map-pin-plus-light`: ImageVector
    get() {
        if (`_map-pin-plus-light` != null) {
            return `_map-pin-plus-light`!!
        }
        `_map-pin-plus-light` = Builder(name = "Map-pin-plus-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(166.0f, 104.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(134.0f, 110.0f)
                verticalLineToRelative(26.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(122.0f, 110.0f)
                lineTo(96.0f, 110.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(26.0f)
                lineTo(122.0f, 72.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                lineTo(134.0f, 98.0f)
                horizontalLineToRelative(26.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 166.0f, 104.0f)
                close()
                moveTo(214.0f, 104.0f)
                curveToRelative(0.0f, 30.91f, -14.34f, 63.74f, -41.47f, 94.94f)
                arcToRelative(252.32f, 252.32f, 0.0f, false, true, -41.09f, 38.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.88f, 0.0f)
                arcToRelative(252.32f, 252.32f, 0.0f, false, true, -41.09f, -38.0f)
                curveTo(56.34f, 167.74f, 42.0f, 134.91f, 42.0f, 104.0f)
                arcToRelative(86.0f, 86.0f, 0.0f, false, true, 172.0f, 0.0f)
                close()
                moveTo(202.0f, 104.0f)
                arcToRelative(74.0f, 74.0f, 0.0f, false, false, -148.0f, 0.0f)
                curveToRelative(0.0f, 59.62f, 59.0f, 108.93f, 74.0f, 120.51f)
                curveTo(143.0f, 212.93f, 202.0f, 163.62f, 202.0f, 104.0f)
                close()
            }
        }
        .build()
        return `_map-pin-plus-light`!!
    }

private var `_map-pin-plus-light`: ImageVector? = null
