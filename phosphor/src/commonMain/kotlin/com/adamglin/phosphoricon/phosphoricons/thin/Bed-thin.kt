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

public val ThinGroup.`Bed-thin`: ImageVector
    get() {
        if (`_bed-thin` != null) {
            return `_bed-thin`!!
        }
        `_bed-thin` = Builder(name = "Bed-thin", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 76.0f)
                lineTo(28.0f, 76.0f)
                lineTo(28.0f, 48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                lineTo(20.0f, 208.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(28.0f, 172.0f)
                lineTo(244.0f, 172.0f)
                verticalLineToRelative(36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(252.0f, 112.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 216.0f, 76.0f)
                close()
                moveTo(28.0f, 84.0f)
                horizontalLineToRelative(80.0f)
                verticalLineToRelative(80.0f)
                lineTo(28.0f, 164.0f)
                close()
                moveTo(116.0f, 164.0f)
                lineTo(116.0f, 84.0f)
                lineTo(216.0f, 84.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 28.0f, 28.0f)
                verticalLineToRelative(52.0f)
                close()
            }
        }
        .build()
        return `_bed-thin`!!
    }

private var `_bed-thin`: ImageVector? = null
