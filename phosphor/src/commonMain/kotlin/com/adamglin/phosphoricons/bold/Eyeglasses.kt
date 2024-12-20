package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.Eyeglasses: ImageVector
    get() {
        if (_eyeglasses != null) {
            return _eyeglasses!!
        }
        _eyeglasses = Builder(name = "Eyeglasses", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 36.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, 12.0f)
                verticalLineToRelative(50.46f)
                arcTo(47.94f, 47.94f, 0.0f, false, false, 142.75f, 148.0f)
                horizontalLineToRelative(-29.5f)
                arcTo(47.94f, 47.94f, 0.0f, false, false, 44.0f, 122.46f)
                lineTo(44.0f, 72.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 56.0f, 60.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 20.0f, 72.0f)
                verticalLineToRelative(92.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, 95.32f, 8.0f)
                horizontalLineToRelative(25.36f)
                arcTo(48.0f, 48.0f, 0.0f, false, false, 236.0f, 164.0f)
                lineTo(236.0f, 72.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 200.0f, 36.0f)
                close()
                moveTo(68.0f, 188.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 24.0f, -24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 68.0f, 188.0f)
                close()
                moveTo(188.0f, 188.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 24.0f, -24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 188.0f, 188.0f)
                close()
            }
        }
        .build()
        return _eyeglasses!!
    }

private var _eyeglasses: ImageVector? = null
