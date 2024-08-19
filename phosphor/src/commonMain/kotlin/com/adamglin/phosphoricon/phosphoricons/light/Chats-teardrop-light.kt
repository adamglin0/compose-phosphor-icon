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

public val LightGroup.`Chats-teardrop-light`: ImageVector
    get() {
        if (`_chats-teardrop-light` != null) {
            return `_chats-teardrop-light`!!
        }
        `_chats-teardrop-light` = Builder(name = "Chats-teardrop-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(168.16f, 74.42f)
                arcTo(78.0f, 78.0f, 0.0f, false, false, 18.0f, 104.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(88.0f, 182.0f)
                arcToRelative(78.15f, 78.15f, 0.0f, false, false, 72.0f, 48.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(238.0f, 152.0f)
                arcTo(78.0f, 78.0f, 0.0f, false, false, 168.16f, 74.42f)
                close()
                moveTo(30.0f, 168.0f)
                lineTo(30.0f, 104.0f)
                arcToRelative(66.0f, 66.0f, 0.0f, true, true, 66.0f, 66.0f)
                lineTo(32.0f, 170.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 30.0f, 168.0f)
                close()
                moveTo(226.0f, 216.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(160.0f, 218.0f)
                arcToRelative(66.13f, 66.13f, 0.0f, false, true, -58.89f, -36.19f)
                arcToRelative(77.92f, 77.92f, 0.0f, false, false, 71.0f, -94.68f)
                arcTo(66.0f, 66.0f, 0.0f, false, true, 226.0f, 152.0f)
                close()
            }
        }
        .build()
        return `_chats-teardrop-light`!!
    }

private var `_chats-teardrop-light`: ImageVector? = null
