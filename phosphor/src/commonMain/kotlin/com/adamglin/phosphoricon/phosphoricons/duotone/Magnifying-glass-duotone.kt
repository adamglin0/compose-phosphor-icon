package com.adamglin.phosphoricon.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.DuotoneGroup

public val DuotoneGroup.`Magnifying-glass-duotone`: ImageVector
    get() {
        if (`_magnifying-glass-duotone` != null) {
            return `_magnifying-glass-duotone`!!
        }
        `_magnifying-glass-duotone` = Builder(name = "Magnifying-glass-duotone", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(192.0f, 112.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, true, -80.0f, -80.0f)
                arcTo(80.0f, 80.0f, 0.0f, false, true, 192.0f, 112.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(229.66f, 218.34f)
                lineTo(179.6f, 168.28f)
                arcToRelative(88.21f, 88.21f, 0.0f, true, false, -11.32f, 11.31f)
                lineToRelative(50.06f, 50.07f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, -11.32f)
                close()
                moveTo(40.0f, 112.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, true, true, 72.0f, 72.0f)
                arcTo(72.08f, 72.08f, 0.0f, false, true, 40.0f, 112.0f)
                close()
            }
        }
        .build()
        return `_magnifying-glass-duotone`!!
    }

private var `_magnifying-glass-duotone`: ImageVector? = null
