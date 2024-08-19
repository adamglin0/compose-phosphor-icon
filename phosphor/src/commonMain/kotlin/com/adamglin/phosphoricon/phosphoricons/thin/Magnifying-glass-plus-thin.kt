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

public val ThinGroup.`Magnifying-glass-plus-thin`: ImageVector
    get() {
        if (`_magnifying-glass-plus-thin` != null) {
            return `_magnifying-glass-plus-thin`!!
        }
        `_magnifying-glass-plus-thin` = Builder(name = "Magnifying-glass-plus-thin", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(148.0f, 112.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(116.0f, 116.0f)
                verticalLineToRelative(28.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(108.0f, 116.0f)
                lineTo(80.0f, 116.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(28.0f)
                lineTo(108.0f, 80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                verticalLineToRelative(28.0f)
                horizontalLineToRelative(28.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 148.0f, 112.0f)
                close()
                moveTo(226.83f, 226.83f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, 0.0f)
                lineToRelative(-52.7f, -52.7f)
                arcToRelative(84.1f, 84.1f, 0.0f, true, true, 5.66f, -5.66f)
                lineToRelative(52.7f, 52.7f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 226.83f, 226.83f)
                close()
                moveTo(112.0f, 188.0f)
                arcToRelative(76.0f, 76.0f, 0.0f, true, false, -76.0f, -76.0f)
                arcTo(76.08f, 76.08f, 0.0f, false, false, 112.0f, 188.0f)
                close()
            }
        }
        .build()
        return `_magnifying-glass-plus-thin`!!
    }

private var `_magnifying-glass-plus-thin`: ImageVector? = null
