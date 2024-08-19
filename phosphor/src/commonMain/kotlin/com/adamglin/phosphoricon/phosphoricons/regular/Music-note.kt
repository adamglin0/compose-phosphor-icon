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

public val RegularGroup.`Music-note`: ImageVector
    get() {
        if (`_music-note` != null) {
            return `_music-note`!!
        }
        `_music-note` = Builder(name = "Music-note", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(210.3f, 56.34f)
                lineToRelative(-80.0f, -24.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 120.0f, 40.0f)
                verticalLineTo(148.26f)
                arcTo(48.0f, 48.0f, 0.0f, true, false, 136.0f, 184.0f)
                verticalLineTo(98.75f)
                lineToRelative(69.7f, 20.91f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 216.0f, 112.0f)
                verticalLineTo(64.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 210.3f, 56.34f)
                close()
                moveTo(88.0f, 216.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, -32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 88.0f, 216.0f)
                close()
                moveTo(200.0f, 101.25f)
                lineToRelative(-64.0f, -19.2f)
                verticalLineTo(50.75f)
                lineTo(200.0f, 70.0f)
                close()
            }
        }
        .build()
        return `_music-note`!!
    }

private var `_music-note`: ImageVector? = null
