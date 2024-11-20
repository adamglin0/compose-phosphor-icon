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

public val RegularGroup.ShuffleSimple: ImageVector
    get() {
        if (_shuffleSimple != null) {
            return _shuffleSimple!!
        }
        _shuffleSimple = Builder(name = "ShuffleSimple", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 48.0f)
                lineTo(216.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(200.0f, 67.31f)
                lineTo(156.28f, 111.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 145.0f, 99.72f)
                lineTo(188.69f, 56.0f)
                lineTo(168.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(40.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 216.0f, 48.0f)
                close()
                moveTo(208.0f, 160.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(20.69f)
                lineTo(53.66f, 42.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 42.34f, 53.66f)
                lineTo(188.69f, 200.0f)
                lineTo(168.0f, 200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(216.0f, 168.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 208.0f, 160.0f)
                close()
                moveTo(99.72f, 145.0f)
                lineTo(42.34f, 202.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, 11.32f)
                lineTo(111.0f, 156.28f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 99.72f, 145.0f)
                close()
            }
        }
        .build()
        return _shuffleSimple!!
    }

private var _shuffleSimple: ImageVector? = null
