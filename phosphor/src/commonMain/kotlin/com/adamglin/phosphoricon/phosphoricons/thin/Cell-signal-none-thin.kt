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

public val ThinGroup.`Cell-signal-none-thin`: ImageVector
    get() {
        if (`_cell-signal-none-thin` != null) {
            return `_cell-signal-none-thin`!!
        }
        `_cell-signal-none-thin` = Builder(name = "Cell-signal-none-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(44.0f, 192.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                verticalLineToRelative(-8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                close()
            }
        }
        .build()
        return `_cell-signal-none-thin`!!
    }

private var `_cell-signal-none-thin`: ImageVector? = null
