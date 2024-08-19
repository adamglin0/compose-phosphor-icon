package com.adamglin.phosphoricon.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.BoldGroup

public val BoldGroup.`Wifi-low-bold`: ImageVector
    get() {
        if (`_wifi-low-bold` != null) {
            return `_wifi-low-bold`!!
        }
        `_wifi-low-bold` = Builder(name = "Wifi-low-bold", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(144.0f, 204.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 144.0f, 204.0f)
                close()
                moveTo(175.06f, 155.3f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, false, -94.12f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 14.13f, 19.4f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, true, 65.86f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 14.13f, -19.4f)
                close()
            }
        }
        .build()
        return `_wifi-low-bold`!!
    }

private var `_wifi-low-bold`: ImageVector? = null
