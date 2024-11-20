package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.TreeStructure: ImageVector
    get() {
        if (_treeStructure != null) {
            return _treeStructure!!
        }
        _treeStructure = Builder(name = "TreeStructure", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.0f, 116.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(228.0f, 48.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, -20.0f)
                lineTo(160.0f, 28.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, 20.0f)
                lineTo(140.0f, 60.0f)
                lineTo(128.0f, 60.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -28.0f, 28.0f)
                verticalLineToRelative(28.0f)
                lineTo(76.0f, 116.0f)
                verticalLineToRelative(-4.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 56.0f, 92.0f)
                lineTo(24.0f, 92.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 4.0f, 112.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(56.0f, 164.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(28.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 28.0f, 28.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(228.0f, 160.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, -20.0f)
                lineTo(160.0f, 140.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, 20.0f)
                verticalLineToRelative(12.0f)
                lineTo(128.0f, 172.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(124.0f, 88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(12.0f)
                lineTo(140.0f, 96.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 160.0f, 116.0f)
                close()
                moveTo(52.0f, 140.0f)
                lineTo(28.0f, 140.0f)
                lineTo(28.0f, 116.0f)
                lineTo(52.0f, 116.0f)
                close()
                moveTo(164.0f, 164.0f)
                horizontalLineToRelative(40.0f)
                verticalLineToRelative(40.0f)
                lineTo(164.0f, 204.0f)
                close()
                moveTo(164.0f, 52.0f)
                horizontalLineToRelative(40.0f)
                lineTo(204.0f, 92.0f)
                lineTo(164.0f, 92.0f)
                close()
            }
        }
        .build()
        return _treeStructure!!
    }

private var _treeStructure: ImageVector? = null
