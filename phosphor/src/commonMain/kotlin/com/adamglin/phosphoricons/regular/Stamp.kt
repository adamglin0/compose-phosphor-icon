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

public val RegularGroup.Stamp: ImageVector
    get() {
        if (_stamp != null) {
            return _stamp!!
        }
        _stamp = Builder(name = "Stamp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(40.0f, 232.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                lineTo(216.0f, 216.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 224.0f, 224.0f)
                close()
                moveTo(224.0f, 144.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(48.0f, 200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(32.0f, 144.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, -16.0f)
                horizontalLineToRelative(56.43f)
                lineTo(88.72f, 54.71f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 120.0f, 16.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 31.29f, 38.71f)
                lineTo(151.57f, 128.0f)
                lineTo(208.0f, 128.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 224.0f, 144.0f)
                close()
                moveTo(120.79f, 128.0f)
                horizontalLineToRelative(14.42f)
                lineToRelative(16.43f, -76.65f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 136.0f, 32.0f)
                lineTo(120.0f, 32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -15.65f, 19.35f)
                close()
                moveTo(208.0f, 184.0f)
                lineTo(208.0f, 144.0f)
                lineTo(48.0f, 144.0f)
                verticalLineToRelative(40.0f)
                lineTo(208.0f, 184.0f)
                close()
            }
        }
        .build()
        return _stamp!!
    }

private var _stamp: ImageVector? = null
