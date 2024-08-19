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

public val BoldGroup.`Fan-bold`: ImageVector
    get() {
        if (`_fan-bold` != null) {
            return `_fan-bold`!!
        }
        `_fan-bold` = Builder(name = "Fan-bold", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.85f, 134.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, -87.43f, -42.11f)
                lineToRelative(14.22f, -56.77f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -5.17f, -13.0f)
                arcTo(64.0f, 64.0f, 0.0f, false, false, 86.0f, 127.52f)
                lineTo(29.72f, 143.59f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -8.69f, 11.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, 127.56f, 10.0f)
                lineToRelative(42.0f, 40.7f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 13.86f, 2.0f)
                arcTo(64.0f, 64.0f, 0.0f, false, false, 236.85f, 134.0f)
                close()
                moveTo(116.0f, 128.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 116.0f, 128.0f)
                close()
                moveTo(124.0f, 36.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, 14.0f, 2.53f)
                lineTo(124.6f, 92.17f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -25.85f, 14.88f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 124.0f, 36.0f)
                close()
                moveTo(105.0f, 192.1f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 45.5f, 164.0f)
                lineToRelative(53.18f, -15.19f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 25.8f, 15.0f)
                arcTo(39.84f, 39.84f, 0.0f, false, true, 105.0f, 192.1f)
                close()
                moveTo(209.7f, 170.54f)
                arcToRelative(39.92f, 39.92f, 0.0f, false, true, -9.21f, 10.89f)
                lineTo(160.73f, 143.0f)
                arcToRelative(35.9f, 35.9f, 0.0f, false, false, 0.05f, -29.83f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, 48.89f, 57.4f)
                close()
            }
        }
        .build()
        return `_fan-bold`!!
    }

private var `_fan-bold`: ImageVector? = null
