package com.adamglin.phosphoricon.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.FillGroup

public val FillGroup.`Power-fill`: ImageVector
    get() {
        if (`_power-fill` != null) {
            return `_power-fill`!!
        }
        `_power-fill` = Builder(name = "Power-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f)
                arcTo(104.0f, 104.0f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(120.0f, 64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                close()
                moveTo(128.0f, 208.0f)
                arcTo(80.0f, 80.0f, 0.0f, false, true, 83.55f, 61.48f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 8.9f, 13.29f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, false, 71.1f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 8.9f, -13.29f)
                arcTo(80.0f, 80.0f, 0.0f, false, true, 128.0f, 208.0f)
                close()
            }
        }
        .build()
        return `_power-fill`!!
    }

private var `_power-fill`: ImageVector? = null
