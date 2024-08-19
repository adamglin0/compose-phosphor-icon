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

public val RegularGroup.Pencilruler: ImageVector
    get() {
        if (_pencilruler != null) {
            return _pencilruler!!
        }
        _pencilruler = Builder(name = "Pencilruler", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 32.0f)
                lineTo(160.0f, 32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                lineTo(144.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(224.0f, 48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 208.0f, 32.0f)
                close()
                moveTo(208.0f, 208.0f)
                lineTo(160.0f, 208.0f)
                lineTo(160.0f, 176.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(160.0f, 160.0f)
                lineTo(160.0f, 136.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(160.0f, 120.0f)
                lineTo(160.0f, 96.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(160.0f, 80.0f)
                lineTo(160.0f, 48.0f)
                horizontalLineToRelative(48.0f)
                lineTo(208.0f, 208.0f)
                close()
                moveTo(77.66f, 26.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, 0.0f)
                lineToRelative(-32.0f, 32.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 32.0f, 64.0f)
                lineTo(32.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(96.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(112.0f, 64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -2.34f, -5.66f)
                close()
                moveTo(48.0f, 176.0f)
                lineTo(48.0f, 80.0f)
                lineTo(64.0f, 80.0f)
                verticalLineToRelative(96.0f)
                close()
                moveTo(80.0f, 80.0f)
                lineTo(96.0f, 80.0f)
                verticalLineToRelative(96.0f)
                lineTo(80.0f, 176.0f)
                close()
                moveTo(72.0f, 43.31f)
                lineTo(92.69f, 64.0f)
                lineTo(51.31f, 64.0f)
                close()
                moveTo(48.0f, 208.0f)
                lineTo(48.0f, 192.0f)
                lineTo(96.0f, 192.0f)
                verticalLineToRelative(16.0f)
                close()
            }
        }
        .build()
        return _pencilruler!!
    }

private var _pencilruler: ImageVector? = null
