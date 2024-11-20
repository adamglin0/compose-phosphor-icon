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

public val FillGroup.ThreeD: ImageVector
    get() {
        if (_threeD != null) {
            return _threeD!!
        }
        _threeD = Builder(name = "ThreeD", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(184.0f, 128.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -32.0f, 32.0f)
                horizontalLineToRelative(-8.0f)
                lineTo(144.0f, 96.0f)
                horizontalLineToRelative(8.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 184.0f, 128.0f)
                close()
                moveTo(232.0f, 56.0f)
                lineTo(232.0f, 200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(40.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(24.0f, 56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 40.0f, 40.0f)
                lineTo(216.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 232.0f, 56.0f)
                close()
                moveTo(112.0f, 144.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -18.31f, -28.92f)
                lineTo(110.4f, 92.8f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 104.0f, 80.0f)
                lineTo(64.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(88.0f, 96.0f)
                lineTo(73.6f, 115.2f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 80.0f, 128.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -10.66f, 27.93f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -10.68f, 11.92f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 112.0f, 144.0f)
                close()
                moveTo(200.0f, 128.0f)
                arcToRelative(48.05f, 48.05f, 0.0f, false, false, -48.0f, -48.0f)
                lineTo(136.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineToRelative(16.0f)
                arcTo(48.05f, 48.05f, 0.0f, false, false, 200.0f, 128.0f)
                close()
            }
        }
        .build()
        return _threeD!!
    }

private var _threeD: ImageVector? = null
