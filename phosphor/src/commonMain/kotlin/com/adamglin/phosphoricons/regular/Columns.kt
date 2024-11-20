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

public val RegularGroup.Columns: ImageVector
    get() {
        if (_columns != null) {
            return _columns!!
        }
        _columns = Builder(name = "Columns", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(104.0f, 32.0f)
                lineTo(64.0f, 32.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 48.0f, 48.0f)
                lineTo(48.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(120.0f, 48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 104.0f, 32.0f)
                close()
                moveTo(104.0f, 208.0f)
                lineTo(64.0f, 208.0f)
                lineTo(64.0f, 48.0f)
                horizontalLineToRelative(40.0f)
                close()
                moveTo(192.0f, 32.0f)
                lineTo(152.0f, 32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                lineTo(136.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(208.0f, 48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 192.0f, 32.0f)
                close()
                moveTo(192.0f, 208.0f)
                lineTo(152.0f, 208.0f)
                lineTo(152.0f, 48.0f)
                horizontalLineToRelative(40.0f)
                close()
            }
        }
        .build()
        return _columns!!
    }

private var _columns: ImageVector? = null
