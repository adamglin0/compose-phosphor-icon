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

public val RegularGroup.Checkerboard: ImageVector
    get() {
        if (_checkerboard != null) {
            return _checkerboard!!
        }
        _checkerboard = Builder(name = "Checkerboard", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 32.0f)
                lineTo(48.0f, 32.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 48.0f)
                lineTo(32.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(208.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(224.0f, 48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 208.0f, 32.0f)
                close()
                moveTo(195.31f, 120.0f)
                lineTo(136.0f, 60.69f)
                lineTo(136.0f, 48.0f)
                horizontalLineToRelative(12.69f)
                lineTo(208.0f, 107.32f)
                lineTo(208.0f, 120.0f)
                close()
                moveTo(136.0f, 83.31f)
                lineTo(172.69f, 120.0f)
                lineTo(136.0f, 120.0f)
                close()
                moveTo(208.0f, 84.69f)
                lineTo(171.31f, 48.0f)
                lineTo(208.0f, 48.0f)
                close()
                moveTo(120.0f, 48.0f)
                verticalLineToRelative(72.0f)
                lineTo(48.0f, 120.0f)
                lineTo(48.0f, 48.0f)
                close()
                moveTo(107.31f, 208.0f)
                lineTo(48.0f, 148.69f)
                lineTo(48.0f, 136.0f)
                lineTo(60.69f, 136.0f)
                lineTo(120.0f, 195.31f)
                lineTo(120.0f, 208.0f)
                close()
                moveTo(120.0f, 172.69f)
                lineTo(83.31f, 136.0f)
                lineTo(120.0f, 136.0f)
                close()
                moveTo(48.0f, 171.31f)
                lineTo(84.69f, 208.0f)
                lineTo(48.0f, 208.0f)
                close()
                moveTo(208.0f, 208.0f)
                lineTo(136.0f, 208.0f)
                lineTo(136.0f, 136.0f)
                horizontalLineToRelative(72.0f)
                verticalLineToRelative(72.0f)
                close()
            }
        }
        .build()
        return _checkerboard!!
    }

private var _checkerboard: ImageVector? = null
