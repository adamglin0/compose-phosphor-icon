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

public val BoldGroup.`Ladder-bold`: ImageVector
    get() {
        if (`_ladder-bold` != null) {
            return `_ladder-bold`!!
        }
        `_ladder-bold` = Builder(name = "Ladder-bold", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(219.27f, 211.9f)
                lineTo(168.77f, 73.0f)
                lineToRelative(7.63f, -21.0f)
                lineTo(184.0f, 52.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(88.0f, 28.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -1.11f, 23.94f)
                lineToRelative(-58.16f, 160.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 7.17f, 15.37f)
                arcTo(11.83f, 11.83f, 0.0f, false, false, 40.0f, 228.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.28f, -7.9f)
                lineTo(60.0f, 196.0f)
                lineTo(98.5f, 196.0f)
                lineToRelative(-5.78f, 15.9f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 7.18f, 15.37f)
                arcToRelative(11.79f, 11.79f, 0.0f, false, false, 4.1f, 0.73f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.28f, -7.9f)
                lineTo(132.77f, 172.0f)
                horizontalLineToRelative(46.46f)
                lineToRelative(17.49f, 48.1f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 208.0f, 228.0f)
                arcToRelative(11.83f, 11.83f, 0.0f, false, false, 4.1f, -0.73f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 219.27f, 211.9f)
                close()
                moveTo(124.69f, 124.0f)
                lineTo(86.22f, 124.0f)
                lineTo(95.0f, 100.0f)
                horizontalLineToRelative(38.46f)
                close()
                moveTo(142.14f, 76.0f)
                lineTo(103.68f, 76.0f)
                lineToRelative(8.73f, -24.0f)
                horizontalLineToRelative(38.46f)
                close()
                moveTo(68.77f, 172.0f)
                lineToRelative(8.73f, -24.0f)
                lineTo(116.0f, 148.0f)
                lineToRelative(-8.73f, 24.0f)
                close()
                moveTo(141.5f, 148.0f)
                lineTo(156.0f, 108.11f)
                lineTo(170.5f, 148.0f)
                close()
            }
        }
        .build()
        return `_ladder-bold`!!
    }

private var `_ladder-bold`: ImageVector? = null
