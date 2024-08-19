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

public val ThinGroup.`Diamond-thin`: ImageVector
    get() {
        if (`_diamond-thin` != null) {
            return `_diamond-thin`!!
        }
        `_diamond-thin` = Builder(name = "Diamond-thin", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.5f, 119.55f)
                lineTo(136.45f, 23.49f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -16.9f, 0.0f)
                lineToRelative(-96.0f, 96.06f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 16.9f)
                lineToRelative(96.05f, 96.06f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 16.9f, 0.0f)
                lineToRelative(96.05f, -96.06f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -16.9f)
                close()
                moveTo(226.84f, 130.79f)
                lineTo(130.79f, 226.85f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.58f, 0.0f)
                lineToRelative(-96.0f, -96.06f)
                arcToRelative(3.94f, 3.94f, 0.0f, false, true, 0.0f, -5.58f)
                lineToRelative(96.05f, -96.06f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.58f, 0.0f)
                lineToRelative(96.05f, 96.06f)
                arcToRelative(3.94f, 3.94f, 0.0f, false, true, 0.0f, 5.58f)
                close()
            }
        }
        .build()
        return `_diamond-thin`!!
    }

private var `_diamond-thin`: ImageVector? = null
