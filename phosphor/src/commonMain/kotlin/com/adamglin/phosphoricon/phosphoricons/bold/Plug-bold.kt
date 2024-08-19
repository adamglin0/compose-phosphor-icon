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

public val BoldGroup.`Plug-bold`: ImageVector
    get() {
        if (`_plug-bold` != null) {
            return `_plug-bold`!!
        }
        `_plug-bold` = Builder(name = "Plug-bold", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.49f, 63.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 0.0f)
                lineTo(192.0f, 95.0f)
                lineTo(161.0f, 64.0f)
                lineToRelative(31.52f, -31.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, -17.0f)
                lineTo(144.0f, 47.0f)
                lineTo(120.49f, 23.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -17.0f, 17.0f)
                lineTo(107.0f, 44.0f)
                lineTo(56.89f, 94.14f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, 0.0f, 62.23f)
                lineToRelative(12.88f, 12.88f)
                lineTo(23.51f, 215.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, 17.0f)
                lineToRelative(46.26f, -46.26f)
                lineToRelative(12.88f, 12.88f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, 62.23f, 0.0f)
                lineTo(212.0f, 149.0f)
                lineToRelative(3.51f, 3.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, -17.0f)
                lineTo(209.0f, 112.0f)
                lineToRelative(31.52f, -31.51f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 240.49f, 63.51f)
                close()
                moveTo(144.89f, 182.14f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -28.29f, 0.0f)
                lineTo(73.86f, 139.4f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 0.0f, -28.29f)
                lineTo(124.0f, 61.0f)
                lineToRelative(71.0f, 71.0f)
                close()
            }
        }
        .build()
        return `_plug-bold`!!
    }

private var `_plug-bold`: ImageVector? = null
