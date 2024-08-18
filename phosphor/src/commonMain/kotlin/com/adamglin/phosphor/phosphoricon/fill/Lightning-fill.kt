package com.adamglin.phosphor.phosphoricon.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.FillGroup

public val FillGroup.`Lightning-fill`: ImageVector
    get() {
        if (`_lightning-fill` != null) {
            return `_lightning-fill`!!
        }
        `_lightning-fill` = Builder(name = "Lightning-fill", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(213.85f, 125.46f)
                lineToRelative(-112.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -13.69f, -7.0f)
                lineToRelative(14.66f, -73.33f)
                lineTo(45.19f, 143.49f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -3.0f, -13.0f)
                lineToRelative(112.0f, -120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 13.69f, 7.0f)
                lineTo(153.18f, 90.9f)
                lineToRelative(57.63f, 21.61f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 3.0f, 12.95f)
                close()
            }
        }
        .build()
        return `_lightning-fill`!!
    }

private var `_lightning-fill`: ImageVector? = null
