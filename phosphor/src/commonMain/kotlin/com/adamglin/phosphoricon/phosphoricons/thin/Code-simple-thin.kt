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

public val ThinGroup.`Code-simple-thin`: ImageVector
    get() {
        if (`_code-simple-thin` != null) {
            return `_code-simple-thin`!!
        }
        `_code-simple-thin` = Builder(name = "Code-simple-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(90.66f, 67.0f)
                lineTo(22.0f, 128.0f)
                lineToRelative(68.64f, 61.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.32f, 6.0f)
                lineToRelative(-72.0f, -64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -6.0f)
                lineToRelative(72.0f, -64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 5.32f, 6.0f)
                close()
                moveTo(242.66f, 125.0f)
                lineTo(170.66f, 61.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -5.32f, 6.0f)
                lineTo(234.0f, 128.0f)
                lineToRelative(-68.64f, 61.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.32f, 6.0f)
                lineToRelative(72.0f, -64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -6.0f)
                close()
            }
        }
        .build()
        return `_code-simple-thin`!!
    }

private var `_code-simple-thin`: ImageVector? = null
