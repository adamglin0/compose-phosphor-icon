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

public val BoldGroup.`Map-trifold-bold`: ImageVector
    get() {
        if (`_map-trifold-bold` != null) {
            return `_map-trifold-bold`!!
        }
        `_map-trifold-bold` = Builder(name = "Map-trifold-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(231.38f, 46.54f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -10.29f, -2.18f)
                lineTo(161.4f, 59.28f)
                lineToRelative(-60.0f, -30.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -8.28f, -0.91f)
                lineToRelative(-64.0f, 16.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 20.0f, 56.0f)
                lineTo(20.0f, 200.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 14.91f, 11.64f)
                lineTo(94.6f, 196.72f)
                lineToRelative(60.0f, 30.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 8.28f, 0.91f)
                lineToRelative(64.0f, -16.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 236.0f, 200.0f)
                lineTo(236.0f, 56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 231.38f, 46.54f)
                close()
                moveTo(108.0f, 59.42f)
                lineToRelative(40.0f, 20.0f)
                lineTo(148.0f, 196.58f)
                lineToRelative(-40.0f, -20.0f)
                close()
                moveTo(44.0f, 65.42f)
                lineTo(84.0f, 55.42f)
                lineTo(84.0f, 174.63f)
                lineToRelative(-40.0f, 10.0f)
                close()
                moveTo(212.0f, 190.63f)
                lineToRelative(-40.0f, 10.0f)
                lineTo(172.0f, 81.37f)
                lineToRelative(40.0f, -10.0f)
                close()
            }
        }
        .build()
        return `_map-trifold-bold`!!
    }

private var `_map-trifold-bold`: ImageVector? = null
