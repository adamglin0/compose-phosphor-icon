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

public val ThinGroup.`Chat-text-thin`: ImageVector
    get() {
        if (`_chat-text-thin` != null) {
            return `_chat-text-thin`!!
        }
        `_chat-text-thin` = Builder(name = "Chat-text-thin", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 52.0f)
                lineTo(40.0f, 52.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 28.0f, 64.0f)
                lineTo(28.0f, 224.0f)
                arcToRelative(11.89f, 11.89f, 0.0f, false, false, 6.93f, 10.88f)
                arcTo(12.17f, 12.17f, 0.0f, false, false, 40.0f, 236.0f)
                arcToRelative(11.89f, 11.89f, 0.0f, false, false, 7.69f, -2.83f)
                lineToRelative(0.0f, 0.0f)
                lineTo(81.49f, 204.0f)
                lineTo(216.0f, 204.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(228.0f, 64.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 216.0f, 52.0f)
                close()
                moveTo(220.0f, 192.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(80.0f, 196.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.62f, 1.0f)
                lineTo(42.56f, 227.06f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 36.0f, 224.0f)
                lineTo(36.0f, 64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(216.0f, 60.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                close()
                moveTo(164.0f, 112.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(96.0f, 116.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(64.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 164.0f, 112.0f)
                close()
                moveTo(164.0f, 144.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(96.0f, 148.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(64.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 164.0f, 144.0f)
                close()
            }
        }
        .build()
        return `_chat-text-thin`!!
    }

private var `_chat-text-thin`: ImageVector? = null
