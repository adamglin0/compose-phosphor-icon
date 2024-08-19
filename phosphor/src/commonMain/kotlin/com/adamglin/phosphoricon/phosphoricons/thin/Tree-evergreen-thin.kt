package com.adamglin.phosphoricon.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.ThinGroup

public val ThinGroup.`Tree-evergreen-thin`: ImageVector
    get() {
        if (`_tree-evergreen-thin` != null) {
            return `_tree-evergreen-thin`!!
        }
        `_tree-evergreen-thin` = Builder(name = "Tree-evergreen-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(227.16f, 189.54f)
                lineToRelative(-51.0f, -65.54f)
                horizontalLineTo(208.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.17f, -6.44f)
                lineToRelative(-80.0f, -104.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -6.34f, 0.0f)
                lineToRelative(-80.0f, 104.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 48.0f, 124.0f)
                horizontalLineTo(79.82f)
                lineToRelative(-51.0f, 65.54f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 32.0f, 196.0f)
                horizontalLineToRelative(92.0f)
                verticalLineToRelative(44.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                verticalLineTo(196.0f)
                horizontalLineToRelative(92.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.16f, -6.46f)
                close()
                moveTo(40.18f, 188.0f)
                lineToRelative(51.0f, -65.54f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 88.0f, 116.0f)
                horizontalLineTo(56.12f)
                lineTo(128.0f, 22.56f)
                lineTo(199.88f, 116.0f)
                horizontalLineTo(168.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.16f, 6.46f)
                lineToRelative(51.0f, 65.54f)
                close()
            }
        }
        .build()
        return `_tree-evergreen-thin`!!
    }

private var `_tree-evergreen-thin`: ImageVector? = null
