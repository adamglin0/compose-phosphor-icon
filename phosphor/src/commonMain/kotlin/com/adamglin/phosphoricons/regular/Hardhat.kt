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

public val RegularGroup.HardHat: ImageVector
    get() {
        if (_hardHat != null) {
            return _hardHat!!
        }
        _hardHat = Builder(name = "HardHat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 152.0f)
                lineTo(224.0f, 136.0f)
                arcToRelative(96.37f, 96.37f, 0.0f, false, false, -64.0f, -90.51f)
                lineTo(160.0f, 40.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                lineTo(112.0f, 24.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 96.0f, 40.0f)
                verticalLineToRelative(5.49f)
                arcTo(96.37f, 96.37f, 0.0f, false, false, 32.0f, 136.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(224.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(240.0f, 168.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 224.0f, 152.0f)
                close()
                moveTo(208.0f, 136.0f)
                verticalLineToRelative(16.0f)
                lineTo(160.0f, 152.0f)
                lineTo(160.0f, 62.67f)
                arcTo(80.36f, 80.36f, 0.0f, false, true, 208.0f, 136.0f)
                close()
                moveTo(144.0f, 40.0f)
                lineTo(144.0f, 152.0f)
                lineTo(112.0f, 152.0f)
                lineTo(112.0f, 40.0f)
                close()
                moveTo(48.0f, 136.0f)
                arcTo(80.36f, 80.36f, 0.0f, false, true, 96.0f, 62.67f)
                lineTo(96.0f, 152.0f)
                lineTo(48.0f, 152.0f)
                close()
                moveTo(224.0f, 192.0f)
                lineTo(32.0f, 192.0f)
                lineTo(32.0f, 168.0f)
                lineTo(224.0f, 168.0f)
                verticalLineToRelative(24.0f)
                close()
            }
        }
        .build()
        return _hardHat!!
    }

private var _hardHat: ImageVector? = null
