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

public val ThinGroup.`Checkerboard-thin`: ImageVector
    get() {
        if (`_checkerboard-thin` != null) {
            return `_checkerboard-thin`!!
        }
        `_checkerboard-thin` = Builder(name = "Checkerboard-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 36.0f)
                lineTo(48.0f, 36.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 36.0f, 48.0f)
                lineTo(36.0f, 208.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(208.0f, 220.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(220.0f, 48.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 208.0f, 36.0f)
                close()
                moveTo(193.66f, 124.0f)
                lineTo(132.0f, 62.34f)
                lineTo(132.0f, 44.0f)
                horizontalLineToRelative(18.34f)
                lineTo(212.0f, 105.66f)
                lineTo(212.0f, 124.0f)
                close()
                moveTo(132.0f, 73.66f)
                lineTo(182.34f, 124.0f)
                lineTo(132.0f, 124.0f)
                close()
                moveTo(212.0f, 48.0f)
                lineTo(212.0f, 94.34f)
                lineTo(161.66f, 44.0f)
                lineTo(208.0f, 44.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 212.0f, 48.0f)
                close()
                moveTo(48.0f, 44.0f)
                horizontalLineToRelative(76.0f)
                verticalLineToRelative(80.0f)
                lineTo(44.0f, 124.0f)
                lineTo(44.0f, 48.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 48.0f, 44.0f)
                close()
                moveTo(105.66f, 212.0f)
                lineTo(44.0f, 150.34f)
                lineTo(44.0f, 132.0f)
                lineTo(62.34f, 132.0f)
                lineTo(124.0f, 193.66f)
                lineTo(124.0f, 212.0f)
                close()
                moveTo(124.0f, 182.34f)
                lineTo(73.66f, 132.0f)
                lineTo(124.0f, 132.0f)
                close()
                moveTo(44.0f, 208.0f)
                lineTo(44.0f, 161.66f)
                lineTo(94.34f, 212.0f)
                lineTo(48.0f, 212.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 44.0f, 208.0f)
                close()
                moveTo(208.0f, 212.0f)
                lineTo(132.0f, 212.0f)
                lineTo(132.0f, 132.0f)
                horizontalLineToRelative(80.0f)
                verticalLineToRelative(76.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 208.0f, 212.0f)
                close()
            }
        }
        .build()
        return `_checkerboard-thin`!!
    }

private var `_checkerboard-thin`: ImageVector? = null
