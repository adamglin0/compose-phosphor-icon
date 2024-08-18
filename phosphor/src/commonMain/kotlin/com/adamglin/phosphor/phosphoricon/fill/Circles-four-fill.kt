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

public val FillGroup.`Circles-four-fill`: ImageVector
    get() {
        if (`_circles-four-fill` != null) {
            return `_circles-four-fill`!!
        }
        `_circles-four-fill` = Builder(name = "Circles-four-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(120.0f, 80.0f)
                arcTo(40.0f, 40.0f, 0.0f, true, true, 80.0f, 40.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 120.0f, 80.0f)
                close()
                moveTo(176.0f, 120.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, -40.0f, -40.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 176.0f, 120.0f)
                close()
                moveTo(80.0f, 136.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, 40.0f, 40.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 80.0f, 136.0f)
                close()
                moveTo(176.0f, 136.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, 40.0f, 40.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 176.0f, 136.0f)
                close()
            }
        }
        .build()
        return `_circles-four-fill`!!
    }

private var `_circles-four-fill`: ImageVector? = null
