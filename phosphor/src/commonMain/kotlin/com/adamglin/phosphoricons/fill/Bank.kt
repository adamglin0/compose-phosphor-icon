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

public val FillGroup.Bank: ImageVector
    get() {
        if (_bank != null) {
            return _bank!!
        }
        _bank = Builder(name = "Bank", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(16.0f, 216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                lineTo(240.0f, 200.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 248.0f, 208.0f)
                close()
                moveTo(16.3f, 98.18f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 3.51f, -9.0f)
                lineToRelative(104.0f, -64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.38f, 0.0f)
                lineToRelative(104.0f, 64.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 232.0f, 104.0f)
                lineTo(208.0f, 104.0f)
                verticalLineToRelative(64.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(32.0f, 184.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                lineTo(48.0f, 168.0f)
                lineTo(48.0f, 104.0f)
                lineTo(24.0f, 104.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 16.3f, 98.18f)
                close()
                moveTo(144.0f, 160.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(160.0f, 112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                close()
                moveTo(96.0f, 160.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(112.0f, 112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                close()
            }
        }
        .build()
        return _bank!!
    }

private var _bank: ImageVector? = null
