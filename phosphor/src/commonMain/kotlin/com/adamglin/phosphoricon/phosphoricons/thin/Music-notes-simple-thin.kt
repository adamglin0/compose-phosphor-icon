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

public val ThinGroup.`Music-notes-simple-thin`: ImageVector
    get() {
        if (`_music-notes-simple-thin` != null) {
            return `_music-notes-simple-thin`!!
        }
        `_music-notes-simple-thin` = Builder(name = "Music-notes-simple-thin", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(210.46f, 20.85f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.43f, -0.73f)
                lineToRelative(-128.0f, 32.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 76.0f, 56.0f)
                lineTo(76.0f, 174.87f)
                arcTo(32.0f, 32.0f, 0.0f, true, false, 84.0f, 196.0f)
                lineTo(84.0f, 59.12f)
                lineToRelative(120.0f, -30.0f)
                lineTo(204.0f, 142.87f)
                arcTo(32.0f, 32.0f, 0.0f, true, false, 212.0f, 164.0f)
                lineTo(212.0f, 24.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 210.46f, 20.85f)
                close()
                moveTo(52.0f, 220.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 24.0f, -24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 52.0f, 220.0f)
                close()
                moveTo(180.0f, 188.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 24.0f, -24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 180.0f, 188.0f)
                close()
            }
        }
        .build()
        return `_music-notes-simple-thin`!!
    }

private var `_music-notes-simple-thin`: ImageVector? = null
