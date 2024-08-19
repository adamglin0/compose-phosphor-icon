package com.adamglin.phosphoricon.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.LightGroup

public val LightGroup.`Bookmarks-light`: ImageVector
    get() {
        if (`_bookmarks-light` != null) {
            return `_bookmarks-light`!!
        }
        `_bookmarks-light` = Builder(name = "Bookmarks-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 26.0f)
                lineTo(96.0f, 26.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 82.0f, 40.0f)
                lineTo(82.0f, 58.0f)
                lineTo(64.0f, 58.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 50.0f, 72.0f)
                lineTo(50.0f, 224.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 9.49f, 4.88f)
                lineTo(112.0f, 191.37f)
                lineToRelative(52.52f, 37.51f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 174.0f, 224.0f)
                lineTo(174.0f, 180.8f)
                lineToRelative(22.51f, 16.08f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 206.0f, 192.0f)
                lineTo(206.0f, 40.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 192.0f, 26.0f)
                close()
                moveTo(162.0f, 212.34f)
                lineToRelative(-46.52f, -33.22f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -7.0f, 0.0f)
                lineTo(62.0f, 212.34f)
                lineTo(62.0f, 72.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                close()
                moveTo(194.0f, 180.34f)
                lineTo(174.0f, 166.06f)
                lineTo(174.0f, 72.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, -14.0f)
                lineTo(94.0f, 58.0f)
                lineTo(94.0f, 40.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                close()
            }
        }
        .build()
        return `_bookmarks-light`!!
    }

private var `_bookmarks-light`: ImageVector? = null
