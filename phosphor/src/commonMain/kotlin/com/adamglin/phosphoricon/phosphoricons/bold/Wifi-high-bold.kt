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

public val BoldGroup.`Wifi-high-bold`: ImageVector
    get() {
        if (`_wifi-high-bold` != null) {
            return `_wifi-high-bold`!!
        }
        `_wifi-high-bold` = Builder(name = "Wifi-high-bold", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(144.0f, 204.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 144.0f, 204.0f)
                close()
                moveTo(239.61f, 83.91f)
                arcToRelative(176.0f, 176.0f, 0.0f, false, false, -223.22f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 15.23f, 18.55f)
                arcToRelative(152.0f, 152.0f, 0.0f, false, true, 192.76f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 15.23f, -18.55f)
                close()
                moveTo(207.45f, 119.64f)
                arcToRelative(128.0f, 128.0f, 0.0f, false, false, -158.9f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 14.9f, 18.81f)
                arcToRelative(104.0f, 104.0f, 0.0f, false, true, 129.1f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 14.9f, -18.81f)
                close()
                moveTo(175.07f, 155.3f)
                arcToRelative(80.05f, 80.05f, 0.0f, false, false, -94.14f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 14.14f, 19.4f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, true, 65.86f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 14.14f, -19.4f)
                close()
            }
        }
        .build()
        return `_wifi-high-bold`!!
    }

private var `_wifi-high-bold`: ImageVector? = null
