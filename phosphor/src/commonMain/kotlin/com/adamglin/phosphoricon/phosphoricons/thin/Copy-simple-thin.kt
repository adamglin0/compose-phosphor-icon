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

public val ThinGroup.`Copy-simple-thin`: ImageVector
    get() {
        if (`_copy-simple-thin` != null) {
            return `_copy-simple-thin`!!
        }
        `_copy-simple-thin` = Builder(name = "Copy-simple-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(184.0f, 68.0f)
                lineTo(40.0f, 68.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                lineTo(36.0f, 216.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                lineTo(184.0f, 220.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(188.0f, 72.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 184.0f, 68.0f)
                close()
                moveTo(180.0f, 212.0f)
                lineTo(44.0f, 212.0f)
                lineTo(44.0f, 76.0f)
                lineTo(180.0f, 76.0f)
                close()
                moveTo(220.0f, 40.0f)
                lineTo(220.0f, 184.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(212.0f, 44.0f)
                lineTo(72.0f, 44.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                lineTo(216.0f, 36.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 220.0f, 40.0f)
                close()
            }
        }
        .build()
        return `_copy-simple-thin`!!
    }

private var `_copy-simple-thin`: ImageVector? = null
