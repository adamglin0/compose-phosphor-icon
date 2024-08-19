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

public val RegularGroup.Lamp: ImageVector
    get() {
        if (_lamp != null) {
            return _lamp!!
        }
        _lamp = Builder(name = "Lamp", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(247.35f, 148.85f)
                lineToRelative(-48.0f, -112.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 192.0f, 32.0f)
                horizontalLineTo(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.35f, 4.85f)
                lineToRelative(-48.0f, 112.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 16.0f, 160.0f)
                horizontalLineTo(120.0f)
                verticalLineToRelative(48.0f)
                horizontalLineTo(96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                horizontalLineTo(136.0f)
                verticalLineTo(160.0f)
                horizontalLineToRelative(56.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineTo(160.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.35f, -11.15f)
                close()
                moveTo(28.13f, 144.0f)
                lineTo(69.28f, 48.0f)
                horizontalLineTo(186.72f)
                lineToRelative(41.15f, 96.0f)
                close()
            }
        }
        .build()
        return _lamp!!
    }

private var _lamp: ImageVector? = null
