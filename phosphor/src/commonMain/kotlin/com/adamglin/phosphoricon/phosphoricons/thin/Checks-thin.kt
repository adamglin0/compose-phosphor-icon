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

public val ThinGroup.`Checks-thin`: ImageVector
    get() {
        if (`_checks-thin` != null) {
            return `_checks-thin`!!
        }
        `_checks-thin` = Builder(name = "Checks-thin", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(146.8f, 82.85f)
                lineToRelative(-89.6f, 88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.6f, 0.0f)
                lineTo(13.2f, 133.14f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.6f, -5.71f)
                lineToRelative(35.6f, 35.0f)
                lineToRelative(86.8f, -85.24f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.6f, 5.7f)
                close()
                moveTo(242.8f, 77.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.65f, 0.0f)
                lineToRelative(-86.8f, 85.24f)
                lineToRelative(-21.63f, -21.24f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -5.61f, 5.7f)
                lineToRelative(24.44f, 24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.6f, 0.0f)
                lineToRelative(89.6f, -88.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 242.85f, 77.2f)
                close()
            }
        }
        .build()
        return `_checks-thin`!!
    }

private var `_checks-thin`: ImageVector? = null
