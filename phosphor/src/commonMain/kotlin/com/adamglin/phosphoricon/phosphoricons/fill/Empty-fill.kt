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

public val FillGroup.`Empty-fill`: ImageVector
    get() {
        if (`_empty-fill` != null) {
            return `_empty-fill`!!
        }
        `_empty-fill` = Builder(name = "Empty-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(170.49f, 91.59f)
                arcTo(56.0f, 56.0f, 0.0f, false, true, 97.54f, 175.0f)
                close()
                moveTo(128.0f, 72.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, false, -42.49f, 92.41f)
                lineToRelative(73.0f, -83.37f)
                arcTo(55.67f, 55.67f, 0.0f, false, false, 128.0f, 72.0f)
                close()
                moveTo(232.0f, 128.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, true, 128.0f, 24.0f)
                arcTo(104.13f, 104.13f, 0.0f, false, true, 232.0f, 128.0f)
                close()
                moveTo(200.0f, 128.0f)
                arcToRelative(71.68f, 71.68f, 0.0f, false, false, -18.89f, -48.55f)
                lineTo(186.0f, 73.27f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -12.0f, -10.54f)
                lineToRelative(-4.91f, 6.18f)
                arcTo(72.0f, 72.0f, 0.0f, false, false, 74.89f, 176.55f)
                lineTo(70.0f, 182.73f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 12.0f, 10.54f)
                lineToRelative(4.91f, -6.18f)
                arcTo(71.95f, 71.95f, 0.0f, false, false, 200.0f, 128.0f)
                close()
            }
        }
        .build()
        return `_empty-fill`!!
    }

private var `_empty-fill`: ImageVector? = null
