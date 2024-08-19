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

public val RegularGroup.Arrowfatlinesleft: ImageVector
    get() {
        if (_arrowfatlinesleft != null) {
            return _arrowfatlinesleft!!
        }
        _arrowfatlinesleft = Builder(name = "Arrowfatlinesleft", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(152.0f, 72.0f)
                lineTo(128.0f, 72.0f)
                lineTo(128.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -13.66f, -5.66f)
                lineToRelative(-96.0f, 96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 11.32f)
                lineToRelative(96.0f, 96.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 128.0f, 224.0f)
                lineTo(128.0f, 184.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(160.0f, 80.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 152.0f, 72.0f)
                close()
                moveTo(144.0f, 168.0f)
                lineTo(120.0f, 168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(28.69f)
                lineTo(35.31f, 128.0f)
                lineTo(112.0f, 51.31f)
                lineTo(112.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineToRelative(24.0f)
                close()
                moveTo(224.0f, 80.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(208.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
                moveTo(192.0f, 80.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(176.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
            }
        }
        .build()
        return _arrowfatlinesleft!!
    }

private var _arrowfatlinesleft: ImageVector? = null
