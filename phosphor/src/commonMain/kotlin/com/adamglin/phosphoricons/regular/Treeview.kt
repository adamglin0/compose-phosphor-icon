package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.TreeView: ImageVector
    get() {
        if (_treeView != null) {
            return _treeView!!
        }
        _treeView = Builder(name = "TreeView", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.0f, 152.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(224.0f, 104.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                lineTo(176.0f, 88.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineToRelative(8.0f)
                lineTo(88.0f, 112.0f)
                lineTo(88.0f, 80.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(112.0f, 32.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 96.0f, 16.0f)
                lineTo(64.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 48.0f, 32.0f)
                lineTo(48.0f, 64.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 64.0f, 80.0f)
                horizontalLineToRelative(8.0f)
                lineTo(72.0f, 192.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 24.0f, 24.0f)
                horizontalLineToRelative(64.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(224.0f, 192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                lineTo(176.0f, 176.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineToRelative(8.0f)
                lineTo(96.0f, 200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                lineTo(88.0f, 128.0f)
                horizontalLineToRelative(72.0f)
                verticalLineToRelative(8.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 176.0f, 152.0f)
                close()
                moveTo(64.0f, 32.0f)
                lineTo(96.0f, 32.0f)
                lineTo(96.0f, 64.0f)
                lineTo(64.0f, 64.0f)
                close()
                moveTo(176.0f, 192.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(32.0f)
                lineTo(176.0f, 224.0f)
                close()
                moveTo(176.0f, 104.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(32.0f)
                lineTo(176.0f, 136.0f)
                close()
            }
        }
        .build()
        return _treeView!!
    }

private var _treeView: ImageVector? = null
