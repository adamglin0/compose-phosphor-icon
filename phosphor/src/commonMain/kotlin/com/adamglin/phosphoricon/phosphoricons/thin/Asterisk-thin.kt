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

public val ThinGroup.`Asterisk-thin`: ImageVector
    get() {
        if (`_asterisk-thin` != null) {
            return `_asterisk-thin`!!
        }
        `_asterisk-thin` = Builder(name = "Asterisk-thin", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(211.43f, 178.06f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.49f, 1.37f)
                lineTo(132.0f, 135.06f)
                verticalLineTo(216.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                verticalLineTo(135.06f)
                lineTo(50.06f, 179.43f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.12f, -6.86f)
                lineTo(120.22f, 128.0f)
                lineTo(45.94f, 83.43f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.12f, -6.86f)
                lineTo(124.0f, 120.94f)
                verticalLineTo(40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                verticalLineToRelative(80.94f)
                lineToRelative(73.94f, -44.37f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 4.12f, 6.86f)
                lineTo(135.78f, 128.0f)
                lineToRelative(74.28f, 44.57f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 211.43f, 178.06f)
                close()
            }
        }
        .build()
        return `_asterisk-thin`!!
    }

private var `_asterisk-thin`: ImageVector? = null
