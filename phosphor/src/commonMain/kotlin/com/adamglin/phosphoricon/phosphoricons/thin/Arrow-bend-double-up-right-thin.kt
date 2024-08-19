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

public val ThinGroup.`Arrow-bend-double-up-right-thin`: ImageVector
    get() {
        if (`_arrow-bend-double-up-right-thin` != null) {
            return `_arrow-bend-double-up-right-thin`!!
        }
        `_arrow-bend-double-up-right-thin` = Builder(name = "Arrow-bend-double-up-right-thin",
                defaultWidth = 256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f,
                viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(226.83f, 106.83f)
                lineToRelative(-48.0f, 48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, -5.66f)
                lineTo(218.34f, 104.0f)
                lineTo(173.17f, 58.83f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, -5.66f)
                lineToRelative(48.0f, 48.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 226.83f, 106.83f)
                close()
                moveTo(178.83f, 101.17f)
                lineTo(130.83f, 53.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -5.66f, 5.66f)
                lineTo(166.34f, 100.0f)
                lineTo(128.0f, 100.0f)
                arcTo(100.11f, 100.11f, 0.0f, false, false, 28.0f, 200.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                arcToRelative(92.1f, 92.1f, 0.0f, false, true, 92.0f, -92.0f)
                horizontalLineToRelative(38.34f)
                lineToRelative(-41.17f, 41.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.66f, 5.66f)
                lineToRelative(48.0f, -48.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 178.83f, 101.17f)
                close()
            }
        }
        .build()
        return `_arrow-bend-double-up-right-thin`!!
    }

private var `_arrow-bend-double-up-right-thin`: ImageVector? = null
