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

public val ThinGroup.Spinner: ImageVector
    get() {
        if (_spinner != null) {
            return _spinner!!
        }
        _spinner = Builder(name = "Spinner", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(132.0f, 32.0f)
                lineTo(132.0f, 64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(124.0f, 32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                close()
                moveTo(173.25f, 86.75f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.83f, -1.18f)
                lineTo(198.71f, 63.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.66f, -5.66f)
                lineTo(170.43f, 79.92f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.82f, 6.83f)
                close()
                moveTo(224.0f, 124.0f)
                lineTo(192.0f, 124.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(176.08f, 170.43f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -5.65f, 5.65f)
                lineToRelative(22.62f, 22.63f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.66f, -5.66f)
                close()
                moveTo(128.0f, 188.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(132.0f, 192.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 128.0f, 188.0f)
                close()
                moveTo(79.92f, 170.43f)
                lineTo(57.29f, 193.05f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 63.0f, 198.71f)
                lineToRelative(22.62f, -22.63f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -5.65f, -5.65f)
                close()
                moveTo(68.0f, 128.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                lineTo(32.0f, 124.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                lineTo(64.0f, 132.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 68.0f, 128.0f)
                close()
                moveTo(63.0f, 57.29f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 57.29f, 63.0f)
                lineTo(79.92f, 85.57f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 5.65f, -5.65f)
                close()
            }
        }
        .build()
        return _spinner!!
    }

private var _spinner: ImageVector? = null
