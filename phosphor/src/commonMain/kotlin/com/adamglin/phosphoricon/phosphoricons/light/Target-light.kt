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

public val LightGroup.`Target-light`: ImageVector
    get() {
        if (`_target-light` != null) {
            return `_target-light`!!
        }
        `_target-light` = Builder(name = "Target-light", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(220.06f, 84.0f)
                arcToRelative(102.06f, 102.06f, 0.0f, true, true, -24.31f, -32.27f)
                lineToRelative(24.0f, -24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, 8.49f)
                lineToRelative(-96.0f, 96.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -8.48f, -8.49f)
                lineToRelative(29.39f, -29.4f)
                arcToRelative(42.0f, 42.0f, 0.0f, true, false, 16.78f, 31.24f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 12.0f, -0.68f)
                arcTo(54.0f, 54.0f, 0.0f, true, true, 161.7f, 85.83f)
                lineToRelative(25.54f, -25.55f)
                arcToRelative(89.91f, 89.91f, 0.0f, true, false, 22.0f, 28.93f)
                arcTo(6.0f, 6.0f, 0.0f, true, true, 220.06f, 84.0f)
                close()
            }
        }
        .build()
        return `_target-light`!!
    }

private var `_target-light`: ImageVector? = null
