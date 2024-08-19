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

public val BoldGroup.`Highlighter-bold`: ImageVector
    get() {
        if (`_highlighter-bold` != null) {
            return `_highlighter-bold`!!
        }
        `_highlighter-bold` = Builder(name = "Highlighter-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(252.49f, 107.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 0.0f)
                lineTo(192.0f, 151.0f)
                lineTo(113.0f, 72.0f)
                lineToRelative(43.52f, -43.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, -17.0f)
                lineTo(93.17f, 57.86f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -4.72f, 20.72f)
                lineTo(69.17f, 97.86f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 0.0f, 28.28f)
                lineTo(71.0f, 128.0f)
                lineTo(15.51f, 183.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 4.7f, 19.87f)
                lineToRelative(72.0f, 24.0f)
                arcTo(11.8f, 11.8f, 0.0f, false, false, 96.0f, 228.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 8.49f, -3.52f)
                lineTo(136.0f, 193.0f)
                lineToRelative(1.86f, 1.86f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 28.28f, 0.0f)
                lineToRelative(19.27f, -19.27f)
                arcToRelative(20.27f, 20.27f, 0.0f, false, false, 6.59f, 1.13f)
                arcToRelative(19.86f, 19.86f, 0.0f, false, false, 14.14f, -5.86f)
                lineToRelative(46.35f, -46.34f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 252.49f, 107.51f)
                close()
                moveTo(92.76f, 202.27f)
                lineTo(46.21f, 186.76f)
                lineTo(88.0f, 145.0f)
                lineToRelative(31.0f, 31.0f)
                close()
                moveTo(152.0f, 175.0f)
                lineTo(96.49f, 119.52f)
                horizontalLineToRelative(0.0f)
                lineTo(89.0f, 112.0f)
                lineToRelative(15.0f, -15.0f)
                lineToRelative(63.0f, 63.0f)
                close()
            }
        }
        .build()
        return `_highlighter-bold`!!
    }

private var `_highlighter-bold`: ImageVector? = null
