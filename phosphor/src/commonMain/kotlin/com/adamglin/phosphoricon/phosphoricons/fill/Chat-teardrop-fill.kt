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

public val FillGroup.`Chat-teardrop-fill`: ImageVector
    get() {
        if (`_chat-teardrop-fill` != null) {
            return `_chat-teardrop-fill`!!
        }
        `_chat-teardrop-fill` = Builder(name = "Chat-teardrop-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 124.0f)
                arcTo(100.11f, 100.11f, 0.0f, false, true, 132.0f, 224.0f)
                horizontalLineTo(48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                verticalLineTo(124.0f)
                arcToRelative(100.0f, 100.0f, 0.0f, false, true, 200.0f, 0.0f)
                close()
            }
        }
        .build()
        return `_chat-teardrop-fill`!!
    }

private var `_chat-teardrop-fill`: ImageVector? = null
