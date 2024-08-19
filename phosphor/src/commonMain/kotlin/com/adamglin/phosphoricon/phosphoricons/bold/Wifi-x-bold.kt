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

public val BoldGroup.`Wifi-x-bold`: ImageVector
    get() {
        if (`_wifi-x-bold` != null) {
            return `_wifi-x-bold`!!
        }
        `_wifi-x-bold` = Builder(name = "Wifi-x-bold", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(144.0f, 204.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 144.0f, 204.0f)
                close()
                moveTo(217.0f, 80.0f)
                lineToRelative(15.52f, -15.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, -17.0f)
                lineTo(200.0f, 63.0f)
                lineTo(184.49f, 47.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 17.0f)
                lineTo(183.0f, 80.0f)
                lineTo(167.51f, 95.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, 17.0f)
                lineTo(200.0f, 97.0f)
                lineToRelative(15.51f, 15.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, -17.0f)
                close()
                moveTo(175.1f, 155.3f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, false, -94.13f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 14.13f, 19.4f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, true, 65.87f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 14.13f, -19.4f)
                close()
                moveTo(140.0f, 56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                arcTo(176.27f, 176.27f, 0.0f, false, false, 16.39f, 83.91f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 15.23f, 18.55f)
                arcTo(152.24f, 152.24f, 0.0f, false, true, 128.0f, 68.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 140.0f, 56.0f)
                close()
                moveTo(140.0f, 104.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                arcToRelative(126.66f, 126.66f, 0.0f, false, false, -79.45f, 27.64f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 14.9f, 18.81f)
                arcTo(102.89f, 102.89f, 0.0f, false, true, 128.0f, 116.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 140.0f, 104.0f)
                close()
            }
        }
        .build()
        return `_wifi-x-bold`!!
    }

private var `_wifi-x-bold`: ImageVector? = null
