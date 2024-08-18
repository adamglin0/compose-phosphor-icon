package com.adamglin.phosphor.phosphoricon.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.FillGroup

public val FillGroup.`Music-notes-simple-fill`: ImageVector
    get() {
        if (`_music-notes-simple-fill` != null) {
            return `_music-notes-simple-fill`!!
        }
        `_music-notes-simple-fill` = Builder(name = "Music-notes-simple-fill", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(212.92f, 17.69f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -6.86f, -1.45f)
                lineToRelative(-128.0f, 32.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 72.0f, 56.0f)
                verticalLineTo(166.08f)
                arcTo(36.0f, 36.0f, 0.0f, true, false, 88.0f, 196.0f)
                verticalLineTo(62.25f)
                lineToRelative(112.0f, -28.0f)
                verticalLineToRelative(99.83f)
                arcTo(36.0f, 36.0f, 0.0f, true, false, 216.0f, 164.0f)
                verticalLineTo(24.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 212.92f, 17.69f)
                close()
            }
        }
        .build()
        return `_music-notes-simple-fill`!!
    }

private var `_music-notes-simple-fill`: ImageVector? = null
