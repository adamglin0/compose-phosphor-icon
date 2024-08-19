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

public val BoldGroup.`Chat-circle-text-bold`: ImageVector
    get() {
        if (`_chat-circle-text-bold` != null) {
            return `_chat-circle-text-bold`!!
        }
        `_chat-circle-text-bold` = Builder(name = "Chat-circle-text-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(172.0f, 108.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(96.0f, 120.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(64.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 172.0f, 108.0f)
                close()
                moveTo(160.0f, 136.0f)
                lineTo(96.0f, 136.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(236.0f, 128.0f)
                arcTo(108.0f, 108.0f, 0.0f, false, true, 78.77f, 224.15f)
                lineTo(46.34f, 235.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 21.0f, 209.66f)
                lineToRelative(10.81f, -32.43f)
                arcTo(108.0f, 108.0f, 0.0f, true, true, 236.0f, 128.0f)
                close()
                moveTo(212.0f, 128.0f)
                arcTo(84.0f, 84.0f, 0.0f, true, false, 55.27f, 170.06f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 1.0f, 9.81f)
                lineToRelative(-9.93f, 29.79f)
                lineToRelative(29.79f, -9.93f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, 3.8f, -0.62f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 6.0f, 1.62f)
                arcTo(84.0f, 84.0f, 0.0f, false, false, 212.0f, 128.0f)
                close()
            }
        }
        .build()
        return `_chat-circle-text-bold`!!
    }

private var `_chat-circle-text-bold`: ImageVector? = null
