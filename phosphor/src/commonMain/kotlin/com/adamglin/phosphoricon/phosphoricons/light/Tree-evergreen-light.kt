package com.adamglin.phosphoricon.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.LightGroup

public val LightGroup.`Tree-evergreen-light`: ImageVector
    get() {
        if (`_tree-evergreen-light` != null) {
            return `_tree-evergreen-light`!!
        }
        `_tree-evergreen-light` = Builder(name = "Tree-evergreen-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.74f, 188.32f)
                lineTo(180.27f, 126.0f)
                horizontalLineTo(208.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.76f, -9.66f)
                lineToRelative(-80.0f, -104.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -9.52f, 0.0f)
                lineToRelative(-80.0f, 104.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 48.0f, 126.0f)
                horizontalLineTo(75.73f)
                lineTo(27.26f, 188.32f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 32.0f, 198.0f)
                horizontalLineToRelative(90.0f)
                verticalLineToRelative(42.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                verticalLineTo(198.0f)
                horizontalLineToRelative(90.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.74f, -9.68f)
                close()
                moveTo(44.27f, 186.0f)
                lineToRelative(48.47f, -62.32f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 88.0f, 114.0f)
                horizontalLineTo(60.19f)
                lineTo(128.0f, 25.84f)
                lineTo(195.81f, 114.0f)
                horizontalLineTo(168.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -4.74f, 9.68f)
                lineTo(211.73f, 186.0f)
                close()
            }
        }
        .build()
        return `_tree-evergreen-light`!!
    }

private var `_tree-evergreen-light`: ImageVector? = null
