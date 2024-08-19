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

public val BoldGroup.`Heart-straight-break-bold`: ImageVector
    get() {
        if (`_heart-straight-break-bold` != null) {
            return `_heart-straight-break-bold`!!
        }
        `_heart-straight-break-bold` = Builder(name = "Heart-straight-break-bold", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(225.84f, 54.16f)
                arcToRelative(62.0f, 62.0f, 0.0f, false, false, -87.6f, -0.08f)
                lineTo(128.0f, 63.94f)
                lineToRelative(-10.24f, -9.86f)
                arcToRelative(62.0f, 62.0f, 0.0f, false, false, -87.66f, 87.7f)
                lineToRelative(89.35f, 90.64f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.1f, 0.0f)
                lineToRelative(89.29f, -90.58f)
                arcToRelative(62.0f, 62.0f, 0.0f, false, false, 0.0f, -87.68f)
                close()
                moveTo(208.84f, 124.93f)
                lineTo(128.03f, 206.93f)
                lineTo(47.16f, 124.93f)
                arcToRelative(38.0f, 38.0f, 0.0f, true, true, 53.74f, -53.74f)
                lineToRelative(0.16f, 0.16f)
                lineToRelative(9.67f, 9.31f)
                lineToRelative(-7.0f, 6.76f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -0.17f, 17.13f)
                lineTo(127.0f, 128.0f)
                lineToRelative(-7.52f, 7.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 17.0f, 17.0f)
                lineToRelative(16.0f, -16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -17.0f)
                lineTo(129.13f, 96.16f)
                lineTo(155.0f, 71.29f)
                lineToRelative(0.16f, -0.16f)
                arcToRelative(38.0f, 38.0f, 0.0f, true, true, 53.68f, 53.8f)
                close()
            }
        }
        .build()
        return `_heart-straight-break-bold`!!
    }

private var `_heart-straight-break-bold`: ImageVector? = null
