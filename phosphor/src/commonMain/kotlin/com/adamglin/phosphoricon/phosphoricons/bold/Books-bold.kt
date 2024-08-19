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

public val BoldGroup.`Books-bold`: ImageVector
    get() {
        if (`_books-bold` != null) {
            return `_books-bold`!!
        }
        `_books-bold` = Builder(name = "Books-bold", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(235.57f, 193.73f)
                lineTo(202.38f, 35.93f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -23.76f, -15.48f)
                lineTo(131.81f, 30.51f)
                arcToRelative(19.82f, 19.82f, 0.0f, false, false, -11.0f, 6.65f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 104.0f, 28.0f)
                lineTo(56.0f, 28.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 36.0f, 48.0f)
                lineTo(36.0f, 208.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(124.0f, 90.25f)
                lineToRelative(25.62f, 121.82f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 169.15f, 228.0f)
                arcToRelative(20.27f, 20.27f, 0.0f, false, false, 4.23f, -0.45f)
                lineToRelative(46.81f, -10.06f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 235.57f, 193.73f)
                close()
                moveTo(148.19f, 88.65f)
                lineToRelative(39.0f, -8.38f)
                lineToRelative(2.53f, 12.0f)
                lineToRelative(-39.0f, 8.38f)
                close()
                moveTo(155.65f, 124.15f)
                lineTo(194.65f, 115.77f)
                lineTo(203.81f, 159.35f)
                lineTo(164.81f, 167.73f)
                close()
                moveTo(179.71f, 44.76f)
                lineTo(182.24f, 56.76f)
                lineTo(143.24f, 65.14f)
                lineTo(140.71f, 53.14f)
                close()
                moveTo(60.0f, 88.0f)
                horizontalLineToRelative(40.0f)
                verticalLineToRelative(80.0f)
                lineTo(60.0f, 168.0f)
                close()
                moveTo(100.0f, 52.0f)
                lineTo(100.0f, 64.0f)
                lineTo(60.0f, 64.0f)
                lineTo(60.0f, 52.0f)
                close()
                moveTo(60.0f, 204.0f)
                lineTo(60.0f, 192.0f)
                horizontalLineToRelative(40.0f)
                verticalLineToRelative(12.0f)
                close()
                moveTo(172.29f, 203.24f)
                lineTo(169.76f, 191.24f)
                lineTo(208.76f, 182.86f)
                lineTo(211.29f, 194.86f)
                close()
            }
        }
        .build()
        return `_books-bold`!!
    }

private var `_books-bold`: ImageVector? = null
