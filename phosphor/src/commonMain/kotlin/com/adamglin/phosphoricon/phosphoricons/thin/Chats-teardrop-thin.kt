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

public val ThinGroup.`Chats-teardrop-thin`: ImageVector
    get() {
        if (`_chats-teardrop-thin` != null) {
            return `_chats-teardrop-thin`!!
        }
        `_chats-teardrop-thin` = Builder(name = "Chats-teardrop-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(166.76f, 76.32f)
                arcTo(76.0f, 76.0f, 0.0f, false, false, 20.0f, 104.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(89.33f, 180.0f)
                arcTo(76.13f, 76.13f, 0.0f, false, false, 160.0f, 228.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(236.0f, 152.0f)
                arcTo(76.0f, 76.0f, 0.0f, false, false, 166.76f, 76.32f)
                close()
                moveTo(28.0f, 168.0f)
                lineTo(28.0f, 104.0f)
                arcToRelative(68.0f, 68.0f, 0.0f, true, true, 68.0f, 68.0f)
                lineTo(32.0f, 172.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 28.0f, 168.0f)
                close()
                moveTo(228.0f, 216.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(160.0f, 220.0f)
                arcTo(68.16f, 68.16f, 0.0f, false, true, 98.0f, 180.0f)
                arcTo(76.0f, 76.0f, 0.0f, false, false, 169.5f, 84.67f)
                arcTo(68.0f, 68.0f, 0.0f, false, true, 228.0f, 152.0f)
                close()
            }
        }
        .build()
        return `_chats-teardrop-thin`!!
    }

private var `_chats-teardrop-thin`: ImageVector? = null
