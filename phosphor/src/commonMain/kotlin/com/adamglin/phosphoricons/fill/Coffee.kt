package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.Coffee: ImageVector
    get() {
        if (_coffee != null) {
            return _coffee!!
        }
        _coffee = Builder(name = "Coffee", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 80.0f)
                lineTo(32.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(96.3f, 96.3f, 0.0f, false, false, 32.54f, 72.0f)
                lineTo(32.0f, 208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(208.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(183.46f, 208.0f)
                arcToRelative(96.59f, 96.59f, 0.0f, false, false, 27.0f, -40.09f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 248.0f, 128.0f)
                verticalLineToRelative(-8.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 208.0f, 80.0f)
                close()
                moveTo(232.0f, 128.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -17.2f, 23.0f)
                arcToRelative(95.78f, 95.78f, 0.0f, false, false, 1.2f, -15.0f)
                lineTo(216.0f, 97.38f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 232.0f, 120.0f)
                close()
                moveTo(112.0f, 56.0f)
                lineTo(112.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                lineTo(128.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                close()
                moveTo(144.0f, 56.0f)
                lineTo(144.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                lineTo(160.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                close()
                moveTo(80.0f, 56.0f)
                lineTo(80.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                lineTo(96.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                close()
            }
        }
        .build()
        return _coffee!!
    }

private var _coffee: ImageVector? = null
