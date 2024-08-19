package com.adamglin.phosphoricon.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.BoldGroup

public val BoldGroup.`Toolbox-bold`: ImageVector
    get() {
        if (`_toolbox-bold` != null) {
            return `_toolbox-bold`!!
        }
        `_toolbox-bold` = Builder(name = "Toolbox-bold", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 64.0f)
                horizontalLineTo(180.0f)
                verticalLineTo(56.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -28.0f, -28.0f)
                horizontalLineTo(104.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 76.0f, 56.0f)
                verticalLineToRelative(8.0f)
                horizontalLineTo(32.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 12.0f, 84.0f)
                verticalLineTo(192.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineTo(224.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                verticalLineTo(84.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 224.0f, 64.0f)
                close()
                moveTo(100.0f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                verticalLineToRelative(8.0f)
                horizontalLineTo(100.0f)
                close()
                moveTo(220.0f, 88.0f)
                verticalLineToRelative(32.0f)
                horizontalLineTo(196.0f)
                verticalLineToRelative(-4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                verticalLineToRelative(4.0f)
                horizontalLineTo(84.0f)
                verticalLineToRelative(-4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                verticalLineToRelative(4.0f)
                horizontalLineTo(36.0f)
                verticalLineTo(88.0f)
                close()
                moveTo(36.0f, 188.0f)
                verticalLineTo(144.0f)
                horizontalLineTo(60.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(88.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(44.0f)
                close()
            }
        }
        .build()
        return `_toolbox-bold`!!
    }

private var `_toolbox-bold`: ImageVector? = null
