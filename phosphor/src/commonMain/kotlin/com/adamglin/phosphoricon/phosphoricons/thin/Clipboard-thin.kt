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

public val ThinGroup.`Clipboard-thin`: ImageVector
    get() {
        if (`_clipboard-thin` != null) {
            return `_clipboard-thin`!!
        }
        `_clipboard-thin` = Builder(name = "Clipboard-thin", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 36.0f)
                lineTo(161.92f, 36.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, -67.84f, 0.0f)
                lineTo(56.0f, 36.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 44.0f, 48.0f)
                lineTo(44.0f, 216.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(200.0f, 228.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(212.0f, 48.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 200.0f, 36.0f)
                close()
                moveTo(128.0f, 28.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 36.0f, 36.0f)
                verticalLineToRelative(4.0f)
                lineTo(92.0f, 68.0f)
                lineTo(92.0f, 64.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 128.0f, 28.0f)
                close()
                moveTo(204.0f, 216.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(56.0f, 220.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(52.0f, 48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(88.83f, 44.0f)
                arcTo(43.71f, 43.71f, 0.0f, false, false, 84.0f, 64.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(172.0f, 64.0f)
                arcToRelative(43.71f, 43.71f, 0.0f, false, false, -4.83f, -20.0f)
                lineTo(200.0f, 44.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                close()
            }
        }
        .build()
        return `_clipboard-thin`!!
    }

private var `_clipboard-thin`: ImageVector? = null
