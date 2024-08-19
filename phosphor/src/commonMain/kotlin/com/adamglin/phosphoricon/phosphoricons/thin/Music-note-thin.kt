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

public val ThinGroup.`Music-note-thin`: ImageVector
    get() {
        if (`_music-note-thin` != null) {
            return `_music-note-thin`!!
        }
        `_music-note-thin` = Builder(name = "Music-note-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(209.15f, 60.17f)
                lineToRelative(-80.0f, -24.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 124.0f, 40.0f)
                verticalLineTo(158.75f)
                arcTo(44.0f, 44.0f, 0.0f, true, false, 132.0f, 184.0f)
                verticalLineTo(93.38f)
                lineToRelative(74.85f, 22.45f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 212.0f, 112.0f)
                verticalLineTo(64.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 209.15f, 60.17f)
                close()
                moveTo(88.0f, 220.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, true, 36.0f, -36.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 88.0f, 220.0f)
                close()
                moveTo(204.0f, 106.62f)
                lineTo(132.0f, 85.0f)
                verticalLineTo(45.38f)
                lineTo(204.0f, 67.0f)
                close()
            }
        }
        .build()
        return `_music-note-thin`!!
    }

private var `_music-note-thin`: ImageVector? = null
