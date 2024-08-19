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

public val FillGroup.`Subtract-fill`: ImageVector
    get() {
        if (`_subtract-fill` != null) {
            return `_subtract-fill`!!
        }
        `_subtract-fill` = Builder(name = "Subtract-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(174.63f, 81.35f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, false, -93.28f, 93.28f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, false, 93.28f, -93.28f)
                close()
                moveTo(96.0f, 160.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, true, 64.0f, -64.0f)
                arcTo(64.07f, 64.07f, 0.0f, false, true, 96.0f, 160.0f)
                close()
            }
        }
        .build()
        return `_subtract-fill`!!
    }

private var `_subtract-fill`: ImageVector? = null
