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

public val FillGroup.`Tree-palm-fill`: ImageVector
    get() {
        if (`_tree-palm-fill` != null) {
            return `_tree-palm-fill`!!
        }
        `_tree-palm-fill` = Builder(name = "Tree-palm-fill", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(239.84f, 60.33f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -4.65f, 5.75f)
                lineTo(179.0f, 90.55f)
                arcToRelative(71.42f, 71.42f, 0.0f, false, true, 43.36f, 33.21f)
                arcToRelative(70.64f, 70.64f, 0.0f, false, true, 7.2f, 54.32f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 217.0f, 182.36f)
                lineToRelative(-81.0f, -61.68f)
                verticalLineTo(224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                verticalLineTo(120.68f)
                lineTo(39.0f, 182.36f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -12.57f, -4.28f)
                arcToRelative(70.64f, 70.64f, 0.0f, false, true, 7.2f, -54.32f)
                arcTo(71.42f, 71.42f, 0.0f, false, true, 77.0f, 90.55f)
                lineTo(20.81f, 66.08f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -2.6f, -12.85f)
                arcToRelative(66.86f, 66.86f, 0.0f, false, true, 97.74f, 0.0f)
                arcToRelative(72.21f, 72.21f, 0.0f, false, true, 12.0f, 17.0f)
                arcToRelative(72.21f, 72.21f, 0.0f, false, true, 12.05f, -17.0f)
                arcToRelative(66.86f, 66.86f, 0.0f, false, true, 97.74f, 0.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 239.84f, 60.33f)
                close()
            }
        }
        .build()
        return `_tree-palm-fill`!!
    }

private var `_tree-palm-fill`: ImageVector? = null
