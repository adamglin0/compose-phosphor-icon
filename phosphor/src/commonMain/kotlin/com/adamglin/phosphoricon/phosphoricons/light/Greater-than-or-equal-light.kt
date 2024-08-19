package com.adamglin.phosphoricon.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.LightGroup

public val LightGroup.`Greater-than-or-equal-light`: ImageVector
    get() {
        if (`_greater-than-or-equal-light` != null) {
            return `_greater-than-or-equal-light`!!
        }
        `_greater-than-or-equal-light` = Builder(name = "Greater-than-or-equal-light", defaultWidth
                = 256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(53.93f, 154.37f)
                lineTo(190.64f, 104.0f)
                lineTo(53.93f, 53.63f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 4.15f, -11.26f)
                lineToRelative(152.0f, 56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 11.26f)
                lineToRelative(-152.0f, 56.0f)
                arcTo(6.09f, 6.09f, 0.0f, false, true, 56.0f, 166.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -2.07f, -11.63f)
                close()
                moveTo(208.0f, 194.0f)
                horizontalLineTo(56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineTo(208.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
            }
        }
        .build()
        return `_greater-than-or-equal-light`!!
    }

private var `_greater-than-or-equal-light`: ImageVector? = null
