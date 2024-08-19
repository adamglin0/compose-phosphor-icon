package com.adamglin.phosphoricon.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.RegularGroup

public val RegularGroup.Eyeglasses: ImageVector
    get() {
        if (_eyeglasses != null) {
            return _eyeglasses!!
        }
        _eyeglasses = Builder(name = "Eyeglasses", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, 16.0f)
                verticalLineToRelative(58.08f)
                arcTo(44.0f, 44.0f, 0.0f, false, false, 145.68f, 152.0f)
                lineTo(110.32f, 152.0f)
                arcTo(44.0f, 44.0f, 0.0f, false, false, 40.0f, 130.08f)
                lineTo(40.0f, 72.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 56.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 24.0f, 72.0f)
                verticalLineToRelative(92.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, 87.81f, 4.0f)
                horizontalLineToRelative(32.38f)
                arcTo(44.0f, 44.0f, 0.0f, false, false, 232.0f, 164.0f)
                lineTo(232.0f, 72.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 200.0f, 40.0f)
                close()
                moveTo(68.0f, 192.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, 28.0f, -28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 68.0f, 192.0f)
                close()
                moveTo(188.0f, 192.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, 28.0f, -28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 188.0f, 192.0f)
                close()
            }
        }
        .build()
        return _eyeglasses!!
    }

private var _eyeglasses: ImageVector? = null
