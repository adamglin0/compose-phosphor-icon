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

public val FillGroup.`Tree-fill`: ImageVector
    get() {
        if (`_tree-fill` != null) {
            return `_tree-fill`!!
        }
        `_tree-fill` = Builder(name = "Tree-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 187.85f)
                arcToRelative(72.44f, 72.44f, 0.0f, false, false, 8.0f, 4.62f)
                verticalLineTo(232.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                verticalLineTo(192.47f)
                arcTo(72.44f, 72.44f, 0.0f, false, false, 128.0f, 187.85f)
                close()
                moveTo(198.1f, 62.59f)
                arcToRelative(76.0f, 76.0f, 0.0f, false, false, -140.2f, 0.0f)
                arcTo(71.71f, 71.71f, 0.0f, false, false, 16.0f, 127.8f)
                curveTo(15.9f, 166.0f, 48.0f, 199.0f, 86.14f, 200.0f)
                arcTo(72.22f, 72.22f, 0.0f, false, false, 120.0f, 192.47f)
                verticalLineTo(156.94f)
                lineTo(76.42f, 135.16f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 7.16f, -14.32f)
                lineTo(120.0f, 139.06f)
                verticalLineTo(88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(27.06f)
                lineToRelative(36.42f, -18.22f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 7.16f, 14.32f)
                lineTo(136.0f, 132.94f)
                verticalLineToRelative(59.53f)
                arcTo(72.17f, 72.17f, 0.0f, false, false, 168.0f, 200.0f)
                lineToRelative(1.82f, 0.0f)
                curveTo(208.0f, 199.0f, 240.11f, 166.0f, 240.0f, 127.8f)
                arcTo(71.71f, 71.71f, 0.0f, false, false, 198.1f, 62.59f)
                close()
            }
        }
        .build()
        return `_tree-fill`!!
    }

private var `_tree-fill`: ImageVector? = null
