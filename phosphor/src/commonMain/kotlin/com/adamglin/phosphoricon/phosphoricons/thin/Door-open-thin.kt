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

public val ThinGroup.`Door-open-thin`: ImageVector
    get() {
        if (`_door-open-thin` != null) {
            return `_door-open-thin`!!
        }
        `_door-open-thin` = Builder(name = "Door-open-thin", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 220.0f)
                lineTo(204.0f, 220.0f)
                lineTo(204.0f, 40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                lineTo(64.0f, 28.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 52.0f, 40.0f)
                lineTo(52.0f, 220.0f)
                lineTo(24.0f, 220.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                lineTo(232.0f, 228.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(196.0f, 40.0f)
                lineTo(196.0f, 220.0f)
                lineTo(172.0f, 220.0f)
                lineTo(172.0f, 36.0f)
                horizontalLineToRelative(20.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 196.0f, 40.0f)
                close()
                moveTo(60.0f, 40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(164.0f, 36.0f)
                lineTo(164.0f, 220.0f)
                lineTo(60.0f, 220.0f)
                close()
                moveTo(140.0f, 132.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 140.0f, 132.0f)
                close()
            }
        }
        .build()
        return `_door-open-thin`!!
    }

private var `_door-open-thin`: ImageVector? = null
