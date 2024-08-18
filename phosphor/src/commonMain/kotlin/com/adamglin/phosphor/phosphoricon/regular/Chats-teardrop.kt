package com.adamglin.phosphor.phosphoricon.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.RegularGroup

public val RegularGroup.`Chats-teardrop`: ImageVector
    get() {
        if (`_chats-teardrop` != null) {
            return `_chats-teardrop`!!
        }
        `_chats-teardrop` = Builder(name = "Chats-teardrop", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(169.57f, 72.59f)
                arcTo(80.0f, 80.0f, 0.0f, false, false, 16.0f, 104.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineTo(86.67f)
                arcTo(80.15f, 80.15f, 0.0f, false, false, 160.0f, 232.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineTo(152.0f)
                arcTo(80.0f, 80.0f, 0.0f, false, false, 169.57f, 72.59f)
                close()
                moveTo(32.0f, 104.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, true, 64.0f, 64.0f)
                horizontalLineTo(32.0f)
                close()
                moveTo(224.0f, 216.0f)
                horizontalLineTo(160.0f)
                arcToRelative(64.14f, 64.14f, 0.0f, false, true, -55.68f, -32.43f)
                arcTo(79.93f, 79.93f, 0.0f, false, false, 174.7f, 89.71f)
                arcTo(64.0f, 64.0f, 0.0f, false, true, 224.0f, 152.0f)
                close()
            }
        }
        .build()
        return `_chats-teardrop`!!
    }

private var `_chats-teardrop`: ImageVector? = null
