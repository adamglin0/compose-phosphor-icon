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

public val ThinGroup.`Number-one-thin`: ImageVector
    get() {
        if (`_number-one-thin` != null) {
            return `_number-one-thin`!!
        }
        `_number-one-thin` = Builder(name = "Number-one-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(140.0f, 48.0f)
                verticalLineTo(208.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                verticalLineTo(55.06f)
                lineTo(98.06f, 75.43f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.12f, -6.86f)
                lineToRelative(40.0f, -24.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 140.0f, 48.0f)
                close()
            }
        }
        .build()
        return `_number-one-thin`!!
    }

private var `_number-one-thin`: ImageVector? = null
