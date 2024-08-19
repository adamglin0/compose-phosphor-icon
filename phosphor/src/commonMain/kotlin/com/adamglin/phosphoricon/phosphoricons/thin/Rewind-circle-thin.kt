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

public val ThinGroup.`Rewind-circle-thin`: ImageVector
    get() {
        if (`_rewind-circle-thin` != null) {
            return `_rewind-circle-thin`!!
        }
        `_rewind-circle-thin` = Builder(name = "Rewind-circle-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 28.0f)
                arcTo(100.0f, 100.0f, 0.0f, true, false, 228.0f, 128.0f)
                arcTo(100.11f, 100.11f, 0.0f, false, false, 128.0f, 28.0f)
                close()
                moveTo(128.0f, 220.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, true, true, 92.0f, -92.0f)
                arcTo(92.1f, 92.1f, 0.0f, false, true, 128.0f, 220.0f)
                close()
                moveTo(117.79f, 88.42f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.19f, 0.38f)
                lineToRelative(-48.0f, 36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 6.4f)
                lineToRelative(48.0f, 36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.4f, 0.8f)
                arcToRelative(4.05f, 4.05f, 0.0f, false, false, 1.79f, -0.42f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 120.0f, 164.0f)
                lineTo(120.0f, 92.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 117.79f, 88.42f)
                close()
                moveTo(112.0f, 156.0f)
                lineTo(74.67f, 128.0f)
                lineTo(112.0f, 100.0f)
                close()
                moveTo(173.79f, 88.42f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.19f, 0.38f)
                lineToRelative(-48.0f, 36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 6.4f)
                lineToRelative(48.0f, 36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.4f, 0.8f)
                arcToRelative(4.05f, 4.05f, 0.0f, false, false, 1.79f, -0.42f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 176.0f, 164.0f)
                lineTo(176.0f, 92.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 173.79f, 88.42f)
                close()
                moveTo(168.0f, 156.0f)
                lineToRelative(-37.33f, -28.0f)
                lineTo(168.0f, 100.0f)
                close()
            }
        }
        .build()
        return `_rewind-circle-thin`!!
    }

private var `_rewind-circle-thin`: ImageVector? = null
