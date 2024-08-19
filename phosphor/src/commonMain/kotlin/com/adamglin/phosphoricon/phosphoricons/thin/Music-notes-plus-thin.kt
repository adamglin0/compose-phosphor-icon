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

public val ThinGroup.`Music-notes-plus-thin`: ImageVector
    get() {
        if (`_music-notes-plus-thin` != null) {
            return `_music-notes-plus-thin`!!
        }
        `_music-notes-plus-thin` = Builder(name = "Music-notes-plus-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.0f, 48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(204.0f, 52.0f)
                lineTo(204.0f, 72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(196.0f, 52.0f)
                lineTo(176.0f, 52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(20.0f)
                lineTo(196.0f, 24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                lineTo(204.0f, 44.0f)
                horizontalLineToRelative(20.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 228.0f, 48.0f)
                close()
                moveTo(212.0f, 112.0f)
                verticalLineToRelative(52.0f)
                arcToRelative(32.06f, 32.06f, 0.0f, true, true, -8.0f, -21.13f)
                lineTo(204.0f, 112.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                close()
                moveTo(204.0f, 164.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, -24.0f, 24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 204.0f, 164.0f)
                close()
                moveTo(84.0f, 107.12f)
                lineTo(84.0f, 196.0f)
                arcToRelative(32.06f, 32.06f, 0.0f, true, true, -8.0f, -21.13f)
                lineTo(76.0f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.0f, -3.88f)
                lineToRelative(56.0f, -14.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 137.0f, 45.88f)
                lineTo(84.0f, 59.12f)
                lineTo(84.0f, 98.88f)
                lineToRelative(75.0f, -18.76f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 161.0f, 87.88f)
                close()
                moveTo(76.0f, 196.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, -24.0f, 24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 76.0f, 196.0f)
                close()
            }
        }
        .build()
        return `_music-notes-plus-thin`!!
    }

private var `_music-notes-plus-thin`: ImageVector? = null
