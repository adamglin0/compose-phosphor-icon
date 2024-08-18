package com.adamglin.phosphor.phosphoricon.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.RegularGroup

public val RegularGroup.`Magnifying-glass-minus`: ImageVector
    get() {
        if (`_magnifying-glass-minus` != null) {
            return `_magnifying-glass-minus`!!
        }
        `_magnifying-glass-minus` = Builder(name = "Magnifying-glass-minus", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(152.0f, 112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(80.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(64.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 152.0f, 112.0f)
                close()
                moveTo(229.66f, 229.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 0.0f)
                lineToRelative(-50.06f, -50.07f)
                arcToRelative(88.11f, 88.11f, 0.0f, true, true, 11.31f, -11.31f)
                lineToRelative(50.07f, 50.06f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 229.66f, 229.66f)
                close()
                moveTo(112.0f, 184.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, true, false, -72.0f, -72.0f)
                arcTo(72.08f, 72.08f, 0.0f, false, false, 112.0f, 184.0f)
                close()
            }
        }
        .build()
        return `_magnifying-glass-minus`!!
    }

private var `_magnifying-glass-minus`: ImageVector? = null
