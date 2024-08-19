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

public val RegularGroup.`Music-notes-minus`: ImageVector
    get() {
        if (`_music-notes-minus` != null) {
            return `_music-notes-minus`!!
        }
        `_music-notes-minus` = Builder(name = "Music-notes-minus", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(176.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(48.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 232.0f, 48.0f)
                close()
                moveTo(216.0f, 88.0f)
                verticalLineToRelative(76.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, true, -16.0f, -29.92f)
                lineTo(200.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
                moveTo(200.0f, 164.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, false, -20.0f, 20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 200.0f, 164.0f)
                close()
                moveTo(88.0f, 110.25f)
                lineTo(88.0f, 196.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, true, -16.0f, -29.92f)
                lineTo(72.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 6.06f, -7.76f)
                lineToRelative(56.0f, -14.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 3.88f, 15.52f)
                lineTo(88.0f, 62.25f)
                verticalLineToRelative(31.5f)
                lineToRelative(70.06f, -17.51f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 3.88f, 15.52f)
                close()
                moveTo(72.0f, 196.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, false, -20.0f, 20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 72.0f, 196.0f)
                close()
            }
        }
        .build()
        return `_music-notes-minus`!!
    }

private var `_music-notes-minus`: ImageVector? = null
