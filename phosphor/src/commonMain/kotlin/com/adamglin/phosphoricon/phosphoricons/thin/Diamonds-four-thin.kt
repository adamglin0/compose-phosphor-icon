package com.adamglin.phosphoricon.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.ThinGroup

public val ThinGroup.`Diamonds-four-thin`: ImageVector
    get() {
        if (`_diamonds-four-thin` != null) {
            return `_diamonds-four-thin`!!
        }
        `_diamonds-four-thin` = Builder(name = "Diamonds-four-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(125.17f, 106.83f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.66f, 0.0f)
                lineToRelative(40.0f, -40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -5.66f)
                lineToRelative(-40.0f, -40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.66f, 0.0f)
                lineToRelative(-40.0f, 40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 5.66f)
                close()
                moveTo(128.0f, 29.66f)
                lineTo(162.34f, 64.0f)
                lineTo(128.0f, 98.34f)
                lineTo(93.66f, 64.0f)
                close()
                moveTo(130.83f, 149.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.66f, 0.0f)
                lineToRelative(-40.0f, 40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 5.66f)
                lineToRelative(40.0f, 40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.66f, 0.0f)
                lineToRelative(40.0f, -40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -5.66f)
                close()
                moveTo(128.0f, 226.34f)
                lineTo(93.66f, 192.0f)
                lineTo(128.0f, 157.66f)
                lineTo(162.34f, 192.0f)
                close()
                moveTo(234.83f, 125.17f)
                lineToRelative(-40.0f, -40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.66f, 0.0f)
                lineToRelative(-40.0f, 40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 5.66f)
                lineToRelative(40.0f, 40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.66f, 0.0f)
                lineToRelative(40.0f, -40.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 234.83f, 125.17f)
                close()
                moveTo(192.0f, 162.34f)
                lineTo(157.66f, 128.0f)
                lineTo(192.0f, 93.66f)
                lineTo(226.34f, 128.0f)
                close()
                moveTo(106.83f, 125.17f)
                lineTo(66.83f, 85.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.66f, 0.0f)
                lineToRelative(-40.0f, 40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 5.66f)
                lineToRelative(40.0f, 40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.66f, 0.0f)
                lineToRelative(40.0f, -40.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 106.83f, 125.17f)
                close()
                moveTo(64.0f, 162.34f)
                lineTo(29.66f, 128.0f)
                lineTo(64.0f, 93.66f)
                lineTo(98.34f, 128.0f)
                close()
            }
        }
        .build()
        return `_diamonds-four-thin`!!
    }

private var `_diamonds-four-thin`: ImageVector? = null
