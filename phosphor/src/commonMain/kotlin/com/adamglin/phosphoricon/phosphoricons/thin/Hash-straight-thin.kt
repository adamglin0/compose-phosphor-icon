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

public val ThinGroup.`Hash-straight-thin`: ImageVector
    get() {
        if (`_hash-straight-thin` != null) {
            return `_hash-straight-thin`!!
        }
        `_hash-straight-thin` = Builder(name = "Hash-straight-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 156.0f)
                lineTo(164.0f, 156.0f)
                lineTo(164.0f, 100.0f)
                horizontalLineToRelative(52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(164.0f, 92.0f)
                lineTo(164.0f, 40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                lineTo(156.0f, 92.0f)
                lineTo(100.0f, 92.0f)
                lineTo(100.0f, 40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                lineTo(92.0f, 92.0f)
                lineTo(40.0f, 92.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                lineTo(92.0f, 100.0f)
                verticalLineToRelative(56.0f)
                lineTo(40.0f, 156.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                lineTo(92.0f, 164.0f)
                verticalLineToRelative(52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(100.0f, 164.0f)
                horizontalLineToRelative(56.0f)
                verticalLineToRelative(52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(164.0f, 164.0f)
                horizontalLineToRelative(52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(100.0f, 156.0f)
                lineTo(100.0f, 100.0f)
                horizontalLineToRelative(56.0f)
                verticalLineToRelative(56.0f)
                close()
            }
        }
        .build()
        return `_hash-straight-thin`!!
    }

private var `_hash-straight-thin`: ImageVector? = null
