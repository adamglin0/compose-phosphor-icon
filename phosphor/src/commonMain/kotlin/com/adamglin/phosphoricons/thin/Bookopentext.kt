package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.BookOpenText: ImageVector
    get() {
        if (_bookOpenText != null) {
            return _bookOpenText!!
        }
        _bookOpenText = Builder(name = "BookOpenText", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 52.0f)
                lineTo(160.0f, 52.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -32.0f, 19.54f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 96.0f, 52.0f)
                lineTo(24.0f, 52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                lineTo(20.0f, 200.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                lineTo(96.0f, 204.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 28.0f, 28.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 28.0f, -28.0f)
                horizontalLineToRelative(72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(236.0f, 56.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 232.0f, 52.0f)
                close()
                moveTo(96.0f, 196.0f)
                lineTo(28.0f, 196.0f)
                lineTo(28.0f, 60.0f)
                lineTo(96.0f, 60.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 28.0f, 28.0f)
                lineTo(124.0f, 209.4f)
                arcTo(35.94f, 35.94f, 0.0f, false, false, 96.0f, 196.0f)
                close()
                moveTo(228.0f, 196.0f)
                lineTo(160.0f, 196.0f)
                arcToRelative(35.94f, 35.94f, 0.0f, false, false, -28.0f, 13.41f)
                lineTo(132.0f, 88.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 28.0f, -28.0f)
                horizontalLineToRelative(68.0f)
                close()
                moveTo(160.0f, 92.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                lineTo(160.0f, 100.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                close()
                moveTo(204.0f, 128.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(160.0f, 132.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(40.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 204.0f, 128.0f)
                close()
                moveTo(204.0f, 160.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(160.0f, 164.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(40.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 204.0f, 160.0f)
                close()
            }
        }
        .build()
        return _bookOpenText!!
    }

private var _bookOpenText: ImageVector? = null
