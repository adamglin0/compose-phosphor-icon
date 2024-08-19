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

public val ThinGroup.`Ghost-thin`: ImageVector
    get() {
        if (`_ghost-thin` != null) {
            return `_ghost-thin`!!
        }
        `_ghost-thin` = Builder(name = "Ghost-thin", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(108.0f, 116.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 108.0f, 116.0f)
                close()
                moveTo(156.0f, 108.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 156.0f, 108.0f)
                close()
                moveTo(220.0f, 120.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.53f, 3.1f)
                lineToRelative(-26.8f, -21.93f)
                lineToRelative(-26.8f, 21.93f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.07f, 0.0f)
                lineTo(128.0f, 197.17f)
                lineTo(101.2f, 219.1f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.07f, 0.0f)
                lineToRelative(-26.8f, -21.93f)
                lineTo(42.53f, 219.1f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 36.0f, 216.0f)
                lineTo(36.0f, 120.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, false, true, 184.0f, 0.0f)
                close()
                moveTo(212.0f, 120.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, false, false, -168.0f, 0.0f)
                verticalLineToRelative(87.56f)
                lineTo(66.8f, 188.9f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.07f, 0.0f)
                lineToRelative(26.8f, 21.93f)
                lineToRelative(26.8f, -21.93f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.06f, 0.0f)
                lineToRelative(26.8f, 21.93f)
                lineToRelative(26.8f, -21.93f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.07f, 0.0f)
                lineTo(212.0f, 207.56f)
                close()
            }
        }
        .build()
        return `_ghost-thin`!!
    }

private var `_ghost-thin`: ImageVector? = null
