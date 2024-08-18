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

public val FillGroup.`Tree-view-fill`: ImageVector
    get() {
        if (`_tree-view-fill` != null) {
            return `_tree-view-fill`!!
        }
        `_tree-view-fill` = Builder(name = "Tree-view-fill", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.0f, 136.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineTo(88.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineToRelative(64.0f)
                verticalLineToRelative(-8.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, -16.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, 16.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                horizontalLineTo(176.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineTo(96.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -24.0f, -24.0f)
                verticalLineTo(80.0f)
                horizontalLineTo(64.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 48.0f, 64.0f)
                verticalLineTo(32.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 64.0f, 16.0f)
                horizontalLineTo(96.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, 16.0f)
                verticalLineTo(64.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 96.0f, 80.0f)
                horizontalLineTo(88.0f)
                verticalLineToRelative(32.0f)
                horizontalLineToRelative(72.0f)
                verticalLineToRelative(-8.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, -16.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, 16.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                horizontalLineTo(176.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 160.0f, 136.0f)
                close()
            }
        }
        .build()
        return `_tree-view-fill`!!
    }

private var `_tree-view-fill`: ImageVector? = null
