package com.adamglin.phosphoricon.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.FillGroup

public val FillGroup.`Hand-waving-fill`: ImageVector
    get() {
        if (`_hand-waving-fill` != null) {
            return `_hand-waving-fill`!!
        }
        `_hand-waving-fill` = Builder(name = "Hand-waving-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(219.31f, 98.46f)
                arcTo(88.0f, 88.0f, 0.0f, true, true, 67.08f, 186.77f)
                horizontalLineToRelative(0.0f)
                lineTo(26.15f, 115.88f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 27.69f, -16.0f)
                lineTo(72.4f, 132.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.86f, -8.0f)
                lineTo(47.0f, 56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 74.69f, 40.0f)
                lineTo(114.0f, 108.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 13.85f, -8.0f)
                lineToRelative(-30.0f, -52.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 27.71f, -16.0f)
                lineTo(166.0f, 102.12f)
                arcTo(48.25f, 48.25f, 0.0f, false, false, 152.0f, 136.0f)
                arcToRelative(47.59f, 47.59f, 0.0f, false, false, 9.6f, 28.8f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 12.79f, -9.61f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 181.0f, 110.26f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 2.17f, -10.43f)
                lineTo(171.71f, 80.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 27.71f, -16.0f)
                lineToRelative(19.89f, 34.46f)
                close()
                moveTo(189.94f, 41.46f)
                arcTo(43.74f, 43.74f, 0.0f, false, true, 216.74f, 62.0f)
                lineToRelative(0.33f, 0.57f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.86f, -8.0f)
                lineTo(230.6f, 54.0f)
                arcToRelative(59.64f, 59.64f, 0.0f, false, false, -36.54f, -28.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -4.12f, 15.46f)
                close()
                moveTo(79.58f, 225.72f)
                arcTo(103.58f, 103.58f, 0.0f, false, true, 53.93f, 196.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -13.86f, 8.0f)
                arcToRelative(119.56f, 119.56f, 0.0f, false, false, 29.6f, 34.28f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 9.91f, -12.56f)
                close()
            }
        }
        .build()
        return `_hand-waving-fill`!!
    }

private var `_hand-waving-fill`: ImageVector? = null
