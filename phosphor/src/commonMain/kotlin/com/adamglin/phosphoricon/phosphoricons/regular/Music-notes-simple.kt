package com.adamglin.phosphoricon.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.RegularGroup

public val RegularGroup.`Music-notes-simple`: ImageVector
    get() {
        if (`_music-notes-simple` != null) {
            return `_music-notes-simple`!!
        }
        `_music-notes-simple` = Builder(name = "Music-notes-simple", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(212.92f, 17.69f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -6.86f, -1.45f)
                lineToRelative(-128.0f, 32.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 72.0f, 56.0f)
                lineTo(72.0f, 166.08f)
                arcTo(36.0f, 36.0f, 0.0f, true, false, 88.0f, 196.0f)
                lineTo(88.0f, 62.25f)
                lineToRelative(112.0f, -28.0f)
                verticalLineToRelative(99.83f)
                arcTo(36.0f, 36.0f, 0.0f, true, false, 216.0f, 164.0f)
                lineTo(216.0f, 24.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 212.92f, 17.69f)
                close()
                moveTo(52.0f, 216.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 52.0f, 216.0f)
                close()
                moveTo(180.0f, 184.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 180.0f, 184.0f)
                close()
            }
        }
        .build()
        return `_music-notes-simple`!!
    }

private var `_music-notes-simple`: ImageVector? = null
